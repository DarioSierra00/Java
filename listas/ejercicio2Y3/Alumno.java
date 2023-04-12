package com.edu.listas.ejercicio2Y3;

public class Alumno {
	
	private String nombre;
	private String dni;
	
	public Alumno(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	
	
	public String toString() {
		return String.format("Alumno con nombre %s y dni %s.", this.nombre, this.dni);
	}
}
