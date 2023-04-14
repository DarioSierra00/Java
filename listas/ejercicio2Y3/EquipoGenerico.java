package com.edu.listas.ejercicio2Y3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EquipoGenerico<T> {
	
	String nombreDelEquipo;
	List<T> elementos = new ArrayList<>();

	
	public EquipoGenerico(String nombreDelEquipo) {
		super();
		this.nombreDelEquipo = nombreDelEquipo;
	}

	public void addAlumno(T t) throws AlumnoException {
		if(t!=null && encontrarAlumno(t) == null) {
			this.elementos.add(t);
		}else {
			throw new AlumnoException("El alumno existe");
		}
	}
	
	public void deleteAlumno(T t) throws AlumnoException {
		if(t!=null && encontrarAlumno(t)!=null) {
			this.elementos.remove(t);
		}else {
			throw new AlumnoException("El alumno no existe");
		}
	}
	
	public T encontrarAlumno(T t) {
		T tipo = null;
		if(t!= null && this.elementos.indexOf(t)!= -1) {
			tipo = t;
		}
		return tipo;
	}
	
	
	public EquipoGenerico unionEquipo(EquipoGenerico e) {
		if(e!=null && !this.elementos.equals(e.elementos)) {
			this.elementos.addAll(e.elementos);
		}
		return this;
	}
	
	public Set<T> interseccionEquipo(Equipo e) {	
		Set<T> interseccion = new HashSet<>(this.elementos);
		if(e!=null) {
			interseccion.retainAll(e.grupoAlumnos);
		}
		return interseccion;
	}

	@Override
	public String toString() {
		return String.format("nombreDelEquipo %s y sus participantes %s", this.nombreDelEquipo, this.elementos.toString());
	}
}
