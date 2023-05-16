package com.edu.ciudadesx2.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {
	
	private String country_id;
	private String country;
	private List<City> listCity;
	
	public Country(String country_id, String country) throws IOException {
		super();
		this.country_id = country_id;
		this.country = country;
		this.listCity = new ArrayList<>();
		addCity();
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, country_id);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj != null &&
				obj instanceof Country &&
				this.hashCode()==obj.hashCode();
	}
	
	public void addCity() throws IOException {
		File f = new File("./ficheros/city.txt");
		
		BufferedReader bf = new BufferedReader(new FileReader(f));
		String linea = bf.readLine();
		String[] arrayCity;
		linea = bf.readLine();
		while(linea != null) {
			arrayCity = linea.split(",");
			
				if(arrayCity[2].equals(this.country_id)) {
					this.listCity.add(new City(arrayCity[0], arrayCity[1]));
				}
			
			linea = bf.readLine();
		}
		bf.close();
	}
	@Override
	public String toString() {
		return String.format("Country id: %s, country: %s%n"
							+ "		 Cities:%s%n"
							,this.country_id,this.country,this.listCity.toString());
	}

	public String getCountry_id() {
		return country_id;
	}

	public String getCountry() {
		return country;
	}

	public int getSizeListCity() {
		return this.listCity.size();
	}

	public List<City> getListCity() {
		return listCity;
	}
	
	
}
