
package ru.vtb.msa.person.wsdl.dataquality;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vtb.msa.person.wsdl.xml.swipersonmatchinputio.SwiPersonMatchInputIO;


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
 *         &lt;element ref="{http://www.siebel.com/xml/SwiPersonMatchInputIO}SwiPersonMatchInputIO"/>
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
    "swiPersonMatchInputIO"
})
@XmlRootElement(name = "PersonMatch_Input")
public class PersonMatchInput {

    @XmlElement(name = "SwiPersonMatchInputIO", namespace = "http://www.siebel.com/xml/SwiPersonMatchInputIO", required = true)
    protected SwiPersonMatchInputIO swiPersonMatchInputIO;

    /**
     * Gets the value of the swiPersonMatchInputIO property.
     * 
     * @return
     *     possible object is
     *     {@link SwiPersonMatchInputIO }
     *     
     */
    public SwiPersonMatchInputIO getSwiPersonMatchInputIO() {
        return swiPersonMatchInputIO;
    }

    /**
     * Sets the value of the swiPersonMatchInputIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwiPersonMatchInputIO }
     *     
     */
    public void setSwiPersonMatchInputIO(SwiPersonMatchInputIO value) {
        this.swiPersonMatchInputIO = value;
    }

}
