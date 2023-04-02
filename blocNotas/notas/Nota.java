package com.edu.blocNotas.notas;

import java.time.LocalDateTime;
import java.util.Objects;

public class Nota {
	private static int codigoSiguiente = 0;
	private int codigo;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	
	public Nota(String texto) {
		super();
		this.texto = texto;
		this.codigo = this.codigoSiguiente++;
		this.fechaCreacion = LocalDateTime.now();
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
		this.fechaUltimaModificacion = LocalDateTime.now();
	}

	public int getCodigo() {
		return codigo;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	
	public boolean isModificado() {
		return this.fechaUltimaModificacion != null;
	}
	
	public boolean isEmpty() {
		return this.texto.isEmpty();
	}
	
	public boolean isCreadoAnterior(Nota nota) {
		return this.fechaCreacion.isBefore(nota.fechaCreacion);
			
		
	}
	
	public boolean isModificadoAnterior(Nota nota) {
		return this.fechaUltimaModificacion.isBefore(nota.fechaUltimaModificacion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, fechaCreacion, fechaUltimaModificacion, texto);
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
		Nota other = (Nota) obj;
		return resultado && Objects.equals(fechaCreacion, other.fechaCreacion)
				&& Objects.equals(texto, other.texto);
	}
	
	public String toString() {
		return String.format("%s\n"
							+ "Nota con codigo: %s\n"
							+ "Texto: %s\n"
							+ "FechaCreacion: %s\n", getClass().getSimpleName(), this.codigo, this.texto, this.fechaCreacion);
	}
	
	public int compareTo(Nota o) {
		return this.texto.compareTo(o.getTexto());
	}
	
	
	
	
	
	
	
	
	
	
	
}
