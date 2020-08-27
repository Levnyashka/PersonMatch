
package ru.vtb.msa.person.wsdl.xml.swipersonmatchoutputio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfCIFContactReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfCIFContactReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIFContactReference" type="{http://www.siebel.com/xml/SwiPersonMatchOutputIO}CIFContactReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCIFContactReference", propOrder = {
    "cifContactReference"
})
public class ListOfCIFContactReference {

    @XmlElement(name = "CIFContactReference")
    protected List<CIFContactReference> cifContactReference;

    /**
     * Gets the value of the cifContactReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cifContactReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIFContactReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIFContactReference }
     * 
     * 
     */
    public List<CIFContactReference> getCIFContactReference() {
        if (cifContactReference == null) {
            cifContactReference = new ArrayList<CIFContactReference>();
        }
        return this.cifContactReference;
    }

}
