
package ru.vtb.msa.person.wsdl.xml.swipersonmatchoutputio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfContact_INSPersonalAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfContact_INSPersonalAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contact_INSPersonalAddress" type="{http://www.siebel.com/xml/SwiPersonMatchOutputIO}Contact_INSPersonalAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfContact_INSPersonalAddress", propOrder = {
    "contactINSPersonalAddress"
})
public class ListOfContactINSPersonalAddress {

    @XmlElement(name = "Contact_INSPersonalAddress")
    protected List<ContactINSPersonalAddress> contactINSPersonalAddress;

    /**
     * Gets the value of the contactINSPersonalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactINSPersonalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactINSPersonalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactINSPersonalAddress }
     * 
     * 
     */
    public List<ContactINSPersonalAddress> getContactINSPersonalAddress() {
        if (contactINSPersonalAddress == null) {
            contactINSPersonalAddress = new ArrayList<ContactINSPersonalAddress>();
        }
        return this.contactINSPersonalAddress;
    }

}
