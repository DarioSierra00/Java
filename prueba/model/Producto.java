package com.edu.prueba.model;

public class Producto {
	
	protected int precio;
	protected String marca;
	protected String Modelo;
	protected int stock = 100;
	
	public Producto(int precio, String marca, String modelo) {
		super();
		this.precio = precio;
		this.marca = marca;
		Modelo = modelo;
	}
	public void vender() {
		if(stock>0) {
			stock--;
		}
	}
	public String getMarca() {
		return marca;
	}
	@Override
	public String toString() {
		return "Producto con precio " + precio + ", marca " + marca + ", Modelo " + Modelo;
	}
}
