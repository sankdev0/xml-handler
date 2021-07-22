package com.sankdev;

// import java content classes generated by binding compiler
import com.sankdev.edbind.*;

import jakarta.xml.bind.*;

import java.util.List;

public class App 
{
    public static void main( String[] args ) {
        try {
            // create a JAXBContext capable of handling classes generated into
            // the com.sankdev.edbind package
            JAXBContext jaxbContext = JAXBContext.newInstance( "com.sankdev.edbind" );

            // create an Unmarshaller
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            // unmarshal a po instance document into a tree of Java content
            // objects composed of classes from the com.sankdev.edbind package.
            // ONLY accepts PacketEPD xml-documents
            @SuppressWarnings("unchecked")
            JAXBElement<PacketEPD> packetEPDJAXBElement = (JAXBElement<PacketEPD>) unmarshaller.unmarshal(
                    App.class.getResourceAsStream( "/xml-files/B150S53M.xml" ));

            PacketEPD packetEPD = packetEPDJAXBElement.getValue();

            // get List of all EDs
            List<ED> eds = packetEPD.getED101OrED103OrED104();

            // get the desired ED
            for (ED tempEd : eds) {
                if (tempEd instanceof ED101) {
                    ED101 ed101 = (ED101) tempEd;
                    AccDocRefID accDocRefID = ed101.getAccDoc();
                    if (accDocRefID.getAccDocNo().equals("1244")) {
                        System.out.println("ED101 with No 1244 found");
                        String payerInn = ed101.getPayer().getINN();
                        String purpose = ed101.getPurpose();
                        if (!payerInn.isEmpty() && !purpose.isEmpty() && !purpose.contains("///;ИП")) {
                            System.out.println("Incorrect purpose detected. Amending");
                            ed101.setPurpose(purpose + "///;ИП21;" + payerInn);
                        }
                    }
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
