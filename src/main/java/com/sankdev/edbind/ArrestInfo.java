//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.26 at 12:23:07 PM YEKT 
//


package com.sankdev.edbind;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Total Amount of Arrest (Limitation) and Total Unpaid Amount of Arrest (Limitation) on account.
 * 
 * <p>Java class for ArrestInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrestInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TotalAmount" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" /&gt;
 *       &lt;attribute name="IndeterminateAmountFlag" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrestInfo")
public class ArrestInfo {

    @XmlAttribute(name = "TotalAmount")
    protected BigInteger totalAmount;
    @XmlAttribute(name = "IndeterminateAmountFlag", required = true)
    protected boolean indeterminateAmountFlag;

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalAmount(BigInteger value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the indeterminateAmountFlag property.
     * 
     */
    public boolean isIndeterminateAmountFlag() {
        return indeterminateAmountFlag;
    }

    /**
     * Sets the value of the indeterminateAmountFlag property.
     * 
     */
    public void setIndeterminateAmountFlag(boolean value) {
        this.indeterminateAmountFlag = value;
    }

}
