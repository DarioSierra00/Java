package com.edu.geometria.model;

public class Rectangulo {
	public Rectangulo(double longitud, double ancho) {
		super();
		this.longitud = longitud;
		this.ancho = ancho;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		if (longitud>0 && longitud <=20) {
			this.longitud = longitud;
		}
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		if (ancho>0 && ancho <=20) {
			this.ancho = ancho;
		}
	}
	public double calcularPerimetro(int longitud, int ancho) {
		int resultado = 0;
		if ((ancho > 0 && ancho <=20) && (longitud>0 && longitud <=20)) {
			resultado = 4*longitud;
		}return resultado;
	}
	public double calcularArea(int longitud, int ancho) {
		int resultado = 0;
		if ((ancho > 0 && ancho <=20) && (longitud>0 && longitud <=20)) {
			resultado = ancho * longitud;
		}return resultado;
	}
	
	
	
	
	
	
	private double longitud;
	private double ancho;
}
