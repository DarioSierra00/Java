package com.edu.prueba.model;

import java.util.Objects;

public class TelefonoMovil extends Producto{
	protected int capacidadAlmacenamiento;


	public TelefonoMovil(int precio, String marca, String modelo, int capacidadAlmacenamiento) {
		super(precio, marca, modelo);
		this.capacidadAlmacenamiento = capacidadAlmacenamiento;
	}

	@Override
	public String toString() {
		return "Producto con precio " + precio + ", marca " + marca + ", Modelo " + Modelo + " y con capacidad de almacenamiento de " + capacidadAlmacenamiento;
	}

	
}
