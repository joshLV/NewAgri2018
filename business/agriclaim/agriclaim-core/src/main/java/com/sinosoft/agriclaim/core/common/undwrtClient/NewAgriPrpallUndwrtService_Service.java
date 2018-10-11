
package com.sinosoft.agriclaim.core.common.undwrtClient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "NewAgriPrpallUndwrtService", targetNamespace = "http://server.webservice.indiv.sinosoft.com", wsdlLocation = "http://192.168.0.2:7701/webAgriPrpallService/services/NewAgriPrpallUndwrtService?wsdl")
public class NewAgriPrpallUndwrtService_Service
    extends Service
{

    private final static URL NEWAGRIPRPALLUNDWRTSERVICE_WSDL_LOCATION;
    private final static WebServiceException NEWAGRIPRPALLUNDWRTSERVICE_EXCEPTION;
    private final static QName NEWAGRIPRPALLUNDWRTSERVICE_QNAME = new QName("http://server.webservice.indiv.sinosoft.com", "NewAgriPrpallUndwrtService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.2:7701/webAgriPrpallService/services/NewAgriPrpallUndwrtService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NEWAGRIPRPALLUNDWRTSERVICE_WSDL_LOCATION = url;
        NEWAGRIPRPALLUNDWRTSERVICE_EXCEPTION = e;
    }

    public NewAgriPrpallUndwrtService_Service() {
        super(__getWsdlLocation(), NEWAGRIPRPALLUNDWRTSERVICE_QNAME);
    }

    public NewAgriPrpallUndwrtService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), NEWAGRIPRPALLUNDWRTSERVICE_QNAME, features);
    }

    public NewAgriPrpallUndwrtService_Service(URL wsdlLocation) {
        super(wsdlLocation, NEWAGRIPRPALLUNDWRTSERVICE_QNAME);
    }

    public NewAgriPrpallUndwrtService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NEWAGRIPRPALLUNDWRTSERVICE_QNAME, features);
    }

    public NewAgriPrpallUndwrtService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NewAgriPrpallUndwrtService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NewAgriPrpallUndwrtService
     */
    @WebEndpoint(name = "NewAgriPrpallUndwrtService")
    public NewAgriPrpallUndwrtService getNewAgriPrpallUndwrtService() {
        return super.getPort(new QName("http://server.webservice.indiv.sinosoft.com", "NewAgriPrpallUndwrtService"), NewAgriPrpallUndwrtService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NewAgriPrpallUndwrtService
     */
    @WebEndpoint(name = "NewAgriPrpallUndwrtService")
    public NewAgriPrpallUndwrtService getNewAgriPrpallUndwrtService(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.webservice.indiv.sinosoft.com", "NewAgriPrpallUndwrtService"), NewAgriPrpallUndwrtService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NEWAGRIPRPALLUNDWRTSERVICE_EXCEPTION!= null) {
            throw NEWAGRIPRPALLUNDWRTSERVICE_EXCEPTION;
        }
        return NEWAGRIPRPALLUNDWRTSERVICE_WSDL_LOCATION;
    }

}
