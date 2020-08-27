
package ru.vtb.msa.person.wsdl.xml.swipersonmatchoutputio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfContact_AlternatePhone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfContact_AlternatePhone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contact_AlternatePhone" type="{http://www.siebel.com/xml/SwiPersonMatchOutputIO}Contact_AlternatePhone" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfContact_AlternatePhone", propOrder = {
    "contactAlternatePhone"
})
public class ListOfContactAlternatePhone {

    @XmlElement(name = "Contact_AlternatePhone")
    protected List<ContactAlternatePhone> contactAlternatePhone;

    /**
     * Gets the value of the contactAlternatePhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactAlternatePhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactAlternatePhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactAlternatePhone }
     * 
     * 
     */
    public List<ContactAlternatePhone> getContactAlternatePhone() {
        if (contactAlternatePhone == null) {
            contactAlternatePhone = new ArrayList<ContactAlternatePhone>();
        }
        return this.contactAlternatePhone;
    }

}
