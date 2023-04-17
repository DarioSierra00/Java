package com.edu.listas.ejercicio5;

public class TestAlumno {
	
	Persona p = new Profesor("Luis", 31);
	Persona a = new Alumno("Jaimito", 17);
	Persona a1 = new Alumno("Mario", 17);
	
	void testEnviarMensajeOK() {
		try {
			a.enviarMensaje(p, "Hey que pasa Luis");
		} catch (MensajeException e) {
		}
	}
	
	void testEnviarMensajeKO() {
		try {
			a.enviarMensaje(a1, "Se podra?");
		} catch (Exception e) {
		}
	}
	
	void leerBuzonOK() {
		try {
			a.leerBuzon();
		} catch (Exception e) {
		}
	}
}
