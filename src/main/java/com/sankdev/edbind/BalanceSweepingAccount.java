//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.26 at 12:23:07 PM YEKT 
//


package com.sankdev.edbind;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Balance Sweeping Destination Account.
 * 
 * <p>Java class for BalanceSweepingAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceSweepingAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DailyTransfer" type="{urn:cbr-ru:ed:v2.0}DailyTransfer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BIC" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" /&gt;
 *       &lt;attribute name="Account" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceSweepingAccount", propOrder = {
    "dailyTransfer"
})
public class BalanceSweepingAccount {

    @XmlElement(name = "DailyTransfer")
    protected DailyTransfer dailyTransfer;
    @XmlAttribute(name = "BIC", required = true)
    protected String bic;
    @XmlAttribute(name = "Account", required = true)
    protected String account;

    /**
     * Gets the value of the dailyTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link DailyTransfer }
     *     
     */
    public DailyTransfer getDailyTransfer() {
        return dailyTransfer;
    }

    /**
     * Sets the value of the dailyTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyTransfer }
     *     
     */
    public void setDailyTransfer(DailyTransfer value) {
        this.dailyTransfer = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

}
