package com.edu.linea.model;

import java.util.Objects;

public class Linea {
	
	public Linea() {
		super();
	}

	public Punto inicio;
	public Punto fin;
	
	public Linea(Punto inicio, Punto fin) {
		super();
		this.inicio = inicio;
		this.fin = fin;
	}
	

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales= this==obj;
		if (obj!= null && !sonIguales && obj instanceof Linea) {
			Linea other = (Linea) obj;
			sonIguales = Objects.equals(fin, other.fin) && Objects.equals(inicio, other.inicio);
		}return sonIguales;
		
	}


	public void moverDerecha(double desplazamiento) {
		this.inicio.moverDerecha(desplazamiento);
		this.fin.moverDerecha(desplazamiento);
	}
}
