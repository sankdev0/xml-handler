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
     * Checks if ed101 must be sent to GIS GMP.
     * @param ed101 the ED101 instance.
     * @return {@code true} if the ED101 document must be sent to GIS GMP.
     */
    public boolean qualifyForGisGmp(ED101 ed101) {

        String payeeBankCorrespAcc = ed101.getPayee().getBank().getCorrespAcc();
        // когда нет номера коррсчета, чаще всего плтаеж типа
        // "Подкрепление наличными деньгами операционной кассы дополнительного офиса не имеющего
        // корреспондентского субсчета"
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

}
