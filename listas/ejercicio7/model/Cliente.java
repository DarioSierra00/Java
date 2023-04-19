package com.edu.listas.ejercicio7.model;

public class Cliente {
	private int numeroCliente;
	private static int codigoSiguienteCliente;
	
	public Cliente(int numeroCliente) {
		super();
		this.numeroCliente = codigoSiguienteCliente++;
	}
	
	
	
}
