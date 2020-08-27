
package ru.vtb.msa.person.wsdl.xml.swipersonmatchoutputio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfContact_Segment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfContact_Segment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contact_Segment" type="{http://www.siebel.com/xml/SwiPersonMatchOutputIO}Contact_Segment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfContact_Segment", propOrder = {
    "contactSegment"
})
public class ListOfContactSegment {

    @XmlElement(name = "Contact_Segment")
    protected List<ContactSegment> contactSegment;

    /**
     * Gets the value of the contactSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactSegment }
     * 
     * 
     */
    public List<ContactSegment> getContactSegment() {
        if (contactSegment == null) {
            contactSegment = new ArrayList<ContactSegment>();
        }
        return this.contactSegment;
    }

}
