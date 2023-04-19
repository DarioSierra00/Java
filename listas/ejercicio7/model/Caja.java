package com.edu.listas.ejercicio7.model;

import java.util.ArrayList;
import java.util.List;

import com.edu.listas.ejercicio7.exception.CajaException;

public class Caja {
	private int numeroCaja;
	private static int codigoSiguienteCaja = 0;
	protected List<Cliente> cliente;
	private boolean estado;
	
	
	
	public Caja() {
		super();
		this.numeroCaja = codigoSiguienteCaja++;
		this.estado = false;
		this.cliente = new ArrayList<>();
	}

	public void abrirCaja() throws CajaException {
		if(this.estado) {
			throw new CajaException("La caja ya está abierta");
		}
		this.estado = true;
	}
	
	public void cerrarCaja() throws CajaException {
		if(this.estado && cliente.isEmpty()) {
			this.estado = false;
		}
		else {
			throw new CajaException("Para cerrar la caja no debe haber clientes");
		}
}
	
	public String atenderCliente() throws AlmacenException {
		String resultado = "";
		if(!this.estado || this.cliente.isEmpty()) {
			throw new AlmacenException("La caja no esta abierta o la caja está vacía");
		}
		resultado = String.format("Se ha atendido al cliente con número %s", this.cliente.get(0).getNumeroCliente());
		
		this.cliente.remove(this.cliente.get(0));
		
		return resultado;
	}
	
	public int getClientesCaja() {
		return this.cliente.size();
	}
	
	public void addCliente(Cliente c) {
		this.cliente.add(c);
	}

	public int getNumeroCaja() {
		return numeroCaja;
	}

	public boolean isEstado() {
		return estado;
	}

	
	
	
}
