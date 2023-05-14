package com.edu.mockExamenTest.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.edu.mockExamenTest.model.test.Persona;

class TestPersona {
	
	Persona p = new Persona();
	@Test
	void testPersonaStringStringString() {
		Persona p = new Persona("Dario","Sierra","30266693G");
	}
	
	@Test
	void testPersonaStringStringStringException() {
		try {
			Persona p = new Persona("","","3947g7376383");
		} catch (Exception e) {
			assert(true);
		}
	}

	@Test
	void testPersonaStringStringStringLocalDateString() {
		try {
			Persona p = new Persona("Dario","Sierra","30266693G",LocalDate.of(2004, 9, 12),"HOMBRE");
		} catch (Exception e) {
			assert(false);
		}
	}
	
	@Test
	void testPersonaStringStringStringLocalDateStringException() {
		try {
			Persona p = new Persona("","Sierra","302fff66693G",LocalDate.of(2024, 9, 12),"loco");
		} catch (Exception e) {
			assert(true);
		}
	}


	@Test
	void testvalidarDatosConTodo() {
		boolean resultado = p.validarDatos("Dario", "Sierra", "30264636V",LocalDate.of(2004, 9, 12),"HOMBRE");
		assertTrue(resultado);
	}
	
	@Test
	void testvalidarDatosConTodoKO() {
		boolean resultado = p.validarDatos("", "", "302F4636V",LocalDate.of(2024, 9, 12),"HOMBRE");
		assertFalse(resultado);
	}

	@Test
	void testValidarDatosP() {
		assertFalse(p.validarDatos("", "", ""));
		assertFalse(p.validarDatos("Dario", "Sierra", "30G66693G"));
		
		Assertions.assertThrows(NullPointerException.class, () -> {assertFalse(p.validarDatos(null, null, null));});
		
	}

	@Test
	void testValidarFecha() {
		assertFalse(p.validarFecha(null, null));
		assertFalse(p.validarFecha(LocalDate.of(2024, 3, 12), "loco"));
		
	}

	@Test
	void testBonoJovenDisponible() {
		Persona p = new Persona("Dario","Sierra","30266693G", LocalDate.of(2004, 9, 12), "HOMBRE");
		
		assertTrue(p.bonoJovenDisponible());
	}
	
	@Test
	void testBonoJovenDisponibleFalse() {
		Persona p = new Persona("Dario","Sierra","30266693G", LocalDate.of(2020, 9, 12), "HOMBRE");
		
		assertFalse(p.bonoJovenDisponible());
	}

	@ParameterizedTest
	@CsvSource(value = {"2004,1","2005,2","2006,3"})
	void testObtenerEdadPara(int annio,int edad) {
		Persona p = null;
		try {
			p = new Persona("Dario","Sierra","30266693G", LocalDate.of(2004, 9, 12), "HOMBRE");
		} catch (Exception e) {
			assert(false);
		}
		assertTrue(p.obtenerEdadPara(annio)==edad);
	}
	
	

	@Test
	void testObtenerEdadPara() {
		Persona p = null;
		Persona p1 = null;
		
		try {
			p = new Persona("Dario","Sierra","30266693G", LocalDate.of(2004, 9, 12), "HOMBRE");
		} catch (Exception e) {
			assert(false);
		}
		try {
			p1 = new Persona("Dario","Sierra","30266693G", LocalDate.of(2005, 9, 12), "HOMBRE");
		} catch (Exception e) {
			assert(false);
		}
		
		assertTrue(p.obtenerEdad()==18);
		assertFalse(p1.obtenerEdad()==44);
	}

}
