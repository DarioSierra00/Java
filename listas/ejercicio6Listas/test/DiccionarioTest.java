package com.edu.listas.ejercicio6Listas.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.edu.listas.ejercicio6.Excepciones.DiccionarioException;
import com.edu.listas.ejercicio6Listas.model.Diccionario;

class DiccionarioTest {
	Diccionario d = new Diccionario();
	
	@Test
	void testAnnyadirPalabra() {
		try {
			assertTrue(d.buscarPalabra("lerele").isEmpty());
			d.annyadirPalabra("Leer", "Arte de leer Berserk");
		} catch (DiccionarioException e) {
			e.printStackTrace();
		}
		try {
			assertFalse(d.buscarPalabra("Leer").isEmpty());
		} catch (DiccionarioException e) {
			assert(true);
		}
		
		
	}

	@Test
	void testBuscarPalabra() {
		fail("Not yet implemented");
	}

	@Test
	void testBorrarPalabra() {
		fail("Not yet implemented");
	}

	@Test
	void testListarPalabra() {
		fail("Not yet implemented");
	}

}
