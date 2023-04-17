package com.edu.listas.ejercicio8;

public class Alumno {
	
	private String nombre;
	private String dni;
	private int edad;
	private char sexo;
	private String ciudad;
	
	public Alumno(String nombre, String dni, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	
	public String toString() {
		return String.format("Alumno con nombre %s y dni %s.", this.nombre, this.dni);
	}
}
