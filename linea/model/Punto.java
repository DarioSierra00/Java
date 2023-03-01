package com.edu.linea.model;

import java.util.Objects;

public class Punto {
	
	
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void moverDerecha(double desplazamiento) {
		this.x+=desplazamiento;
	}
	
	private double x;
	private double y;
}
