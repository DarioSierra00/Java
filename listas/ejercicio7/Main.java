package com.edu.listas.ejercicio7;

import java.util.Scanner;

import com.edu.listas.ejercicio7.exception.CajaException;
import com.edu.listas.ejercicio7.model.Almacen;
import com.edu.listas.ejercicio7.model.AlmacenException;
import com.edu.listas.ejercicio7.model.Caja;

public class Main {

	public static void main(String[] args) {
final String MENU = "1.Abrir caja\n2.Cerrar caja\n3.Nuevo Cliente\n4.Atender Cliente\n5.Salir";
		
		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		
		Almacen a = new Almacen();
		
		Caja caja0 = new Caja(); 
		Caja caja2 = new Caja(); 
		Caja caja3 = new Caja(); 
		Caja caja4 = new Caja(); 
		Caja caja5 = new Caja(); 
		Caja caja6 = new Caja(); 
		Caja caja7 = new Caja(); 
		a.addCaja(caja0);
		a.addCaja(caja2);
		a.addCaja(caja3);
		a.addCaja(caja4);
		a.addCaja(caja5);
		a.addCaja(caja6);
		a.addCaja(caja7);
		
		while(opcion != 5) {
			System.out.println(MENU);
			System.out.println("Introduce una opción: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			if(opcion == 1) {
				System.out.println("Introduce el número de la caja: ");
				int numeroCaja = Integer.valueOf(sc.nextLine());
					try {
						a.abrirCaja(numeroCaja);
					} catch (CajaException e) {
						e.printStackTrace();
					}
					System.out.println("Caja abierta correctamente.");
			}else if(opcion == 2) {
				System.out.println("Introduce el número de la caja: ");
				int numeroCaja = Integer.valueOf(sc.nextLine());
				try {
					a.cerrarCaja(numeroCaja);
				} catch (CajaException e) {
					e.printStackTrace();
				}
				System.out.println("Caja cerrada correctamente.");
			}else if(opcion == 3) {
				try {
					System.out.println(a.addClienteCaja());
				} catch (AlmacenException e) {
					e.printStackTrace();
				}
			}else if(opcion == 4) {
				System.out.println("Introduce el número de la caja en la que encuentras: ");
				int numeroCaja = Integer.valueOf(sc.nextLine());

				try {
					System.out.println(a.atenderCliente(numeroCaja));
				} catch (AlmacenException e) {
					e.printStackTrace();
				}
			}

		}
		System.out.println("Saliendo del sistema de cajas...");
		
		
	}
	}


