package com.sankdev.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

/**
 * Utility interface for working with directories and files.
 */
public interface FileUtil {

  /**
   * Create a copy of the working directory containing the files to be processed. It is done to be
   * safe as any changes are done in a working directory.
   *
   * @param source         The source directory containing the files to be processed.
   * @param copyDirSuffix  Suffix to be appended to the directory copy root.
   * @param copyFileSuffix Suffix to be appended to each file copy.
   * @return the Path to a copy directory containing the files to be processed. It is the original
   * directory with suffix appended.
   * @throws IOException when operation fails
   */
  Path copyWorkingDir(
    Path source, String copyDirSuffix, String copyFileSuffix) throws IOException;

  /**
   * Return the list of files in the specified directory (recursively).
   *
   * @param source the source directory path containing the files.
   * @return the list of files in the source directory.
   * @throws IOException when operation fails.
   */
  List<File> listFilesInDir(Path source) throws IOException;

  Optional<String> getFileExtension(String fileName);

  String removeFileExtension(String filename, boolean removeAllExtensions);
}
