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
		
		public static Boolean esCapicua(double numero) {
			StringBuilder numeroAlReves = new StringBuilder();
			String numeroStr = String.valueOf(numero);
			Boolean resultado = false;
			
			for (int i = numeroStr.length()-1; i>=0; i--) {
				if (numeroStr.charAt(i)== '.') {
					numeroStr = numeroStr.substring(0,i) + numeroStr.substring(i+1);
					i--;
				}
				numeroAlReves.append(numeroStr.charAt(i));
				
			}if (numeroAlReves.substring(0).equals(numeroStr.substring(0))) {
				resultado = true;
			}return resultado;
			}
		
		public static Boolean palabraEscondida(String cadena, String palabraBuscar) {
			int cont = 0;
			Boolean palabraEscondida = false;
			
			for (int i = 0; i < cadena.length(); i++) {
				if (cont < palabraBuscar.length()) {
					if ((palabraBuscar.charAt(cont)) == cadena.charAt(i)) {
						cont ++;
					}
				}if (cont == palabraBuscar.length()){
					palabraEscondida = true;
				}
			}return palabraEscondida;
		}
		
		public static String reemplazarPalabra(String cadena, String palabraBuscar, String palabraReemplazo) {
			StringBuilder resultado = new StringBuilder();
			String tmp = "";
			int coincidencia = 0;
			
			for (int i = 0; i < cadena.length(); i++) {
				if (cadena.charAt(i) == palabraBuscar.charAt(coincidencia)) {
					tmp+= palabraBuscar.charAt(coincidencia);
					coincidencia++;
					if (palabraBuscar.length() == coincidencia) {
						coincidencia=0;
						resultado.append(palabraReemplazo);
						tmp = "";
					}
				}else {
					resultado.append(tmp + cadena.charAt(i));
					coincidencia = 0;
				}
			}return resultado.toString();
		}
		
		public static String numeroPalabrasFrasesParrafos(String cadena) {
			int contPalabra = 0;
			int contFrase = 0;
			int contParrafo = 0;
			
			for (int i = 0; i < cadena.length(); i++) {
				if (i==0 && !cadena.substring(i, i+1).equals(" ")) {
					contPalabra ++;
				}else if(!cadena.substring(i, i+1).isBlank()&&cadena.substring(i-1, i).isBlank()) {
					contPalabra ++;
				}else if (cadena.substring(i,i+1).isBlank() && cadena.substring(i-1,i).equals(".")) {
					contFrase ++;
				}else if (cadena.substring(i,i+1).equals("\n")) {
					contParrafo++;
				}
			}return("En la cadena hay: "+ contPalabra + " palabras, "+ contFrase + " frases, y " + contParrafo + " párrafos");
		}
		
		/*. Escribir una función que devuelva el número de palabras, frases y párrafos que
existen en una cadena de texto que recibe como parámetro. Ten en cuenta que entre
dos palabras puede haber más de un blanco, las frases se separan por puntos y los
párrafos por saltos de línea.*/
		
		public static void main(String[] args) {
			System.out.println(banderaFor("HOLA LOCOTRONES", 4));
			System.out.println(contarPalabra("Hola", "HolalocoHola"));
			System.out.println(startWith("dario", "dario sierra"));
			System.out.println(endWith("dario", "sierra dario"));
			System.out.println(contains("currito", "que locotron eres currito mio"));
			System.out.println(esPalindromo("somos o no somos"));
			System.out.println(esCapicua(124.21));
			System.out.println(palabraEscondida("shybaoxlna", "hola"));
			System.out.println(reemplazarPalabra("currito mio eres un loco", "loco", "locotron"));
			System.out.println(numeroPalabrasFrasesParrafos("Dos palabras una frase. \n y un parrafo"));
			}
		}

