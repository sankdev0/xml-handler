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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Bank Order
 * 
 * <p>Java class for ED109 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ED109"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:cbr-ru:ed:v2.0}ED"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccDoc" type="{urn:cbr-ru:ed:v2.0}AccDocRefID"/&gt;
 *         &lt;element name="PayerOrd" type="{urn:cbr-ru:ed:v2.0}CustomerOrderType"/&gt;
 *         &lt;element name="PayeeOrd" type="{urn:cbr-ru:ed:v2.0}CustomerOrderType"/&gt;
 *         &lt;element name="Purpose" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max210TextType"/&gt;
 *         &lt;element name="Field7a" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max35TextType" minOccurs="0"/&gt;
 *         &lt;element name="FreeFields" type="{urn:cbr-ru:ed:v2.0}FreeFieldsType" minOccurs="0"/&gt;
 *         &lt;element name="InitialED" type="{urn:cbr-ru:ed:v2.0}EDRefID" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingDetails" type="{urn:cbr-ru:ed:v2.0}ProcessingDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EDReceiver" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDDrawerIDType" /&gt;
 *       &lt;attribute name="SystemCode" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}SystemCodeType" /&gt;
 *       &lt;attribute name="Sum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}KopeckAmountType" /&gt;
 *       &lt;attribute name="TransKind" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}TwoDigitCodeType" fixed="17" /&gt;
 *       &lt;attribute name="Priority" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}PaytPriorityCodeType" /&gt;
 *       &lt;attribute name="PaymentPrecedence" type="{urn:cbr-ru:ed:leaftypes:v2.0}TwoDigitCodeType" /&gt;
 *       &lt;attribute name="ReqSettlementDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ED109", propOrder = {
    "accDoc",
    "payerOrd",
    "payeeOrd",
    "purpose",
    "field7A",
    "freeFields",
    "initialED",
    "processingDetails"
})
public class ED109
    extends ED
{

    @XmlElement(name = "AccDoc", required = true)
    protected AccDocRefID accDoc;
    @XmlElement(name = "PayerOrd", required = true)
    protected CustomerOrderType payerOrd;
    @XmlElement(name = "PayeeOrd", required = true)
    protected CustomerOrderType payeeOrd;
    @XmlElement(name = "Purpose", required = true)
    protected String purpose;
    @XmlElement(name = "Field7a")
    protected String field7A;
    @XmlElement(name = "FreeFields")
    protected FreeFieldsType freeFields;
    @XmlElement(name = "InitialED")
    protected EDRefID initialED;
    @XmlElement(name = "ProcessingDetails")
    protected ProcessingDetails processingDetails;
    @XmlAttribute(name = "EDReceiver")
    protected String edReceiver;
    @XmlAttribute(name = "SystemCode", required = true)
    protected String systemCode;
    @XmlAttribute(name = "Sum", required = true)
    protected BigInteger sum;
    @XmlAttribute(name = "TransKind", required = true)
    protected String transKind;
    @XmlAttribute(name = "Priority", required = true)
    protected String priority;
    @XmlAttribute(name = "PaymentPrecedence")
    protected String paymentPrecedence;
    @XmlAttribute(name = "ReqSettlementDate")
    protected XMLGregorianCalendar reqSettlementDate;

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
     * Gets the value of the payerOrd property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderType }
     *     
     */
    public CustomerOrderType getPayerOrd() {
        return payerOrd;
    }

    /**
     * Sets the value of the payerOrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderType }
     *     
     */
    public void setPayerOrd(CustomerOrderType value) {
        this.payerOrd = value;
    }

    /**
     * Gets the value of the payeeOrd property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderType }
     *     
     */
    public CustomerOrderType getPayeeOrd() {
        return payeeOrd;
    }

    /**
     * Sets the value of the payeeOrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderType }
     *     
     */
    public void setPayeeOrd(CustomerOrderType value) {
        this.payeeOrd = value;
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
     * Gets the value of the field7A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField7A() {
        return field7A;
    }

    /**
     * Sets the value of the field7A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField7A(String value) {
        this.field7A = value;
    }

    /**
     * Gets the value of the freeFields property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFieldsType }
     *     
     */
    public FreeFieldsType getFreeFields() {
        return freeFields;
    }

    /**
     * Sets the value of the freeFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFieldsType }
     *     
     */
    public void setFreeFields(FreeFieldsType value) {
        this.freeFields = value;
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
     * Gets the value of the transKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransKind() {
        if (transKind == null) {
            return "17";
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

}
