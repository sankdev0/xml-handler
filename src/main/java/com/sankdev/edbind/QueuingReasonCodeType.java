//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 04:08:48 PM YEKT 
//


package com.sankdev.edbind;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueuingReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="QueuingReasonCodeType"&gt;
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}CodeCategory"&gt;
 *     &lt;enumeration value="QLLQ"/&gt;
 *     &lt;enumeration value="QWFC"/&gt;
 *     &lt;enumeration value="QLSF"/&gt;
 *     &lt;enumeration value="QLSV"/&gt;
 *     &lt;enumeration value="QLIF"/&gt;
 *     &lt;enumeration value="QLIV"/&gt;
 *     &lt;enumeration value="QCLI"/&gt;
 *     &lt;enumeration value="QICL"/&gt;
 *     &lt;enumeration value="QTCL"/&gt;
 *     &lt;enumeration value="QLRS"/&gt;
 *     &lt;enumeration value="QLRW"/&gt;
 *     &lt;enumeration value="QIRS"/&gt;
 *     &lt;enumeration value="QACI"/&gt;
 *     &lt;enumeration value="QCES"/&gt;
 *     &lt;enumeration value="QNET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QueuingReasonCodeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum QueuingReasonCodeType {

    QLLQ,
    QWFC,
    QLSF,
    QLSV,
    QLIF,
    QLIV,
    QCLI,
    QICL,
    QTCL,
    QLRS,
    QLRW,
    QIRS,
    QACI,
    QCES,
    QNET;

    public String value() {
        return name();
    }

    public static QueuingReasonCodeType fromValue(String v) {
        return valueOf(v);
    }

}
