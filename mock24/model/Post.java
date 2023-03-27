package com.edu.mock24.model;

import com.edu.mock24.model.enumerados.Valoraciones;
import com.edu.mock24.model.exception.PublicacionException;

public class Post extends Publicacion{

	private int numeroLecturas;
	private String tema;
	
	public Post(String texto, Usuario login, String tema) throws PublicacionException {
		super(texto, login);
		this.tema = tema;
	}

	protected void setTexto(String texto) throws PublicacionException {
		if(texto!=null && !texto.isEmpty()) {
			this.texto= texto;
		}
		else {
			throw new PublicacionException("El texto no puede estar en blanco");
		}
	}

	public boolean valorar(Valoraciones valoracion) {
		this.valoracion=valoracion.getValoracion()*2;
		this.numeroLecturas++;
		return false;
	}
	
	public String toString() {
        return String.format("Publicación: %s\r\n"
                + "Realizada por: %s\r\n"
                + "Valoración: %s\r\n"
                + "Fecha de publicación: %s\n"
                , this.texto,getLoginUsuario(),getValoracion(),getFechaCreacion());
    }

}
