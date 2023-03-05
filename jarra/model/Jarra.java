package com.edu.jarra.model;

import java.util.Objects;

public class Jarra {
	
	private static double totalAgua;
	private double capacidad;
	private double cantidadAgua;
	
	public Jarra(int capacidad) {
		this.capacidad = capacidad;
	}


	public Jarra(double totalAgua, double capacidad, double cantidadAgua) {
		super();
		this.totalAgua = totalAgua;
		this.capacidad = capacidad;
		this.cantidadAgua = cantidadAgua;
	}

	public static double getTotalAgua() {
		return totalAgua;
	}


	public void setTotalAgua(double totalAgua) {
		this.totalAgua = totalAgua;
	}


	public double getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}


	public double getCantidadAgua() {
		return cantidadAgua;
	}


	public void setCantidadAgua(double cantidadAgua) {
		this.cantidadAgua = cantidadAgua;
	}

	public void llenarJarra() {
		this.cantidadAgua = this.capacidad;
		this.totalAgua += this.capacidad;
	}
	
	public void vaciarJarra() {
		this.cantidadAgua = 0;
	}
	public boolean volcarJarra(Jarra jarra) {
		boolean resultado = false;
		if(jarra.capacidad>= this.cantidadAgua + jarra.cantidadAgua) {
			jarra.cantidadAgua+=this.cantidadAgua;
			this.cantidadAgua = 0.0;
			resultado = true;
		}return resultado;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jarra other = (Jarra) obj;
		return Double.doubleToLongBits(cantidadAgua) == Double.doubleToLongBits(other.cantidadAgua)
				&& Double.doubleToLongBits(capacidad) == Double.doubleToLongBits(other.capacidad)
				&& Double.doubleToLongBits(totalAgua) == Double.doubleToLongBits(other.totalAgua);
	}


	@Override
	public String toString() {
		return "Jarra [totalAgua=" + totalAgua + ", capacidad=" + capacidad + ", cantidadAgua=" + cantidadAgua + "]";
	}
	
	
	
	
}
