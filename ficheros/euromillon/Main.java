package com.edu.ficheros.euromillon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		File fichero1 = new File("/home/estudiante/temporalJava/Euromillones.csv");
		Historial h = new Historial();
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(fichero1));;
			String linea = buffer.readLine();
			linea = buffer.readLine();
			
			while(linea != null) {
				h.addSorteo(linea);
				linea = buffer.readLine();

			}
		} catch (IOException | CombinacionException e) {
			e.printStackTrace();
		}
		
		System.out.println(h.mostrarHistorico());
		System.out.println(h.numeroMenosRepetido());
		System.out.println(h.numeroMasRepetido());
		
	}
}	
