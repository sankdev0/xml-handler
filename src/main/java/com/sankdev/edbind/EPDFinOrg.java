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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Базовый комплексный тип для ЭС ED107
 * 
 * <p>Java class for EPDFinOrg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EPDFinOrg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:cbr-ru:ed:v2.0}ED"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SettleNotEarlier" type="{urn:cbr-ru:ed:v2.0}SettleNotEarlier" minOccurs="0"/&gt;
 *         &lt;element name="SettleNotLater" type="{urn:cbr-ru:ed:v2.0}SettleNotLater" minOccurs="0"/&gt;
 *         &lt;element name="AccDoc" type="{urn:cbr-ru:ed:v2.0}AccDocRefID"/&gt;
 *         &lt;element name="RelatedDoc" type="{urn:cbr-ru:ed:v2.0}RelatedDocRefID" minOccurs="0"/&gt;
 *         &lt;element name="OrderingBank" type="{urn:cbr-ru:ed:v2.0}FinOrg" minOccurs="0"/&gt;
 *         &lt;element name="PrevInstrAgent" type="{urn:cbr-ru:ed:v2.0}FinOrg" minOccurs="0"/&gt;
 *         &lt;element name="InstructingAgent" type="{urn:cbr-ru:ed:v2.0}FinOrgRU"/&gt;
 *         &lt;element name="InstructedAgent" type="{urn:cbr-ru:ed:v2.0}FinOrgRU"/&gt;
 *         &lt;element name="AcctWithInst" type="{urn:cbr-ru:ed:v2.0}FinOrg" minOccurs="0"/&gt;
 *         &lt;element name="Beneficiary" type="{urn:cbr-ru:ed:v2.0}FinOrg" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EDReceiver" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDDrawerIDType" /&gt;
 *       &lt;attribute name="PaytKind" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" /&gt;
 *       &lt;attribute name="Sum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}KopeckAmountType" /&gt;
 *       &lt;attribute name="PaymentPrecedence" type="{urn:cbr-ru:ed:leaftypes:v2.0}TwoDigitCodeType" /&gt;
 *       &lt;attribute name="ReqSettlementDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *       &lt;attribute name="CodePurpose" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max35TextType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EPDFinOrg", propOrder = {
    "settleNotEarlier",
    "settleNotLater",
    "accDoc",
    "relatedDoc",
    "orderingBank",
    "prevInstrAgent",
    "instructingAgent",
    "instructedAgent",
    "acctWithInst",
    "beneficiary"
})
@XmlSeeAlso({
    ED107 .class
})
public class EPDFinOrg
    extends ED
{

    @XmlElement(name = "SettleNotEarlier")
    protected SettleNotEarlier settleNotEarlier;
    @XmlElement(name = "SettleNotLater")
    protected SettleNotLater settleNotLater;
    @XmlElement(name = "AccDoc", required = true)
    protected AccDocRefID accDoc;
    @XmlElement(name = "RelatedDoc")
    protected RelatedDocRefID relatedDoc;
    @XmlElement(name = "OrderingBank")
    protected FinOrg orderingBank;
    @XmlElement(name = "PrevInstrAgent")
    protected FinOrg prevInstrAgent;
    @XmlElement(name = "InstructingAgent", required = true)
    protected FinOrgRU instructingAgent;
    @XmlElement(name = "InstructedAgent", required = true)
    protected FinOrgRU instructedAgent;
    @XmlElement(name = "AcctWithInst")
    protected FinOrg acctWithInst;
    @XmlElement(name = "Beneficiary")
    protected FinOrg beneficiary;
    @XmlAttribute(name = "EDReceiver")
    protected String edReceiver;
    @XmlAttribute(name = "PaytKind")
    protected String paytKind;
    @XmlAttribute(name = "Sum", required = true)
    protected BigInteger sum;
    @XmlAttribute(name = "PaymentPrecedence")
    protected String paymentPrecedence;
    @XmlAttribute(name = "ReqSettlementDate")
    protected XMLGregorianCalendar reqSettlementDate;
    @XmlAttribute(name = "CodePurpose")
    protected String codePurpose;

    /**
     * Gets the value of the settleNotEarlier property.
     * 
     * @return
     *     possible object is
     *     {@link SettleNotEarlier }
     *     
     */
    public SettleNotEarlier getSettleNotEarlier() {
        return settleNotEarlier;
    }

    /**
     * Sets the value of the settleNotEarlier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettleNotEarlier }
     *     
     */
    public void setSettleNotEarlier(SettleNotEarlier value) {
        this.settleNotEarlier = value;
    }

    /**
     * Gets the value of the settleNotLater property.
     * 
     * @return
     *     possible object is
     *     {@link SettleNotLater }
     *     
     */
    public SettleNotLater getSettleNotLater() {
        return settleNotLater;
    }

    /**
     * Sets the value of the settleNotLater property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettleNotLater }
     *     
     */
    public void setSettleNotLater(SettleNotLater value) {
        this.settleNotLater = value;
    }

    /**
     * Gets the value of the accDoc property.
     * 
     * @return
     *     possible object is
     *     {@link AccDocRefID }
     *     
     */
    public AccDocRefID getAccDoc() {
        return accDoc;
    }

    /**
     * Sets the value of the accDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccDocRefID }
     *     
     */
    public void setAccDoc(AccDocRefID value) {
        this.accDoc = value;
    }

    /**
     * Gets the value of the relatedDoc property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedDocRefID }
     *     
     */
    public RelatedDocRefID getRelatedDoc() {
        return relatedDoc;
    }

    /**
     * Sets the value of the relatedDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedDocRefID }
     *     
     */
    public void setRelatedDoc(RelatedDocRefID value) {
        this.relatedDoc = value;
    }

    /**
     * Gets the value of the orderingBank property.
     * 
     * @return
     *     possible object is
     *     {@link FinOrg }
     *     
     */
    public FinOrg getOrderingBank() {
        return orderingBank;
    }

    /**
     * Sets the value of the orderingBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinOrg }
     *     
     */
    public void setOrderingBank(FinOrg value) {
        this.orderingBank = value;
    }

    /**
     * Gets the value of the prevInstrAgent property.
     * 
     * @return
     *     possible object is
     *     {@link FinOrg }
     *     
     */
    public FinOrg getPrevInstrAgent() {
        return prevInstrAgent;
    }

    /**
     * Sets the value of the prevInstrAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinOrg }
     *     
     */
    public void setPrevInstrAgent(FinOrg value) {
        this.prevInstrAgent = value;
    }

    /**
     * Gets the value of the instructingAgent property.
     * 
     * @return
     *     possible object is
     *     {@link FinOrgRU }
     *     
     */
    public FinOrgRU getInstructingAgent() {
        return instructingAgent;
    }

    /**
     * Sets the value of the instructingAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinOrgRU }
     *     
     */
    public void setInstructingAgent(FinOrgRU value) {
        this.instructingAgent = value;
    }

    /**
     * Gets the value of the instructedAgent property.
     * 
     * @return
     *     possible object is
     *     {@link FinOrgRU }
     *     
     */
    public FinOrgRU getInstructedAgent() {
        return instructedAgent;
    }

    /**
     * Sets the value of the instructedAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinOrgRU }
     *     
     */
    public void setInstructedAgent(FinOrgRU value) {
        this.instructedAgent = value;
    }

    /**
     * Gets the value of the acctWithInst property.
     * 
     * @return
     *     possible object is
     *     {@link FinOrg }
     *     
     */
    public FinOrg getAcctWithInst() {
        return acctWithInst;
    }

    /**
     * Sets the value of the acctWithInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinOrg }
     *     
     */
    public void setAcctWithInst(FinOrg value) {
        this.acctWithInst = value;
    }

    /**
     * Gets the value of the beneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link FinOrg }
     *     
     */
    public FinOrg getBeneficiary() {
        return beneficiary;
    }

    /**
     * Sets the value of the beneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinOrg }
     *     
     */
    public void setBeneficiary(FinOrg value) {
        this.beneficiary = value;
    }

    /**
     * Gets the value of the edReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDReceiver() {
        return edReceiver;
    }

    /**
     * Sets the value of the edReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDReceiver(String value) {
        this.edReceiver = value;
    }

    /**
     * Gets the value of the paytKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaytKind() {
        return paytKind;
    }

    /**
     * Sets the value of the paytKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaytKind(String value) {
        this.paytKind = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSum(BigInteger value) {
        this.sum = value;
    }

    /**
     * Gets the value of the paymentPrecedence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPrecedence() {
        return paymentPrecedence;
    }

    /**
     * Sets the value of the paymentPrecedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPrecedence(String value) {
        this.paymentPrecedence = value;
    }

    /**
     * Gets the value of the reqSettlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqSettlementDate() {
        return reqSettlementDate;
    }

    /**
     * Sets the value of the reqSettlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqSettlementDate(XMLGregorianCalendar value) {
        this.reqSettlementDate = value;
    }

    /**
     * Gets the value of the codePurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePurpose() {
        return codePurpose;
    }

    /**
     * Sets the value of the codePurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePurpose(String value) {
        this.codePurpose = value;
    }

}
