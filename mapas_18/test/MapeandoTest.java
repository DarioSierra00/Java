package com.edu.mapas_18.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.edu.mapas_18.model.Genero;
import com.edu.mapas_18.model.Mapeando;
import com.edu.mapas_18.model.Persona;

class MapeandoTest {
	Mapeando m = new Mapeando();
	List<Persona> persons = new ArrayList<>();
	List<Integer> numbers = new ArrayList<>();
	
	@Test
	void testMapearPersonasPorGeneroOK() {
		persons.add(new Persona("Currito", "Currele", Genero.MASCULINO));
		persons.add(new Persona("Lola", "Lolita", Genero.FEMENINO));
		persons.add(new Persona("Paco", "Lerele", Genero.MASCULINO));
		persons.add(new Persona("Andoni", "GY", Genero.MASCULINO));
		persons.add(new Persona("Jorge", "Tabet", Genero.MASCULINO));
		
		assertTrue(m.mapearPersonasPorGenero(persons).containsKey(Genero.MASCULINO));
		assertFalse(m.mapearPersonasPorGenero(persons).containsKey(Genero.NEUTRO));
		assertFalse(m.mapearPersonasPorGenero(persons).isEmpty());

	}
	@Test
	void testMapearPersonasPorGeneroKO() {
		assertFalse(m.mapearPersonasPorGenero(persons).containsKey(Genero.MASCULINO));
		assertFalse(m.mapearPersonasPorGenero(persons).containsKey(Genero.NEUTRO));
		assertTrue(m.mapearPersonasPorGenero(persons).isEmpty());
		

	}

	@Test
	void testContarNumerosOK() {
		numbers.add(1);
		numbers.add(2);
		numbers.add(1);
		numbers.add(3);
		numbers.add(3);
		numbers.add(5);
		
		assertTrue(m.contarNumeros(numbers).containsValue(1));
		assertFalse(m.contarNumeros(numbers).isEmpty());
		assertFalse(m.contarNumeros(numbers).containsValue(8));
	}
	
	@Test
	void testContarNumerosKO() {
		assertFalse(m.contarNumeros(numbers).containsValue(1));
		assertTrue(m.contarNumeros(numbers).isEmpty());
		assertFalse(m.contarNumeros(numbers).containsValue(8));
	}


}
