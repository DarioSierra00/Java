package com.edu;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		/*Realizar un programa que solicite diez números enteros y cuando se
		termine de introducir el último los muestre en el orden inverso al que se
		introdujeron.*/
		Scanner sc = new Scanner(System.in);
		
		int numeros[] = new int[10];
		
		/* for(int i = 0; i <numeros.length; i++) {
			 System.out.println("Ingrese los numeros que quiera: ");
			 numeros[i] = Integer.valueOf(sc.nextLine());
			 
		 }
		 for(int j = 0; j < numeros.length; j++) {
			 System.out.println(numeros.length-numeros[j]+1);
		 }
		 /*
		  Realiza un programa que cargue un vector con de 10 números enteros.
El programa debe imprimir los elementos del vector y después
desplazarlos una posición, de tal forma que el último pase a la primera
posición, el primero a la segunda, el segundo a la tercera, y así
sucesivamente.
Introduce el número en la posición (1/10): 5
Introduce el número en la posición (2/10): 10
...
Introduce el número en la posición (10/10): 9
Vector original: 5 10 2 30 4 15 6 88 3 9
Vector después de desplazar: 9 5 10 2 30 4 15 6 88 3
NOTA: Sólo debe usarse un vector, no crear vectores auxiliares.
		  */
		int tmp =numeros[0];
		for(int i = 0; i <numeros.length; i++) {
			 System.out.println("Introduce el numero en la posicion: ");
			 numeros[i] = Integer.valueOf(sc.nextLine());
		 }
		 for(int j = 0; j< numeros.length; j++) {
			 numeros[j]=tmp;
			 System.out.println(numeros[j]);
		 }
		 
	}
	

}
