
package ru.vtb.msa.person.wsdl.xml.swipersonmatchoutputio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contact_INSPersonalAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact_INSPersonalAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrustFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalAddressValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalApartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPrefCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPrefDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginExternalSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameExternalSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPrefCityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPrefDistrictType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalNotFormAddrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalHousing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalKLADRCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalOKATOCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalAddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPrefStateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPrefSettlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPrefSettlementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPrefStreetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPrefState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPrefStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPersonalPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact_INSPersonalAddress", propOrder = {
    "trustFlag",
    "countryCode",
    "insPersonalAddressType",
    "insPersonalAddressValue",
    "insPersonalApartmentNumber",
    "insPersonalPrefCity",
    "insPersonalCountry",
    "insPersonalPrefDistrict",
    "insPersonalBuilding",
    "updateDate",
    "loginExternalSystem",
    "nameExternalSystem",
    "insPersonalPrefCityType",
    "insPersonalPrefDistrictType",
    "insPersonalEndDate",
    "insPersonalNotFormAddrName",
    "insPersonalHousing",
    "insPersonalKLADRCode",
    "insPersonalOKATOCode",
    "insPersonalAddressName",
    "insPersonalPrefStateType",
    "insPersonalRegion",
    "insPersonalPrefSettlement",
    "insPersonalPrefSettlementType",
    "insPersonalPrefStreetType",
    "insPersonalPrefState",
    "insPersonalStartDate",
    "insPersonalPrefStreet",
    "insPersonalHouse",
    "insPersonalPostalCode"
})
public class ContactINSPersonalAddress {

