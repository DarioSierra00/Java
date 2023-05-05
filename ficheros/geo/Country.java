package com.edu.ficheros.geo;

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
	
	public void addCity() throws IOException {
		//File f = new File("C:\\Users\\HAWKS\\Desktop\\geo\\city.txt");
		File f = new File("/home/estudiante/Downloads/city.txt");

		BufferedReader buffer = new BufferedReader(new FileReader(f));
		String linea = buffer.readLine();
		linea = buffer.readLine();
		String[] arrayCity = null;
		
		while(linea != null)
			arrayCity = linea.split(",");
		
		if(arrayCity[1].equals(country_id)) {
			this.listCity.add(new City(arrayCity[0], arrayCity[1]));
		}
		
		linea = buffer.readLine();
		buffer.close();

	}
	
	@Override
	public int hashCode() {
		return Objects.hash(country, country_id);
	}

	@Override
    public boolean equals(Object obj) {
        return this==obj || obj!=null &&
                obj instanceof Country
                && this.hashCode()==((Country)obj).hashCode();
    }

	@Override
	public String toString() {
		return String.format("Country id: %s, country: %s%n"
							+ "		 Cities:%s%n"
							+ "%n",this.country_id,this.country,this.listCity.size());
	}
}
