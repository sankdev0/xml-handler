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
 * <p>Java class for AccRstrCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AccRstrCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLRS"/&gt;
 *     &lt;enumeration value="LMRS"/&gt;
 *     &lt;enumeration value="URRS"/&gt;
 *     &lt;enumeration value="PSRS"/&gt;
 *     &lt;enumeration value="ESRS"/&gt;
 *     &lt;enumeration value="SCRS"/&gt;
 *     &lt;enumeration value="MVRS"/&gt;
 *     &lt;enumeration value="RTRS"/&gt;
 *     &lt;enumeration value="FSRS"/&gt;
 *     &lt;enumeration value="LSRS"/&gt;
 *     &lt;enumeration value="QPRS"/&gt;
 *     &lt;enumeration value="SDRS"/&gt;
 *     &lt;enumeration value="SMRS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccRstrCodeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum AccRstrCodeType {

    CLRS,
    LMRS,
    URRS,
    PSRS,
    ESRS,
    SCRS,
    MVRS,
    RTRS,
    FSRS,
    LSRS,
    QPRS,
    SDRS,
    SMRS;

    public String value() {
        return name();
    }

    public static AccRstrCodeType fromValue(String v) {
        return valueOf(v);
    }

}