    @XmlElement(name = "TrustFlag")
    protected String trustFlag;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "INSPersonalAddressType")
    protected String insPersonalAddressType;
    @XmlElement(name = "INSPersonalAddressValue")
    protected String insPersonalAddressValue;
    @XmlElement(name = "INSPersonalApartmentNumber")
    protected String insPersonalApartmentNumber;
    @XmlElement(name = "INSPersonalPrefCity")
    protected String insPersonalPrefCity;
    @XmlElement(name = "INSPersonalCountry")
    protected String insPersonalCountry;
    @XmlElement(name = "INSPersonalPrefDistrict")
    protected String insPersonalPrefDistrict;
    @XmlElement(name = "INSPersonalBuilding")
    protected String insPersonalBuilding;
    @XmlElement(name = "UpdateDate")
    protected String updateDate;
    @XmlElement(name = "LoginExternalSystem")
    protected String loginExternalSystem;
    @XmlElement(name = "NameExternalSystem")
    protected String nameExternalSystem;
    @XmlElement(name = "INSPersonalPrefCityType")
    protected String insPersonalPrefCityType;
    @XmlElement(name = "INSPersonalPrefDistrictType")
    protected String insPersonalPrefDistrictType;
    @XmlElement(name = "INSPersonalEndDate")
    protected String insPersonalEndDate;
    @XmlElement(name = "INSPersonalNotFormAddrName")
    protected String insPersonalNotFormAddrName;
    @XmlElement(name = "INSPersonalHousing")
    protected String insPersonalHousing;
    @XmlElement(name = "INSPersonalKLADRCode")
    protected String insPersonalKLADRCode;
    @XmlElement(name = "INSPersonalOKATOCode")
    protected String insPersonalOKATOCode;
    @XmlElement(name = "INSPersonalAddressName")
    protected String insPersonalAddressName;
    @XmlElement(name = "INSPersonalPrefStateType")
    protected String insPersonalPrefStateType;
    @XmlElement(name = "INSPersonalRegion")
    protected String insPersonalRegion;
    @XmlElement(name = "INSPersonalPrefSettlement")
    protected String insPersonalPrefSettlement;
    @XmlElement(name = "INSPersonalPrefSettlementType")
    protected String insPersonalPrefSettlementType;
    @XmlElement(name = "INSPersonalPrefStreetType")
    protected String insPersonalPrefStreetType;
    @XmlElement(name = "INSPersonalPrefState")
    protected String insPersonalPrefState;
    @XmlElement(name = "INSPersonalStartDate")
    protected String insPersonalStartDate;
    @XmlElement(name = "INSPersonalPrefStreet")
    protected String insPersonalPrefStreet;
    @XmlElement(name = "INSPersonalHouse")
    protected String insPersonalHouse;
    @XmlElement(name = "INSPersonalPostalCode")
    protected String insPersonalPostalCode;

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
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the insPersonalAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalAddressType() {
        return insPersonalAddressType;
    }

    /**
     * Sets the value of the insPersonalAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPersonalAddressType(String value) {
        this.insPersonalAddressType = value;
    }

    /**
     * Gets the value of the insPersonalAddressValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalAddressValue() {
        return insPersonalAddressValue;
    }

    /**
     * Sets the value of the insPersonalAddressValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPersonalAddressValue(String value) {
        this.insPersonalAddressValue = value;
    }

    /**
     * Gets the value of the insPersonalApartmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalApartmentNumber() {
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
    public void setINSPersonalApartmentNumber(String value) {
        this.insPersonalApartmentNumber = value;
    }

    /**
     * Gets the value of the insPersonalPrefCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalPrefCity() {
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
    public String getINSPersonalCountry() {
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
    public String getINSPersonalPrefDistrict() {
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
    public void setINSPersonalPrefDistrict(String value) {
        this.insPersonalPrefDistrict = value;
    }

    /**
     * Gets the value of the insPersonalBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalBuilding() {
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
    public void setINSPersonalBuilding(String value) {
        this.insPersonalBuilding = value;
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
     * Gets the value of the insPersonalPrefCityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalPrefCityType() {
        return insPersonalPrefCityType;
    }

    /**
     * Sets the value of the insPersonalPrefCityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPersonalPrefCityType(String value) {
        this.insPersonalPrefCityType = value;
    }

    /**
     * Gets the value of the insPersonalPrefDistrictType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalPrefDistrictType() {
        return insPersonalPrefDistrictType;
    }

    /**
     * Sets the value of the insPersonalPrefDistrictType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPersonalPrefDistrictType(String value) {
        this.insPersonalPrefDistrictType = value;
    }

    /**
     * Gets the value of the insPersonalEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalEndDate() {
        return insPersonalEndDate;
    }

    /**
     * Sets the value of the insPersonalEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPersonalEndDate(String value) {
        this.insPersonalEndDate = value;
    }

    /**
     * Gets the value of the insPersonalNotFormAddrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalNotFormAddrName() {
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
    public void setINSPersonalNotFormAddrName(String value) {
        this.insPersonalNotFormAddrName = value;
    }

    /**
     * Gets the value of the insPersonalHousing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalHousing() {
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
    public void setINSPersonalHousing(String value) {
        this.insPersonalHousing = value;
    }

    /**
     * Gets the value of the insPersonalKLADRCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalKLADRCode() {
        return insPersonalKLADRCode;
    }

    /**
     * Sets the value of the insPersonalKLADRCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPersonalKLADRCode(String value) {
        this.insPersonalKLADRCode = value;
    }

    /**
     * Gets the value of the insPersonalOKATOCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalOKATOCode() {
        return insPersonalOKATOCode;
    }

    /**
     * Sets the value of the insPersonalOKATOCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPersonalOKATOCode(String value) {
        this.insPersonalOKATOCode = value;
    }

    /**
     * Gets the value of the insPersonalAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalAddressName() {
        return insPersonalAddressName;
    }

    /**
     * Sets the value of the insPersonalAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPersonalAddressName(String value) {
        this.insPersonalAddressName = value;
    }

    /**
     * Gets the value of the insPersonalPrefStateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalPrefStateType() {
        return insPersonalPrefStateType;
    }

    /**
     * Sets the value of the insPersonalPrefStateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPersonalPrefStateType(String value) {
        this.insPersonalPrefStateType = value;
    }

    /**
     * Gets the value of the insPersonalRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalRegion() {
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
    public void setINSPersonalRegion(String value) {
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
    public String getINSPersonalPrefSettlement() {
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
    public void setINSPersonalPrefSettlement(String value) {
        this.insPersonalPrefSettlement = value;
    }

    /**
     * Gets the value of the insPersonalPrefSettlementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalPrefSettlementType() {
        return insPersonalPrefSettlementType;
    }

    /**
     * Sets the value of the insPersonalPrefSettlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPersonalPrefSettlementType(String value) {
        this.insPersonalPrefSettlementType = value;
    }

    /**
     * Gets the value of the insPersonalPrefStreetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalPrefStreetType() {
        return insPersonalPrefStreetType;
    }

    /**
     * Sets the value of the insPersonalPrefStreetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPersonalPrefStreetType(String value) {
        this.insPersonalPrefStreetType = value;
    }

    /**
     * Gets the value of the insPersonalPrefState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalPrefState() {
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
    public void setINSPersonalPrefState(String value) {
        this.insPersonalPrefState = value;
    }

    /**
     * Gets the value of the insPersonalStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalStartDate() {
        return insPersonalStartDate;
    }

    /**
     * Sets the value of the insPersonalStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPersonalStartDate(String value) {
        this.insPersonalStartDate = value;
    }

    /**
     * Gets the value of the insPersonalPrefStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalPrefStreet() {
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
    public void setINSPersonalPrefStreet(String value) {
        this.insPersonalPrefStreet = value;
    }

    /**
     * Gets the value of the insPersonalHouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalHouse() {
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
    public void setINSPersonalHouse(String value) {
        this.insPersonalHouse = value;
    }

    /**
     * Gets the value of the insPersonalPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPersonalPostalCode() {
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
    public void setINSPersonalPostalCode(String value) {
        this.insPersonalPostalCode = value;
    }

}
