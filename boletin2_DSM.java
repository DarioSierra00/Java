package com.edu;

import java.util.Scanner;

public class boletin2_DSM {
	public static String numeroSolucionesEcuacionSegundoGrado(double a, double b, double c) {
		double x1 = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		double x2 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		
		String resultado = "El primer resultado es "+ x1 + "y el segundo resultado es " + x2;
		return resultado;
	}
	
	public static Boolean constraseñaSegura(String contrasenya) {
		int contUp=0, contMin=0, contSig=0, contDig=0;
		Boolean segura = false;
		int cont = 0;
		if (contrasenya.length() >= 8) {
			while (cont < contrasenya.length()) {
				if (Character.isUpperCase(contrasenya.charAt(cont))) {
					contUp++;
				}else if (Character.isLowerCase(contrasenya.charAt(cont))) {
					contMin++;
				}else if (Character.isDigit(contrasenya.charAt(cont))) {
					contDig++;
				}else if (contrasenya.charAt(cont)=='.' || contrasenya.charAt(cont)=='?' || contrasenya.charAt(cont)=='!'){
					contSig++;
				}cont++;
			}if (contUp>0 && contMin>0 && contSig>0 && contDig>0) {
				segura = true;
			}
		
		}return segura;
	}
	
	public static String codificacionCadena(String cadena) {
		int cont=0;
		String resultado = "";
		
		while (cont < cadena.length()) {
			if (cont % 2 != 0){
				resultado += String.valueOf(cadena.charAt(cont))+String.valueOf(cadena.charAt(cont-1));
			}cont++;
		}return resultado;
	}
	
	public static Boolean esMultiplo(int num1, int num2) {
		Boolean resultado = false;
		if (num1 % num2 == 0) {
			resultado = true;
		}return resultado;
	}
	
	public static int horaMayor(int hora1, int min1, int sec1, int hora2, int min2, int sec2) {
		int resultado = 0;
		if (hora1 <= 12 && min1 <= 60 && sec1 <= 60 && hora2 <=12 && min2 <= 60 && sec2 <= 60) {
			if (hora1 > hora2) {
				resultado = 1;
			}else if (hora1 < hora2) {
				resultado = 2;
			}else {
				if (min1 > min2) {
					resultado = 1;
				}else if (min1 < min2) {
					resultado = 2;
				}else {
					if (sec1 > sec2) {
						resultado = 1;
					}else if (sec1 < sec2) {
						resultado = 2;
					}else {
						resultado = 0;
					}
				}
			}
		}else {
			resultado = -1000;
		}return resultado;
	}
	
	/*public static int segundosEntre(int hora1, int min1, int sec1, int hora2, int min2, int sec2) {
		int resultado = 0;
		
	}*/
	public static String toBinary(int binario) {

		String resultado = "";
		while(binario > 0) {
			if(binario%2 == 0) {
				resultado = "0" + resultado;
			}else {
				resultado = "1" + resultado;
			}
			binario=(int)binario/2;
		}
		
		return resultado;
	}
	
	public static int toDecimal(String numero) {

		int decimal = 0;
		int posicion = 0;
		for(int i = numero.length()-1; i>= 0; i--) {
			int digito = 1;
			if(numero.charAt(i) == '0') {
				digito = 0;
			}
			double multiplicador = Math.pow(2, posicion);
			decimal += digito * multiplicador;
			posicion ++;
		}
		return decimal;
	}
	
	public static int greaterCommonDivisor(int num1, int num2) {
		if (num1==0) {
			return num2;
		}while (num2 != 0) {
			if (num1 > num2) {
				num1 = num1 - num2;
			}else {
				num2 = num2 - num1;
			}
		}return num1;
	}
	/*Realiza un método llamado gcd (greaterCommonDivisor) que recibirá dos números y
devuelva el máximo común divisor según el algoritmo de Euclides.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		/*
		System.out.println("Introduce un numero para darle la vuelta: ");
		String numero = (sc.nextLine());
		String resultado = "";
		
		for (int i = numero.length(); 0 < i;) {
			i--;
			resultado +=numero.charAt(i);
		}System.out.println(resultado);
		
		System.out.println(constraseñaSegura("Dario?5.32"));
		System.out.println(codificacionCadena("Hola mundo"));
		System.out.println(esMultiplo(12, 4));
		System.out.println(horaMayor(12,12,12,12,12,12));
		System.out.println(toBinary(352));
		System.out.println(toDecimal("57463"));
		System.out.println(greaterCommonDivisor(12,6));*/
	}

}
