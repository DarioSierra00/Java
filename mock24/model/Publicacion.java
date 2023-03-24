package com.edu.mock24.model;

import java.time.LocalDateTime;

public abstract class Publicacion implements Valorable{
	protected String texto;
	private LocalDateTime fechaCreacion;
	protected int valoracion;
	private static int codigoSiguiente = 0;
	Usuario usuario;
	
	public Publicacion(String Usuario) {
		super();
	}
	
	protected String getTexto() {
		return this.texto;
	}
	
	protected void setTexto(String texto) {
		this.texto=texto;
	}
	
	public LocalDateTime getFechaCreacion() {
		return this.fechaCreacion;
	}
	
	public int getValoracion() {
		return this.valoracion;
	}
	
	public boolean valorar(String valoracion) {
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
		return "Publicacion : " + texto + "\n "+" Valoracion " + valoracion
			+"\n FechaCreacion" + fechaCreacion +  "\n usuario=" + usuario;
	}
	
	
}
