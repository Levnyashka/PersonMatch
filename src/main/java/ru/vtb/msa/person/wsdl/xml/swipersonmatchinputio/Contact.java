
package ru.vtb.msa.person.wsdl.xml.swipersonmatchinputio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalApartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPrefCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPrefDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Series" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalNotFormAddrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalHousing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPrefSettlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPrefState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPrefStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DULIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DULType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "birthDate",
    "firstName",
    "lastName",
    "middleName",
    "insPersonalApartmentNumber",
    "insPersonalBuilding",
    "insPersonalPrefCity",
    "insPersonalCountry",
    "insPersonalPrefDistrict",
    "number",
    "series",
    "email",
    "insPersonalNotFormAddrName",
    "fullPhone",
    "insPersonalHouse",
    "insPersonalHousing",
    "insPersonalPostalCode",
    "insPersonalRegion",
    "insPersonalPrefSettlement",
    "insPersonalPrefState",
    "insPersonalPrefStreet",
    "inn",
    "searchType",
    "dulIssueDate",
    "dulType"
})
public class Contact {

    @XmlElement(name = "BirthDate")
    protected String birthDate;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "INSPersonalApartmentNumber")
    protected String insPersonalApartmentNumber;
    @XmlElement(name = "INSPersonalBuilding")
    protected String insPersonalBuilding;
    @XmlElement(name = "INSPersonalPrefCity")
    protected String insPersonalPrefCity;
    @XmlElement(name = "INSPersonalCountry")
    protected String insPersonalCountry;
    @XmlElement(name = "INSPersonalPrefDistrict")
    protected String insPersonalPrefDistrict;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Series")
    protected String series;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "INSPersonalNotFormAddrName")
    protected String insPersonalNotFormAddrName;
    @XmlElement(name = "FullPhone")
    protected String fullPhone;
    @XmlElement(name = "INSPersonalHouse")
    protected String insPersonalHouse;
    @XmlElement(name = "INSPersonalHousing")
    protected String insPersonalHousing;
    @XmlElement(name = "INSPersonalPostalCode")
    protected String insPersonalPostalCode;
    @XmlElement(name = "INSPersonalRegion")
    protected String insPersonalRegion;
    @XmlElement(name = "INSPersonalPrefSettlement")
    protected String insPersonalPrefSettlement;
    @XmlElement(name = "INSPersonalPrefState")
    protected String insPersonalPrefState;
    @XmlElement(name = "INSPersonalPrefStreet")
    protected String insPersonalPrefStreet;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "SearchType", defaultValue = "cust")
    protected String searchType;
    @XmlElement(name = "DULIssueDate")
    protected String dulIssueDate;
    @XmlElement(name = "DULType")
    protected String dulType;

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the insPersonalApartmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsPersonalApartmentNumber() {
        return insPersonalApartmentNumber;
    }

    /**
     * Sets the value of the insPersonalApartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsPersonalApartmentNumber(String value) {
        this.insPersonalApartmentNumber = value;
    }

    /**
     * Gets the value of the insPersonalBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsPersonalBuilding() {
        return insPersonalBuilding;
    }

    /**
     * Sets the value of the insPersonalBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsPersonalBuilding(String value) {
        this.insPersonalBuilding = value;
    }

    /**
     * Gets the value of the insPersonalPrefCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsPersonalPrefCity() {
        return insPersonalPrefCity;
    }

    /**
     * Sets the value of the insPersonalPrefCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPersonalPrefCity(String value) {
        this.insPersonalPrefCity = value;
    }

    /**
     * Gets the value of the insPersonalCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsPersonalCountry() {
        return insPersonalCountry;
    }

    /**
     * Sets the value of the insPersonalCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPersonalCountry(String value) {
        this.insPersonalCountry = value;
    }

    /**
     * Gets the value of the insPersonalPrefDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsPersonalPrefDistrict() {
        return insPersonalPrefDistrict;
    }

    /**
     * Sets the value of the insPersonalPrefDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsPersonalPrefDistrict(String value) {
        this.insPersonalPrefDistrict = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeries(String value) {
        this.series = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the insPersonalNotFormAddrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsPersonalNotFormAddrName() {
        return insPersonalNotFormAddrName;
    }

    /**
     * Sets the value of the insPersonalNotFormAddrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsPersonalNotFormAddrName(String value) {
        this.insPersonalNotFormAddrName = value;
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

    /**
     * Gets the value of the insPersonalHouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsPersonalHouse() {
        return insPersonalHouse;
    }

    /**
     * Sets the value of the insPersonalHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsPersonalHouse(String value) {
        this.insPersonalHouse = value;
    }

    /**
     * Gets the value of the insPersonalHousing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsPersonalHousing() {
        return insPersonalHousing;
    }

    /**
     * Sets the value of the insPersonalHousing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsPersonalHousing(String value) {
        this.insPersonalHousing = value;
    }

    /**
     * Gets the value of the insPersonalPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsPersonalPostalCode() {
        return insPersonalPostalCode;
    }

    /**
     * Sets the value of the insPersonalPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsPersonalPostalCode(String value) {
        this.insPersonalPostalCode = value;
    }

    /**
     * Gets the value of the insPersonalRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsPersonalRegion() {
        return insPersonalRegion;
    }

    /**
     * Sets the value of the insPersonalRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsPersonalRegion(String value) {
        this.insPersonalRegion = value;
    }

    /**
     * Gets the value of the insPersonalPrefSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsPersonalPrefSettlement() {
        return insPersonalPrefSettlement;
    }

    /**
     * Sets the value of the insPersonalPrefSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsPersonalPrefSettlement(String value) {
        this.insPersonalPrefSettlement = value;
    }

    /**
     * Gets the value of the insPersonalPrefState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsPersonalPrefState() {
        return insPersonalPrefState;
    }

    /**
     * Sets the value of the insPersonalPrefState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsPersonalPrefState(String value) {
        this.insPersonalPrefState = value;
    }

    /**
     * Gets the value of the insPersonalPrefStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsPersonalPrefStreet() {
        return insPersonalPrefStreet;
    }

    /**
     * Sets the value of the insPersonalPrefStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsPersonalPrefStreet(String value) {
        this.insPersonalPrefStreet = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchType(String value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the dulIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDulIssueDate() {
        return dulIssueDate;
    }

    /**
     * Sets the value of the dulIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDulIssueDate(String value) {
        this.dulIssueDate = value;
    }

    /**
     * Gets the value of the dulType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDulType() {
        return dulType;
    }

    /**
     * Sets the value of the dulType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDulType(String value) {
        this.dulType = value;
    }

}
