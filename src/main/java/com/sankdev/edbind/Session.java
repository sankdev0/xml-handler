//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.26 at 12:23:07 PM YEKT 
//


package com.sankdev.edbind;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Settlement Cycle Type and Number (Or Settlement Time).
 * 
 * <p>Java class for Session complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Session"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SessionID" type="{urn:cbr-ru:ed:leaftypes:v2.0}SessionIDType"/&gt;
 *         &lt;element name="SettlementTime" type="{urn:cbr-ru:ed:leaftypes:v2.0}TimeType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="SessionType" type="{urn:cbr-ru:ed:leaftypes:v2.0}SessionTypeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Session", propOrder = {
    "sessionID",
    "settlementTime"
})
public class Session {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "SettlementTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar settlementTime;
    @XmlAttribute(name = "SessionType")
    protected SessionTypeType sessionType;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the settlementTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlementTime() {
        return settlementTime;
    }

    /**
     * Sets the value of the settlementTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlementTime(XMLGregorianCalendar value) {
        this.settlementTime = value;
    }

    /**
     * Gets the value of the sessionType property.
     * 
     * @return
     *     possible object is
     *     {@link SessionTypeType }
     *     
     */
    public SessionTypeType getSessionType() {
        return sessionType;
    }

    /**
     * Sets the value of the sessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionTypeType }
     *     
     */
    public void setSessionType(SessionTypeType value) {
        this.sessionType = value;
    }

}
