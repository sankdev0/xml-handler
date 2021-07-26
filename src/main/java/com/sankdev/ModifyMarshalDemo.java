package com.sankdev;

// import java content classes generated by binding compiler
import com.sankdev.edbind.*;

import jakarta.xml.bind.*;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class ModifyMarshalDemo
{
    public static void main( String[] args ) {
        Properties properties = new Properties();

        try {
            properties.load(ModifyMarshalDemo.class.getResourceAsStream("/config.properties"));
        } catch (IOException exc) {
            exc.printStackTrace();
        }

        String jaxbContextPackage = properties.getProperty("jaxb.context.package", "com.sankdev.edbind");

        try {
            // create a JAXBContext capable of handling classes generated into
            // the com.sankdev.edbind package
            JAXBContext jaxbContext = JAXBContext.newInstance( jaxbContextPackage );

            // create an Unmarshaller
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            // unmarshal a po instance document into a tree of Java content
            // objects composed of classes from the com.sankdev.edbind package.
            // ONLY accepts PacketEPD xml-documents
            @SuppressWarnings("unchecked")
            JAXBElement<PacketEPD> packetEPDJAXBElement = (JAXBElement<PacketEPD>) unmarshaller.unmarshal(
                    ModifyMarshalDemo.class.getResourceAsStream("/demo-xml-files/B150S53M.xml"));

            PacketEPD packetEPD = packetEPDJAXBElement.getValue();

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

            // create a Marshaller and marshal to a file or another stream
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );
            marshaller.marshal( packetEPDJAXBElement, System.out );

        } catch( JAXBException je ) {
            je.printStackTrace();
        }
    }
}
