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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Список балансовых счетов.
 * 
 * <p>Java class for ListAccBrf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListAccBrf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="AccBrf" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDBrfType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListAccBrf")
public class ListAccBrf {

    @XmlAttribute(name = "AccBrf", required = true)
    protected String accBrf;

    /**
     * Gets the value of the accBrf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccBrf() {
        return accBrf;
    }

    /**
     * Sets the value of the accBrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccBrf(String value) {
        this.accBrf = value;
    }

}
