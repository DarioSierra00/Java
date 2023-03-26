package com.edu.herencia.model;

public class Camion extends Vehiculo {
private int capacidadCarga;
    
    public Camion(String marca, String modelo, int año, int capacidadCarga) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }
    
    public int getCapacidadCarga() {
        return capacidadCarga;
    }
    
    public void descargar() {
        System.out.println("El camión está descargando su carga.");
    }

	@Override
	public String toString() {
		return marca + ", modelo "+ modelo + ", año del camion " + año + " con capacidad de " + capacidadCarga + "kg";
	}
}
