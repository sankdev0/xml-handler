//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.26 at 12:23:07 PM YEKT 
//


package com.sankdev.edbind;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ED307ParticipantStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ED307ParticipantStatusType"&gt;
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory"&gt;
 *     &lt;enumeration value="PSWA"/&gt;
 *     &lt;enumeration value="PSAC"/&gt;
 *     &lt;enumeration value="PSWD"/&gt;
 *     &lt;enumeration value="PSDL"/&gt;
 *     &lt;enumeration value="PSDE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ED307ParticipantStatusType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ED307ParticipantStatusType {

    PSWA,
    PSAC,
    PSWD,
    PSDL,
    PSDE;

    public String value() {
        return name();
    }

    public static ED307ParticipantStatusType fromValue(String v) {
        return valueOf(v);
    }

}
