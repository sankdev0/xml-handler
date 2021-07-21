//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 04:08:48 PM YEKT 
//


package com.sankdev.edbind;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Primary account of liquidity pool (LP) OR List of Subordinate Accounts of LP.
 * 
 * <p>Java class for PoolSPInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoolSPInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ListOfSP" type="{urn:cbr-ru:ed:v2.0}ListOfSP"/&gt;
 *         &lt;element name="MainPoolParticipant" type="{urn:cbr-ru:ed:v2.0}MainPoolParticipant"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoolSPInfo", propOrder = {
    "listOfSP",
    "mainPoolParticipant"
})
public class PoolSPInfo {

    @XmlElement(name = "ListOfSP")
    protected ListOfSP listOfSP;
    @XmlElement(name = "MainPoolParticipant")
    protected MainPoolParticipant mainPoolParticipant;

    /**
     * Gets the value of the listOfSP property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSP }
     *     
     */
    public ListOfSP getListOfSP() {
        return listOfSP;
    }

    /**
     * Sets the value of the listOfSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSP }
     *     
     */
    public void setListOfSP(ListOfSP value) {
        this.listOfSP = value;
    }

    /**
     * Gets the value of the mainPoolParticipant property.
     * 
     * @return
     *     possible object is
     *     {@link MainPoolParticipant }
     *     
     */
    public MainPoolParticipant getMainPoolParticipant() {
        return mainPoolParticipant;
    }

    /**
     * Sets the value of the mainPoolParticipant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainPoolParticipant }
     *     
     */
    public void setMainPoolParticipant(MainPoolParticipant value) {
        this.mainPoolParticipant = value;
    }

}
