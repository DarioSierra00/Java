package com.edu.calculos;

import java.util.Scanner;

import com.edu.calculos.model.Complejo;

public class Main {
	private static final String MENU ="--------------------------------------------------------------------------"
            + "\n 1. Sumar complejos: Debe solicitar dos números complejos y mostrar el\n"
            + "resultado de la suma.\n"
            + "2. Restar complejos: Debe solicitar dos número complejos y mostrar el\n"
            + "resultado de la resta.\n"
            + "3. Salir."
            +"\n -------------------------------------------------------------------------";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		while (opcion!=3) {
			System.out.println(MENU);
			System.out.println("Introduce una opcion: ");
			opcion = Integer.valueOf(sc.nextLine());
			if (opcion==1) {
				System.out.println("Introduce el primer numero real: ");
				Double real = Double.valueOf(sc.nextLine());
				System.out.println("Introduce el segundo numero real: ");
				Double real2 = Double.valueOf(sc.nextLine());
				System.out.println("Introduce el primer numero imaginario: ");
				Double imaginario = Double.valueOf(sc.nextLine());
				System.out.println("Introduce el segundo numero imaginario: ");
				Double imaginario2 = Double.valueOf(sc.nextLine());
				Complejo c = new Complejo(real,imaginario);
				Complejo c2 = new Complejo(real2, imaginario2);
				System.out.println(c.suma(c2));
			}else if (opcion==2) {
				System.out.println("Introduce el primer numero real: ");
				Double real = Double.valueOf(sc.nextLine());
				System.out.println("Introduce el segundo numero real: ");
				Double real2 = Double.valueOf(sc.nextLine());
				System.out.println("Introduce el primer numero imaginario: ");
				Double imaginario = Double.valueOf(sc.nextLine());
				System.out.println("Introduce el segundo numero imaginario: ");
				Double imaginario2 = Double.valueOf(sc.nextLine());
				Complejo c = new Complejo(real,imaginario);
				Complejo c2 = new Complejo(real2, imaginario2);
				System.out.println(c.resta(c2));
			}
		}
	}
}
