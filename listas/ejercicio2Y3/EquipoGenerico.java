package com.edu.listas.ejercicio2Y3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EquipoGenerico<T> {
	
	String nombreDelEquipo;
	List<T> grupoAlumnos = new ArrayList<>();

	
	public EquipoGenerico(String nombreDelEquipo) {
		super();
		this.nombreDelEquipo = nombreDelEquipo;
	}

	public void addAlumno(T t) throws AlumnoException {
		if(t!=null && encontrarAlumno(t) == null) {
			this.grupoAlumnos.add(t);
		}else {
			throw new AlumnoException("El alumno existe");
		}
	}
	
	public void deleteAlumno(T t) throws AlumnoException {
		if(t!=null && encontrarAlumno(t)!=null) {
			this.grupoAlumnos.remove(t);
		}else {
			throw new AlumnoException("El alumno no existe");
		}
	}
	
	public T encontrarAlumno(T t) {
		T tipo = null;
		if(t!= null && this.grupoAlumnos.indexOf(t)!= -1) {
			tipo = t;
		}
		return tipo;
	}
	
	public EquipoGenerico<T> unionEquipo(Equipo e) {
		if(e!=null && !this.grupoAlumnos.equals(e.grupoAlumnos)) {
			this.grupoAlumnos.addAll(e.grupoAlumnos);
		}
		return this;
	}
	
	public Set<T> interseccionEquipo(Equipo e) {	
		Set<T> interseccion = new HashSet<>(this.grupoAlumnos);
		if(e!=null) {
			interseccion.retainAll(e.grupoAlumnos);
		}
		return interseccion;
	}

	@Override
	public String toString() {
		return String.format("nombreDelEquipo %s y sus participantes %s", this.nombreDelEquipo, this.grupoAlumnos.toString());
	}
}
