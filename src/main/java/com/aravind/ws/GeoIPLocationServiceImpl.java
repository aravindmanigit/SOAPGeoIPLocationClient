package com.aravind.ws;

import com.aravind.ws.stubs.GeoIP;
import com.aravind.ws.stubs.GeoIPService;
import com.aravind.ws.stubs.GeoIPServiceSoap;

public class GeoIPLocationServiceImpl implements GeoIPLocationService {

	public Object doService(Object ipaddress) {
		if (ipaddress != null)
		{
			GeoIPService geoIPService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
			GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipaddress.toString());
			return geoIP;
		}
		return null;
	}

}
