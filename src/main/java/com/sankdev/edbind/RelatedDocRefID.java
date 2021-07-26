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
 * Initial Settlement Document Attributes.
 * 
 * <p>Java class for RelatedDocRefID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedDocRefID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="RelatedDocNo" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max16TextType" /&gt;
 *       &lt;attribute name="RelatedDocDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedDocRefID")
public class RelatedDocRefID {

    @XmlAttribute(name = "RelatedDocNo", required = true)
    protected String relatedDocNo;
    @XmlAttribute(name = "RelatedDocDate", required = true)
    protected XMLGregorianCalendar relatedDocDate;

    /**
     * Gets the value of the relatedDocNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedDocNo() {
        return relatedDocNo;
    }

    /**
     * Sets the value of the relatedDocNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedDocNo(String value) {
        this.relatedDocNo = value;
    }

    /**
     * Gets the value of the relatedDocDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRelatedDocDate() {
        return relatedDocDate;
    }

    /**
     * Sets the value of the relatedDocDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRelatedDocDate(XMLGregorianCalendar value) {
        this.relatedDocDate = value;
    }

}
