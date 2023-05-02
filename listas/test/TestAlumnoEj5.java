package com.edu.listas.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.edu.listas.ejercicio5.Alumno;
import com.edu.listas.ejercicio5.MensajeException;
import com.edu.listas.ejercicio5.Persona;
import com.edu.listas.ejercicio5.Profesor;

class TestAlumnoEj5 {

	
	@ParameterizedTest
	@CsvSource({"18,Hola"})
	void testEnviarMensaje(String edad, String mens) {
		Persona p = new Alumno("Sergio",Integer.valueOf(edad));
		Persona p1 = new Alumno("Luis",Integer.valueOf(edad));
		Persona p2 = new Profesor("Josemi",Integer.valueOf(edad));

		
		try {
			p.enviarMensaje(p1, mens);
			
		} catch (MensajeException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testLeerBuzon() {
		fail("Not yet implemented");
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
