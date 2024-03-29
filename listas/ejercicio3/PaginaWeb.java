package com.edu.listas.ejercicio3;

import java.time.LocalDateTime;

public class PaginaWeb {
	
	String url;
	LocalDateTime fecha;
	
	public PaginaWeb(String url, LocalDateTime fecha) {
		super();
		this.url = url;
		this.fecha = fecha;
	}

	public LocalDateTime getFecha() {
		return this.fecha;
	}

	public String getUrl() {
		return this.url;
	}

	@Override
	public String toString() {
		return String.format("Pagina Web con url %s y fecha %s", this.url, this.fecha);
	}
	
	
	
	
}
