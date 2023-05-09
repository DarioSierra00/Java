package com.edu.listas.ejercicio5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Alumno extends Persona {

	public Alumno(String username, LocalDate fechaNacimiento) {
		super(username, fechaNacimiento);
	}

	@Override
	public void enviarMensaje(Persona destinatario, Mensaje mensaje) throws DestinatarioNoValidoException {
		
		if(esMayorEdad() || destinatario instanceof Profesor) {
			destinatario.recibirMensaje(mensaje);
		}else {
			throw new DestinatarioNoValidoException("Un alumno menor de edad no puede enviar mensajes a otros alumnos");
		}

	}
	
	public void enviarMensaje(Persona destinatario, String texto) throws DestinatarioNoValidoException {
		/*
		if(esMayorEdad() || destinatario instanceof Profesor) {
			destinatario.recibirMensaje(new Mensaje(this, destinatario, texto, LocalDate.now()));
		}else {
			throw new DestinatarioNoValidoException();
		}*/
		
		
		enviarMensaje(destinatario, new Mensaje(this, destinatario, texto, LocalDateTime.now()));
	}

}
