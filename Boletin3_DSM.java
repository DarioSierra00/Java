package com.edu;

public class Boletin3_DSM {

		public static String banderaFor(String cadena, int posicion) {

			String resultado = "";
			
			for (int i= 0; i < cadena.length(); i++) {
			
				if ((posicion%2==0) && (i%2==0)) {
					resultado += cadena.charAt(i);
			
				}else if ((posicion%2!=0) && (i%2!=0)) {
					resultado += cadena.charAt(i);
				}
			}return resultado;
			}
		//public static int divisiblePor3(int numero) {
			//}
			
		public static int contarPalabra(String palabraContar, String cadena) {
			int numeroVeces = 0;
			int cont = 0;
			int igual = 0;
			
			while (cont < cadena.length()) {
				if ((palabraContar.charAt(igual)) == (cadena.charAt(cont))){
					igual ++;
						
				}else {
					igual = 0;
						
				}if (igual == palabraContar.length()) {
					numeroVeces ++;
					igual = 0;
				}cont ++;
		}return numeroVeces;
		
	}
		
		public static Boolean startWith(String palabraBuscar, String cadena) {
			return (cadena.substring(0, palabraBuscar.length()).equals(palabraBuscar));
		}
		
		public static Boolean endWith(String palabraBuscar, String cadena) {
			return (cadena.substring(cadena.indexOf(palabraBuscar.charAt(0)), cadena.length()).equals(palabraBuscar));
		}
		
		public static Boolean contains(String palabraContar, String cadena) {
			int numeroVeces = 0;
			int cont = 0;
			int igual = 0;
			Boolean resultado = false;
			while (cont < cadena.length()) {
				if ((palabraContar.charAt(igual)) == (cadena.charAt(cont))){
					igual ++;
						
				}else {
					igual = 0;
						
				}if (igual == palabraContar.length()) {
					numeroVeces ++;
					igual = 0;
				}cont ++;
		}
			if (numeroVeces >=0) {
				resultado = true;
			}return resultado;
	}
		
		public static Boolean esPalindromo(String cadena) {
			Boolean resultado = false;
			String palabraAlReves = "";
			
			for (int i = cadena.length()-1; i>=0; i--) {
				if(Character.isWhitespace(cadena.charAt(i))) {
					cadena = cadena.substring(0,i) + cadena.substring(i+1);
					i--;
					
				}palabraAlReves+=cadena.substring(i,i+1);
				
				if (palabraAlReves.substring(0).equals(cadena.substring(0))) {
					resultado = true;
				}
				}return resultado;
			}
		
		/*public static Boolean esCapicua(double numero) {
			
			}*/
		
		public static void main(String[] args) {
			System.out.println(banderaFor("HOLA LOCOTRONES", 4));
			System.out.println(contarPalabra("Hola", "HolalocoHola"));
			System.out.println(startWith("dario", "dario sierra"));
			System.out.println(endWith("dario", "sierra dario"));
			System.out.println(contains("currito", "que locotron eres currito mio"));
			System.out.println(esPalindromo("somos o no somos"));
			//System.out.println(esCapicua(303));
			}
		}

