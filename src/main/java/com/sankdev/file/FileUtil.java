package com.sankdev.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/** Utility interface for working with directories and files.
 */
public interface FileUtil {

    /**
     * Create a copy of the working directory containing the files to be processed.
     * It is done to be safe as any changes are done in a working directory.
     * @param source the source directory containing the files to be processed.
     * @return the Path to a copy directory containing the files to be processed.
     * It is the original directory with suffix "-out" appended.
     * @throws IOException when operation fails
     */
    Path copyWorkingDir(Path source) throws IOException;

    /**
     * Return the list of files in the specified directory (recursively).
     * @param source the source directory path containing the files.
     * @return the list of files in the source directory.
     * @throws IOException when operation fails.
     */
    List<File> listFilesInDir(Path source) throws IOException;
}
