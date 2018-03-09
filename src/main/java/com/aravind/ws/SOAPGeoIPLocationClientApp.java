package com.aravind.ws;

import com.aravind.ws.stubs.GeoIP;
import com.aravind.ws.stubs.GeoIPService;

public class SOAPGeoIPLocationClientApp {

	private static final String IP_ADDRESS = "216.58.199.36";
	
	public static void main(String[] args) {
		GeoIPLocationServiceImpl geoIPLocationServiceImpl = new GeoIPLocationServiceImpl();
		GeoIP geoIP = (GeoIP) geoIPLocationServiceImpl.doService(IP_ADDRESS);
		System.out.println("The country of the IP address is " + geoIP.getCountryName());
	}

}
