
package ru.vtb.msa.person.wsdl.xml.swipersonmatchoutputio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfCandidate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfCandidate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Candidate" type="{http://www.siebel.com/xml/SwiPersonMatchOutputIO}Candidate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCandidate", propOrder = {
    "candidate"
})
public class ListOfCandidate {

    @XmlElement(name = "Candidate")
    protected List<Candidate> candidate;

    /**
     * Gets the value of the candidate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the candidate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCandidate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Candidate }
     * 
     * 
     */
    public List<Candidate> getCandidate() {
        if (candidate == null) {
            candidate = new ArrayList<Candidate>();
        }
        return this.candidate;
    }

}
