package com.edu.practicaMock.publicacion;

import com.edu.practicaMock.usuario.Usuario;

public class Recomendacion extends Publicacion {

	private static final int MINIMO_CARACTERES= 10;

	private static final int MAXIMO_CARACTERES= 200;

	private int numeroEstrellas;
	
	public Recomendacion(String texto, Usuario usuario, int numeroEstrellas) throws PublicacionException {
		super(texto, usuario);
		if(numeroEstrellas>=1 && numeroEstrellas<=5) {
			this.numeroEstrellas= numeroEstrellas;
		}
	}

	@Override
	protected void setTexto(String texto) throws PublicacionException {
		if(texto!=null && texto.length()>=MINIMO_CARACTERES && texto.length()<=MAXIMO_CARACTERES) {
			this.texto=texto;
		}
		else {
			throw new PublicacionException("Tamaño de caracteres excedidos");
		}
	}

	@Override
	public String toString() {
		return super.toString().concat("\nNúmero de estrellas: "+this.numeroEstrellas);
	}

	

}
