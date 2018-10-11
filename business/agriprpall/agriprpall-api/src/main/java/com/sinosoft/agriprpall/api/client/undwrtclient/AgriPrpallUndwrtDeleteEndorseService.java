
package com.sinosoft.agriprpall.api.client.undwrtclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AgriPrpallUndwrtDeleteEndorseService", targetNamespace = "http://server.webservice.indiv.sinosoft.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AgriPrpallUndwrtDeleteEndorseService {


    /**
     * 
     * @param requestXML
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "DeleteEndorse")
    @WebResult(name = "DeleteEndorseReturn", targetNamespace = "http://webservices.sinosoft.com")
    @RequestWrapper(localName = "DeleteEndorse", targetNamespace = "http://webservices.sinosoft.com", className = "com.sinosoft.demo.core.webservice.DeleteEndorse")
    @ResponseWrapper(localName = "DeleteEndorseResponse", targetNamespace = "http://webservices.sinosoft.com", className = "com.sinosoft.demo.core.webservice.DeleteEndorseResponse")
    public String deleteEndorse(
            @WebParam(name = "requestXML", targetNamespace = "http://webservices.sinosoft.com")
                    String requestXML);

    /**
     * 
     * @param businessNo
     * @param dbManager
     */
    @WebMethod
    @RequestWrapper(localName = "deleteUWTrace", targetNamespace = "http://webservices.sinosoft.com", className = "com.sinosoft.demo.core.webservice.DeleteUWTrace")
    @ResponseWrapper(localName = "deleteUWTraceResponse", targetNamespace = "http://webservices.sinosoft.com", className = "com.sinosoft.demo.core.webservice.DeleteUWTraceResponse")
    public void deleteUWTrace(
            @WebParam(name = "dbManager", targetNamespace = "http://webservices.sinosoft.com")
                    DBManager dbManager,
            @WebParam(name = "businessNo", targetNamespace = "http://webservices.sinosoft.com")
                    String businessNo);

}
