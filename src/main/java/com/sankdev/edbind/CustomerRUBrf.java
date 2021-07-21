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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * ��������� ����������� ��� ���������� � ����������� ��������� ���������� ������������ �������
 * 
 * <p>Java class for CustomerRUBrf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRUBrf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bank" type="{urn:cbr-ru:ed:v2.0}BankRU"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="INN" type="{urn:cbr-ru:ed:leaftypes:v2.0}INNIDTextType" /&gt;
 *       &lt;attribute name="PersonalAcc" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRUBrf", propOrder = {
    "bank"
})
public class CustomerRUBrf {

    @XmlElement(name = "Bank", required = true)
    protected BankRU bank;
    @XmlAttribute(name = "INN")
    protected String inn;
    @XmlAttribute(name = "PersonalAcc")
    protected String personalAcc;

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link BankRU }
     *     
     */
    public BankRU getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankRU }
     *     
     */
    public void setBank(BankRU value) {
        this.bank = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the personalAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalAcc() {
        return personalAcc;
    }

    /**
     * Sets the value of the personalAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalAcc(String value) {
        this.personalAcc = value;
    }

}
