package com.edu.listas.ejercicio7.model;

public class Cliente {
	private int numeroCliente;
	private static int codigoSiguienteCliente;
	private int numCajaAsignada;
	
	public Cliente() {
		super();
		this.numeroCliente = codigoSiguienteCliente++;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumCajaAsignada(int numCajaAsignada) {
		this.numCajaAsignada = numCajaAsignada;
	}
	
	
	
}
