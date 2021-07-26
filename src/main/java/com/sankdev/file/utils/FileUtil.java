package com.sankdev.file.utils;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileUtil {

    /**
     * Create a copy of the working directory containing the files to be processed
     * @param source the source directory containing the files to be processed
     * @return the Path to a copy directory containing the files to be processed
     * @throws IOException thrown when operation fails
     */
    public static Path copyWorkingDirCopy(Path source) throws IOException {

        FileSystem fileSystem = FileSystems.getDefault();

        Path target = source.getParent().resolve(source.getFileName() + "-out");

        Files.createDirectory(target);

        FileVisitor<Path> theFileVisitor = new SimpleFileVisitor<>() {

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                Path targetDir = target.resolve(source.relativize(dir));
                try {
                    Files.copy(dir, targetDir);
                } catch (FileAlreadyExistsException e) {
                    if (!Files.isDirectory(targetDir))
                        throw e;
                }
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.copy(file, target.resolve(source.relativize(file)));
                return FileVisitResult.CONTINUE;
            }
        };

        Files.walkFileTree(source, theFileVisitor);

        return target;
    }
}
