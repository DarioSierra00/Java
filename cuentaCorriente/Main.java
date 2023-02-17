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
		System.out.println("Introduce el saldo que tienes: ");
		double saldo = Integer.valueOf(sc.nextLine());
		double saldoRetirar = 0;
		double saldoIngresar = 0;
		
		while (saldo > 0) {
			c.setSaldo(saldo);
			System.out.println(MENU);
			System.out.println("Introduce una opción: ");
			int opcion = Integer.valueOf(sc.nextLine());
			
			if (opcion==1) {
				System.out.println("Indique la cantidad que quieres retirar: ");
				saldoRetirar = Double.valueOf(sc.nextLine());
				if (saldoRetirar > 0) {
					c.realizarReintegro(saldoRetirar, saldo);
				}else {
					System.out.println("No puede retirar ya que no tiene ese saldo.");
				}
			}else if (opcion==2) {
				System.out.println("Indique la cantidad que quieres ingresar: ");
				saldoIngresar = Double.valueOf(sc.nextLine());
				if (saldoIngresar > 0) {
					c.realizarIngreso(saldoIngresar, saldo);
				}else {
					System.out.println("Lo que ingresas debe ser mayor a 0");
				}
			}else if (opcion==3) {
				System.out.println(c.getSaldo());
				System.out.println(c.getIngresos());
				System.out.println(c.getReintegro());
			}else if (opcion==4) {
				saldo= -1;
			}
		}System.out.println("Su saldo es de "+ c.getSaldo());
		
		}
	}
	

