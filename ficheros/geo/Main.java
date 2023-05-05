package com.edu.ficheros.geo;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		
		Country country = null;
		City city = null;
		
		try {
			country = new Country("45","Indonesia");
			city = new City("117", "Cianjur");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		GeneradorArchivo ga = null;
		try {
			ga = new GeneradorArchivo();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("hola");
		//ga.geneadorArchivo();

	}
}
