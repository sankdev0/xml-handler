//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.26 at 12:23:07 PM YEKT 
//


package com.sankdev.edbind;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Базовый комплексный тип для обмена с ФК.
 * 
 * <p>Java class for EDWithDeclaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDWithDeclaration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:cbr-ru:ed:v2.0}ED"&gt;
 *       &lt;attribute name="DeclarationDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *       &lt;attribute name="DeclarationNo" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DeclarationNoType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDWithDeclaration")
public class EDWithDeclaration
    extends ED
{

    @XmlAttribute(name = "DeclarationDate", required = true)
    protected XMLGregorianCalendar declarationDate;
    @XmlAttribute(name = "DeclarationNo", required = true)
    protected BigInteger declarationNo;

    /**
     * Gets the value of the declarationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeclarationDate() {
        return declarationDate;
    }

    /**
     * Sets the value of the declarationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeclarationDate(XMLGregorianCalendar value) {
        this.declarationDate = value;
    }

    /**
     * Gets the value of the declarationNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeclarationNo() {
        return declarationNo;
    }

    /**
     * Sets the value of the declarationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeclarationNo(BigInteger value) {
        this.declarationNo = value;
    }

}
