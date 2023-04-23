package com.edu.mockEuro.model;

import java.util.HashSet;
import java.util.Set;

public class Combinacion {
	
	private static final int VALOR_MINIMO = 1;
	private static final int VALOR_MAXIMO_NUMEROS = 50;
	private static final int VALOR_MAXIMO_ESTRELLAS = 12;
	private static final int TOTAL_NUMEROS = 5;
	private static final int TOTAL_ESTRELLAS = 2;
	
	private Set<Integer> numeros;
	private Set<Integer> estrellas;
	
	
	public Combinacion(int num1, int num2, int num3, int num4, int num5, int star1, int star2) {
		super();
		this.numeros = new HashSet<>();
		this.estrellas = new HashSet<>();
	}


	public Set<Integer> getNumeros() {
		return numeros;
	}


	public Set<Integer> getEstrellas() {
		return estrellas;
	}
	
	

}
