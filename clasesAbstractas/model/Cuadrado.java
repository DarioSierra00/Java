package com.edu.clasesAbstractas.model;

public class Cuadrado extends Figura {
	
	private double lado;

	public Cuadrado(double lado) {
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
