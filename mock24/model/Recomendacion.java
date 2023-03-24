package com.edu.mock24.model;

public class Recomendacion extends Publicacion{
	
	public Recomendacion(String Usuario, int numeroEstrellas) {
		super(Usuario);
	}
	
	protected void setTexto(String texto) {
		
	}

	@Override
	public String toString() {
		return "Recomendacion .\n";
	}

}
