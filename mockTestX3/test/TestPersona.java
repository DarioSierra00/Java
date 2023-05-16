package com.edu.mockTestX3.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.LocalDate;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.edu.mockTestX3.model.Persona;
import com.edu.mockTestX3.model.PersonaException;

class TestPersona {

	@Test
	void testPersonaStringStringStringCorrecto() {
		Persona p = null;
		try {
			p = new Persona("Dario","Sierra","30266693G");
		} catch (Exception e) {
			assert(false);
		}
	}
	
	@Test
	void testPersonaStringStringStringException() {
		Persona p = null;
		try {
			p = new Persona("Dario","Sierra","30266293G");
		} catch (Exception e) {
			assert(true);
		}
	}

	@Test
	void testPersonaStringStringStringLocalDateStringCorrecto() {
		Persona p = null;
		
		try {
			p = new Persona("Dario","Sierra","30266693G",LocalDate.of(2004, 9, 12),"HOMBRE");
		} catch (Exception e) {
			assert(false);
		}
	}
	
	@Test
	void testPersonaStringStringStringLocalDateStringException() {
		Persona p = null;
		
		try {
			p = new Persona("Dario","Sierra","30266693G",LocalDate.of(2024, 9, 12),"HOMBRE");
		} catch (Exception e) {
			assert(true);
		}
	}

	@Test
	void testValidarDatosCorrecto() {
		Persona p = new Persona();
		
		assertTrue(p.validarDatos("Dario", "Sierra", "30266693G"));
	}
	
	@Test
	void testValidarDatosDNIIncorrecto() {
		Persona p = new Persona();
		
		assertFalse(p.validarDatos(null, "Sierra", "30266693G"));
		assertFalse(p.validarDatos("", "Sierra", "30266693G"));
		assertFalse(p.validarDatos("Dario", null, "30266693G"));
		assertFalse(p.validarDatos("Dario", "", "30266693G"));
		assertFalse(p.validarDatos("Dario", "Sierra", null));
		assertFalse(p.validarDatos("Dario", "Sierra", ""));
		assertFalse(p.validarDatos(null, null, "3026G693G"));
		assertFalse(p.validarDatos("Dario", "Sierra", "30266693G", null, ""));
		assertFalse(p.validarDatos("Dario", "Sierra", "30266693G", null, null));
	}

	@Test
	void testBonoJovenDisponibleCorrecto() {
		Persona p = new Persona("Dario","Sierra","30266693G",LocalDate.of(2004, 9, 12),"HOMBRE");
		
		assertTrue(p.bonoJovenDisponible());
	}
	
	@Test
	void testBonoJovenDisponibleIncorrecto() {
		Persona p = new Persona("Dario","Sierra","30266693G",LocalDate.of(2006, 9, 12),"HOMBRE");
		
		assertFalse(p.bonoJovenDisponible());
	}

	@Test
	void testObtenerEdad() {
		Persona p = new Persona("Dario","Sierra","30266693G",LocalDate.of(2004, 9, 12),"HOMBRE");
		
		assertTrue(p.obtenerEdad()==19);
	}

	@ParameterizedTest
	@CsvSource(value = {"2004,0","2005,1","2006,2"})
	void testObtenerEdadParaCorrecto(int annio, int edad) {
		Persona p = null;
		
		p = new Persona("Dario","Sierra","30266693G",LocalDate.of(2004, 9, 12),"HOMBRE");
		
		assertTrue(p.obtenerEdadPara(annio)==edad);
	}

	@ParameterizedTest
	@CsvSource(value = {"2004,1","2005,2","2006,3"})
	void testObtenerEdadParaIncorrecto(int annio, int edad) {
		Persona p = new Persona("Dario","Sierra","30266693G",LocalDate.of(2004, 9, 12),"HOMBRE");
		
		assertFalse(p.obtenerEdadPara(annio)==edad);
	}

	static Stream<Arguments> listAnnio(){
		return Stream.of(Arguments.of(2004,0),Arguments.of(2005,1),Arguments.of(2006,2));
	}
	
	@ParameterizedTest
	@MethodSource("listAnnio")
	void testObtenerEdadParaMethodSource(int annio, int edad) {
		Persona p = new Persona("Dario","Sierra","30266693G",LocalDate.of(2004, 9, 12),"HOMBRE");
		
		assertTrue(p.obtenerEdadPara(annio)==edad);
	}
	
	@ParameterizedTest
	@CsvFileSource(files = "./ficheros/edad.csv")
	void testObtenerEdadParaFileSource(int annio, int edad) {
		Persona p = new Persona("Dario","Sierra","30266693G",LocalDate.of(2004, 9, 12),"HOMBRE");
		
		assertTrue(p.obtenerEdadPara(annio)==edad);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"HOMBRE","MUJER"})
	void testConstructorConValueSource(String sexo) {
		
		try {
			Persona p = new Persona("Dario","Sierra","30266693G",LocalDate.of(2004, 9, 12),sexo);
		} catch (PersonaException e) {
			assert(false);
		}
	}
	
	
}
