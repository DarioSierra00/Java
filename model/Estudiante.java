package com.edu.model;

public class Estudiante extends Persona {
	
	public Estudiante(int edad, String nombre, String apellidos, String sexo, String aula, String curso) {
		super(edad, nombre, apellidos, sexo);
		this.aula = aula;
		this.curso = curso;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	private String aula;
	private String curso;
}
