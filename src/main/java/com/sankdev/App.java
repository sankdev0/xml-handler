package com.sankdev;

import com.sankdev.file.FileUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) throws IOException {

        Logger mainLogger = Logger.getLogger("mainLogger");

        // Load config properties
        Properties properties = new Properties();
        properties.load(App.class.getResourceAsStream("/config.properties"));

        // copy working directory for processing files
        Path source = Paths.get(properties.getProperty("jaxb.xml.files.path"));

        mainLogger.info("Source directory retrieved - " + source);

        Path workingDirCopy = FileUtil.copyWorkingDir(source);

        mainLogger.info("All files copied for processing to working directory - " +
                workingDirCopy);

        List<File> fileList = FileUtil.listFilesInDir(workingDirCopy);

        for (File tempFile : fileList) {
            mainLogger.info("File to be processed - " + tempFile.toString());
        }

    }
}
