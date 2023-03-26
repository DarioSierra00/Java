package com.edu.mock24.model;

public class Post extends Publicacion{

	private String tema;
	
	public Post(String texto, Usuario login, String tema) {
		super(texto, login);
		this.tema = tema;
	}

	protected void setTexto(String texto) {
		
	}
	
	public boolean valorar(String valoracion) {
		return true;
	}

}
