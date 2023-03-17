package com.edu;

public class ListaNumeros {

	public static final String DIGITOS = "0123456789";
	static int[] array = {1,3,77,44,345,789,2};
	
	public double calculoMedia(int[] numeros) {
		int suma = 0;
		
		for(int n: numeros) {
			suma+=n;
		}
		return numeros.length>0? suma/numeros.length : 0;
	}
	
	public static int filtrarPorDigitoFinal(int[] numeros, char digitoFinal) {
		int cantidad = 0;
		for(int n:array) {
			int sizeNumero = String.valueOf(n).length();
			if(digitoFinal == String.valueOf(n).charAt(sizeNumero-1)) {
				cantidad ++;
			}
		}return cantidad;
		
	}
<<<<<<< HEAD
	
/*	public static int[] digitoQueMasTerminan(int[] array) {
=======
	/*
	public static int[] digitoQueMasTerminan(int[] array) {
>>>>>>> 497241a (PruebaEvaluable)
		int[] nums = {1,3,500,2,33};
			
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<DIGITOS.length(); i++) {
			
			int cantidad = filtrarPorDigitoFinal(array,DIGITOS.charAt(i));
		}
	}*/
}
	
