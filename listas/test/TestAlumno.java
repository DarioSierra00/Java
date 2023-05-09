package com.edu.listas.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.edu.listas.ejercicio5.Alumno;
import com.edu.listas.ejercicio5.DestinatarioNoValidoException;
import com.edu.listas.ejercicio5.Mensaje;
import com.edu.listas.ejercicio5.Persona;
import com.edu.listas.ejercicio5.Profesor;

class TestAlumno {

	Persona p = new Profesor("Curro", LocalDate.of(2000,8,7));
	Persona p1 =  new Alumno("Luis", LocalDate.of(2010,9,12));
	Mensaje m = new Mensaje(p,p1,"hola", null);
	@ParameterizedTest
	@CsvSource({""})
	void testEnviarMensajePersonaMensaje(Persona p, Mensaje m) {
		
	}
	
	@ParameterizedTest

	@CsvSource(value= {"Dario,LocalDate.now().minusYears(23)","Luis,LocalDate.now().minusYears(23)" })

	void testEnviarMensajePersonaMensaje(String nombre,LocalDate fecha) {

	Persona pf = new Profesor(nombre, fecha);
	Persona pa2 = new Alumno(nombre, fecha);
	assertTrue(pa2.mostrarMensajes().isEmpty());

	try {
		pf.enviarMensaje(pa2, "de locos");
	} catch (DestinatarioNoValidoException e) {
		assert(false);
	}
		assertTrue(!pa2.mostrarMensajes().isEmpty());
	}

	@Test
	@ParameterizedTest
	
	void testPersona() {
		fail("Not yet implemented");
	}

	@Test
	void testEsMayorEdad() {
		fail("Not yet implemented");
	}

	@Test
	void testMostrarMensajes() {
		fail("Not yet implemented");
	}

	@Test
	void testMostrarMensajesPorRemitente() {
		fail("Not yet implemented");
	}

	@Test
	void testBuscarMensajePorContenido() {
		fail("Not yet implemented");
	}

	@Test
	void testRecibirMensaje() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testCompareTo() {
		fail("Not yet implemented");
	}

}
