package com.aravind.ws.stubs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.2
 * 2018-03-09T12:13:16.003+11:00
 * Generated source version: 3.2.2
 *
 */
@WebService(targetNamespace = "http://www.webservicex.net/", name = "GeoIPServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface GeoIPServiceSoap {

    /**
     * GeoIPService -
     * 				GetGeoIP enables you to easily look up countries by IP addresses
     * 			
     */
    @WebMethod(operationName = "GetGeoIP", action = "http://www.webservicex.net/GetGeoIP")
    @RequestWrapper(localName = "GetGeoIP", targetNamespace = "http://www.webservicex.net/", className = "com.aravind.ws.stubs.GetGeoIP")
    @ResponseWrapper(localName = "GetGeoIPResponse", targetNamespace = "http://www.webservicex.net/", className = "com.aravind.ws.stubs.GetGeoIPResponse")
    @WebResult(name = "GetGeoIPResult", targetNamespace = "http://www.webservicex.net/")
    public com.aravind.ws.stubs.GeoIP getGeoIP(
        @WebParam(name = "IPAddress", targetNamespace = "http://www.webservicex.net/")
        java.lang.String ipAddress
    );

    /**
     * GeoIPService -
     * 				GetGeoIPContext enables you to easily look up countries by Context
     * 			
     */
    @WebMethod(operationName = "GetGeoIPContext", action = "http://www.webservicex.net/GetGeoIPContext")
    @RequestWrapper(localName = "GetGeoIPContext", targetNamespace = "http://www.webservicex.net/", className = "com.aravind.ws.stubs.GetGeoIPContext")
    @ResponseWrapper(localName = "GetGeoIPContextResponse", targetNamespace = "http://www.webservicex.net/", className = "com.aravind.ws.stubs.GetGeoIPContextResponse")
    @WebResult(name = "GetGeoIPContextResult", targetNamespace = "http://www.webservicex.net/")
    public com.aravind.ws.stubs.GeoIP getGeoIPContext();
}
