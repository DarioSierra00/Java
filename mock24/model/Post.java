package com.edu.mock24.model;

public class Post extends Publicacion{

	public Post(String Usuario) {
		super(Usuario);
	}
	
	protected void setTexto(String texto) {
		
	}
	
	public boolean valorar(String valoracion) {
		return true;
	}

}
