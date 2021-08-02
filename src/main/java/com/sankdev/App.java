package com.sankdev;

import com.sankdev.edbind.ED101;
import com.sankdev.edbind.PacketEPD;
import com.sankdev.file.FileUtil;
import com.sankdev.file.FileUtilImpl;
import com.sankdev.gisgmp.GisGmpError;
import com.sankdev.gisgmp.PacketEPDHandler;
import com.sankdev.gisgmp.PacketEPDHandlerImpl;
import com.sankdev.xml.XmlUtil;
import com.sankdev.xml.XmlUtilImpl;
import jakarta.xml.bind.JAXBException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

public class App {

  public static void main(String[] args) throws IOException, JAXBException {

    Logger mainLogger = Logger.getLogger("mainLogger");

    // Load config properties
    Properties properties = new Properties();
    properties.load(App.class.getResourceAsStream("/config.properties"));

    // copy working directory for processing files
    Path source = Paths.get(properties.getProperty("jaxb.xml.files.path"));
    String copyDirSuffix = properties.getProperty("jaxb.xml-files.copy.directory.suffix");
    String copyFileSuffix = properties.getProperty("jaxb.xml-files.copy.file.suffix");

    mainLogger.info("Source directory retrieved - " + source);
    mainLogger.info("Copy Directory suffix retrieved - " + copyDirSuffix);
    mainLogger.info("Copy File suffix retrieved - " + copyFileSuffix);

    FileUtil fileUtil = new FileUtilImpl();

    Path workingDirCopy = fileUtil.copyWorkingDir(source, copyDirSuffix, copyFileSuffix);

    mainLogger.info("All files copied for processing to working directory - " +
      workingDirCopy);

    List<File> fileList = fileUtil.listFilesInDir(workingDirCopy);

    XmlUtil<PacketEPD> xmlHandler =
      new XmlUtilImpl<>(PacketEPD.class,
        properties.getProperty(
          "jaxb.context.package", "com.sankdev.edbind"));

    PacketEPDHandler packetEPDHandler = new PacketEPDHandlerImpl();

    for (File tempFile : fileList) {
      mainLogger.info("File to be processed - " + tempFile.toString());
      PacketEPD packetEPD = xmlHandler.getRootElementValue(tempFile);
      packetEPDHandler.handleError(packetEPD, ED101.class, GisGmpError.ERROR_CODE_290);
      File updatedFile = xmlHandler.marshalToFile(packetEPD, tempFile);
      mainLogger.info("Updated file - " + updatedFile.toString());

    }

  }
}
