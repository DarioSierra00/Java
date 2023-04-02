package com.edu.practicaMock.publicacion;

import com.edu.practicaMock.usuario.Usuario;

public class Post extends Publicacion {

	private int numeroLecturas;
	private String tema;
	
	public Post(String texto, Usuario usuario, String tema) throws PublicacionException {
		super(texto, usuario);
		this.tema= tema;
	}
	
	protected void setTexto() {
		
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
	protected void setTexto(String texto) throws PublicacionException {
		if(texto!=null && !texto.isEmpty()) {
			this.texto = texto;
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}

	

}
