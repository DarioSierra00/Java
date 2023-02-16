package com.edu;

import java.util.Scanner;

public class Mockk {

		public static double frecuenciaNotasSwitch(String nota) {
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
		
		public static double frecuenciaNotasSostenido(String nota, Boolean sostenido) {
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
		
		public static final double ENTRADA_GENERAL 				= 8;
		public static final double ENTRADA_PAREJA  				= 11;
		public static final double ENTRADA_DIA_ESPECTADOR  		= 5;
		public static final double DESCUENTO_TARJETA_JACARANDA	= 0.10;
		public static final String DIAS_SEMANA					= "LMXJVSD";
		public static final String POSEE_TARJETA				= "SN";
		
		public static void main(String[] args) {

				
			Scanner sc = new Scanner(System.in);
			int entradas = -1;
			double precioFinal = 0.0;
				
			while(entradas!=0) {
					
				do {
					System.out.println("Número de entradas: ");
					entradas = Integer.valueOf(sc.nextLine());
				}while(entradas<0);
					
				String dia = "";
				do {
					System.out.println("Día de la semana (L,M,X,J,V,S,D):");
					dia = sc.nextLine();
				}while(DIAS_SEMANA.toLowerCase().indexOf(dia.toLowerCase())==-1);
					
					
				String poseeTarjeta = "";
				do {
					System.out.println("¿Tienes tarjeta CineJacaranda(S/N)?:");
					poseeTarjeta = sc.nextLine();
				}while(POSEE_TARJETA.indexOf(poseeTarjeta)==-1);
					
					
					/*
								if(entradas%2==0) {
									precioFinal=((int)(entradas/2))*ENTRADA_PAREJA;
								}else {
									precioFinal=((int)(entradas/2))*ENTRADA_PAREJA+ENTRADA_GENERAL;
								}
					 */
				if(dia.equalsIgnoreCase("J")) {//Día de la pareja
					precioFinal=((int)(entradas/2))*ENTRADA_PAREJA;
					precioFinal+=(entradas%2)*ENTRADA_GENERAL;
						
				}else if(dia.equalsIgnoreCase("X")){//Día del espectador
					precioFinal=entradas*ENTRADA_DIA_ESPECTADOR;
				}else {
					precioFinal=entradas*ENTRADA_GENERAL;
				}
					
				if(poseeTarjeta.equalsIgnoreCase("s")) {
						//precioFinal=(precioFinal-DESCUENTO_TARJETA_JACARANDA*precioFinal);
					precioFinal*=(1-DESCUENTO_TARJETA_JACARANDA);
				}
				System.out.printf("El precio final es %s", precioFinal);
				
				}
			}
		}
			
