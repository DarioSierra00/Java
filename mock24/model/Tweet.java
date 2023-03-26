package com.edu.mock24.model;

public class Tweet extends Publicacion{


	private final int MAXIMO_CARACTERES=50;
	
	public Tweet(String texto, Usuario login) {
		super(texto, login);
	}
	
	public void setTexto(String texto) {
		this.texto=texto;
	}
	
	public boolean valorar(String valoracion) {
		boolean hayValoracion=false;
		return true;
	}

}
