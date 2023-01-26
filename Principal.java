package com.edu;

import java.util.Scanner;

//import java.util.Scanner;

public class Principal {

	/*public static void main(String[] args) {
		boolean abierto = true;
		if (abierto) {
			System.out.println("Puede pasar");
		}
		else {
			System.out.println("En otra ocasion");
		}
		int dia = 0;
		System.out.println("Introduce un dia");
		Scanner scanner=new Scanner(System.in);
		String loQueHaLeido = scanner.nextLine();
		dia = Integer.valueOf(loQueHaLeido);
		
		if (dia == 1) {
			System.out.println("Lunes");
		}
		else if (dia == 2) {
			System.out.println("Martes");
		}
		else if (dia == 3) {
			System.out.println("Miércoles");
		}
		else if (dia == 4) {
			System.out.println("Jueves");
		}
		else if (dia == 5) {
			System.out.println("Viernes");
		}
		else if (dia == 6) {
			System.out.println("Sabado");
		}
		else if (dia == 7) {
			System.out.println("Domingo");
		}
		else {
			System.out.println("El dia introducido no es válido");
		}
	}*/
	
	public static void main(String[] args) {
		String mes = "Enero";
		System.out.println("Introduce un mes");
		Scanner scanner=new Scanner(System.in);
		String loQueHaLeido = scanner.nextLine();
		mes = String.valueOf(loQueHaLeido);
		
		switch (mes) {
		case "Enero": {
			System.out.println("31 dias");
			break;
		}
		case "Febrero": {
			System.out.println("28 dias");
			break;
		}
		case "Marzo": {
			System.out.println("31 dias");
			break;
		}
		case "Abril": {
			System.out.println("30 dias");
			break;
		}
		case "Mayo": {
			System.out.println("31 dias");
			break;
		}
		case "Junio": {
			System.out.println("30 dias");
			break;
		}
		case "Julio": {
			System.out.println("31 dias");
			break;
		}
		case "Agosto": {
			System.out.println("31 dias");
			break;
		}
		case "Septiembre": {
			System.out.println("30 dias");
			break;
		}
		case "Octubre": {
			System.out.println("31 dias");
			break;
		}
		case "Noviembre": {
			System.out.println("30 dias");
			break;
		}
		case "Diciembre": {
			System.out.println("31 dias");
			break;
		}
		default:
			System.out.println("No existe ese mes");
		}
		
	} 
}
