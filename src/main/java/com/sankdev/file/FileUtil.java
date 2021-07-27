package com.sankdev.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface FileUtil {

    /**
     * Create a copy of the working directory containing the files to be processed
     * @param source the source directory containing the files to be processed
     * @return the Path to a copy directory containing the files to be processed.
     * It is the original directory with "-out" suffix appended.
     * @throws IOException thrown when operation fails
     */
    Path copyWorkingDir(Path source) throws IOException;

    List<File> listFilesInDir(Path source) throws IOException;
}
