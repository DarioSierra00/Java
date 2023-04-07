package com.edu.alquiler.model;

public class Furgona_Carga extends Vehiculo {

	private double pma;
	
	public Furgona_Carga(String matricula, Gama gama, double pma) {
		super(matricula, gama);
		this.pma = pma;
		super.precioBase += (0.5 * pma);
	}
	
	@Override
	public String toString() {
		return super.toString().concat(", peso máximo autorizado " + this.pma);
	}

}
