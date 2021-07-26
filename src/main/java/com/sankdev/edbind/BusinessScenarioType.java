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
 * <p>Java class for BusinessScenarioType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BusinessScenarioType"&gt;
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory"&gt;
 *     &lt;enumeration value="ANNL"/&gt;
 *     &lt;enumeration value="BLSW"/&gt;
 *     &lt;enumeration value="CAPE"/&gt;
 *     &lt;enumeration value="CLWD"/&gt;
 *     &lt;enumeration value="CAWC"/&gt;
 *     &lt;enumeration value="COLE"/&gt;
 *     &lt;enumeration value="GFUT"/&gt;
 *     &lt;enumeration value="LEVL"/&gt;
 *     &lt;enumeration value="LNOV"/&gt;
 *     &lt;enumeration value="LOAN"/&gt;
 *     &lt;enumeration value="SPEC"/&gt;
 *     &lt;enumeration value="WCNF"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="PRSP"/&gt;
 *     &lt;enumeration value="NSPK"/&gt;
 *     &lt;enumeration value="OPKC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessScenarioType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum BusinessScenarioType {

    ANNL,
    BLSW,
    CAPE,
    CLWD,
    CAWC,
    COLE,
    GFUT,
    LEVL,
    LNOV,
    LOAN,
    SPEC,
    WCNF,
    PART,
    PRSP,
    NSPK,
    OPKC;

    public String value() {
        return name();
    }

    public static BusinessScenarioType fromValue(String v) {
        return valueOf(v);
    }

}
