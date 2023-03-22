package com.edu.sieteYmedia.model;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Baraja {
	private Carta[] cartas;
	private final static int MAX_SIZE = 40;
	private static int cont =0;
	private int siguiente;
	
	public Baraja() throws Exception {
		this.cartas = new Carta[MAX_SIZE];
		this.siguiente = 0;
		int posicion = 0;
		
		for(Palo p: Palo.values()) { //recorremos palos
			for(int i = 1; i < 13; i++) { //recorremos valores
				if(i!=8 && i!=9) {//limitamos valores validos
					try {
						this.cartas[posicion++] = new Carta(p,i);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	public void Barajar() {
		int posicion = 0;
		Carta c;
		
		for(int i=1; i<MAX_SIZE; i++) {
			posicion = generarNumero();
			c = cartas[i];
			cartas[i] =cartas[posicion];
			cartas[posicion] =c;
		}
		
		
	}
	
	public Carta getSiguiente() {
		return this.cartas[siguiente++];
	}
	
	
	
	public int generarNumero() {
		return ThreadLocalRandom.current().nextInt(0, MAX_SIZE);
	}
	
	public String toString() {
		return "Baraja "+ Arrays.toString(cartas);
	}
}
