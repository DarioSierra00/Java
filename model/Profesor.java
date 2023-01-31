package com.edu.model;

public class Profesor extends Persona {
	
	public Profesor(int edad, String nombre, String apellidos, String sexo, String asignatura, double sueldo) {
		super(edad, nombre, apellidos, sexo);
		this.asignatura = asignatura;
		this.sueldo = sueldo;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	private String asignatura;
	private double sueldo;
}
