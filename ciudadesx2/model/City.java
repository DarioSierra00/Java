package com.edu.ciudadesx2.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City {
	
	private String city_id;
	private String city;
	private List<Address> listAddress;
	

	public City(String city_id, String city) throws IOException {
		super();
		this.city_id = city_id;
		this.city = city;
		this.listAddress = new ArrayList<>();
		addAddress();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(city, city_id);
	}
	
	@Override
	public boolean equals(Object obj) {
		return this==obj || obj != null &&
				obj instanceof City &&
				this.hashCode()==obj.hashCode();
	}
	
	public void addAddress() throws IOException {
		File f = new File("./ficheros/address.txt");
		
		BufferedReader bf = new BufferedReader(new FileReader(f));
		String linea = bf.readLine();
		
		String[] arrayAddress;
		linea = bf.readLine();
		while(linea != null) {
			arrayAddress = linea.split(",");
			try {
				if(arrayAddress[4].equals(this.city_id)) {
					this.listAddress.add(new Address(arrayAddress[0],arrayAddress[1]));
				}
			} catch (Exception e) {
			}
			
			linea = bf.readLine();
		}
		bf.close();
	}
	
	@Override
	public String toString() {
		return String.format("	City id: %s, city: %s, address:%s ", this.city_id,this.city,this.listAddress.toString());
	}

	public String getCity_id() {
		return city_id;
	}

	public String getCity() {
		return city;
	}

	public List<Address> getListAddress() {
		return listAddress;
	}
	
}
