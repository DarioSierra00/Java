package com.edu.ciudadesx2;

import java.io.IOException;

import com.edu.ciudadesx2.model.Country;
import com.edu.ciudadesx2.model.GeneradorArchivo;

public class Main {

	public static void main(String[] args) {
		try {
			GeneradorArchivo g = new GeneradorArchivo();
			g.generarFichero();
			g.toJson();
			g.toCsv();
			g.toXML();
			System.out.println("ola");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
