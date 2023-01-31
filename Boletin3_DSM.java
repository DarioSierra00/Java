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
		
		//. Crea tres funciones cuyo comportamiento sea como el de los métodos de String
		//startsWirth, contains y endsWith, pero sin utilizar ninguno de ellos
			
		
		public static Boolean startWith(String palabraBuscar, String cadena) {
			return (cadena.substring(0, palabraBuscar.length()).equals(palabraBuscar));
		}
		
		public static Boolean endWith(String palabraBuscar, String cadena) {
			return (cadena.substring(cadena.indexOf(palabraBuscar.charAt(0)), cadena.length()).equals(palabraBuscar));
		}
		public static void main(String[] args) {
			System.out.println(banderaFor("HOLA LOCOTRONES", 4));
			System.out.println(contarPalabra("Hola", "HolalocoHola"));
			System.out.println(startWith("dario", "dario sierra"));
			System.out.println(endWith("dario", "sierra dario"));
			}
		}

