package com.edu.listas.ejercicio8;


import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
	
	private String nombre;
	private String dni;
	private int edad;
	private char sexo;
	private String ciudad;
	

	public Alumno(String nombre, String dni, int edad, char sexo, String ciudad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.sexo = sexo;

		this.ciudad = ciudad;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(ciudad, dni, edad, nombre, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null &&
				obj instanceof Alumno
				&& this.hashCode()==((Alumno)obj).hashCode();
	}


	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}


	public char getSexo() {
		return sexo;
	}
	
	public String getDni() {
		return dni;
	}

	public String getCiudad() {
		return ciudad;
	}


	@Override
	public int compareTo(Alumno o) {
		return this.edad-o.edad;
	}
	
	public String toString() {
		return String.format("Alumno con nombre %s y dni %s.", this.nombre, this.dni);
	}

}
