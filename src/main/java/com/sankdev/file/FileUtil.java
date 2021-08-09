/*
 *  Copyright (c) 2021-2021. San K (alias for A.K.).
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

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
