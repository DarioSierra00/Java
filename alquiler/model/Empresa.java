package com.edu.alquiler.model;

public class Empresa {
	
	private static final int NUM_MAXIMO_VEHICULOS = 200;
	
	private double precio;
	Vehiculo[] vehiculos;
	
	
	public Empresa() {
		super();
		this.vehiculos = new Vehiculo[NUM_MAXIMO_VEHICULOS];
	}
	
	public void darDeAlta(Vehiculo v) {
		boolean dadoAlta = false;
		
		for(int i = 0; i < NUM_MAXIMO_VEHICULOS && !dadoAlta; i++) {
			if(this.vehiculos[i] == null) {
				this.vehiculos[i] = v;
			}
		}
	}
	
	public double calcularPrecio(String matricula, int numDias) {
		int posicionVehiculo = encontrarVehiculo(matricula);
		
		if(posicionVehiculo != -1) {
			this.precio = this.vehiculos[posicionVehiculo].precioBase * numDias;
		}
		return this.precio;
	}
	
	public int encontrarVehiculo(String matricula) {
		int pos = -1;
		for(int i = 0; i <NUM_MAXIMO_VEHICULOS && pos==-1; i++) {
			if(this.vehiculos[i].getMatricula().equals(matricula)) {
				pos = i;
			}
		}return pos;
	}
}
