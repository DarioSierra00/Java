package com.edu.mock24.model;

import com.edu.mock24.model.enumerados.Valoraciones;
import com.edu.mock24.model.exception.PublicacionException;

public class Tweet extends Publicacion{


	private final int MAXIMO_CARACTERES=50;

	public Tweet(String texto, Usuario login) throws PublicacionException {
		super(texto, login);
	}
	
	public void setTexto(String texto) throws PublicacionException {
		if(texto!=null && texto.length()<=MAXIMO_CARACTERES) {
			this.texto=texto;
		}
		else {
			throw new PublicacionException("Demasiados Caracteres");
		}
	}
	
	public boolean valorar(Valoraciones valoracion) {
		this.valoracion=valoracion.getValoracion()*2;
		return true;
	}
	
	public String toString() {
        return String.format("Publicación: %s \r\n"
                + "Realizada por: %s \r\n"
                + "Valoración: %s \r\n"
                + "Fecha de publicación: %s \n"
                , this.texto,getLoginUsuario(),getValoracion(),getFechaCreacion());
    }

}
