package com.edu.listas.ejercicio5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mensaje implements Comparable<Mensaje>{
	
	private static int codigoSiguiente;
	private Persona remitente;
	private String texto;
	private LocalDateTime fechaYHora;
	private int codigo;
	
	public Mensaje(Persona remitente, String texto) {
		super();
		this.remitente = remitente;
		this.texto = texto;
		this.fechaYHora = LocalDateTime.now();
		this.codigo = codigoSiguiente++;
	}

	

	public int getCodigo() {
		return codigo;
	}



	public int compareTo(Mensaje m) {
		return this.remitente.nombre.compareTo(m.remitente.nombre);
	}
	
	
	
	
	
}

