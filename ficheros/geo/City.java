package com.edu.ficheros.geo;

import java.util.List;

public class City {
	
	private String city_id;
	private List<Address> listAddress;
	
	public void addAdresses(String linea) {
		String[] addresses = linea.split(",");
		
		if(addresses[0].equals(city_id)) {
			
		}
	}
}
