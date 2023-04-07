package com.edu.alquiler.model;

public enum Gama {
	ALTA(50),
	MEDIA(40),
	BAJA(30);

	private int precio;
	
	Gama(int g) {
	}
	
	public int getPrecio() {
		return this.precio;
	}
}
