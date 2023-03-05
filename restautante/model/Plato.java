package com.edu.restautante.model;

import java.util.Objects;

public class Plato {
	
	private String nombre;
	private double precio;
	private static final double IVA = 1.21;
	private double graduacion;
	private Vino vinoRecomendado;
	
	public String getNombre() {
		return nombre;
	}

	public double getPrecioBase() {
		return precio;
	}
	
	public double getPrecioVentaPublico() {
		return precio*IVA;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void incrementaPrecio(double incremento) {
		this.precio += incremento;
	}

	public void setVinoRecomendado(Vino vino) {
		
	}
	public void setVinoRecomendado(String vino, double graduacion) {
		
	}
	public double getGradosVinosRecomendado() {
		return this.graduacion;
	}
	
	public Plato(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Plato(String nombre, double precio) {
		super();
		if(precio>0) {
			this.nombre = nombre;
			this.precio = precio;
		}
	}

	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (this == obj)
			resultado = true;
		if (obj == null)
			resultado = false;
		if (getClass() != obj.getClass())
			resultado = false;
		Plato other = (Plato) obj;
		return resultado&&Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Nombre del plato: " + this.nombre + ", precio sin IVA " + getPrecioBase() + ", precio con IVA " + getPrecioVentaPublico();
	}
}
