
package ru.vtb.msa.person.wsdl.xml.swipersonmatchoutputio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.xml.swipersonmatchoutputio package. 
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

    private final static QName _SwiPersonMatchOutputIO_QNAME = new QName("http://www.siebel.com/xml/SwiPersonMatchOutputIO", "SwiPersonMatchOutputIO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.xml.swipersonmatchoutputio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SwiPersonMatchOutputIO }
     * 
     */
    public SwiPersonMatchOutputIO createSwiPersonMatchOutputIO() {
        return new SwiPersonMatchOutputIO();
    }

    /**
     * Create an instance of {@link Candidate }
     * 
     */
    public Candidate createCandidate() {
        return new Candidate();
    }

    /**
     * Create an instance of {@link ContactAlternatePhone }
     * 
     */
    public ContactAlternatePhone createContactAlternatePhone() {
        return new ContactAlternatePhone();
    }

    /**
     * Create an instance of {@link ListOfContactSegment }
     * 
     */
    public ListOfContactSegment createListOfContactSegment() {
        return new ListOfContactSegment();
    }

    /**
     * Create an instance of {@link ContactPUBContactIdentity }
     * 
     */
    public ContactPUBContactIdentity createContactPUBContactIdentity() {
        return new ContactPUBContactIdentity();
    }

    /**
     * Create an instance of {@link ListOfCIFContactReference }
     * 
     */
    public ListOfCIFContactReference createListOfCIFContactReference() {
        return new ListOfCIFContactReference();
    }

    /**
     * Create an instance of {@link Driver }
     * 
     */
    public Driver createDriver() {
        return new Driver();
    }

    /**
     * Create an instance of {@link ContactINSPersonalAddress }
     * 
     */
    public ContactINSPersonalAddress createContactINSPersonalAddress() {
        return new ContactINSPersonalAddress();
    }

    /**
     * Create an instance of {@link SwiPersonMatchOutputIOTopElmt }
     * 
     */
    public SwiPersonMatchOutputIOTopElmt createSwiPersonMatchOutputIOTopElmt() {
        return new SwiPersonMatchOutputIOTopElmt();
    }

    /**
     * Create an instance of {@link ListOfContactPUBContactIdentity }
     * 
     */
    public ListOfContactPUBContactIdentity createListOfContactPUBContactIdentity() {
        return new ListOfContactPUBContactIdentity();
    }

    /**
     * Create an instance of {@link ContactSegment }
     * 
     */
    public ContactSegment createContactSegment() {
        return new ContactSegment();
    }

    /**
     * Create an instance of {@link DriverPersonalAddress }
     * 
     */
    public DriverPersonalAddress createDriverPersonalAddress() {
        return new DriverPersonalAddress();
    }

    /**
     * Create an instance of {@link ListOfContactINSPersonalAddress }
     * 
     */
    public ListOfContactINSPersonalAddress createListOfContactINSPersonalAddress() {
        return new ListOfContactINSPersonalAddress();
    }

    /**
     * Create an instance of {@link ListOfContactAlternatePhone }
     * 
     */
    public ListOfContactAlternatePhone createListOfContactAlternatePhone() {
        return new ListOfContactAlternatePhone();
    }

    /**
     * Create an instance of {@link ListOfDriverPersonalAddress }
     * 
     */
    public ListOfDriverPersonalAddress createListOfDriverPersonalAddress() {
        return new ListOfDriverPersonalAddress();
    }

    /**
     * Create an instance of {@link ListOfCandidate }
     * 
     */
    public ListOfCandidate createListOfCandidate() {
        return new ListOfCandidate();
    }

    /**
     * Create an instance of {@link CIFContactReference }
     * 
     */
    public CIFContactReference createCIFContactReference() {
        return new CIFContactReference();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwiPersonMatchOutputIO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/SwiPersonMatchOutputIO", name = "SwiPersonMatchOutputIO")
    public JAXBElement<SwiPersonMatchOutputIO> createSwiPersonMatchOutputIO(SwiPersonMatchOutputIO value) {
        return new JAXBElement<SwiPersonMatchOutputIO>(_SwiPersonMatchOutputIO_QNAME, SwiPersonMatchOutputIO.class, null, value);
    }

}
