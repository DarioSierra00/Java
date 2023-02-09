package com.edu;

import java.util.Scanner;

public class Mock {
	Scanner sc = new Scanner(System.in);
	
	public static double frecuenciaNotas1(String nota) {
		nota = nota.toLowerCase();
		final double DO = 523.25;
        final double RE = 587.33;
        final double MI = 659.26;
        final double FA = 698.46;
        final double SOL = 783.99;
        final double LA = 880.00;
        final double SI = 987.77;
        double resultado = -1;
		
		
			switch (nota) {
			case "do": {
				resultado = DO;
				break;
			}case "re": {
				resultado = RE;
				break;
			}case "mi": {
				resultado = MI;
				break;
			}case "fa": {
				resultado = FA;
				break;
			}case "sol": {
				resultado = SOL;
				break;
			}case "la": {
				resultado = LA;
				break;
			}case "si": {
				resultado = SI;
				break;
			}default:
				resultado = -1;
		}return resultado;
	}
	
	public static double frecuenciaNotas(String nota) {
		final double DO = 523.25;
        final double RE = 587.33;
        final double MI = 659.26;
        final double FA = 698.46;
        final double SOL = 783.99;
        final double LA = 880.00;
        final double SI = 987.77;
        double resultado = -1;
        
		nota = nota.toLowerCase();
		if (nota.equals("do")|| nota.equals("re")|| nota.equals("mi")|| nota.equals("fa")|| nota.equals("sol")|| nota.equals("la")|| nota.equals("si")) {
			
			if (nota.equals("do")) {
				resultado = DO;
			}else if (nota.equals("re")){
				resultado = RE;
			}else if (nota.equals("mi")){
				resultado = MI;
			}else if (nota.equals("fa")){
				resultado = FA;
			}else if (nota.equals("sol")){
				resultado = SOL;
			}else if (nota.equals("la")){
				resultado = LA;
			}else if (nota.equals("si")){
				resultado = SI;
			}
		}return resultado;
	}
	
	public static double frecuenciaNotas3(String nota, Boolean sostenido) {
		nota = nota.toLowerCase();
		final double DO = 523.25;
        final double RE = 587.33;
        final double MI = 659.26;
        final double FA = 698.46;
        final double SOL = 783.99;
        final double LA = 880.00;
        final double SI = 987.77;
        double resultado = -1;
        
        if (nota.equals("do")|| nota.equals("re")|| nota.equals("mi")|| nota.equals("fa")|| nota.equals("sol")|| nota.equals("la")|| nota.equals("si")) {
			
			if (nota.equals("do") && sostenido) {
				resultado = DO*1.03;
			}else if (nota.equals("re") && sostenido){
				resultado = RE*1.03;
			}else if (nota.equals("mi") && sostenido){
				resultado = MI*1.03;
			}else if (nota.equals("fa") && sostenido){
				resultado = FA*1.03;
			}else if (nota.equals("sol") && sostenido){
				resultado = SOL*1.03;
			}else if (nota.equals("la") && sostenido){
				resultado = LA*1.03;
			}else if (nota.equals("si") && sostenido){
				resultado = SI*1.03;
			}else {
				if (nota.equals("do") && !sostenido) {
					resultado = DO;
				}else if (nota.equals("re") && !sostenido) {
					resultado = RE;
				}else if (nota.equals("mi") && !sostenido){
					resultado = MI;
				}else if (nota.equals("fa") && !sostenido){
					resultado = FA;
				}else if (nota.equals("sol") && !sostenido){
					resultado = SOL;
				}else if (nota.equals("la") && !sostenido){
					resultado = LA;
				}else if (nota.equals("si") && !sostenido){
					resultado = SI;
				}
			}
			
		}return resultado;
	}
	
	public static double frecuenciaCardiacaMaxima(int año, String fechaNacimiento) {
		
		double fcmr = 0;
		
		int edad = 0;
		if (fechaNacimiento.length()==10) {
			edad = año - Integer.valueOf(fechaNacimiento.substring(6));
			int fcm = 220 - edad;
			fcmr = fcm - fcm*0.15;
		}else {
			fcmr = -1;
		}
		
		return fcmr;
	}
	
	public static void main(String[] args) {
		System.out.println(frecuenciaNotas3("do", true));
		System.out.println(frecuenciaCardiacaMaxima(2023, "12/09/2004"));
		}
}
