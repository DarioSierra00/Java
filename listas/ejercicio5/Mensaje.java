package com.edu.listas.ejercicio5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

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
	
	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (this == obj)
			resultado = true;
		if (obj == null)
			resultado = false;
		if (getClass() != obj.getClass())
			resultado = false;
		Mensaje other = (Mensaje) obj;
		return resultado && Objects.equals(fechaYHora, other.fechaYHora) && Objects.equals(remitente, other.remitente)
				&& Objects.equals(texto, other.texto);
	}
	
	@Override
	public String toString() {
		return String.format("Mensaje %s: De: %s Texto: %s Fecha y hora:" + 
			" %s", this.codigo, this.remitente.getNombre(), this.texto, this.fechaYHora);
	}
	
	
	
}

