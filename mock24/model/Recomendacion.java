package com.edu.mock24.model;

public class Recomendacion extends Publicacion{
	

	private final int MAXIMO_CARACTERES=100;
	private final int MINIMO_CARACTERES=200;
	
	public Recomendacion(String texto, Usuario login , int numEstrella) {
		super(texto, login);
		
	}
	
	protected void setTexto(String texto) {
		
	}

	@Override
	public String toString() {
		return "Recomendacion .\n";
	}

}
