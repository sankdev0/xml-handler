//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 04:08:48 PM YEKT 
//


package com.sankdev.edbind;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * ��������� ��� � ���, �� ����������� ��
 * 
 * <p>Java class for CustomerAccInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max160TextType"/&gt;
 *         &lt;element name="AccModifList" type="{urn:cbr-ru:ed:v2.0}AccModifList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AccBrfModifList" type="{urn:cbr-ru:ed:v2.0}AccBrfModifList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OURBIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" /&gt;
 *       &lt;attribute name="OCBIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" /&gt;
 *       &lt;attribute name="UIS" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDDrawerIDType" /&gt;
 *       &lt;attribute name="MemberType" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" /&gt;
 *       &lt;attribute name="DispatchPayeePayts" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" /&gt;
 *       &lt;attribute name="ForeignPaytsSystemMode" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccInfo", propOrder = {
    "name",
    "accModifList",
    "accBrfModifList"
})
public class CustomerAccInfo {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "AccModifList")
    protected List<AccModifList> accModifList;
    @XmlElement(name = "AccBrfModifList")
    protected List<AccBrfModifList> accBrfModifList;
    @XmlAttribute(name = "OURBIC")
    protected String ourbic;
    @XmlAttribute(name = "OCBIC")
    protected String ocbic;
    @XmlAttribute(name = "UIS")
    protected String uis;
    @XmlAttribute(name = "MemberType", required = true)
    protected String memberType;
    @XmlAttribute(name = "DispatchPayeePayts")
    protected String dispatchPayeePayts;
    @XmlAttribute(name = "ForeignPaytsSystemMode")
    protected String foreignPaytsSystemMode;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the accModifList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accModifList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccModifList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccModifList }
     * 
     * 
     */
    public List<AccModifList> getAccModifList() {
        if (accModifList == null) {
            accModifList = new ArrayList<AccModifList>();
        }
        return this.accModifList;
    }

    /**
     * Gets the value of the accBrfModifList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accBrfModifList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccBrfModifList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccBrfModifList }
     * 
     * 
     */
    public List<AccBrfModifList> getAccBrfModifList() {
        if (accBrfModifList == null) {
            accBrfModifList = new ArrayList<AccBrfModifList>();
        }
        return this.accBrfModifList;
    }

    /**
     * Gets the value of the ourbic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOURBIC() {
        return ourbic;
    }

    /**
     * Sets the value of the ourbic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOURBIC(String value) {
        this.ourbic = value;
    }

    /**
     * Gets the value of the ocbic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCBIC() {
        return ocbic;
    }

    /**
     * Sets the value of the ocbic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCBIC(String value) {
        this.ocbic = value;
    }

    /**
     * Gets the value of the uis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIS() {
        return uis;
    }

    /**
     * Sets the value of the uis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIS(String value) {
        this.uis = value;
    }

    /**
     * Gets the value of the memberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberType() {
        return memberType;
    }

    /**
     * Sets the value of the memberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberType(String value) {
        this.memberType = value;
    }

    /**
     * Gets the value of the dispatchPayeePayts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchPayeePayts() {
        return dispatchPayeePayts;
    }

    /**
     * Sets the value of the dispatchPayeePayts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchPayeePayts(String value) {
        this.dispatchPayeePayts = value;
    }

    /**
     * Gets the value of the foreignPaytsSystemMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignPaytsSystemMode() {
        return foreignPaytsSystemMode;
    }

    /**
     * Sets the value of the foreignPaytsSystemMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignPaytsSystemMode(String value) {
        this.foreignPaytsSystemMode = value;
    }

}
