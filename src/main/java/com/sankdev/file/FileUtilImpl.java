package com.sankdev.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FileUtilImpl implements FileUtil {

  @Override
  public Optional<String> getFileExtension(String fileName) {
    return Optional.ofNullable(fileName).filter(f -> f.contains("."))
      .map(f -> f.substring(fileName.lastIndexOf(".") + 1));
  }


  /**
   * “(?<!^)[.]” – We use a negative-lookbehind in this regex. It matches a dot “.” that is not at
   * the beginning of the filename “(?<!^)[.].*” – If the removeAllExtensions option is set, this
   * will match the first matched dot until the end of the filename “(?<!^)[.][^.]*$” – This pattern
   * matches only the last extension
   */
  public String removeFileExtension(
    String filename, boolean removeAllExtensions) {
    if (filename == null || filename.isEmpty()) {
      return filename;
    }

    String extPattern = "(?<!^)[.]" + (removeAllExtensions ? ".*" : "[^.]*$");
    return filename.replaceAll(extPattern, "");
  }

  private void deleteDirectory(Path source) throws IOException {

    if (Files.notExists(source)) {
      return;
    }

    FileVisitor<Path> fileVisitor = new SimpleFileVisitor<>() {

      @Override
      public FileVisitResult visitFile(
        Path file, BasicFileAttributes attrs)
        throws IOException {
        Files.deleteIfExists(file);
        return FileVisitResult.CONTINUE;
      }

      @Override
      public FileVisitResult postVisitDirectory(
        Path dir, IOException exc) throws IOException {
        Files.deleteIfExists(dir);
        return FileVisitResult.CONTINUE;
      }
    };

    Files.walkFileTree(source, fileVisitor);
  }

  @Override
  public Path copyWorkingDir(Path source, String copyDirSuffix, String copyFileSuffix) throws
    IOException {

    Path target = source.getParent().resolve(source.getFileName()
      + copyDirSuffix);

    deleteDirectory(target);
    Files.createDirectory(target);

    FileVisitor<Path> fileVisitor = new SimpleFileVisitor<>() {

      @Override
      public FileVisitResult preVisitDirectory
        (Path dir, BasicFileAttributes attrs)
        throws IOException {

        Path targetDir = target.resolve(source.relativize(dir));

        try {
          Files.copy(dir, targetDir);
        } catch (FileAlreadyExistsException e) {
          if (!Files.isDirectory(targetDir)) {
            throw e;
          }
        }
        return FileVisitResult.CONTINUE;
      }

      @Override
      public FileVisitResult visitFile(
        Path file, BasicFileAttributes attrs)
        throws IOException {

        Path targetFile = target.resolve(source.relativize(file));
        // Apply Copy File suffix
        String fileName = String.valueOf(targetFile.getFileName());

        fileName = removeFileExtension(fileName, true) + copyFileSuffix + "."
          + getFileExtension(fileName).orElse("");

        targetFile = targetFile.getParent().resolve(fileName);

        Files.copy(file, targetFile);
        return FileVisitResult.CONTINUE;
      }
    };

    Files.walkFileTree(source, fileVisitor);

    return target;
  }

  @Override
  public List<File> listFilesInDir(Path source) throws IOException {

    List<File> fileList = new ArrayList<>();

    FileVisitor<Path> fileVisitor = new SimpleFileVisitor<>() {

      @Override
      public FileVisitResult visitFile(
        Path file, BasicFileAttributes attrs) {
        fileList.add(file.toFile());
        return FileVisitResult.CONTINUE;
      }
    };

    Files.walkFileTree(source, fileVisitor);

    return fileList;
  }
}

