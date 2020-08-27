
package ru.vtb.msa.person.wsdl.xml.swipersonmatchinputio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwiPersonMatchInputIOTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwiPersonMatchInputIOTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SwiPersonMatchInputIO" type="{http://www.siebel.com/xml/SwiPersonMatchInputIO}SwiPersonMatchInputIO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwiPersonMatchInputIOTopElmt", propOrder = {
    "swiPersonMatchInputIO"
})
public class SwiPersonMatchInputIOTopElmt {

    @XmlElement(name = "SwiPersonMatchInputIO", required = true)
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
