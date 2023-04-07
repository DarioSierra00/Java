package com.edu.alquiler.model;

public enum Combustible {
	GASOLINA(3.5),
	DIESEL(2);

	private double precio;
	
	Combustible(double d) {
		this.precio = d;
	}
	
	public double getPrecio() {
		return this.precio;
	}
}
