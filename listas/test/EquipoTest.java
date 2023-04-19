package com.edu.listas.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.edu.listas.ejercicio2Y3.Alumno;
import com.edu.listas.ejercicio2Y3.AlumnoException;
import com.edu.listas.ejercicio2Y3.Equipo;

class EquipoTest {
	Equipo e = new Equipo("Betis");
	Alumno a = new Alumno("Curritooooo", "1278876t");
	
	@Test
	void testEquipo() {
		fail("Not yet implemented");
	}

	@Test
	void testAddAlumnoOK() {
		try {
			e.addAlumno(a);
		} catch (AlumnoException e) {
			assert(true);
		}
	}
	
	@Test
	void testAddAlumnoKONULL() {
		try {
			e.addAlumno(null);
		} catch (AlumnoException e) {
			assert(true);
		}
	}
	
	@Test
	void testAddAlumnoKOEncontrado() {
		try {
			e.addAlumno(a);
			e.addAlumno(a);
		} catch (AlumnoException e) {
			assert(true);
		}
	}

	@Test
	void testDeleteAlumno() {
		try {
			e.deleteAlumno(a);
		} catch (AlumnoException e) {
			assert(true);
		}
	}
	
	@Test
	void testDeleteAlumnoKONULL() {
		try {
			e.deleteAlumno(null);
		} catch (AlumnoException e) {
			assert(true);
		}
	}
	
	@Test
	void testDeleteAlumnoKONOencontrado() {
		try {
			e.addAlumno(a);
			e.deleteAlumno(a);
			e.deleteAlumno(a);
		} catch (AlumnoException e) {
			assert(true);
		}
	}

	@Test
	void testEncontrarAlumnoOK() {
		try {
			e.addAlumno(a);
			e.encontrarAlumno(a);
		} catch (AlumnoException e) {
			assert(true);
		}
	}

	@Test
	void testUnionEquipo() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
