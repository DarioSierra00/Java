package com.edu.listas.ejercicio6Listas.model;

import java.util.ArrayList;
import java.util.List;

public class Entrada {
	private String nombrePalabra;
	private List<String> significados;
	
	
	public Entrada(String nombrePalabra, String significado) {
		super();
		this.nombrePalabra = nombrePalabra;
		this.significados = new ArrayList<>();
		annyadirSignificado(significado);
		
	}

	public void annyadirSignificado(String significado) {
		if(significado != null) {
			this.significados.add(significado);
		}
	}

	public String getNombrePalabra() {
		return nombrePalabra;
	}

	public List<String> getSignificados() {
		return significados;
	}
	
	
}
