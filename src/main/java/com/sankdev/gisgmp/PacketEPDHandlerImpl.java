package com.sankdev.gisgmp;

import com.sankdev.edbind.AccDocRefID;
import com.sankdev.edbind.ED;
import com.sankdev.edbind.ED101;
import com.sankdev.edbind.PacketEPD;

import java.util.List;
import java.util.function.Predicate;

public class PacketEPDHandlerImpl implements PacketEPDHandler {

    static class theEd101Filter implements Predicate<ED> {

        @Override
        public boolean test(ED ed) {
            if (ed instanceof ED101) {
                return !qualifyForGisGmp((ED101) ed);
            }
            return true;
        }
    }

    private static boolean qualifyForGisGmp(ED101 ed101) {

        GisGmpFilters gisGmpFilters = new GisGmpFilters();

        return gisGmpFilters.qualifyForGisGmp(ed101);
    }

    private static boolean filterEd101(List<ED> list) {
        return list.removeIf(new theEd101Filter());
    }

    @Override
    public PacketEPD handleError(PacketEPD packetEPD, GisGmpError error) {

        // get List of all EDs in the PacketEDP
        List<ED> eds = packetEPD.getED101OrED103OrED104();

        System.out.println("Elements were removed - " + filterEd101(eds));

        eds.removeIf((ED ed) -> {
            if (ed instanceof ED101) {
                ED101 ed101 = (ED101) ed;
                String purpose = ed101.getPurpose();
                String paymentId = ed101.getPaymentID();
                String drawerStatus = ed101.getDepartmentalInfo().getDrawerStatus();
                String departmentalInfoDocNo = ed101.getDepartmentalInfo().getDocNo();
                // FIXME move the criteria to an external config file
                // РП к ВС "Прием информации об уплате
                // (информации из распоряжения плательщика)"
                // https://smev3.gosuslugi.ru/portal/inquirytype_one.jsp?id=230604&zone=fed&page=1&dTest=false
                // Если платеж бюджетный согласно фильтрам в {@link GisGmpFilters}
                // и DrawerStatus (Статус плательщика, поле 101) = "03", "19", "20", "24"
                // то обязательно ненулевые один из
                // - PaymentID (УИН)
                // - ИП (идентификатор плательщика)
                // - DocNo (Номер Документа, поле 108)
                // Иначе ошибка 290
                if ((drawerStatus.equals("03") || drawerStatus.equals("19")
                        || drawerStatus.equals("20") || drawerStatus.equals("24"))
                        &&
                        (paymentId.equals("0") && !purpose.contains("///;ИП") && departmentalInfoDocNo.equals("0"))
                ) {
                    return false;
                }
                return true;
            }
            return true;
        });

        for (ED tempED : eds) {

            if (tempED instanceof ED101) {
                ED101 ed101 = (ED101) tempED;
                AccDocRefID accDoc = ed101.getAccDoc();
                String accDocNo = accDoc.getAccDocNo();
                String accDocDate = accDoc.getAccDocDate().toString();
                System.out.println("Identified the ED101 - accDocNo " + accDocNo + " accDocDate " + accDocDate);
            }

        }

        return null;
    }

}
