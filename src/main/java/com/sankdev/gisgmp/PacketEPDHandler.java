package com.sankdev.gisgmp;

import com.sankdev.edbind.PacketEPD;
import jakarta.xml.bind.JAXBException;

import java.io.File;
import java.io.IOException;

/**
 * Utility interface for handling GisGmp errors. An implementation should
 * operate on in-memory objects mapped to xml files. Marshalling and
 * unmarshalling, file processing is done with corresponding utility
 * classes.
 */
public interface PacketEPDHandler {

    PacketEPD handleError (PacketEPD packetEPD, GisGmpError error);

}
