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
 * Information about transmitted partition.
 * 
 * <p>Java class for PartInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="PartNo" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}OrdinalNumberType" /&gt;
 *       &lt;attribute name="PartQuantity" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}OrdinalNumberType" /&gt;
 *       &lt;attribute name="PartAggregateID" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}PartAggregateIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartInfo")
public class PartInfo {

    @XmlAttribute(name = "PartNo", required = true)
    protected BigInteger partNo;
    @XmlAttribute(name = "PartQuantity", required = true)
    protected BigInteger partQuantity;
    @XmlAttribute(name = "PartAggregateID", required = true)
    protected String partAggregateID;

    /**
     * Gets the value of the partNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPartNo() {
        return partNo;
    }

    /**
     * Sets the value of the partNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPartNo(BigInteger value) {
        this.partNo = value;
    }

    /**
     * Gets the value of the partQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPartQuantity() {
        return partQuantity;
    }

    /**
     * Sets the value of the partQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPartQuantity(BigInteger value) {
        this.partQuantity = value;
    }

    /**
     * Gets the value of the partAggregateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartAggregateID() {
        return partAggregateID;
    }

    /**
     * Sets the value of the partAggregateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartAggregateID(String value) {
        this.partAggregateID = value;
    }

}
