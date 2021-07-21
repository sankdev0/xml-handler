//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 04:08:48 PM YEKT 
//


package com.sankdev.edbind;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * �������� ����������.
 * 
 * <p>Java class for CashAccInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashAccInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="CashAccCode" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}CashAccountingCodeType" /&gt;
 *       &lt;attribute name="CashAccSum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}KopeckAmountType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccInfo")
public class CashAccInfo {

    @XmlAttribute(name = "CashAccCode", required = true)
    protected String cashAccCode;
    @XmlAttribute(name = "CashAccSum", required = true)
    protected BigInteger cashAccSum;

    /**
     * Gets the value of the cashAccCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashAccCode() {
        return cashAccCode;
    }

    /**
     * Sets the value of the cashAccCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashAccCode(String value) {
        this.cashAccCode = value;
    }

    /**
     * Gets the value of the cashAccSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCashAccSum() {
        return cashAccSum;
    }

    /**
     * Sets the value of the cashAccSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCashAccSum(BigInteger value) {
        this.cashAccSum = value;
    }

}
