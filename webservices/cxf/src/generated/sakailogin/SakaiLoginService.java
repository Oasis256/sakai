package sakailogin;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2014-02-10T16:01:57.462-07:00
 * Generated source version: 2.7.8
 * 
 */
@WebServiceClient(name = "SakaiLoginService", 
                  wsdlLocation = "file:/Users/jbush/Dev/projects/sakai_trunk/webservices/cxf/src/resources/wsdl/SakaiLogin.wsdl",
                  targetNamespace = "SakaiLogin") 
public class SakaiLoginService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("SakaiLogin", "SakaiLoginService");
    public final static QName SakaiLogin = new QName("SakaiLogin", "SakaiLogin");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/jbush/Dev/projects/sakai_trunk/webservices/cxf/src/resources/wsdl/SakaiLogin.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SakaiLoginService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/jbush/Dev/projects/sakai_trunk/webservices/cxf/src/resources/wsdl/SakaiLogin.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SakaiLoginService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SakaiLoginService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SakaiLoginService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns SakaiLogin
     */
    @WebEndpoint(name = "SakaiLogin")
    public SakaiLogin getSakaiLogin() {
        return super.getPort(SakaiLogin, SakaiLogin.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SakaiLogin
     */
    @WebEndpoint(name = "SakaiLogin")
    public SakaiLogin getSakaiLogin(WebServiceFeature... features) {
        return super.getPort(SakaiLogin, SakaiLogin.class, features);
    }

}
