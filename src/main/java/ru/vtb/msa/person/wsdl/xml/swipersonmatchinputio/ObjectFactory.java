
package ru.vtb.msa.person.wsdl.xml.swipersonmatchinputio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.xml.swipersonmatchinputio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SwiPersonMatchInputIO_QNAME = new QName("http://www.siebel.com/xml/SwiPersonMatchInputIO", "SwiPersonMatchInputIO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.xml.swipersonmatchinputio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SwiPersonMatchInputIO }
     * 
     */
    public SwiPersonMatchInputIO createSwiPersonMatchInputIO() {
        return new SwiPersonMatchInputIO();
    }

    /**
     * Create an instance of {@link SwiPersonMatchInputIOTopElmt }
     * 
     */
    public SwiPersonMatchInputIOTopElmt createSwiPersonMatchInputIOTopElmt() {
        return new SwiPersonMatchInputIOTopElmt();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwiPersonMatchInputIO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/SwiPersonMatchInputIO", name = "SwiPersonMatchInputIO")
    public JAXBElement<SwiPersonMatchInputIO> createSwiPersonMatchInputIO(SwiPersonMatchInputIO value) {
        return new JAXBElement<SwiPersonMatchInputIO>(_SwiPersonMatchInputIO_QNAME, SwiPersonMatchInputIO.class, null, value);
    }

}
