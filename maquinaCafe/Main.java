package com.edu.maquinaCafe;

import java.util.Scanner;

import com.edu.maquinaCafe.model.MaquinaCafe;

public class Main {
	private static final String MENU ="--------------------------------------------------------------------------"
            + "\n 1. Servir Cafe solo"
            + "\n 2. Servir leche"
            + "\n 3. Servir CafeConLeche"
            + "\n 4. Consultar estado"
            + "\n 5. Apagar máquina y salir"
            +"\n -------------------------------------------------------------------------";		                 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MaquinaCafe mc = new MaquinaCafe();
		int opcion = 0;
		Double monedero = 0.0;
		Double saldoMaquina = 0.0;
		System.out.println("Introduce el saldo inicial de la maquina: ");
		saldoMaquina = Double.valueOf(sc.nextLine());
		mc.setMonedero(saldoMaquina);
		mc.llenarDeposito();
		while (opcion!=5) {
			System.out.println(MENU);
			System.out.println("Introduce una opcion: ");
			opcion = Integer.valueOf(sc.nextLine());
			if (opcion==1) {
				System.out.println("Introduce dinero: ");
				monedero = Double.valueOf(sc.nextLine());
				System.out.println(mc.servirCafe(monedero));
			}else if (opcion==2) {
				System.out.println("Introduce dinero: ");
				monedero = Double.valueOf(sc.nextLine());
				System.out.println(mc.servirLeche(monedero));
			}else if (opcion==3) {
				System.out.println("Introduce dinero: ");
				monedero = Double.valueOf(sc.nextLine());
				System.out.println(mc.servirCafeLeche(monedero));
			}else if (opcion==4) {
				System.out.println(mc.getEstado());
			}
		}
	}
		
		

}