
package com.learnwebservices.services.tempconverter;

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
@WebServiceClient(name = "TempConverterEndpointService", targetNamespace = "http://learnwebservices.com/services/tempconverter", wsdlLocation = "http://www.learnwebservices.com/services/tempconverter?wsdl")
public class TempConverterEndpointService
    extends Service
{

    private final static URL TEMPCONVERTERENDPOINTSERVICE_WSDL_LOCATION;
    private final static WebServiceException TEMPCONVERTERENDPOINTSERVICE_EXCEPTION;
    private final static QName TEMPCONVERTERENDPOINTSERVICE_QNAME = new QName("http://learnwebservices.com/services/tempconverter", "TempConverterEndpointService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.learnwebservices.com/services/tempconverter?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TEMPCONVERTERENDPOINTSERVICE_WSDL_LOCATION = url;
        TEMPCONVERTERENDPOINTSERVICE_EXCEPTION = e;
    }

    public TempConverterEndpointService() {
        super(__getWsdlLocation(), TEMPCONVERTERENDPOINTSERVICE_QNAME);
    }

    public TempConverterEndpointService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TEMPCONVERTERENDPOINTSERVICE_QNAME, features);
    }

    public TempConverterEndpointService(URL wsdlLocation) {
        super(wsdlLocation, TEMPCONVERTERENDPOINTSERVICE_QNAME);
    }

    public TempConverterEndpointService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TEMPCONVERTERENDPOINTSERVICE_QNAME, features);
    }

    public TempConverterEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TempConverterEndpointService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TempConverterEndpoint
     */
    @WebEndpoint(name = "TempConverterEndpointPort")
    public TempConverterEndpoint getTempConverterEndpointPort() {
        return super.getPort(new QName("http://learnwebservices.com/services/tempconverter", "TempConverterEndpointPort"), TempConverterEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TempConverterEndpoint
     */
    @WebEndpoint(name = "TempConverterEndpointPort")
    public TempConverterEndpoint getTempConverterEndpointPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://learnwebservices.com/services/tempconverter", "TempConverterEndpointPort"), TempConverterEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TEMPCONVERTERENDPOINTSERVICE_EXCEPTION!= null) {
            throw TEMPCONVERTERENDPOINTSERVICE_EXCEPTION;
        }
        return TEMPCONVERTERENDPOINTSERVICE_WSDL_LOCATION;
    }

}
