package com.edu.cuentaCorriente;

import java.util.Scanner;

import com.edu.cuentaCorriente.model.CuentaCorriente;

public class Main {

	public static String MENU = "--------------------------------------------------------------------------"
					            + "\n 1. Hacer un reintegro"
					            + "\n 2. Hacer un ingreso"
					            + "\n 3. Consultar el saldo y el numero de reintegros e ingresos realizados"
					            + "\n 4. Finalizar"
					            +"-------------------------------------------------------------------------";		                 
   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CuentaCorriente c = new CuentaCorriente(); 
		int opcion = 1;
		System.out.println("Introduce el saldo que tienes: ");
		int saldo = Integer.valueOf(sc.nextLine());
		int saldoRetirar = 0;
		int saldoIngresar = 0;
		c.setSaldo(saldo);
		while (opcion!=4) {
			System.out.println(MENU);
			System.out.println("Introduce una opción: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			if (opcion==1) {
				System.out.println("Indique la cantidad que quieres retirar: ");
				saldoRetirar = Integer.valueOf(sc.nextLine());
				c.realizarReintegro(saldoRetirar);
			}else if (opcion==2) {
				System.out.println("Indique la cantidad que quieres ingresar: ");
				saldoIngresar = Integer.valueOf(sc.nextLine());
				c.realizarIngreso(saldoIngresar);
			}else if (opcion==3) {
				System.out.println("saldo disponible "+ c.getSaldo() + ", numero de reintegros "+ c.getReintegro() + ", numero de ingresos "+ c.getIngresos());
			}else if (opcion==4) {
				System.out.println("Su saldo es de "+ c.getSaldo());
			}
		}
		
		}
	}
	

