package com.edu.enumerados.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class  Persona implements Desplazable,Comparable<Persona>{
	private Genero_00 genero;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	
	public Persona(Genero_00 genero, String nombre, String apellidos, LocalDate fechaNacimiento) {
		super();
		this.genero = genero;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int getEdad() {
		return (int) ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());

		}
	
	public int compareTo(Persona o) {
		int resultado = 0;
		if(this.genero.equals(Genero_00.HOMBRE) && o.genero.equals(Genero_00.MUJER)) {
			resultado = 1;
		}else if(this.genero.equals(Genero_00.MUJER) && o.genero.equals(Genero_00.HOMBRE)) {
			resultado = -1;
		}else {
			resultado = 0;
		}
		return resultado;
	}
	
	@Override
	public String toString() {
		return "Soy " + genero + " y me llamo " + nombre + " " + apellidos + " tengo "
				+ getEdad() + "años";
	}
	
}
