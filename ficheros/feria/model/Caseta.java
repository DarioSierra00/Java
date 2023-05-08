package com.edu.ficheros.feria.model;

import java.util.Objects;

import com.edu.ficheros.geo.City;

public class Caseta implements Comparable<Caseta>{
	
	private String titulo;
	private String calle;
	private String numero;
	private String modulo;
	private String clase;
	private String entidad;
	private String id;
	private String idCalle;
	
	public Caseta(String titulo, String calle, String numero, String modulo, String clase, String entidad, String id,
			String idCalle) {
		super();
		this.titulo = titulo;
		this.calle = calle;
		this.numero = numero;
		this.modulo = modulo;
		this.clase = clase;
		this.entidad = entidad;
		this.id = id;
		this.idCalle = idCalle;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCalle() {
		return calle;
	}

	public String getNumero() {
		return numero;
	}

	public String getModulo() {
		return modulo;
	}

	public String getClase() {
		return clase;
	}

	public String getEntidad() {
		return entidad;
	}

	public String getId() {
		return id;
	}

	public String getIdCalle() {
		return idCalle;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(calle, clase, entidad, id, idCalle, modulo, numero, titulo);
	}
	
	public void restarNumero(int num) {
        this.numero=String.valueOf(Integer.valueOf(numero)-num);
    }
	
	

	@Override
    public boolean equals(Object obj) {
        return this==obj || obj!=null &&
                obj instanceof Caseta
                && this.hashCode()==((Caseta)obj).hashCode();
    }

	@Override
	public String toString() {
		return String.format("Caseta con nombre %s, situada en la calle %s, con numero %s. Modulo %s, clase %s, entidad %s, con un id %s y un id de calle %s", 
				this.titulo, this.calle, this.numero, this.modulo, this.clase, this.entidad, this.id, this.idCalle);
	}

	@Override
	public int compareTo(Caseta o) {
		return this.numero.compareTo(o.numero);
	}
	
	
}
