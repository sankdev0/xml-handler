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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Account's Restrictions.
 * 
 * <p>Java class for AccRstrListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccRstrListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="AccRstr" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}RstrType" /&gt;
 *       &lt;attribute name="AccRstrDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *       &lt;attribute name="SuccessorBIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccRstrListType")
public class AccRstrListType {

    @XmlAttribute(name = "AccRstr", required = true)
    protected RstrType accRstr;
    @XmlAttribute(name = "AccRstrDate", required = true)
    protected XMLGregorianCalendar accRstrDate;
    @XmlAttribute(name = "SuccessorBIC")
    protected String successorBIC;

    /**
     * Gets the value of the accRstr property.
     * 
     * @return
     *     possible object is
     *     {@link RstrType }
     *     
     */
    public RstrType getAccRstr() {
        return accRstr;
    }

    /**
     * Sets the value of the accRstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RstrType }
     *     
     */
    public void setAccRstr(RstrType value) {
        this.accRstr = value;
    }

    /**
     * Gets the value of the accRstrDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccRstrDate() {
        return accRstrDate;
    }

    /**
     * Sets the value of the accRstrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccRstrDate(XMLGregorianCalendar value) {
        this.accRstrDate = value;
    }

    /**
     * Gets the value of the successorBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessorBIC() {
        return successorBIC;
    }

    /**
     * Sets the value of the successorBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessorBIC(String value) {
        this.successorBIC = value;
    }

}
