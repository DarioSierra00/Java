package com.edu.listas.ejercicio1;

import java.util.Arrays;

public class Main {

	
	protected static <T> T[] reverse ( T[] arrayOriginal) {
		T[] tmp = arrayOriginal.clone();
		for(int i = 0, cont = arrayOriginal.length-1; i<arrayOriginal.length; i++, cont--) {
			tmp[i] = arrayOriginal[cont];
		}return tmp;
	}

	public static void main(String[] args) {
		Integer[] numeros = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(reverse(numeros)));
	}

}

