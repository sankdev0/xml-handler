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
 * Participantís Accounts information.
 * 
 * <p>Java class for AccountsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccRstrList" type="{urn:cbr-ru:ed:v2.0}AccRstrListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Account" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" /&gt;
 *       &lt;attribute name="RegulationAccountType" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountType" /&gt;
 *       &lt;attribute name="CK" type="{urn:cbr-ru:ed:leaftypes:v2.0}Eq2TextType" /&gt;
 *       &lt;attribute name="AccountCBRBIC" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" /&gt;
 *       &lt;attribute name="DateIn" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *       &lt;attribute name="DateOut" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" /&gt;
 *       &lt;attribute name="AccountStatus" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountStatusType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountsType", propOrder = {
    "accRstrList"
})
public class AccountsType {

    @XmlElement(name = "AccRstrList")
    protected List<AccRstrListType> accRstrList;
    @XmlAttribute(name = "Account", required = true)
    protected String account;
    @XmlAttribute(name = "RegulationAccountType", required = true)
    protected AccountType regulationAccountType;
    @XmlAttribute(name = "CK")
    protected String ck;
    @XmlAttribute(name = "AccountCBRBIC", required = true)
    protected String accountCBRBIC;
    @XmlAttribute(name = "DateIn", required = true)
    protected XMLGregorianCalendar dateIn;
    @XmlAttribute(name = "DateOut")
    protected XMLGregorianCalendar dateOut;
    @XmlAttribute(name = "AccountStatus")
    protected AccountStatusType accountStatus;

    /**
     * Gets the value of the accRstrList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accRstrList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccRstrList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccRstrListType }
     * 
     * 
     */
    public List<AccRstrListType> getAccRstrList() {
        if (accRstrList == null) {
            accRstrList = new ArrayList<AccRstrListType>();
        }
        return this.accRstrList;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the regulationAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getRegulationAccountType() {
        return regulationAccountType;
    }

    /**
     * Sets the value of the regulationAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setRegulationAccountType(AccountType value) {
        this.regulationAccountType = value;
    }

    /**
     * Gets the value of the ck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCK() {
        return ck;
    }

    /**
     * Sets the value of the ck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCK(String value) {
        this.ck = value;
    }

    /**
     * Gets the value of the accountCBRBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCBRBIC() {
        return accountCBRBIC;
    }

    /**
     * Sets the value of the accountCBRBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCBRBIC(String value) {
        this.accountCBRBIC = value;
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
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatusType }
     *     
     */
    public AccountStatusType getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatusType }
     *     
     */
    public void setAccountStatus(AccountStatusType value) {
        this.accountStatus = value;
    }

}
