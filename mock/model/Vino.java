package com.edu.mock.model;

import java.util.Objects;

public class Vino {
	private String nombreVino;
	private double graduacion;
	

	public Vino(String descripcion) {
		super();
		this.nombreVino = descripcion;
	}
	
	public Vino(String descripcion, double graduacion) throws Exception {
		this(descripcion);
		if(graduacion < 0) {
			throw new Exception("La graduación no puede ser negativa");
		}
		this.graduacion = graduacion;
	}
	
	
	
	public String getNombreVino() {
		return nombreVino;
	}

	public double getGraduacion() {
		return graduacion;
	}
	

	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof Vino) 
				&& Objects.equals(this.nombreVino, ((Vino) obj).nombreVino));
	}
	

	public String toString() {
		return String.format("Vino %s con graduacion %s", this.nombreVino, this.graduacion);
	}
}
