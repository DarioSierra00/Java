package com.edu.alquiler;

import java.util.Scanner;

import com.edu.alquiler.model.Coche;
import com.edu.alquiler.model.Combustible;
import com.edu.alquiler.model.Empresa;
import com.edu.alquiler.model.Furgona_Carga;
import com.edu.alquiler.model.Gama;
import com.edu.alquiler.model.Microbus;

public class Main {

	public static void main(String[] args) {
		final String MENU= "1. Alta de vehículo: \n 2. Cálculo de precio de alquiler: \n 3. Salir: ";
		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		
		Empresa emp = new Empresa();
		while(opcion!=3) {
			System.out.println(MENU);
			System.out.println("Elige una opción: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			if(opcion==1) {
				String vehiculo;
				System.out.println("Introduce el vehiculo que quieres alquilar, Coche, Microbus, FurgonaCarga: ");
				vehiculo = sc.nextLine();
				
				String matricula;
				System.out.println("Introduce la matricula del vehiculo: ");
				matricula = sc.nextLine();
				
				Gama gama = null;
				
				do {
					try {
						System.out.println("Introduce la gama del vehiculo: ");
						gama = gama.valueOf(sc.nextLine().toUpperCase());
					}catch(Exception e) {
						System.out.println("No es correcta la gama: ");
					}
				}while(gama == null);
				
				if(vehiculo.equalsIgnoreCase("coche")) {
					Combustible combustible = null;
					
					do {
						try {
							System.out.println("Introduce el tipo de combustible: ");
							combustible = combustible.valueOf(sc.nextLine().toUpperCase());
						}catch(Exception e) {
							System.out.println("No es el combustible correcto: ");
						}
					}while(combustible == null);
					
					emp.darDeAlta(new Coche(matricula, gama, combustible));
					System.out.println("Dado de alta correctamente.");
				}
				else if(vehiculo.equalsIgnoreCase("microbus")) {
					int plazas;
					
					System.out.println("Introduce el numero de plazas: ");
					plazas = Integer.valueOf(sc.nextLine());
					emp.darDeAlta(new Microbus(matricula, gama, plazas));
					System.out.println("Dado de alta.");
				}
				else if(vehiculo.equalsIgnoreCase("furgoneta")) {
					double pma;
					System.out.println("Introduce la pma: ");
					pma = Double.valueOf(sc.nextLine());
					emp.darDeAlta(new Furgona_Carga(matricula, gama, pma));
				}
			}
			else if(opcion==2) {
				String matricula;
				System.out.println("Introduce la matricula del vehiculo: ");
				matricula = sc.nextLine();
				
				int numDias;
				System.out.println("Cuantos dias se va a alquilar: ");
				numDias = Integer.valueOf(sc.nextLine());
				
				System.out.println(emp.calcularPrecio(matricula, numDias));
			}
		}
		System.out.println("Saliendo..");
	}

}
