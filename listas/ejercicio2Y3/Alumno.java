package com.edu.listas.ejercicio2Y3;

import java.util.Objects;

import com.edu.listas.ejercicio5.Mensaje;

public class Alumno {
	
	private String nombre;
	private String dni;
	
	public Alumno(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null &&
				obj instanceof Alumno 
				&& this.hashCode()==((Alumno)obj).hashCode();
	}
	
	
	
	
	public String toString() {
		return String.format("Alumno con nombre %s y dni %s.", this.nombre, this.dni);
	}
}
