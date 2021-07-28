package com.sankdev.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FileUtilImpl implements FileUtil {

    @Override
    public Path copyWorkingDir(Path source) throws IOException {

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

    @Override
    public List<File> listFilesInDir(Path source) throws IOException {

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

