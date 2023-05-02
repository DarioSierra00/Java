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
		
		try {
			FileReader reader = new FileReader(fichero1);
			BufferedReader buffer = new BufferedReader(reader);;
			
			String linea = buffer.readLine();
			linea = buffer.readLine();
			
			while(linea != null) {
				String[] li = linea.split(",");
				System.out.println(LocalDate.parse(li[0], DateTimeFormatter.ofPattern("d/MM/yyyy")));
				linea = buffer.readLine();
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}	
