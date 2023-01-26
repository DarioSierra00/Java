/*
package com.edu;

import java.util.Scanner;

public class Boletin1_DSM {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean multiplo = false;
		
		System.out.println("Introduce un numero:");
		int num1 = Integer.valueOf(sc.nextLine());
		System.out.println("Introduce otro numero: ");
		int num2 = Integer.valueOf(sc.nextLine());

		if ((num1%num2==0) || (num2%num1==0)){
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		System.out.println("Introduce el dia de hoy");
		String dia = String.valueOf(sc.nextLine());
		
		switch (dia) {
		case "Lunes": {
			System.out.println("Base de Datos");
			break;
		}case "Martes","Miercoles","Viernes": {
			System.out.println("Programacion");
			break;
		}case "Jueves": {
			System.out.println("Dormir un ratillo");
			break;}
		default:
			System.out.println("Hoy a dormir");
		}
		
		System.out.println("Inserta un caracter: ");
		String caracter = String.valueOf(sc.nextLine());
		char c = caracter.charAt(0);
		
		if (c==32) {
			System.out.println("Espacio en blanco");
		}
		else if (c==40 || c==41 || c==123 || c==125) {
			System.out.println("Paréntesis o llaves");
		}
		else if ((c>=33 && c<=47) || (c>=58 && c<=63)) {
			System.out.println("Signo de puntuación");
		}
		else if (c>=48 && c<=57) {
			System.out.println("Digito");
		}
		if (c>=65 && c<=90){
			System.out.println(c + " Es Mayúscula");
		}
		else if (c>=97 && c<=122) {
			System.out.println(c + " Es Minúscula");
		}
		else if (c>=48 && c<=57) {
			System.out.println("Otro caracter");
		}
		
		
		System.out.println("Introduce la nota de tu parte práctica: ");
		double practica = Double.valueOf(sc.nextLine());
		System.out.println("Introduce la nota de tu parte teórica: ");
		double teorica = Double.valueOf(sc.nextLine());
		System.out.println("Introduce la nota de tu parte de problemas: ");
		double problemas = Double.valueOf(sc.nextLine());
		
		practica *= 0.1;
		teorica *= 0.4;
		problemas *= 0.5;
		
		double nota = practica + teorica + problemas;
		System.out.println(nota);
		
		if (nota>=0 && nota<5) {
			System.out.println("Insuficiente");
		}else if(nota>=5 && nota<6){
			System.out.println("Suficiente");
		}else if(nota>=6 && nota<7) {
			System.out.println("Bien");
		}else if (nota>=7 || nota<=8) {
			System.out.println("Notable");
		}else if (nota>=9 || nota<=10) {
			System.out.println("Sobresaliente");
		}
		while (practica<0 || practica>10) {
			System.out.println("La nota debe ser entre 0 y 10: ");
		}
		while (teorica<0 || teorica>10) {
			System.out.println("La nota debe ser entre 0 y 10: ");
		}	
		while (problemas<0 || problemas>10) {
			System.out.println("La nota debe ser entre 0 y 10: ");
		}
		
		
		System.out.println("Introduce la hora: ");
		int hora = Integer.valueOf(sc.nextLine());
		
		if (hora>=6 && hora<=12){
			System.out.println("Buenos días");
		}else if (hora>=13 && hora<=20) {
			System.out.println("Buenas tardes");
		}else if ((hora>=21 && hora<=24) || (hora>=0 && hora<=5)) {
			System.out.println("Buenas noches");
		}
		
		
		System.out.println("Introduce el mes en el que estamos: ");
		int mes = Integer.valueOf(sc.nextLine());
		System.out.println("Introduce el dia en el que estamos: ");
		int dia = Integer.valueOf(sc.nextLine());
		
		if ((mes>=3 && dia>=20) && (mes<=6 && dia<=21) || (mes==4) || mes==5) {
			System.out.println("La temperatura está configurada a 20º");
		}else if ((mes>=6 && dia>=22) && (mes<=9 && dia<=23) || (mes==6) || (mes==7) || (mes==8)){
			System.out.println("La temperatura está configurada a 24º");
		}else if ((mes>=9 && dia>=24) && (mes<=12 && dia<=21) || (mes==10) || (mes==11)){
			System.out.println("La temperatura está a 19º");
		}else if ((mes<=12 && dia>=22) && (mes<=1 && dia<=1) || (mes==2) || (mes==3)) {
			System.out.println("La temperatura está a 18º");
		}
		
		// Ejercicio 7.A
		
		int num=1;
		for (num=1;num<=100;num++)
		{
			System.out.println(num);
		}
		
		while (num<=100){
			System.out.println(num);
			num++;
		}
		
		do {
			System.out.println(num);
			num++;
		}while (num<=100);
		
		
		//Ejercicio 7.B
		for (int i=100;i>=1;i--){
			System.out.println(i);
		}
		
		int num = 100;
		
		while (num>=1) {
			System.out.println(num);
			num--;
		}
		
		do {
			System.out.println(num);
			num--;
		}while (num>=1);
		
		//Ejercicio 7.C
		for (int i=0; i<=100;) {
			System.out.println(i+=5);
		}
		
		int num = 0;
		
		while (num<100) {
			System.out.println(num+=5);
		}
		
		int num = 0;
		
		do {
			System.out.println(num);
			num+=5;
		}while (num<=100);
		
		
		//Ejercicio 7.D
		for (int i=320; i>=160;i-=20) {
			System.out.println(i);
		}
		
		int num = 320;
		
		while (num>160) {
			System.out.println(num-=20);
		}
		
		int num = 320;
		
		do {
			System.out.println(num);
			num-=20;
		}while (num>=160);
		
		
		//Ejercicio 8
		int suma = 0;
		
		for (int i=0; i<15; i++) {
			System.out.println("Introduce un numero: ");
			suma+= Integer.valueOf(sc.nextLine());
		}System.out.println("La suma es : "+ suma);
		
		//Ejercicio 9
		int num = 0;
		
		for (int i=0; i<5; i++) {
			System.out.println("Introduce un numero");
			num = Integer.valueOf(sc.nextLine());
			if (num%3==0){
				System.out.println(num + " Es múltiplo de 3");
			}
			else {
				System.out.println(num + " No es múltiplo de 3");
			}
				
		}
		
		//Ejercicio 10
		
		System.out.println("Introduce un numero entero mayor que 0");

		int numero=Integer.valueOf(sc.nextLine());
		int contador=0;
		int suma=0;

		while(numero>0 && contador<=100) {

			numero++;
			contador+=1;
			suma+=numero;
		}

		System.out.println("La suma es " +suma);
		
		
		
		//Ejercicio 11
		System.out.println("Introduce un numero positivo: ");
		int numero=Integer.valueOf(sc.nextLine());
		
		while (numero>=0) {
			double cuadrado = Math.pow(numero, 2);
			System.out.println("El elevado es " + cuadrado);
			System.out.println("Introduce otro numero positivo: ");
			numero=Integer.valueOf(sc.nextLine());
		}
		
		//Ejercicio 12
		System.out.println("Introduce un numero positivo: ");
		int num=Integer.valueOf(sc.nextLine());
		int cont = 0;
		
		while (num>=0) {
			System.out.println("Introduce numero positivo: ");
			num = Integer.valueOf(sc.nextLine());
			cont++;
		}System.out.println(cont);
		
		
		int mayor = 5;
		int menor = 5;
		for (int i=0;i<10;i++) {
			System.out.println("Introduce un numero: ");
			int num = Integer.valueOf(sc.nextLine());
			if (mayor<num) {
				mayor = num;
			}else if (num < menor){
				menor = num;
			}
		}System.out.println("El mayor es " + mayor);
		 System.out.println("El menor es " + menor);
		
		
		//Ejercicio 14
		
		System.out.println("Introduce un numero positivo: ");
		int num=Integer.valueOf(sc.nextLine());
		int numerosIntrod = 0;
		int sumaImpares = 0;
		int mayor = 0;
		int contImpares = 0;
		double mediaImpares = 0;
		
		while (num>=0) {
			System.out.println("Introduce numero positivo: ");
			num = Integer.valueOf(sc.nextLine());
			numerosIntrod++;
			if (num%2!=0) {
				contImpares++;
				sumaImpares+=num;
			}else if (num%2==0 && num>mayor){
				mayor = num;
			}
		}
		 mediaImpares = sumaImpares / contImpares;
		 System.out.println("Se han introducido" + numerosIntrod + "numeros");
		 System.out.println("La media de los impares es" + mediaImpares);
		 System.out.println("El mayor de los pares es "+ mayor);
		
		
		//Ejercicio 15
		
		String acabar = "";
		int suma = 0;
		System.out.println("Quieres introducir numeros? ");
		acabar = String.valueOf(sc.nextLine());
		while (!acabar.equals("fin")) {
			System.out.println("Introduce un numero ");
			int num = Integer.valueOf(sc.nextLine());
			suma+=num;
			
			System.out.println("Quieres introducir numeros? ");
			acabar = String.valueOf(sc.nextLine());
		}
		System.out.println("La suma de todo es "+ suma);
		
		
		//Ejercicio 16
		double salario = 0;
		int suma = 0;
		int mayorMil = 0;
		
		for (int i=0;i<10;i++) {
			System.out.println("Cuanto gana al mes: ");
			salario = Integer.valueOf(sc.nextLine());
			if (salario>0) {
				suma+=salario;
			}if (salario>1000) {
				mayorMil++;
			}
		}
		System.out.println("La suma de todo el salario es "+suma + "y salarios mayores de 1000€ hay " + mayorMil);
		
		
		//Ejercicio 17
		
		int serie=13, num1=0,num2=1, suma=1;
		
		
		for (int i=1; i<serie;i++) {
			System.out.println(suma);
			
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
		}
		
		
		//Ejercicio 18
		System.out.println(calcularAreaCirculo());
		System.out.println(longitudCirculo());
	}	


	public static final double PI = 3.14;
	
	public static double calcularAreaCirculo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio para el area: ");
		int radio = Integer.valueOf(sc.nextLine());
		
		double calculoRadio = PI * Math.pow(radio,2);
		
		return calculoRadio; 
		
	}
	public static double longitudCirculo() {
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio para la longitud: ");
		int radio = Integer.valueOf(sc.nextLine());
		double longitud;
        longitud = (2 * PI) * radio;
        return longitud;
    }
}
	*/