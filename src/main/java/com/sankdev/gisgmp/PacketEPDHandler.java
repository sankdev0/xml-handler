package com.sankdev.gisgmp;

import com.sankdev.edbind.ED;
import com.sankdev.edbind.PacketEPD;

/**
 * Utility interface for handling GisGmp errors. An implementation should
 * operate on in-memory objects mapped to xml files. Marshalling and
 * unmarshalling, file processing is done with corresponding utility
 * classes.
 */
public interface PacketEPDHandler {

    void handleError (PacketEPD packetEPD, Class<? extends ED> type, GisGmpError error);

}
