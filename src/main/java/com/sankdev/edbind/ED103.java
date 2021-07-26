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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Payment Request
 * 
 * <p>Java class for ED103 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ED103"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:cbr-ru:ed:v2.0}EPDComplete"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IndirectParticipantInfo" type="{urn:cbr-ru:ed:v2.0}IndirectParticipantInfoType" minOccurs="0"/&gt;
 *         &lt;element name="ParticipantBusinessScenario" type="{urn:cbr-ru:ed:leaftypes:v2.0}ParticipantBusinessScenarioType" minOccurs="0"/&gt;
 *         &lt;element name="SettlementCondition" type="{urn:cbr-ru:ed:v2.0}SettlementCondition" minOccurs="0"/&gt;
 *         &lt;element name="Purpose" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max210TextType"/&gt;
 *         &lt;element name="InitialED" type="{urn:cbr-ru:ed:v2.0}EDRefID" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingDetails" type="{urn:cbr-ru:ed:v2.0}ProcessingDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TransKind" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}TwoDigitCodeType" fixed="02" /&gt;
 *       &lt;attribute name="Priority" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}PaytPriorityCodeType" /&gt;
 *       &lt;attribute name="PaytCondition" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" /&gt;
 *       &lt;attribute name="AcptTerm" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDayQuantityType" /&gt;
 *       &lt;attribute name="DocDispatchDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *       &lt;attribute name="ReceiptDateCollectBank" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *       &lt;attribute name="ReceiptDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *       &lt;attribute name="FileDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *       &lt;attribute name="ChargeOffDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *       &lt;attribute name="MaturityDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *       &lt;attribute name="AcptSum" type="{urn:cbr-ru:ed:leaftypes:v2.0}KopeckAmountType" /&gt;
 *       &lt;attribute name="SystemCode" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}SystemCodeType" /&gt;
 *       &lt;attribute name="PaymentID" type="{urn:cbr-ru:ed:leaftypes:v2.0}PaymentIDType" /&gt;
 *       &lt;attribute name="ResField" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max35TextType" /&gt;
 *       &lt;attribute name="OperationID" type="{urn:cbr-ru:ed:leaftypes:v2.0}OperationIDType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ED103", propOrder = {
    "indirectParticipantInfo",
    "participantBusinessScenario",
    "settlementCondition",
    "purpose",
    "initialED",
    "processingDetails"
})
public class ED103
    extends EPDComplete
{

    @XmlElement(name = "IndirectParticipantInfo")
    protected IndirectParticipantInfoType indirectParticipantInfo;
    @XmlElement(name = "ParticipantBusinessScenario")
    @XmlSchemaType(name = "string")
    protected ParticipantBusinessScenarioType participantBusinessScenario;
    @XmlElement(name = "SettlementCondition")
    protected SettlementCondition settlementCondition;
    @XmlElement(name = "Purpose", required = true)
    protected String purpose;
    @XmlElement(name = "InitialED")
    protected EDRefID initialED;
    @XmlElement(name = "ProcessingDetails")
    protected ProcessingDetails processingDetails;
    @XmlAttribute(name = "TransKind", required = true)
    protected String transKind;
    @XmlAttribute(name = "Priority", required = true)
    protected String priority;
    @XmlAttribute(name = "PaytCondition", required = true)
    protected String paytCondition;
    @XmlAttribute(name = "AcptTerm")
    protected BigInteger acptTerm;
    @XmlAttribute(name = "DocDispatchDate")
    protected XMLGregorianCalendar docDispatchDate;
    @XmlAttribute(name = "ReceiptDateCollectBank")
    protected XMLGregorianCalendar receiptDateCollectBank;
    @XmlAttribute(name = "ReceiptDate")
    protected XMLGregorianCalendar receiptDate;
    @XmlAttribute(name = "FileDate")
    protected XMLGregorianCalendar fileDate;
    @XmlAttribute(name = "ChargeOffDate")
    protected XMLGregorianCalendar chargeOffDate;
    @XmlAttribute(name = "MaturityDate")
    protected XMLGregorianCalendar maturityDate;
    @XmlAttribute(name = "AcptSum")
    protected BigInteger acptSum;
    @XmlAttribute(name = "SystemCode", required = true)
    protected String systemCode;
    @XmlAttribute(name = "PaymentID")
    protected String paymentID;
    @XmlAttribute(name = "ResField")
    protected String resField;
    @XmlAttribute(name = "OperationID")
    protected String operationID;

    /**
     * Gets the value of the indirectParticipantInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IndirectParticipantInfoType }
     *     
     */
    public IndirectParticipantInfoType getIndirectParticipantInfo() {
        return indirectParticipantInfo;
    }

    /**
     * Sets the value of the indirectParticipantInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndirectParticipantInfoType }
     *     
     */
    public void setIndirectParticipantInfo(IndirectParticipantInfoType value) {
        this.indirectParticipantInfo = value;
    }

    /**
     * Gets the value of the participantBusinessScenario property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantBusinessScenarioType }
     *     
     */
    public ParticipantBusinessScenarioType getParticipantBusinessScenario() {
        return participantBusinessScenario;
    }

    /**
     * Sets the value of the participantBusinessScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantBusinessScenarioType }
     *     
     */
    public void setParticipantBusinessScenario(ParticipantBusinessScenarioType value) {
        this.participantBusinessScenario = value;
    }

    /**
     * Gets the value of the settlementCondition property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCondition }
     *     
     */
    public SettlementCondition getSettlementCondition() {
        return settlementCondition;
    }

    /**
     * Sets the value of the settlementCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCondition }
     *     
     */
    public void setSettlementCondition(SettlementCondition value) {
        this.settlementCondition = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the initialED property.
     * 
     * @return
     *     possible object is
     *     {@link EDRefID }
     *     
     */
    public EDRefID getInitialED() {
        return initialED;
    }

    /**
     * Sets the value of the initialED property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDRefID }
     *     
     */
    public void setInitialED(EDRefID value) {
        this.initialED = value;
    }

    /**
     * Gets the value of the processingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingDetails }
     *     
     */
    public ProcessingDetails getProcessingDetails() {
        return processingDetails;
    }

    /**
     * Sets the value of the processingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingDetails }
     *     
     */
    public void setProcessingDetails(ProcessingDetails value) {
        this.processingDetails = value;
    }

    /**
     * Gets the value of the transKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransKind() {
        if (transKind == null) {
            return "02";
        } else {
            return transKind;
        }
    }

    /**
     * Sets the value of the transKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransKind(String value) {
        this.transKind = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the paytCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaytCondition() {
        return paytCondition;
    }

    /**
     * Sets the value of the paytCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaytCondition(String value) {
        this.paytCondition = value;
    }

    /**
     * Gets the value of the acptTerm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcptTerm() {
        return acptTerm;
    }

    /**
     * Sets the value of the acptTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcptTerm(BigInteger value) {
        this.acptTerm = value;
    }

    /**
     * Gets the value of the docDispatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDispatchDate() {
        return docDispatchDate;
    }

    /**
     * Sets the value of the docDispatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDispatchDate(XMLGregorianCalendar value) {
        this.docDispatchDate = value;
    }

    /**
     * Gets the value of the receiptDateCollectBank property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDateCollectBank() {
        return receiptDateCollectBank;
    }

    /**
     * Sets the value of the receiptDateCollectBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDateCollectBank(XMLGregorianCalendar value) {
        this.receiptDateCollectBank = value;
    }

    /**
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

    /**
     * Gets the value of the fileDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFileDate() {
        return fileDate;
    }

    /**
     * Sets the value of the fileDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFileDate(XMLGregorianCalendar value) {
        this.fileDate = value;
    }

    /**
     * Gets the value of the chargeOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChargeOffDate() {
        return chargeOffDate;
    }

    /**
     * Sets the value of the chargeOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChargeOffDate(XMLGregorianCalendar value) {
        this.chargeOffDate = value;
    }

    /**
     * Gets the value of the maturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaturityDate() {
        return maturityDate;
    }

    /**
     * Sets the value of the maturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaturityDate(XMLGregorianCalendar value) {
        this.maturityDate = value;
    }

    /**
     * Gets the value of the acptSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcptSum() {
        return acptSum;
    }

    /**
     * Sets the value of the acptSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcptSum(BigInteger value) {
        this.acptSum = value;
    }

    /**
     * Gets the value of the systemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * Sets the value of the systemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

    /**
     * Gets the value of the paymentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentID(String value) {
        this.paymentID = value;
    }

    /**
     * Gets the value of the resField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResField() {
        return resField;
    }

    /**
     * Sets the value of the resField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResField(String value) {
        this.resField = value;
    }

    /**
     * Gets the value of the operationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationID() {
        return operationID;
    }

    /**
     * Sets the value of the operationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationID(String value) {
        this.operationID = value;
    }

}
