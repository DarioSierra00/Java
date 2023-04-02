package com.edu.practicaMock.publicacion;

import com.edu.practicaMock.usuario.Usuario;

public class Tweet extends Publicacion {

	private static final int MAXIMO_CARACTERES= 50;
	public Tweet(String texto, Usuario usuario) throws PublicacionException {
		super(texto, usuario);
	}

	@Override
	protected void setTexto(String texto) throws PublicacionException {
		if(texto!=null && texto.length()<=MAXIMO_CARACTERES) {
			this.texto=texto;
		}
		else {
			throw new PublicacionException("Has alcanzado el máximo de caracteres permitidos");
		}
	}
		
	public boolean valorar(String valoracion) {
		boolean esPosibleValorar = false;
		try {
			Valoraciones valoraciones = Valoraciones.valueOf(valoracion.toUpperCase());
			this.valoracion+=valoraciones.getValoracion()*2;
			
			
		}catch(Exception e){
		}
		return esPosibleValorar;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	

}
