
package ru.vtb.msa.person.wsdl.xml.swipersonmatchoutputio;

import ru.vtb.msa.person.wsdl.xml.TypeCheckObject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contact_AlternatePhone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact_AlternatePhone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrustFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotFormFullPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameExternalSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginExternalSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact_AlternatePhone", propOrder = {
    "trustFlag",
    "notFormFullPhone",
    "phoneType",
    "endDate",
    "startDate",
    "updateDate",
    "nameExternalSystem",
    "loginExternalSystem",
    "phoneRegion",
    "operatorName",
    "phoneValue",
    "fullPhone"
})
public class ContactAlternatePhone implements TypeCheckObject {

    @XmlElement(name = "TrustFlag")
    protected String trustFlag;
    @XmlElement(name = "NotFormFullPhone")
    protected String notFormFullPhone;
    @XmlElement(name = "PhoneType")
    protected String phoneType;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "UpdateDate")
    protected String updateDate;
    @XmlElement(name = "NameExternalSystem")
    protected String nameExternalSystem;
    @XmlElement(name = "LoginExternalSystem")
    protected String loginExternalSystem;
    @XmlElement(name = "PhoneRegion")
    protected String phoneRegion;
    @XmlElement(name = "OperatorName")
    protected String operatorName;
    @XmlElement(name = "PhoneValue")
    protected String phoneValue;
    @XmlElement(name = "FullPhone")
    protected String fullPhone;


    @Override
    public String getType() {
        return this.phoneType;
    }

    /**
     * Gets the value of the trustFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustFlag() {
        return trustFlag;
    }

    /**
     * Sets the value of the trustFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustFlag(String value) {
        this.trustFlag = value;
    }

    /**
     * Gets the value of the notFormFullPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotFormFullPhone() {
        return notFormFullPhone;
    }

    /**
     * Sets the value of the notFormFullPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotFormFullPhone(String value) {
        this.notFormFullPhone = value;
    }

    /**
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneType(String value) {
        this.phoneType = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the nameExternalSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameExternalSystem() {
        return nameExternalSystem;
    }

    /**
     * Sets the value of the nameExternalSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameExternalSystem(String value) {
        this.nameExternalSystem = value;
    }

    /**
     * Gets the value of the loginExternalSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginExternalSystem() {
        return loginExternalSystem;
    }

    /**
     * Sets the value of the loginExternalSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginExternalSystem(String value) {
        this.loginExternalSystem = value;
    }

    /**
     * Gets the value of the phoneRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneRegion() {
        return phoneRegion;
    }

    /**
     * Sets the value of the phoneRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneRegion(String value) {
        this.phoneRegion = value;
    }

    /**
     * Gets the value of the operatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Sets the value of the operatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
    }

    /**
     * Gets the value of the phoneValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneValue() {
        return phoneValue;
    }

    /**
     * Sets the value of the phoneValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneValue(String value) {
        this.phoneValue = value;
    }

    /**
     * Gets the value of the fullPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullPhone() {
        return fullPhone;
    }

    /**
     * Sets the value of the fullPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullPhone(String value) {
        this.fullPhone = value;
    }

}
