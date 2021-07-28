package com.sankdev;

// import java content classes generated by binding compiler

import com.sankdev.edbind.AccDocRefID;
import com.sankdev.edbind.ED;
import com.sankdev.edbind.ED101;
import com.sankdev.edbind.PacketEPD;
import com.sankdev.xml.XmlUtil;
import com.sankdev.xml.XmlUtilImpl;
import jakarta.xml.bind.*;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Properties;

// test output file should be revised in the target directory
public class ModifyMarshalTestDemo
{
    public static void main( String[] args ) {
        Properties properties = new Properties();

        try {
            properties.load(ModifyMarshalTestDemo.class.getResourceAsStream("/config.properties"));
        } catch (IOException exc) {
            exc.printStackTrace();
        }

        String jaxbContextPackage = properties.getProperty("jaxb.context.package", "com.sankdev.edbind");

        try {
            XmlUtil<PacketEPD> xmlUtil = new XmlUtilImpl<>(PacketEPD.class, jaxbContextPackage);

            File demoFile = new File(ModifyMarshalTestDemo.class.getResource("/demo-xml-files/B150S53M.xml").toURI());
            File outFile = new File(ModifyMarshalTestDemo.class.getResource("/demo-xml-files/B150S53M-out.xml").toURI());

            PacketEPD packetEPD = xmlUtil.getRootElementValue(demoFile);

            // get List of all EDs
            List<ED> eds = packetEPD.getED101OrED103OrED104();

            // get the desired ED, modify it and remove the ones you don't need
            boolean removeFlag;
            for (int i = 0; i < eds.size(); i++) {
                removeFlag = true;
                if (eds.get(i) instanceof ED101) {
                    ED101 ed101 = (ED101) eds.get(i);
                    AccDocRefID accDocRefID = ed101.getAccDoc();
                    if (accDocRefID.getAccDocNo().equals("1244")) {
                        System.out.println("ED101 with No 1244 found");
                        String payerInn = ed101.getPayer().getINN();
                        String purpose = ed101.getPurpose();
                        if (!payerInn.isEmpty() && !purpose.isEmpty() && !purpose.contains("///;ИП")) {
                            System.out.println("Incorrect purpose detected. Amending");
                            ed101.setPurpose(purpose + "///;ИП21;" + payerInn);
                            removeFlag = false;
                        }
                    }
                }
                if (removeFlag) {
                    eds.remove(i);
                    i--;
                }
            }

            outFile = xmlUtil.marshalToFile(packetEPD, outFile);

            System.out.println("Files check " + (demoFile == outFile));

        } catch(JAXBException | IOException | URISyntaxException exc ) {
            exc.printStackTrace();
        }
    }
}
