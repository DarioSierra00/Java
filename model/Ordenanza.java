package com.edu.model;

public class Ordenanza extends Persona {
	
	public Ordenanza(int edad, String nombre, String apellidos, String sexo, String funcionalidad, double sueldo) {
		super(edad, nombre, apellidos, sexo);
		this.funcionalidad = funcionalidad;
		this.sueldo = sueldo;
	}
	public String getFuncionalidad() {
		return funcionalidad;
	}
	public void setFuncionalidad(String funcionalidad) {
		this.funcionalidad = funcionalidad;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	private String funcionalidad;
	private double sueldo;
}
