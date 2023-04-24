package com.edu.listas.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import com.edu.listas.ejercicio3.Historial;
import com.edu.listas.ejercicio3.HistorialException;
import com.edu.listas.ejercicio3.PaginaWeb;

class HistorialTest {
	PaginaWeb pw = new PaginaWeb("Currito.es",LocalDateTime.now());
	PaginaWeb pw1 = new PaginaWeb("",LocalDateTime.now().plusDays(1));
	PaginaWeb pw2 = new PaginaWeb("",LocalDateTime.now().minusDays(2));
	Historial h = new Historial();
	
	@Test
	void testAddPaginaHistorialOK() {
		try {
			h.addPaginaHistorial(pw);
			h.addPaginaHistorial(pw1);
		} catch (HistorialException e) {
			assert(true);
		}
	}
	
	@Test
	void testAddPaginaHistorialKO() {
		try {
			h.addPaginaHistorial(pw1);
			h.addPaginaHistorial(pw2);
		} catch (HistorialException e) {
			assert(true);
		}
	}

	@Test
	void testMostrarHistorialCompleto() {
		h.mostrarHistorialCompleto();
	}

	@Test
	void testMostrarHistorialDia() {
		try {
			h.addPaginaHistorial(pw);
			h.mostrarHistorialDia(24);
		} catch (HistorialException e) {
			assert(true);
		}
	}
	

	@Test
	void testBorrarHistorial() {
		try {
			h.addPaginaHistorial(pw);
		} catch (HistorialException e) {
			assert(true);
		}
		h.borrarHistorial();
	}

	@Test
	void testBorrarVisitasPagina() {
		try {
			h.addPaginaHistorial(pw);
		} catch (HistorialException e) {
			assert(true);
		}
		h.borrarVisitasPagina("Currito.es");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
