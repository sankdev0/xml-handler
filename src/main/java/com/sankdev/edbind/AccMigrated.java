//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 04:08:48 PM YEKT 
//


package com.sankdev.edbind;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information regarding Participantís Migration from RABIS.
 * 
 * <p>Java class for AccMigrated complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccMigrated"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="BalanceReceived" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccMigrated")
public class AccMigrated {

    @XmlAttribute(name = "BalanceReceived", required = true)
    protected boolean balanceReceived;

    /**
     * Gets the value of the balanceReceived property.
     * 
     */
    public boolean isBalanceReceived() {
        return balanceReceived;
    }

    /**
     * Sets the value of the balanceReceived property.
     * 
     */
    public void setBalanceReceived(boolean value) {
        this.balanceReceived = value;
    }

}
