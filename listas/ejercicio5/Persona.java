package com.edu.listas.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
	
	String nombre;
	int edad;
	List<Mensaje> listaMensajes;
	
	
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.listaMensajes = new ArrayList<>();
	}

	public abstract void enviarMensaje(Persona p, String texto);
	
	public abstract String leerBuzon() throws MensajeException;
	
	public abstract void borrarMensaje(int numero);

	public int getEdad() {
		return this.edad;
	}

	
	
	
	
	
}
