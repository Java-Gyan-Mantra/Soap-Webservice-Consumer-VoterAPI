
package vs.online.voterservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the vs.online.voterservice.types package. 
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

    private final static QName _VoterId_QNAME = new QName("http://www.online.vs/VoterService/types", "voterId");
    private final static QName _VoterType_QNAME = new QName("http://www.online.vs/VoterService/types", "voterType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: vs.online.voterservice.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActivityResponse }
     * 
     */
    public ActivityResponse createActivityResponse() {
        return new ActivityResponse();
    }

    /**
     * Create an instance of {@link VoterInfo }
     * 
     */
    public VoterInfo createVoterInfo() {
        return new VoterInfo();
    }

    /**
     * Create an instance of {@link ServiceFaultType }
     * 
     */
    public ServiceFaultType createServiceFaultType() {
        return new ServiceFaultType();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link VoterResponse }
     * 
     */
    public VoterResponse createVoterResponse() {
        return new VoterResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.online.vs/VoterService/types", name = "voterId")
    public JAXBElement<String> createVoterId(String value) {
        return new JAXBElement<String>(_VoterId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.online.vs/VoterService/types", name = "voterType")
    public JAXBElement<String> createVoterType(String value) {
        return new JAXBElement<String>(_VoterType_QNAME, String.class, null, value);
    }

}
