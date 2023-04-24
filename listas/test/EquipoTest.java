package com.edu.listas.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.edu.listas.ejercicio2Y3.Alumno;
import com.edu.listas.ejercicio2Y3.AlumnoException;
import com.edu.listas.ejercicio2Y3.Equipo;

class EquipoTest {
	Equipo e = new Equipo("Betis");
	Alumno a = new Alumno("Curritooooo", "1278876t");
	Equipo e1 = new Equipo("Mallorca");
	Alumno a1 = new Alumno("Locotron", "8394013g");

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
	void testUnionEquipoOK() {
		try {
			e.addAlumno(a);
			e1.addAlumno(a1);
		} catch (AlumnoException e1) {
			assert(true);
		}
		e.unionEquipo(e1);
	}
	
	@Test
	void testUnionEquipoKO() {
		try {
			e.addAlumno(a);
			e1.addAlumno(a1);
		} catch (AlumnoException e1) {
			assert(true);
		}
		e.unionEquipo(null);
		e.unionEquipo(e);
	}
	
	

	@Test
	void testToString() {
		try {
			e.addAlumno(a);
		} catch (AlumnoException e2) {
			e2.printStackTrace();
		}
		assertEquals("nombreDelEquipo Betis y sus participantes Curritooooo", e.toString());
	}

}
