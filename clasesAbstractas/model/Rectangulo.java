package com.edu.clasesAbstractas.model;

public class Rectangulo extends Figura {
	
	private double lado;
	
	public Rectangulo(double lado) {
		super();
		this.lado = lado;
	}

	public double calcularArea() {
		return lado*lado;
	}
	
	public double calcularPerimetro() {
		return 4*lado;
	}
}
