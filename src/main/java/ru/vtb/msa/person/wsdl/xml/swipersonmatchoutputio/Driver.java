
package ru.vtb.msa.person.wsdl.xml.swipersonmatchoutputio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Driver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Driver">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DULIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DULType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Series" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfDriverPersonalAddress" type="{http://www.siebel.com/xml/SwiPersonMatchOutputIO}ListOfDriverPersonalAddress" minOccurs="0"/>
 *         &lt;element name="ListOfCandidate" type="{http://www.siebel.com/xml/SwiPersonMatchOutputIO}ListOfCandidate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Driver", propOrder = {
    "type",
    "typeCode",
    "birthDate",
    "dulIssueDate",
    "dulType",
    "firstName",
    "series",
    "lastName",
    "middleName",
    "number",
    "listOfDriverPersonalAddress",
    "listOfCandidate"
})
public class Driver {

    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "TypeCode")
    protected String typeCode;
    @XmlElement(name = "BirthDate")
    protected String birthDate;
    @XmlElement(name = "DULIssueDate")
    protected String dulIssueDate;
    @XmlElement(name = "DULType")
    protected String dulType;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "Series")
    protected String series;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "ListOfDriverPersonalAddress")
    protected ListOfDriverPersonalAddress listOfDriverPersonalAddress;
    @XmlElement(name = "ListOfCandidate")
    protected ListOfCandidate listOfCandidate;

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
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
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
     * Gets the value of the dulIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDULIssueDate() {
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
    public void setDULIssueDate(String value) {
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
    public String getDULType() {
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
    public void setDULType(String value) {
        this.dulType = value;
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
     * Gets the value of the listOfDriverPersonalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDriverPersonalAddress }
     *     
     */
    public ListOfDriverPersonalAddress getListOfDriverPersonalAddress() {
        return listOfDriverPersonalAddress;
    }

    /**
     * Sets the value of the listOfDriverPersonalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDriverPersonalAddress }
     *     
     */
    public void setListOfDriverPersonalAddress(ListOfDriverPersonalAddress value) {
        this.listOfDriverPersonalAddress = value;
    }

    /**
     * Gets the value of the listOfCandidate property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCandidate }
     *     
     */
    public ListOfCandidate getListOfCandidate() {
        return listOfCandidate;
    }

    /**
     * Sets the value of the listOfCandidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCandidate }
     *     
     */
    public void setListOfCandidate(ListOfCandidate value) {
        this.listOfCandidate = value;
    }

}
