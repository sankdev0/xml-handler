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
 * Сумма с признаком отсутствия верхней границы на списание и признаком изменения
 * 
 * <p>Java class for SumWithUnlimitAndInd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SumWithUnlimitAndInd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Sum" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" /&gt;
 *       &lt;attribute name="ChangeSum" type="{urn:cbr-ru:ed:leaftypes:v2.0}Indicator1Type" /&gt;
 *       &lt;attribute name="UnlimitedFundsMode" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SumWithUnlimitAndInd")
public class SumWithUnlimitAndInd {

    @XmlAttribute(name = "Sum")
    protected BigInteger sum;
    @XmlAttribute(name = "ChangeSum")
    protected Boolean changeSum;
    @XmlAttribute(name = "UnlimitedFundsMode", required = true)
    protected String unlimitedFundsMode;

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSum(BigInteger value) {
        this.sum = value;
    }

    /**
     * Gets the value of the changeSum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeSum() {
        return changeSum;
    }

    /**
     * Sets the value of the changeSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeSum(Boolean value) {
        this.changeSum = value;
    }

    /**
     * Gets the value of the unlimitedFundsMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnlimitedFundsMode() {
        return unlimitedFundsMode;
    }

    /**
     * Sets the value of the unlimitedFundsMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnlimitedFundsMode(String value) {
        this.unlimitedFundsMode = value;
    }

}
