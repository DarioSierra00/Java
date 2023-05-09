package com.edu.listas.ejercicio5;

import java.time.LocalDate;

public class Profesor extends Persona {

	public Profesor(String username, LocalDate fechaNacimiento) {
		super(username, fechaNacimiento);
	}

	@Override
	public void enviarMensaje(Persona destinatario, Mensaje mensaje) {
		destinatario.recibirMensaje(mensaje);

	}

}
