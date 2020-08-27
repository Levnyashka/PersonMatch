
package ru.vtb.msa.person.wsdl.dataquality;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vtb.msa.person.wsdl.xml.swipersonmatchoutputio.SwiPersonMatchOutputIO;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siebel.com/xml/SwiPersonMatchOutputIO}SwiPersonMatchOutputIO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "swiPersonMatchOutputIO"
})
@XmlRootElement(name = "PersonMatch_Output")
public class PersonMatchOutput {

    @XmlElement(name = "SwiPersonMatchOutputIO", namespace = "http://www.siebel.com/xml/SwiPersonMatchOutputIO", required = true)
    protected SwiPersonMatchOutputIO swiPersonMatchOutputIO;

    /**
     * Gets the value of the swiPersonMatchOutputIO property.
     * 
     * @return
     *     possible object is
     *     {@link SwiPersonMatchOutputIO }
     *     
     */
    public SwiPersonMatchOutputIO getSwiPersonMatchOutputIO() {
        return swiPersonMatchOutputIO;
    }

    /**
     * Sets the value of the swiPersonMatchOutputIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwiPersonMatchOutputIO }
     *     
     */
    public void setSwiPersonMatchOutputIO(SwiPersonMatchOutputIO value) {
        this.swiPersonMatchOutputIO = value;
    }

}
