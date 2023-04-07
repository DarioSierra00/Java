package com.edu.alquiler.model;

public class Microbus extends Vehiculo {

	private int plazas;
	
	public Microbus(String matricula, Gama gama, int plazas) {
		super(matricula, gama);
		if(plazas>0) {
			this.plazas = plazas;
			super.precioBase += (plazas * 5);
		}
	}
	
	@Override
	public String toString() {
		return super.toString().concat(", numero de plazas " + this.plazas);
	}

}
