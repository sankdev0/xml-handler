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
 * <p>Java class for ConditionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConditionCodeType"&gt;
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}CodeCategory"&gt;
 *     &lt;enumeration value="RSRV"/&gt;
 *     &lt;enumeration value="ERCP"/&gt;
 *     &lt;enumeration value="COVR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConditionCodeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ConditionCodeType {

    RSRV,
    ERCP,
    COVR;

    public String value() {
        return name();
    }

    public static ConditionCodeType fromValue(String v) {
        return valueOf(v);
    }

}
