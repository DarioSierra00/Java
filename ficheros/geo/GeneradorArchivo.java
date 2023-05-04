package com.edu.ficheros.geo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class GeneradorArchivo {
	
	private Set<Country> country;

	public GeneradorArchivo() throws IOException {
		super();
		this.country = new HashSet<>();
		addCountry();
	}
	
	public void addCountry() throws IOException {
		File f = new File("C:\\Users\\HAWKS\\Desktop\\geo\\country.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(f));
		String linea = buffer.readLine();
		linea = buffer.readLine();
		String[] arrayCountry = null;
		
		while(linea != null)
			arrayCountry = linea.split(",");
			this.country.add(new Country(arrayCountry[0], arrayCountry[1]));
			linea = buffer.readLine();
		}
		

	
	
	public void geneadorArchivo() throws IOException {
		File f = new File("C:\\Users\\HAWKS\\Desktop\\geo\\generado.txt");
		
		f.createNewFile();
		
		FileWriter writer = new FileWriter(f);
		
		BufferedWriter bufferWriter = new BufferedWriter(writer);
		
		for(Country c : this.country) {
			bufferWriter.append(c.toString());
			bufferWriter.newLine();
		}
		
		bufferWriter.close();
		writer.close();
		
		
	}
}
