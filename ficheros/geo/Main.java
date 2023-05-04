package com.edu.ficheros.geo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		
		File country = new File("/home/estudiante/Downloads/country.txt");
		File city = new File("/home/estudiante/Downloads/city.txt");

		
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(country));
			String linea = buffer.readLine();
			linea = buffer.readLine();
			
			while(linea != null) {
				System.out.println(linea);
				linea = buffer.readLine();
			}
		} catch (IOException e) {
		}
		
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(city));
			String linea = buffer.readLine();
			linea = buffer.readLine();
			
			while(linea != null) {
				System.out.println(linea);
				linea = buffer.readLine();
			}
		} catch (IOException e) {
		}
	}
}
