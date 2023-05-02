package com.edu.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		//FileNotFoundException
		
		File directorioRaiz = new File("/home/estudiante/temporalJava");
		File fichero1 = new File("/home/estudiante/temporalJava/newFichero1.txt");
		
		//System.out.println(directorioRaiz.isDirectory());
		//System.out.println(fichero1.isDirectory());
		
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(fichero1));
			
			String linea = buffer.readLine();
			
			
			while(linea!=null) {
				System.out.println(linea);
				linea = buffer.readLine();
			}
			
			buffer.close();
		} catch (IOException  e) {
			e.printStackTrace();
		}
		
		Fichero f = new Fichero("/home/estudiante/Downloads/ssii_ud05_Practica_2.pdf");
		//System.out.println(f);
	}

}
