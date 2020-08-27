
package ru.vtb.msa.person.wsdl.xml.swipersonmatchoutputio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfDriverPersonalAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfDriverPersonalAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DriverPersonalAddress" type="{http://www.siebel.com/xml/SwiPersonMatchOutputIO}DriverPersonalAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDriverPersonalAddress", propOrder = {
    "driverPersonalAddress"
})
public class ListOfDriverPersonalAddress {

    @XmlElement(name = "DriverPersonalAddress")
    protected List<DriverPersonalAddress> driverPersonalAddress;

    /**
     * Gets the value of the driverPersonalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverPersonalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverPersonalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriverPersonalAddress }
     * 
     * 
     */
    public List<DriverPersonalAddress> getDriverPersonalAddress() {
        if (driverPersonalAddress == null) {
            driverPersonalAddress = new ArrayList<DriverPersonalAddress>();
        }
        return this.driverPersonalAddress;
    }

}
