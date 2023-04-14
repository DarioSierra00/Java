package com.edu.listas.ejercicio5;

import java.util.Iterator;

public class Profesor extends Persona {

	public Profesor(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void enviarMensaje(Persona p, String texto) {
		if(p!=null && texto!=null) {
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
		if(!listaMensajes.contains(frase)) {
			throw new MensajeException("No se encuentra esa frase");
		}
		return 
	}

}
