package com.edu.ficheros.geo;

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
	
	
	
	public City(String id, String city) throws IOException {
		super();
		this.city_id = id;
		this.city = city;
		this.listAddress = new ArrayList<>();
		addAdresses();
	}



	public void addAdresses() throws IOException {
		File f = new File("C:\\Users\\HAWKS\\Desktop\\geo\\address.txt");
		//File f = new File("/home/estudiante/Downloads/address.txt");

		BufferedReader buffer = new BufferedReader(new FileReader(f));
		String linea = buffer.readLine();
		linea = buffer.readLine();
		String[] arrayAddresses;
		
		while(linea != null) {
			arrayAddresses = linea.split(",");
		
			try {
				if(arrayAddresses[4].equals(this.city_id)) {
					this.listAddress.add(new Address(arrayAddresses[0], arrayAddresses[1]));
				}
			} catch (ArrayIndexOutOfBoundsException e) {
			}
		linea = buffer.readLine();

	}buffer.close();
	}
	
	public int getSizeAddress() {
		return this.listAddress.size();
	}
	
	public String getName() {
		return this.city;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(city, city_id);
	}

	@Override
    public boolean equals(Object obj) {
        return this==obj || obj!=null &&
                obj instanceof City
                && this.hashCode()==((City)obj).hashCode();
    }
	
	@Override
	public String toString() {
		return String.format("	City id: %s, city: %s, address:%s ", this.city_id,this.city,this.listAddress.size());
	}
}
