package com.edu.listas.test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.edu.listas.ejercicio5.Alumno;
import com.edu.listas.ejercicio5.MensajeException;
import com.edu.listas.ejercicio5.Persona;
import com.edu.listas.ejercicio5.Profesor;
	
class AlumnoEj5Test {
	Persona p = new Alumno("Currito", 18);
	Persona p1 = new Profesor("Luis", 33);
	Persona p2 = new Alumno("Manuel", 17);


	@Test
	void testEnviarMensaje() {
		try {
			p.enviarMensaje(p1, "Hola profe");
		} catch (MensajeException e) {
			assert(true);
		}
		assertFalse(p2.enviarMensaje(p1, "no"));
	}

	@Test
	void testLeerBuzon() {
		try {
			p1.leerBuzon();
		} catch (MensajeException e) {
			assert(false);
		}
	}

	@Test
	void testBorrarMensaje() {
		fail("Not yet implemented");
	}

	@Test
	void testLeerBuzonAlfabeticamente() {
		fail("Not yet implemented");
	}

	@Test
	void testAlumno() {
		fail("Not yet implemented");
	}

	@Test
	void testEncontrarMensajePorFrase() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
