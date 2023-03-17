package com.edu.mock.model;

import java.util.Objects;

public class Plato {
	private String nombre;
	private double precio;
	private static double iva = 0.21;
	private Vino vinoRecomendado;
	
	
	public Plato(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Plato(String nombre, double precio) {
		this(nombre);
		if(precio<=0) {
			this.precio = precio;
		}
	}
	
	public void incrementarPrecio(double incremento) {
		this.precio += incremento;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecioBase() {
		return precio;
	}
	
	public double getPrecioVentaPublico() {
		return this.precio+ this.precio*iva ;
	}
	
	public String getVinoRecomendado() {
		return this.vinoRecomendado!=null? this.vinoRecomendado.toString():
												"Sin recomendaciones para el vino";
	}
	
	
	public void setVinoRecomendado(Vino vino) {
		this.vinoRecomendado = vino;
	}
	
	public void setVinoRecomendado(String nombre, double graduacion) throws Exception {
		setVinoRecomendado(new Vino(nombre, graduacion));
	}
	
	public double getGradosVinoRecomendado() {
		return this.vinoRecomendado!=null? this.vinoRecomendado.getGraduacion() : 0.0;
	}
	
	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof Plato) 
				&& Objects.equals(this.nombre, ((Plato) obj).nombre));
	}
	
	public double getIva() {
		return iva;
	}
	
	
	public String toString() {
		return String.format("Plato con nombre %s, precio sin iva %s, pvp %s y %s",
				this.nombre, this.precio, this.getPrecioVentaPublico(), getVinoRecomendado()
				);
	}
}
