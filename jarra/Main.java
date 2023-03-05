package com.edu.jarra;

import java.util.Scanner;

import com.edu.jarra.model.Jarra;

public class Main {
	private static final String MENU ="--------------------------------------------------------------------------"
            + "\n 1. Llenar jarra"
            + "\n 2. Vaciar jarra"
            + "\n 3. Volcar jarra A en B"
            + "\n 4. Volcar jarra B en A"
            + "\n 5. Ver estado de las jarras"
            + "\n 6. Salir"
            +"\n -------------------------------------------------------------------------";	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		System.out.println("Introduce la capacidad de la jarra A: ");
		Jarra a = new Jarra(Integer.valueOf(sc.nextLine()));
		System.out.println("Introduce la capacidad de la jarra B: ");
		Jarra b = new Jarra(Integer.valueOf(sc.nextLine()));
		
		
		while (opcion!=6) {
			System.out.println(MENU);
			System.out.println("Introduzca la opcion que más le interese: ");
			opcion = Integer.valueOf(sc.nextLine());
			if (opcion==1) {
				System.out.println("Qué jarra desea llenar? A/B: ");
				String opcionJarra= sc.nextLine();
				if (opcionJarra.equals("a")) {
					a.llenarJarra();
				}else if (opcionJarra.equals("b")) {
					b.llenarJarra();
				}
			}else if (opcion==2) {
				System.out.println("Qué jarra desea vaciar? A/B: ");
				String opcionJarra= sc.nextLine();
				if (opcionJarra.equals("a")) {
					a.vaciarJarra();
				}else if (opcionJarra.equals("b")) {
					b.vaciarJarra();
				}else {
					System.out.println("Introduce una jarra A o B.");
				}
			}else if (opcion==3) {
				System.out.println(a.volcarJarra(b));
			}else if (opcion==4) {
				System.out.println(b.volcarJarra(a));
			}else if (opcion==5) {
				System.out.println(a);
				System.out.println(b);
			}
		}System.out.println("La cantidad de agua gastada es de: " + Jarra.getTotalAgua());
	
		
	}
}
