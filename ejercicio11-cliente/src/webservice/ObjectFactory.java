
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _EsBisiesto_QNAME = new QName("http://webservice/", "esBisiesto");
    private final static QName _EsBisiestoResponse_QNAME = new QName("http://webservice/", "esBisiestoResponse");
    private final static QName _GetDia_QNAME = new QName("http://webservice/", "getDia");
    private final static QName _GetDiaResponse_QNAME = new QName("http://webservice/", "getDiaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EsBisiesto }
     * 
     */
    public EsBisiesto createEsBisiesto() {
        return new EsBisiesto();
    }

    /**
     * Create an instance of {@link EsBisiestoResponse }
     * 
     */
    public EsBisiestoResponse createEsBisiestoResponse() {
        return new EsBisiestoResponse();
    }

    /**
     * Create an instance of {@link GetDia }
     * 
     */
    public GetDia createGetDia() {
        return new GetDia();
    }

    /**
     * Create an instance of {@link GetDiaResponse }
     * 
     */
    public GetDiaResponse createGetDiaResponse() {
        return new GetDiaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsBisiesto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "esBisiesto")
    public JAXBElement<EsBisiesto> createEsBisiesto(EsBisiesto value) {
        return new JAXBElement<EsBisiesto>(_EsBisiesto_QNAME, EsBisiesto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsBisiestoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "esBisiestoResponse")
    public JAXBElement<EsBisiestoResponse> createEsBisiestoResponse(EsBisiestoResponse value) {
        return new JAXBElement<EsBisiestoResponse>(_EsBisiestoResponse_QNAME, EsBisiestoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getDia")
    public JAXBElement<GetDia> createGetDia(GetDia value) {
        return new JAXBElement<GetDia>(_GetDia_QNAME, GetDia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getDiaResponse")
    public JAXBElement<GetDiaResponse> createGetDiaResponse(GetDiaResponse value) {
        return new JAXBElement<GetDiaResponse>(_GetDiaResponse_QNAME, GetDiaResponse.class, null, value);
    }

}
