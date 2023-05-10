package com.edu.listas.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.edu.listas.ejercicio5.Alumno;
import com.edu.listas.ejercicio5.ExceptionsPersona;
import com.edu.listas.ejercicio5.Persona;
import com.edu.listas.ejercicio5.Profesor;

class TestAlumno {

	@ParameterizedTest
	@CsvSource(value= {
			"Alumno,15","Alumno,18","Profesor,23","Profesor,15" })
	void testEnviarMensajePersonaMensaje(String tipo,int edad) {
	Alumno alum = new Alumno("Currito",edad);
	Profesor p = null;
	Alumno al = null;
	
	if(tipo.equals("Alumno")) {
		al = new Alumno("Luis",edad);
		try {
			alum.enviarMensaje(al, "eeeee");
		} catch (ExceptionsPersona e) {
			e.printStackTrace();
		}
	}
	else {
		p = new Profesor("Manuel",edad);
	try {
		alum.enviarMensaje(p, "Que dise loco");
	} catch (ExceptionsPersona e) {
		e.printStackTrace();
	}
	}
	}
	
	@ParameterizedTest
	@CsvFileSource(resources= {"/data.csv"})
	void testEnviarMensajePersonaMensajeCSVFILE(String tipo,int edad) {
	Alumno alum = new Alumno("Currito",edad);
	Profesor p = null;
	Alumno al = null;
	
	if(tipo.equals("Alumno")) {
		al = new Alumno("Luis",edad);
		try {
			alum.enviarMensaje(al, "eeeee");
		} catch (ExceptionsPersona e) {
			e.printStackTrace();
		}
	}
	else {
		p = new Profesor("Manuel",edad);
	try {
		alum.enviarMensaje(p, "Que dise loco");
	} catch (ExceptionsPersona e) {
		e.printStackTrace();
	}
	}
	}

	@ParameterizedTest
	@ValueSource(strings= {
			"Hola loco",""})
	void testLeerMensajesBuzon(String mensaje) {
		Persona p = new Alumno("Currito",23);
		if(!mensaje.isEmpty()) {
			try {
				p.leerMensajesBuzon();
			} catch (ExceptionsPersona e) {
				e.printStackTrace();
			}
		}
	}

	@Test
	void testLeerMensajesBuzonOrdenadorAlfabeticamente() {
		fail("Not yet implemented");
	}

	@Test
	void testBorrarMensajeBuzon() {
		fail("Not yet implemented");
	}

	@Test
	void testEncontrarMensajeContieneFrase() {
		fail("Not yet implemented");
	}

	@Test
	void testRecibirMensaje() {
		fail("Not yet implemented");
	}

	@Test
	void testAlumno() {
		fail("Not yet implemented");
	}

}
