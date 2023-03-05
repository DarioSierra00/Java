package com.edu.restautante.model;

import java.util.Objects;

public class Vino {
	private String nombre;
	private double graduacion;
	
	public Vino(String nombre) {
		
	}
	
	public Vino(String nombre, double graduacion) {
		super();
		if(this.graduacion>0) {
			this.nombre = nombre;
			this.graduacion = graduacion;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vino other = (Vino) obj;
		return Double.doubleToLongBits(graduacion) == Double.doubleToLongBits(other.graduacion)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Nombre del vino" + nombre + ", con graduacion de" + graduacion;
	}
	
}
