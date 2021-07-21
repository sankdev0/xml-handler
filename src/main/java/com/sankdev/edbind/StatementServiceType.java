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
 * <p>Java class for StatementServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="StatementServiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SBMT"/&gt;
 *     &lt;enumeration value="SEMT"/&gt;
 *     &lt;enumeration value="SNOT"/&gt;
 *     &lt;enumeration value="NORS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatementServiceType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum StatementServiceType {

    SBMT,
    SEMT,
    SNOT,
    NORS;

    public String value() {
        return name();
    }

    public static StatementServiceType fromValue(String v) {
        return valueOf(v);
    }

}
