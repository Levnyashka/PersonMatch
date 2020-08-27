
package ru.vtb.msa.person.wsdl.xml.swipersonmatchoutputio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwiPersonMatchOutputIOTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwiPersonMatchOutputIOTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SwiPersonMatchOutputIO" type="{http://www.siebel.com/xml/SwiPersonMatchOutputIO}SwiPersonMatchOutputIO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwiPersonMatchOutputIOTopElmt", propOrder = {
    "swiPersonMatchOutputIO"
})
public class SwiPersonMatchOutputIOTopElmt {

    @XmlElement(name = "SwiPersonMatchOutputIO", required = true)
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
