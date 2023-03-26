package com.edu.prueba;

import java.util.Scanner;

import com.edu.prueba.model.OrdenadorPortatil;
import com.edu.prueba.model.Producto;

public class Main {

	public static int buscarProducto(String nombre, Producto[] p) {
		int posicion = -1;
		for(int i = 0; i < p.length && posicion==-1; i++) {
			if(p[i]!=null && nombre.equalsIgnoreCase(p[i].getMarca())) {
				posicion = i;
			}
		}return posicion;
	}
	
	public static final String MENU="------------------------------------------- \n"
			  + "1. Vender movil \n"
			  + "2. Vender el ordenador portátil \n"
			  + "3. Vender la tablet \n"
			  + "4. Informacion sobre movil \n"
			  + "5. Informacion sobre portátil \n"
			  + "6. Informacion sobre tablet \n"
			  + "7. Salir"
			  + "-------------------------------------------";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion= 0;
		Producto[] p = new Producto[10];
		
		p[0] = new Producto(45, "Currito", "fdsfds");
		p[1] = new OrdenadorPortatil(54, "loco", "red", 34);
		while(opcion!=7) {
			System.out.println(MENU);
			System.out.println("introduce una opcion: ");
			opcion= Integer.valueOf(sc.nextLine());
			
			if(opcion==1) {
				System.out.println("Que movil quieres comprar? ");
				String nombre = sc.nextLine();
				
				int posicion = buscarProducto(nombre, p);
				if(posicion==-1) {
					System.out.println("No tenemos ese movil");
				}else {
					p[posicion]=null;
				}
			}else if(opcion==2) {
				System.out.println("Que ordenador quieres comprar? ");
				String nombre = sc.nextLine();
				
				int posicion = buscarProducto(nombre, p);
				if(posicion==-1) {
					System.out.println("No tenemos ese ordenador");
				}else {
					p[posicion]=null;
				}
			}else if(opcion==3) {
				System.out.println("Que ordenador quieres comprar? ");
				String nombre = sc.nextLine();
				
				int posicion = buscarProducto(nombre, p);
				if(posicion==-1) {
					System.out.println("No tenemos ese ordenador");
				}else {
					p[posicion]=null;
				}
			}else if(opcion==4) {
				System.out.println("Que movil quieres ver? ");
				String nombre = sc.nextLine();
				int posicion = buscarProducto(nombre, p);

				if(posicion==-1) {
					System.out.println("No tenemos ese movil");
				}else {
					System.out.println(p[posicion]);;
				}
			}
		}
	}

}
