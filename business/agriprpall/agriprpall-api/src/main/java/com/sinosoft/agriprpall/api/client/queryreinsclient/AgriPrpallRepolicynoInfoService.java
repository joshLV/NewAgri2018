
package com.sinosoft.agriprpall.api.client.queryreinsclient;

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
@WebService(name = "AgriPrpallRepolicynoInfoService", targetNamespace = "http://server.webservice.indiv.sinosoft.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AgriPrpallRepolicynoInfoService {


    /**
     * 
     * @param requestXML
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "queryRelateRepolicynoReturn", targetNamespace = "http://webservices.sinosoft.com")
    @RequestWrapper(localName = "queryRelateRepolicyno", targetNamespace = "http://webservices.sinosoft.com", className = "com.sinosoft.demo.core.webservice.QueryRelateRepolicyno")
    @ResponseWrapper(localName = "queryRelateRepolicynoResponse", targetNamespace = "http://webservices.sinosoft.com", className = "com.sinosoft.demo.core.webservice.QueryRelateRepolicynoResponse")
    public String queryRelateRepolicyno(
            @WebParam(name = "requestXML", targetNamespace = "http://webservices.sinosoft.com")
                    String requestXML);

}
