package com.edu.listas.ejercicio5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensaje implements Comparable<Mensaje> {
	
	private Persona emisor;
	private Persona destinatario;
	private String texto;
	private LocalDateTime fecha;
	private String id;
	private static int secuencia = 1;
	
	
	public Mensaje(Persona emisor, Persona destinatario, String texto, LocalDateTime fecha) {
		super();
		this.emisor = emisor;
		this.destinatario = destinatario;
		this.texto = texto;
		this.fecha = fecha;
		this.id = ""+secuencia++;
	}
	
	public boolean contieneTexto(String textoABuscar) {
		return textoABuscar!=null && !textoABuscar.isEmpty() && this.texto.contains(textoABuscar);
	}
	
	public String toString() {
		return String.format("Mensaje %s: De: %s Texto: %s Fecha y hora:"
				+ "%s", this.id, this.emisor, this.texto, 
				this.fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")) );
	}


	public Persona getEmisor() {
		return emisor;
	}


	@Override
	public int compareTo(Mensaje o) {
		return this.id.compareTo(o.id);
	}
	

}
