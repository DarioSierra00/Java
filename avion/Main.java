package com.edu.avion;

import java.util.Scanner;

public class Main {

	public static final String MENU = "-------------------------------------------------- \n-1. Crear avión sólo con el identificador \n-2. Crear avión con el identificador y la compañia \n--------------------------------------------------";
	public static final String MENU2 = "-------------------------------------"
			                         + "\n a. Asignar Vuelo"
			                         + "\n b. Obtener el número de vuelos"
			                         + "\n c. Obtener el número de kilómetros"
			                         + "\n d. Obtener la media de kilómetros por vuelo"
			                         + "\n e. Cambio de compañia"
			                         + "\n f. Mostrar información del avión"
			                         + "\n g. Salir";		                 
			                
							   
							  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nuevaCompannia = "";
		String identificador = "";
		int capacidad = 0;
		String compannia = "";
		String opcion2 = "";
		Avion a = new Avion("BlueWale","Rhyand", 80);
		int capacidadAsientos = 0;
		int numKm = 0;
		
		System.out.println(MENU);
		System.out.println("Introduzca opcion");
		int opcion = Integer.valueOf(sc.nextLine());
		
		if (opcion==1 || opcion==2) {
			if (opcion==1) {
				System.out.println("Introduce el identificador del avion: ");
				identificador = sc.nextLine();
				System.out.println("Introduce la capacidad del avión: ");
				capacidad = Integer.valueOf(sc.nextLine());
				a = new Avion(identificador,capacidad);
			}else if (opcion==2) {
				System.out.println("Introduce el identificador del avion: ");
				identificador = sc.nextLine();
				System.out.println("Introduce la capacidad del avión: ");
				capacidad = Integer.valueOf(sc.nextLine());
				System.out.println("Introduce la compañia");
				compannia = sc.nextLine();
				a = new Avion(identificador, compannia, capacidad);
			}/*if (opcion!=1 || opcion!=2) {
				System.out.println(MENU);
				System.out.println("Introduzca una opcion valida: 1 o 2");
				opcion = Integer.valueOf(sc.nextLine());*/
			
		}while (!opcion2.equals("g")) { //Como tenemos la variable opción2 inicializada en "", nos entra ya que es diferente de "g".
			System.out.println(MENU2);
			System.out.println("Introduzca opcion");
			opcion2 =(sc.nextLine());
			
			if (opcion2.equals("a")) {
				System.out.println("Indique el numero de asientos ocupados en el vuelo: ");
				capacidadAsientos = Integer.valueOf(sc.nextLine());
				System.out.println("Indique cuantos km se realizarán durante el vuelo: ");
				numKm = Integer.valueOf(sc.nextLine());
				System.out.println(a.asignarVuelo(capacidadAsientos, numKm));
			}else if (opcion2.equals("b")) {
				System.out.println(a.getNumVuelos());
			}else if (opcion2.equals("c")) {
				System.out.println(a.getTotalKm());
			}else if (opcion2.equals("d")) {
				System.out.println(a.getMediaKm());
			}else if (opcion2.equals("e")) {
				System.out.println("Nombre de la compañia antigua ");
				compannia = sc.nextLine();
				if (compannia.equals(a.getCompannia())) {
					System.out.println("A que compañia quieres cambiar: ");
					nuevaCompannia=sc.nextLine();
					a.setCompannia(nuevaCompannia);
				}else {
					System.out.println("No se ha encontrado esa compañía");
				}

			}else if (opcion2.equals("f")) {
				System.out.println("Avion con id " +identificador + " de la compañia "+ a.getCompannia() + " ha realizado "+ a.getNumVuelos() + " vuelos, con un total de "+ a.getTotalKm() + " km y una media de "+ a.getMediaKm() + " km por vuelo.");
			}
		}System.out.println("Sayonara!!");
		}

}
