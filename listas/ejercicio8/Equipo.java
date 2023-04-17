package com.edu.listas.ejercicio8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

	public class Equipo {
		protected String nombreDelEquipo;
		protected List<Alumno> grupoAlumnos = new ArrayList<>();

		
		
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
			return this.grupoAlumnos.contains(a)?a:null;
		}
		
		public Equipo unionEquipo(Equipo e) {
			if(e!=null && !this.grupoAlumnos.equals(e.grupoAlumnos)) {
				this.grupoAlumnos.addAll(e.grupoAlumnos);
			}
			return this;
		}
		
		public Set<Alumno> interseccionEquipo(Equipo e) {	
			Set<Alumno> interseccion = new HashSet<>(this.grupoAlumnos);
			if(e!=null) {
				interseccion.retainAll(e.grupoAlumnos);
			}
			return interseccion;
		}
		
		public String listaJugadoresM(Equipo e) {
			StringBuilder sb = new StringBuilder();
			
			if(e != null) {
				for(String a : listaJugadoresM) {
					
				}
			}
		}
		
		
		

		@Override
		public String toString() {
			return String.format("nombreDelEquipo %s y sus participantes %s", this.nombreDelEquipo, this.grupoAlumnos.toString());
		}
		
		
	}

