package com.edu.boletin1Listas.ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Equipo {
	String nombreDelEquipo;
	List<Alumno> grupoAlumnos = new ArrayList<>();
	
	
	public Equipo(String nombreDelEquipo) {
		super();
		this.nombreDelEquipo = nombreDelEquipo;
	}

	public void addAlumno(Alumno a) throws AlumnoException {
		if(a!=null && encontrarAlumno(a) == null) {
			this.grupoAlumnos.add(a);
		}else {
			throw new AlumnoException("El alumno existe");
		}
	}
	
	public void deleteAlumno(Alumno a) throws AlumnoException {
		if(a!=null && encontrarAlumno(a)!=null) {
			this.grupoAlumnos.remove(a);
		}else {
			throw new AlumnoException("El alumno no existe");
		}
	}
	
	public Alumno encontrarAlumno(Alumno a) {
		Alumno alumno = null;
		if(a!= null && this.grupoAlumnos.indexOf(a)!= -1) {
			alumno = a;
		}
		return alumno;
	}
	
	public Equipo unionEquipo(Equipo e) {
		if(e!=null && !this.grupoAlumnos.equals(e.grupoAlumnos)) {
			this.grupoAlumnos.addAll(e.grupoAlumnos);
		}
		return this;
	}

	@Override
	public String toString() {
		return String.format("nombreDelEquipo %s y sus participantes %s", this.nombreDelEquipo, this.grupoAlumnos.toString());
	}
	
	
}
