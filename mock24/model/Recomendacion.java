package com.edu.mock24.model;

import com.edu.mock24.model.exception.PublicacionException;

public class Recomendacion extends Publicacion{
	
	private int numEstrella;
	private final int MAXIMO_CARACTERES=200;
	private final int MINIMO_CARACTERES=100;
	
	public Recomendacion(String texto, Usuario login , int numEstrella) throws PublicacionException {
		super(texto, login);
		if(numEstrella>=1 && numEstrella<=5) {
			this.numEstrella= numEstrella;
		}
		else{
			throw new PublicacionException("El numero de estrellas no es válido");
		}
	}
	
	protected void setTexto(String texto) throws PublicacionException{
		if(texto!=null && texto.length()>=MINIMO_CARACTERES && texto.length()<=MAXIMO_CARACTERES) {
			this.texto = texto;
		}else {
			throw new PublicacionException("Demasiados caracteres");
		}
	}
	
	public int getNumEstrella() {
		return this.numEstrella;
	}

	public String toString() {
        return String.format("Publicación: %s\r\n"
                + "Realizada por: %s\r\n"
                + "Valoración: %s\r\n"
                + "Fecha de publicación: %s\n"
                + "Número de estrellas: %s", this.texto,getLoginUsuario(),getValoracion(),getFechaCreacion(),getNumEstrella());
    }

}
