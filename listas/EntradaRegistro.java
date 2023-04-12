package com.edu.listas;

public class EntradaRegistro<K, V> {

	private K clave;
	private V valor;
	
	public EntradaRegistro(K clave, V valor) {
		super();
		this.clave = clave;
		this.valor = valor;
	}
	
	public String toString() {
		return String.format("Entrada con clave %s y valor asociado %s", this.clave, this.valor);
	}

}
