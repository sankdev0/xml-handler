package com.sankdev.gisgmp;

import com.sankdev.edbind.ED;
import com.sankdev.edbind.ED101;
import com.sankdev.edbind.PacketEPD;

import java.util.List;
import java.util.logging.Logger;

public class PacketEPDHandlerImpl implements PacketEPDHandler {

    private final Logger mainLogger = Logger.getLogger("mainLogger");

    private final GisGmpFilters gisGmpFilters = new GisGmpFilters();

    private void handleError290ED101(PacketEPD packetEPD) {

        final String errorCode = String.valueOf(GisGmpError.ERROR_CODE_290);

        List<ED> eds = packetEPD.getED101OrED103OrED104();

        eds.removeIf((ED ed) -> {
            if (ed instanceof ED101) {
                return (!(gisGmpFilters.qualifyForGisGmp((ED101) ed)
                        && gisGmpFilters.qualifyForPayerIdentifier((ED101) ed)));
            } else {
                return true;
            }
        });

        for (ED tempED : eds) {
            ED101 ed101 = (ED101) tempED;

            mainLogger.info("Processing the ED101  accDocNo "
                    + ed101.getAccDoc().getAccDocNo()
                    + " accDocDate " + ed101.getAccDoc().getAccDocDate().toString()
                    + " for error " + errorCode);

            // Определена такая логика построения Идентификтора плательщика (ИП)
            ed101.setPurpose(ed101.getPurpose() + "///;ИП21;" + ed101.getPayer().getINN());

        }

    }

    @Override
    public void handleError(PacketEPD packetEPD, Class<? extends ED> edType, GisGmpError error) {

        if (ED101.class.getName().equals(edType.getName())) {
            if (error.equals(GisGmpError.ERROR_CODE_290)) {
                handleError290ED101(packetEPD);
            }
        }
    }

}
