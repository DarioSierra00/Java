package com.edu.clasesAbstractas.model;

public class Circulo extends Figura {

	private double radio;
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI*Math.pow(radio, 2);
	}

	@Override
	public double calcularPerimetro() {
		return Math.PI*2*radio;
	}

}
