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
 * <p>Java class for OperationTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OperationTextType"&gt;
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}CodeCategory"&gt;
 *     &lt;enumeration value="OTAE"/&gt;
 *     &lt;enumeration value="OTAP"/&gt;
 *     &lt;enumeration value="CWAC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationTextType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum OperationTextType {

    OTAE,
    OTAP,
    CWAC;

    public String value() {
        return name();
    }

    public static OperationTextType fromValue(String v) {
        return valueOf(v);
    }

}
