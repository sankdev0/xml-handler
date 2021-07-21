//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 04:08:48 PM YEKT 
//


package com.sankdev.edbind;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Interbank Payment Order
 * 
 * <p>Java class for ED107 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ED107"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:cbr-ru:ed:v2.0}EPDFinOrg"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParticipantBusinessScenario" type="{urn:cbr-ru:ed:leaftypes:v2.0}ParticipantBusinessScenarioType" minOccurs="0"/&gt;
 *         &lt;element name="SettlementCondition" type="{urn:cbr-ru:ed:v2.0}SettlementCondition" minOccurs="0"/&gt;
 *         &lt;element name="Sndr2RecvrInfo" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max210TextType" minOccurs="0"/&gt;
 *         &lt;element name="InitialED" type="{urn:cbr-ru:ed:v2.0}EDRefID" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingDetails" type="{urn:cbr-ru:ed:v2.0}ProcessingDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TransKind" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}TwoDigitCodeType" fixed="01" /&gt;
 *       &lt;attribute name="Priority" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}PaytPriorityCodeType" fixed="5" /&gt;
 *       &lt;attribute name="SystemCode" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}SystemCodeType" /&gt;
 *       &lt;attribute name="PaymentID" type="{urn:cbr-ru:ed:leaftypes:v2.0}PaymentIDType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ED107", propOrder = {
    "participantBusinessScenario",
    "settlementCondition",
    "sndr2RecvrInfo",
    "initialED",
    "processingDetails"
})
public class ED107
    extends EPDFinOrg
{

    @XmlElement(name = "ParticipantBusinessScenario")
    @XmlSchemaType(name = "string")
    protected ParticipantBusinessScenarioType participantBusinessScenario;
    @XmlElement(name = "SettlementCondition")
    protected SettlementCondition settlementCondition;
    @XmlElement(name = "Sndr2RecvrInfo")
    protected String sndr2RecvrInfo;
    @XmlElement(name = "InitialED")
    protected EDRefID initialED;
    @XmlElement(name = "ProcessingDetails")
    protected ProcessingDetails processingDetails;
    @XmlAttribute(name = "TransKind", required = true)
    protected String transKind;
    @XmlAttribute(name = "Priority", required = true)
    protected String priority;
    @XmlAttribute(name = "SystemCode", required = true)
    protected String systemCode;
    @XmlAttribute(name = "PaymentID")
    protected String paymentID;

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
     * Gets the value of the sndr2RecvrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndr2RecvrInfo() {
        return sndr2RecvrInfo;
    }

    /**
     * Sets the value of the sndr2RecvrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndr2RecvrInfo(String value) {
        this.sndr2RecvrInfo = value;
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
            return "01";
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
        if (priority == null) {
            return "5";
        } else {
            return priority;
        }
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

}
