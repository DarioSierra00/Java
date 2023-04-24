package com.edu.mockEuro.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.edu.listas.ejercicio2Y3.Alumno;

public class Combinacion {
	
	private static final int VALOR_MINIMO = 1;
	private static final int VALOR_MAXIMO_NUMEROS = 50;
	private static final int VALOR_MAXIMO_ESTRELLAS = 12;
	private static final int TOTAL_NUMEROS = 5;
	private static final int TOTAL_ESTRELLAS = 2;
	
	private Set<Integer> Bolnumeros;
	private Set<Integer> Bolestrellas;
	
	
	public Combinacion(int num1, int num2, int num3, int num4, int num5, int star1, int star2) throws CombinacionException {
		this(toArray(num1,num2,num3,num4,num5), toArray(star1,star2));
	}
	
	public Combinacion(int[] numeros, int[] estrellas) throws CombinacionException {
		super();
		this.Bolnumeros = new HashSet<>();
		this.Bolestrellas = new HashSet<>();
		
		for(int i : numeros) {
			if(i >= VALOR_MINIMO && i <= VALOR_MAXIMO_NUMEROS) {
				this.Bolnumeros.add(i);
			}
			else {
				throw new CombinacionException("Error, has introducido un numero fuera de rango");
			}
		}
		for(int i : estrellas) {
			if(i >= VALOR_MINIMO && i <= VALOR_MAXIMO_ESTRELLAS) {
				this.Bolestrellas.add(i);
			}
			else {
				throw new CombinacionException("Error, has introducido un numero fuera de rango");
			}
		}
		if(this.Bolestrellas.size() != TOTAL_ESTRELLAS) {
			throw new CombinacionException("Error, deben ser dos estrellas");
		}
		if(this.Bolnumeros.size() != TOTAL_NUMEROS) {
			throw new CombinacionException("Error, deben ser cinco numeros");
		}
	}



	public Set<Integer> getNumeros() {
		return this.Bolnumeros;
	}


	public Set<Integer> getEstrellas() {
		return this.Bolestrellas;
	}
	
	public int comprobarCombinacion(Combinacion c) {
		int resultado = -1;
		if(c != null) {
			c.Bolnumeros.retainAll(this.Bolnumeros);
			c.Bolestrellas.retainAll(this.Bolestrellas);
			resultado = c.Bolnumeros.size()+c.Bolestrellas.size();
			}
		return resultado;
		}
	
	
	private static int[] toArray(int ...numeros) {
		return numeros;
	}


	@Override
	public int hashCode() {
		return Objects.hash(Bolestrellas, Bolnumeros);
	}


	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null &&
				obj instanceof Combinacion 
				&& this.hashCode()==((Combinacion)obj).hashCode();
	}
	
	@Override
	public String toString() {
		return "Combinacion de numeros " + this.Bolnumeros + " y de estrellas " + this.Bolestrellas;
	}
	

}
