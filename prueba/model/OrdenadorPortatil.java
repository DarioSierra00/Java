package com.edu.prueba.model;

public class OrdenadorPortatil extends Producto {
	private int memoriaRam;
	
	public OrdenadorPortatil(int precio, String marca, String modelo, int memoriaRam) {
		super(precio, marca, modelo);
		this.memoriaRam = memoriaRam;
	}
	
	public String toString() {
		return "Producto con precio " + precio + ", marca " + marca + ", Modelo " + Modelo + " y con una memoria ram " + memoriaRam;
	}

}
