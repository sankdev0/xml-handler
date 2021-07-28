package com.sankdev.gisgmp;

import com.sankdev.edbind.ED101;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class GisGmpFilters {

    private final Pattern edPayeeBankCorrespAccPattern;

    private final List<Pattern> edPayeePersonalAccPatterns;

    /**
     * This default constructor compiles filter patterns for reuse
     */
    public GisGmpFilters() {

        // FIXME move the filters to an external config file
        // GisGmp filters
        String edPayeeBankCorrespAccRegEx = "^40102.*";
        this.edPayeeBankCorrespAccPattern = Pattern.compile(edPayeeBankCorrespAccRegEx);

        edPayeePersonalAccPatterns = new ArrayList<>(4);
        String edPayeePersonalAccRegExOne = "^(03100|03212|03222|03232|03242|03252|03262|03272|03214|03224|03234|03254).*";
        edPayeePersonalAccPatterns.add(Pattern.compile(edPayeePersonalAccRegExOne));
        String edPayeePersonalAccRegExTwo = "^40503.{8}4.*";
        edPayeePersonalAccPatterns.add(Pattern.compile(edPayeePersonalAccRegExTwo));
        String edPayeePersonalAccRegExThree = "^40603.{8}4.*";
        edPayeePersonalAccPatterns.add(Pattern.compile(edPayeePersonalAccRegExThree));
        String edPayeePersonalAccRegExFour = "^40703.{8}4.*";
        edPayeePersonalAccPatterns.add(Pattern.compile(edPayeePersonalAccRegExFour));
    }

    /**
     * Проверяет, что документ типа ed101 должен быть отравлен в ГИС ГМП.
     *
     * @param ed101 экземпляр ED101.
     * @return {@code true} если документ ED101 должен быть отправлен
     * в ГИС ГМП.
     */
    public boolean qualifyForGisGmp(ED101 ed101) {

        String payeeBankCorrespAcc =
                ed101.getPayee().getBank().getCorrespAcc();
        // когда нет номера корр. счета, чаще всего плтаеж типа
        // "Подкрепление наличными деньгами операционной кассы
        // дополнительного офиса не имеющего корреспондентского субсчета"
        if (payeeBankCorrespAcc == null) {
            return false;
        }

        String payeePersonalAcc = ed101.getPayee().getPersonalAcc();

        Matcher payeeBankCorrespAccMatcher = this.edPayeeBankCorrespAccPattern.matcher(payeeBankCorrespAcc);

        for (Pattern tempPattern : this.edPayeePersonalAccPatterns) {

            Matcher payeePersonalAccMatcher = tempPattern.matcher(payeePersonalAcc);

            if (payeeBankCorrespAccMatcher.matches() && payeePersonalAccMatcher.matches())
                return true;
        }

        return false;
    }

    /**
     * Проверяет, что в документе типа ed101 должен быть заполнен Идентификатор
     * плательщика (ИП) в формате ///;ИП<код документа>;<номер документа>.
     * Идентификатор плательщика должен формироваться автоматически и добавляется
     * в конец Назначения платежа.
     * Иначе может возникать ошибка {@link com.sankdev.gisgmp.GisGmpError}.
     *
     * @param ed101 экзмпляр ED101.
     * @return {@code true} Идентификатор плательщика (ИП) должен быть заполнен.
     */
    public boolean qualifyForPayerIdentifier(ED101 ed101) {

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
        String paymentId = ed101.getPaymentID();
        if (ed101.getDepartmentalInfo() == null) {
            return false;
        }
        String drawerStatus = ed101.getDepartmentalInfo().getDrawerStatus();
        String departmentalInfoDocNo = ed101.getDepartmentalInfo().getDocNo();

        return (drawerStatus.equals("03") || drawerStatus.equals("19")
                || drawerStatus.equals("20") || drawerStatus.equals("24"))
                && paymentId.equals("0") && departmentalInfoDocNo.equals("0");
    }

}
