package com.edu;

public class Boletin3_DSM {

	public class Boletin3 {

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
					
				}
			}
		
		}
		
		//Diseña un programa que cuente el número de veces que aparece una palabra en
		//una cadena de texto.
			
		public static void main(String[] args) {
			System.out.println(banderaFor("HOLA LOCOTRONES", 4));
			}
		}
}
