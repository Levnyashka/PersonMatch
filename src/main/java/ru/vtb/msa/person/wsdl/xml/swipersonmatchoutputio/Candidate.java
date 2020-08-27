
package ru.vtb.msa.person.wsdl.xml.swipersonmatchoutputio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Candidate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Candidate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Citizenship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LFMGenitive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LFMDative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LFMAblative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedExternalSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfContact_INSPersonalAddress" type="{http://www.siebel.com/xml/SwiPersonMatchOutputIO}ListOfContact_INSPersonalAddress" minOccurs="0"/>
 *         &lt;element name="ListOfContact_PUBContactIdentity" type="{http://www.siebel.com/xml/SwiPersonMatchOutputIO}ListOfContact_PUBContactIdentity" minOccurs="0"/>
 *         &lt;element name="ListOfContact_AlternatePhone" type="{http://www.siebel.com/xml/SwiPersonMatchOutputIO}ListOfContact_AlternatePhone" minOccurs="0"/>
 *         &lt;element name="ListOfCIFContactReference" type="{http://www.siebel.com/xml/SwiPersonMatchOutputIO}ListOfCIFContactReference" minOccurs="0"/>
 *         &lt;element name="ListOfContact_Segment" type="{http://www.siebel.com/xml/SwiPersonMatchOutputIO}ListOfContact_Segment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Candidate", propOrder = {
    "matchScore",
    "partyUId",
    "birthDate",
    "updateDate",
    "birthPlace",
    "firstName",
    "citizenship",
    "lastName",
    "middleName",
    "type",
    "mf",
    "inn",
    "lfmGenitive",
    "lfmDative",
    "lfmAblative",
    "createdExternalSystem",
    "maritalStatus",
    "listOfContactINSPersonalAddress",
    "listOfContactPUBContactIdentity",
    "listOfContactAlternatePhone",
    "listOfCIFContactReference",
    "listOfContactSegment"
})
public class Candidate {

    @XmlElement(name = "MatchScore")
    protected String matchScore;
    @XmlElement(name = "PartyUId")
    protected String partyUId;
    @XmlElement(name = "BirthDate")
    protected String birthDate;
    @XmlElement(name = "UpdateDate")
    protected String updateDate;
    @XmlElement(name = "BirthPlace")
    protected String birthPlace;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "Citizenship")
    protected String citizenship;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "MF")
    protected String mf;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "LFMGenitive")
    protected String lfmGenitive;
    @XmlElement(name = "LFMDative")
    protected String lfmDative;
    @XmlElement(name = "LFMAblative")
    protected String lfmAblative;
    @XmlElement(name = "CreatedExternalSystem")
    protected String createdExternalSystem;
    @XmlElement(name = "MaritalStatus")
    protected String maritalStatus;
    @XmlElement(name = "ListOfContact_INSPersonalAddress")
    protected ListOfContactINSPersonalAddress listOfContactINSPersonalAddress;
    @XmlElement(name = "ListOfContact_PUBContactIdentity")
    protected ListOfContactPUBContactIdentity listOfContactPUBContactIdentity;
    @XmlElement(name = "ListOfContact_AlternatePhone")
    protected ListOfContactAlternatePhone listOfContactAlternatePhone;
    @XmlElement(name = "ListOfCIFContactReference")
    protected ListOfCIFContactReference listOfCIFContactReference;
    @XmlElement(name = "ListOfContact_Segment")
    protected ListOfContactSegment listOfContactSegment;

    /**
     * Gets the value of the matchScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchScore() {
        return matchScore;
    }

    /**
     * Sets the value of the matchScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchScore(String value) {
        this.matchScore = value;
    }

    /**
     * Gets the value of the partyUId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyUId() {
        return partyUId;
    }

    /**
     * Sets the value of the partyUId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyUId(String value) {
        this.partyUId = value;
    }

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
     * Gets the value of the birthPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
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
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenship(String value) {
        this.citizenship = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the mf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMF() {
        return mf;
    }

    /**
     * Sets the value of the mf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMF(String value) {
        this.mf = value;
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
     * Gets the value of the lfmGenitive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLFMGenitive() {
        return lfmGenitive;
    }

    /**
     * Sets the value of the lfmGenitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLFMGenitive(String value) {
        this.lfmGenitive = value;
    }

    /**
     * Gets the value of the lfmDative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLFMDative() {
        return lfmDative;
    }

    /**
     * Sets the value of the lfmDative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLFMDative(String value) {
        this.lfmDative = value;
    }

    /**
     * Gets the value of the lfmAblative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLFMAblative() {
        return lfmAblative;
    }

    /**
     * Sets the value of the lfmAblative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLFMAblative(String value) {
        this.lfmAblative = value;
    }

    /**
     * Gets the value of the createdExternalSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedExternalSystem() {
        return createdExternalSystem;
    }

    /**
     * Sets the value of the createdExternalSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedExternalSystem(String value) {
        this.createdExternalSystem = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the listOfContactINSPersonalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactINSPersonalAddress }
     *     
     */
    public ListOfContactINSPersonalAddress getListOfContactINSPersonalAddress() {
        return listOfContactINSPersonalAddress;
    }

    /**
     * Sets the value of the listOfContactINSPersonalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactINSPersonalAddress }
     *     
     */
    public void setListOfContactINSPersonalAddress(ListOfContactINSPersonalAddress value) {
        this.listOfContactINSPersonalAddress = value;
    }

    /**
     * Gets the value of the listOfContactPUBContactIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactPUBContactIdentity }
     *     
     */
    public ListOfContactPUBContactIdentity getListOfContactPUBContactIdentity() {
        return listOfContactPUBContactIdentity;
    }

    /**
     * Sets the value of the listOfContactPUBContactIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactPUBContactIdentity }
     *     
     */
    public void setListOfContactPUBContactIdentity(ListOfContactPUBContactIdentity value) {
        this.listOfContactPUBContactIdentity = value;
    }

    /**
     * Gets the value of the listOfContactAlternatePhone property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactAlternatePhone }
     *     
     */
    public ListOfContactAlternatePhone getListOfContactAlternatePhone() {
        return listOfContactAlternatePhone;
    }

    /**
     * Sets the value of the listOfContactAlternatePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactAlternatePhone }
     *     
     */
    public void setListOfContactAlternatePhone(ListOfContactAlternatePhone value) {
        this.listOfContactAlternatePhone = value;
    }

    /**
     * Gets the value of the listOfCIFContactReference property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCIFContactReference }
     *     
     */
    public ListOfCIFContactReference getListOfCIFContactReference() {
        return listOfCIFContactReference;
    }

    /**
     * Sets the value of the listOfCIFContactReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCIFContactReference }
     *     
     */
    public void setListOfCIFContactReference(ListOfCIFContactReference value) {
        this.listOfCIFContactReference = value;
    }

    /**
     * Gets the value of the listOfContactSegment property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactSegment }
     *     
     */
    public ListOfContactSegment getListOfContactSegment() {
        return listOfContactSegment;
    }

    /**
     * Sets the value of the listOfContactSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactSegment }
     *     
     */
    public void setListOfContactSegment(ListOfContactSegment value) {
        this.listOfContactSegment = value;
    }

}
