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
		
		//File fichero1 = new File("/home/estudiante/temporalJava/Euromillones.csv");
		File fichero1 = new File("C:\\Users\\HAWKS\\Desktop\\euro\\Euromillones_2004_a 2023.csv");
		
		
		
		try {
			Historial h = new Historial();
			Combinacion c = new Combinacion(18,20,23,4,6,3,8);
			BufferedReader buffer = new BufferedReader(new FileReader(fichero1));;
			String linea = buffer.readLine();
			linea = buffer.readLine();
			
			while(linea != null) {
				h.addSorteo(linea);
				linea = buffer.readLine();

			}
			System.out.println(h.mostrarHistorico());
			System.out.println(h.maxAciertosCombi(c));
			System.out.println(h.numeroMenosRepetido());
			System.out.println(h.numeroMasRepetido());
			System.out.println(h.estrellaMenosRepetida());
			System.out.println(h.estrellaMasRepetida());
			System.out.println(h.mayorSecuenciaNumeros());
		} catch (IOException | CombinacionException e) {
			e.printStackTrace();
		}
		
		
		
	
}
}
