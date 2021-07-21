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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of Accounts (and optionally Clearing Circuits).
 * 
 * <p>Java class for AuthClaimAuthorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthClaimAuthorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountsList" type="{urn:cbr-ru:ed:v2.0}BICAccCSListType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthClaimAuthorType", propOrder = {
    "accountsList"
})
public class AuthClaimAuthorType {

    @XmlElement(name = "AccountsList", required = true)
    protected List<BICAccCSListType> accountsList;

    /**
     * Gets the value of the accountsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accountsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICAccCSListType }
     * 
     * 
     */
    public List<BICAccCSListType> getAccountsList() {
        if (accountsList == null) {
            accountsList = new ArrayList<BICAccCSListType>();
        }
        return this.accountsList;
    }

}
