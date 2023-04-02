package com.edu.practicaMock.publicacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import com.edu.practicaMock.usuario.Usuario;

public abstract class Publicacion implements Comparable<Publicacion>, Valorable{
	
	protected String texto;
	private LocalDateTime fechaCreacion;
	protected int valoracion;
	private int codigo;
	private static int codigoSiguiente;
	private Usuario usuario;
	private Valoraciones valoraciones;
	
	
	public Publicacion(String texto, Usuario usuario) throws PublicacionException {
		super();
		this.texto = texto;
		this.usuario = usuario;
		this.codigo= codigoSiguiente++;
		this.fechaCreacion= LocalDateTime.now();
		setTexto(texto);
	}
	
	protected String getTexto() {
		return this.texto;
	}
	
	abstract protected void setTexto(String texto) throws PublicacionException;
	 
	public LocalDateTime getFechaCreacion() {
		return this.fechaCreacion;
	}

	public int getCodigo() {
		return this.codigo;
	}
	
	public int getValoracion() {
		return this.valoracion;
	}
	
	public String getLoginUsuario() {
		return this.usuario.getLogin();
	}
	
	public boolean isAnterior(Publicacion p) {
		return this.fechaCreacion.isBefore(p.fechaCreacion);
	}

	@Override
	public boolean valorar(String valoracion) {
		boolean esPosibleValorar = false;
		try {
			Valoraciones valoraciones = Valoraciones.valueOf(valoracion.toUpperCase());
			this.valoracion+=valoraciones.getValoracion();
			esPosibleValorar = true;
		}catch(Exception e) {
			
		}
		return esPosibleValorar;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, fechaCreacion, texto, usuario, valoracion);
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = this == obj;
		
		if(!sonIguales && obj!=null && obj instanceof Publicacion) {
			Publicacion other = (Publicacion) obj;
			
			sonIguales = other.hashCode()==this.hashCode();
			
		}
		return sonIguales;
	}
	
	public int compareTo(Publicacion p) {
		
		return this.valoracion==p.valoracion?
				this.fechaCreacion.compareTo(p.fechaCreacion):
					this.valoracion-p.valoracion;
	}

	@Override
	public String toString() {
		return String.format("%s\n"
							+ "Publicacion: %s\n"
							+ "Realizada por: %s\n"
							+ "Valoracion: %s\n"
							+"Fecha de Publicación: %s\n", getClass().getSimpleName(),this.texto, getLoginUsuario(), this.valoracion, this.fechaCreacion);
	}
	
	
	
	
	
	
}
