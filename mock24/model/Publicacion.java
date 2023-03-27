package com.edu.mock24.model;

import java.time.LocalDateTime;

import com.edu.mock24.model.enumerados.Valoraciones;
import com.edu.mock24.model.exception.PublicacionException;
import com.edu.mock24.model.interfaces.Valorable;

public abstract class Publicacion implements Valorable{
	protected String texto;
	private LocalDateTime fechaCreacion;
	protected int valoracion;
	private int codigo;
	private static int codigoSiguiente = 0;
	Usuario usuario;
	
	public Publicacion(String texto, Usuario login) throws PublicacionException {
		super();
		this.fechaCreacion = LocalDateTime.now();
		this.codigoSiguiente++;
		this.usuario = login;
		setTexto(texto);
	}
	
	protected String getTexto() {
		return this.texto;
	}
	
	protected abstract void setTexto(String texto) throws PublicacionException;
		
	
	
	public LocalDateTime getFechaCreacion() {
		return this.fechaCreacion;
	}
	
	public int getValoracion() {
		return this.valoracion;
	}
	
	public boolean valorar(Valoraciones valoracion) {
		this.valoracion=valoracion.getValoracion();
		return true;
	}
	
	public int getCodigo() {
		return this.codigoSiguiente;
	}
	
	public String getLoginUsuario() {
		return usuario.getLogin();
	}
	
	//public boolean isAnterior()

	@Override
	public String toString() {
        return String.format("Publicación: %s \r\n"
                + "Realizada por: %s \r\n"
                + "Valoración: %s \r\n"
                + "Fecha de publicación: %s \n"
                , this.texto,getLoginUsuario(),getValoracion(),getFechaCreacion());
    }
	
	
}
