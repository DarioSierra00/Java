package com.edu.listas.ejercicio8;

import java.util.ArrayList;
import java.util.Collections;
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
		
		public String listaJugadoresM() {
			List<Alumno> listaAlumnos = new ArrayList<>();
			for(Alumno a : this.grupoAlumnos) {
				if(a.getEdad() >= 18 && a.getSexo() == 'H' || a.getSexo() == 'h') {
					listaAlumnos.add(a);
				}
			}
			Collections.sort(listaAlumnos);
			StringBuilder sb = new StringBuilder();
			for(Alumno a1 : listaAlumnos) {
				sb.append(a1);
			}
			
			return sb.toString();
		}
		
		public boolean esFemenino() {
			boolean esDeFeminas = true;
			for(Alumno a : this.grupoAlumnos) {
				if(a.getSexo() == 'h' || a.getSexo() == 'H') {
					esDeFeminas = false;
				}
			}
			return esDeFeminas;
		}
		
		public int numeroJMayoresEdad() {
			int cont = 0;
			for(Alumno a : this.grupoAlumnos) {
				if(a.getEdad() >= 18 && a.getSexo() == 'M' || a.getSexo() == 'm') {
					cont++;
				}
			}return cont;
		}
		
		public int edadMayor() {
			int edad = 0;
			for(Alumno a : this.grupoAlumnos) {
				if(a.getSexo() == 'M' || a.getSexo() == 'm' && a.getEdad() > 18) {
					if(a.getEdad() > edad) {
						edad = a.getEdad();
					}
				}
			}return edad;
		}
		
		public Set dniJugadoresM() {
			Set<String> dni = new HashSet<>();
			for(Alumno a : this.grupoAlumnos) {
				if(a.getEdad() < 18 && a.getSexo() == 'H' || a.getSexo() == 'h')
					dni.add(a.getDni());
			}
			return dni;
		}
		
		public List<String> nombresOrdenadosF() {
			List<String> listaNombresOrdenados = new ArrayList<>();
			for(Alumno a : this.grupoAlumnos) {
				if(a.getSexo() == 'M' || a.getSexo() == 'm') {
					listaNombresOrdenados.add(a.getNombre());
				}
			}
			Collections.sort(listaNombresOrdenados);
			return listaNombresOrdenados;
		}
		
		public boolean mayorEdadEnEquipo() {
			boolean esMayorEdad = false;
			for(Alumno a : this.grupoAlumnos) {
				if(a.getSexo() == 'M' || a.getSexo() == 'm' && a.getEdad() >= 18) {
					esMayorEdad = true;
				}
			}return esMayorEdad;
		}
		
		public int ciudadesDireferentes() {
			Set<String> ciudades = new HashSet<>();
			for(Alumno a : this.grupoAlumnos) {
				ciudades.add(a.getCiudad());
			}
			
			return ciudades.size();
			/*int cont = 0;
			String ciudad = "";
			for(Alumno a : this.grupoAlumnos) {
				ciudad = a.getCiudad();
				if(!a.getCiudad().equals(ciudad)) {
					cont++;
				}
			}return cont;*/
		}
		

		@Override
		public String toString() {
			return String.format("nombreDelEquipo %s y sus participantes %s", this.nombreDelEquipo, this.grupoAlumnos.toString());
		}
		
		
	}

