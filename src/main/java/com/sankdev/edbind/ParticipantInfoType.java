//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 04:08:48 PM YEKT 
//


package com.sankdev.edbind;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information about Participant (from BIC Directory Entry).
 * 
 * <p>Java class for ParticipantInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RstrList" type="{urn:cbr-ru:ed:v2.0}RstrListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="NameP" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max160TextType" /&gt;
 *       &lt;attribute name="EnglName" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max140TextType" /&gt;
 *       &lt;attribute name="RegN" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max9TextType" /&gt;
 *       &lt;attribute name="CntrCd" type="{urn:cbr-ru:ed:leaftypes:v2.0}Eq2TextType" /&gt;
 *       &lt;attribute name="Rgn" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max2TextType" /&gt;
 *       &lt;attribute name="Ind" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max6TextType" /&gt;
 *       &lt;attribute name="Tnp" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max5TextType" /&gt;
 *       &lt;attribute name="Nnp" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max25TextType" /&gt;
 *       &lt;attribute name="Adr" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max160TextType" /&gt;
 *       &lt;attribute name="PrntBIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" /&gt;
 *       &lt;attribute name="DateIn" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *       &lt;attribute name="DateOut" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *       &lt;attribute name="PtType" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max2TextType" /&gt;
 *       &lt;attribute name="Srvcs" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max1TextType" /&gt;
 *       &lt;attribute name="XchType" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max1TextType" /&gt;
 *       &lt;attribute name="UID" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDDrawerIDType" /&gt;
 *       &lt;attribute name="ParticipantStatus" type="{urn:cbr-ru:ed:leaftypes:v2.0}ParticipantStatusType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantInfoType", propOrder = {
    "rstrList"
})
public class ParticipantInfoType {

    @XmlElement(name = "RstrList")
    protected List<RstrListType> rstrList;
    @XmlAttribute(name = "NameP", required = true)
    protected String nameP;
    @XmlAttribute(name = "EnglName")
    protected String englName;
    @XmlAttribute(name = "RegN")
    protected String regN;
    @XmlAttribute(name = "CntrCd")
    protected String cntrCd;
    @XmlAttribute(name = "Rgn", required = true)
    protected String rgn;
    @XmlAttribute(name = "Ind")
    protected String ind;
    @XmlAttribute(name = "Tnp")
    protected String tnp;
    @XmlAttribute(name = "Nnp")
    protected String nnp;
    @XmlAttribute(name = "Adr")
    protected String adr;
    @XmlAttribute(name = "PrntBIC")
    protected String prntBIC;
    @XmlAttribute(name = "DateIn", required = true)
    protected XMLGregorianCalendar dateIn;
    @XmlAttribute(name = "DateOut")
    protected XMLGregorianCalendar dateOut;
    @XmlAttribute(name = "PtType", required = true)
    protected String ptType;
    @XmlAttribute(name = "Srvcs", required = true)
    protected String srvcs;
    @XmlAttribute(name = "XchType", required = true)
    protected String xchType;
    @XmlAttribute(name = "UID", required = true)
    protected String uid;
    @XmlAttribute(name = "ParticipantStatus")
    protected ParticipantStatusType participantStatus;

    /**
     * Gets the value of the rstrList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rstrList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRstrList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RstrListType }
     * 
     * 
     */
    public List<RstrListType> getRstrList() {
        if (rstrList == null) {
            rstrList = new ArrayList<RstrListType>();
        }
        return this.rstrList;
    }

    /**
     * Gets the value of the nameP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameP() {
        return nameP;
    }

    /**
     * Sets the value of the nameP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameP(String value) {
        this.nameP = value;
    }

    /**
     * Gets the value of the englName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglName() {
        return englName;
    }

    /**
     * Sets the value of the englName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglName(String value) {
        this.englName = value;
    }

    /**
     * Gets the value of the regN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegN() {
        return regN;
    }

    /**
     * Sets the value of the regN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegN(String value) {
        this.regN = value;
    }

    /**
     * Gets the value of the cntrCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrCd() {
        return cntrCd;
    }

    /**
     * Sets the value of the cntrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrCd(String value) {
        this.cntrCd = value;
    }

    /**
     * Gets the value of the rgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgn() {
        return rgn;
    }

    /**
     * Sets the value of the rgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgn(String value) {
        this.rgn = value;
    }

    /**
     * Gets the value of the ind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInd() {
        return ind;
    }

    /**
     * Sets the value of the ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInd(String value) {
        this.ind = value;
    }

    /**
     * Gets the value of the tnp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTnp() {
        return tnp;
    }

    /**
     * Sets the value of the tnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTnp(String value) {
        this.tnp = value;
    }

    /**
     * Gets the value of the nnp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNnp() {
        return nnp;
    }

    /**
     * Sets the value of the nnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNnp(String value) {
        this.nnp = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdr(String value) {
        this.adr = value;
    }

    /**
     * Gets the value of the prntBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrntBIC() {
        return prntBIC;
    }

    /**
     * Sets the value of the prntBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrntBIC(String value) {
        this.prntBIC = value;
    }

    /**
     * Gets the value of the dateIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateIn() {
        return dateIn;
    }

    /**
     * Sets the value of the dateIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateIn(XMLGregorianCalendar value) {
        this.dateIn = value;
    }

    /**
     * Gets the value of the dateOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOut() {
        return dateOut;
    }

    /**
     * Sets the value of the dateOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOut(XMLGregorianCalendar value) {
        this.dateOut = value;
    }

    /**
     * Gets the value of the ptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtType() {
        return ptType;
    }

    /**
     * Sets the value of the ptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtType(String value) {
        this.ptType = value;
    }

    /**
     * Gets the value of the srvcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrvcs() {
        return srvcs;
    }

    /**
     * Sets the value of the srvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrvcs(String value) {
        this.srvcs = value;
    }

    /**
     * Gets the value of the xchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchType() {
        return xchType;
    }

    /**
     * Sets the value of the xchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXchType(String value) {
        this.xchType = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the participantStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantStatusType }
     *     
     */
    public ParticipantStatusType getParticipantStatus() {
        return participantStatus;
    }

    /**
     * Sets the value of the participantStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantStatusType }
     *     
     */
    public void setParticipantStatus(ParticipantStatusType value) {
        this.participantStatus = value;
    }

}
