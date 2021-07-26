package com.sankdev;

import com.sankdev.file.utils.FileUtil;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
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

        Path workingDirCopy = FileUtil.copyWorkingDirCopy(source);

        mainLogger.info(workingDirCopy.toString());
    }
}
