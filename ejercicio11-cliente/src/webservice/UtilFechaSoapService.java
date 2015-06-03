package webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.0
 * 2015-06-03T17:38:55.730+02:00
 * Generated source version: 3.1.0
 * 
 */
@WebServiceClient(name = "UtilFechaSoapService", 
                  wsdlLocation = "http://localhost:8080/ejercicio11/service/UtilFechaSoap?wsdl",
                  targetNamespace = "http://webservice/") 
public class UtilFechaSoapService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice/", "UtilFechaSoapService");
    public final static QName UtilFechaSoapPort = new QName("http://webservice/", "UtilFechaSoapPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ejercicio11/service/UtilFechaSoap?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UtilFechaSoapService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/ejercicio11/service/UtilFechaSoap?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UtilFechaSoapService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UtilFechaSoapService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UtilFechaSoapService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public UtilFechaSoapService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public UtilFechaSoapService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public UtilFechaSoapService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns UtilFechaSoap
     */
    @WebEndpoint(name = "UtilFechaSoapPort")
    public UtilFechaSoap getUtilFechaSoapPort() {
        return super.getPort(UtilFechaSoapPort, UtilFechaSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UtilFechaSoap
     */
    @WebEndpoint(name = "UtilFechaSoapPort")
    public UtilFechaSoap getUtilFechaSoapPort(WebServiceFeature... features) {
        return super.getPort(UtilFechaSoapPort, UtilFechaSoap.class, features);
    }

}
