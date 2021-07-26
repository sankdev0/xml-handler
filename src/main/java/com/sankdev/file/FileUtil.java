package com.sankdev.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    /**
     * Create a copy of the working directory containing the files to be processed
     * @param source the source directory containing the files to be processed
     * @return the Path to a copy directory containing the files to be processed.
     * It is the original directory with "-out" suffix appended.
     * @throws IOException thrown when operation fails
     */
    public static Path copyWorkingDir(Path source) throws IOException {

        FileSystem fileSystem = FileSystems.getDefault();

        Path target = source.getParent().resolve(source.getFileName() + "-out");

        Files.createDirectory(target);

        FileVisitor<Path> fileVisitor = new SimpleFileVisitor<>() {

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

        Files.walkFileTree(source, fileVisitor);

        return target;
    }

    public static List<File> listFilesInDir(Path source) throws IOException {

        List<File> fileList = new ArrayList<>();

        FileVisitor<Path> fileVisitor = new SimpleFileVisitor<> () {

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                fileList.add(file.toFile());
                return FileVisitResult.CONTINUE;
            }
        };

        Files.walkFileTree(source,fileVisitor);

        return fileList;
    }
}

