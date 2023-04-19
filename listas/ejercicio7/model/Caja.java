package com.edu.listas.ejercicio7.model;

import java.util.ArrayList;
import java.util.List;

import com.edu.listas.ejercicio7.exception.CajaException;

public class Caja {
	private final int MAX_CAJAS = 20;
	private int numeroCaja;
	private static int codigoSiguienteCaja = 0;
	protected List<Cliente> cliente;
	private boolean estado;
	
	
	
	public Caja() {
		super();
		this.numeroCaja = codigoSiguienteCaja;
		this.estado = false;
		this.cliente = new ArrayList<>();
	}

	public void abrirCaja(int num) throws CajaException {
		if(this.estado) {
			throw new CajaException("La caja ya está abierta");
		}
		this.estado = true;
	}
	
	public void cerrarCaja(int num) throws CajaException {
		if(!this.estado && cliente.isEmpty()) {
			this.estado = false;
		}
		else {
			throw new CajaException("Para cerrar la caja no debe haber clientes");
		}
}
}
