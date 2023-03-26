package com.edu.prueba.model;

public class Tablet extends TelefonoMovil{
	private double tamañoPantalla;

	public Tablet(int precio, String marca, String modelo, int capacidadAlmacenamiento, double tamañoPantalla) {
		super(precio, marca, modelo, capacidadAlmacenamiento);
		this.tamañoPantalla = tamañoPantalla;
	}
	public String toString() {
		return "Producto con precio " + precio + ", marca " + marca + ", Modelo " + Modelo + " , con capacidad de almacenamiento de " + capacidadAlmacenamiento + " y un tamaño de la pantalla de " + tamañoPantalla;
	}
}
