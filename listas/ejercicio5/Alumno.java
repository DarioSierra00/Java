package com.edu.listas.ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Alumno extends Persona {

	public Alumno(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void enviarMensaje(Persona p, String texto) throws MensajeException {
		if(this.edad < 18 && p instanceof Alumno) {
			throw new MensajeException("Error, los alumnos menores de edad solo pueden enviar mensajes a profesores");
		}
		else if (p!=null && texto!=null) {
			p.listaMensajes.add(new Mensaje(p,texto));
		}
	}

	@Override
	public String leerBuzon() throws MensajeException {
		if(listaMensajes.isEmpty()) {
			throw new MensajeException("No hay mensajes para leer");
		}
		return listaMensajes.toString();

	}

	@Override
	public void borrarMensaje(int numero) {
		Iterator<Mensaje> iMensaj = this.listaMensajes.iterator();
		
		while(iMensaj.hasNext()) {
			if(iMensaj.next().getCodigo() == numero) {
				iMensaj.remove();
			}
		}
	}
	
	public String encontrarMensajePorFrase(String frase) throws MensajeException {
		Iterator<Mensaje> itFrase = this.listaMensajes.iterator();
		List<Mensaje> listaMensajesFrase = new ArrayList<>();
		Mensaje m = null;
		while(itFrase.hasNext()) {
			m = itFrase.next();
			if(!listaMensajes.contains(frase)) {
				throw new MensajeException("No se encuentra esa frase");
			}
			else {
				listaMensajesFrase.add(m);
			}
		}return listaMensajesFrase.toString();
		
	}

	@Override
	public String leerBuzonAlfabeticamente() throws MensajeException{
		if(listaMensajes.isEmpty()) {
			throw new MensajeException("No hay mensajes.");
		}
			Collections.sort(listaMensajes);
			return listaMensajes.toString();
	}
	
	public String toString() {
		return String.format("Alumno %s con edad %s", this.nombre, this.edad);
	}
}
