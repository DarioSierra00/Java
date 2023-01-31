package com.edu.model;

public class Persona {
	
	public Persona(int edad, String nombre, String apellidos, String sexo) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	private int edad;
	private String nombre;
	private String apellidos;
	private String sexo;


}
