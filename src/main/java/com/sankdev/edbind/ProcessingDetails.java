//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 04:08:48 PM YEKT 
//


package com.sankdev.edbind;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * System-defined Business Scenario Identifier.
 * 
 * <p>Java class for ProcessingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessingDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Session" type="{urn:cbr-ru:ed:v2.0}Session" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BusinessScenario" type="{urn:cbr-ru:ed:leaftypes:v2.0}BusinessScenarioType" /&gt;
 *       &lt;attribute name="DebitDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *       &lt;attribute name="CreditDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingDetails", propOrder = {
    "session"
})
public class ProcessingDetails {

    @XmlElement(name = "Session")
    protected Session session;
    @XmlAttribute(name = "BusinessScenario")
    protected BusinessScenarioType businessScenario;
    @XmlAttribute(name = "DebitDate")
    protected XMLGregorianCalendar debitDate;
    @XmlAttribute(name = "CreditDate")
    protected XMLGregorianCalendar creditDate;

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link Session }
     *     
     */
    public Session getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link Session }
     *     
     */
    public void setSession(Session value) {
        this.session = value;
    }

    /**
     * Gets the value of the businessScenario property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessScenarioType }
     *     
     */
    public BusinessScenarioType getBusinessScenario() {
        return businessScenario;
    }

    /**
     * Sets the value of the businessScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessScenarioType }
     *     
     */
    public void setBusinessScenario(BusinessScenarioType value) {
        this.businessScenario = value;
    }

    /**
     * Gets the value of the debitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDebitDate() {
        return debitDate;
    }

    /**
     * Sets the value of the debitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDebitDate(XMLGregorianCalendar value) {
        this.debitDate = value;
    }

    /**
     * Gets the value of the creditDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditDate() {
        return creditDate;
    }

    /**
     * Sets the value of the creditDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditDate(XMLGregorianCalendar value) {
        this.creditDate = value;
    }

}
