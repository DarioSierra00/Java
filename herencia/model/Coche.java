package com.edu.herencia.model;

public class Coche extends Vehiculo{
private int numPuertas;
    
    public Coche(String marca, String modelo, int año, int numPuertas) {
        super(marca, modelo, año);
        this.numPuertas = numPuertas;
    }
    
    public int getNumPuertas() {
        return numPuertas;
    }
    
    public String abrirMaletero() {
        return "El maletero se está abriendo.";
    }

	@Override
	public String toString() {
		return marca + ", modelo "+ modelo + ", año del coche " + año + " con un total del puertas de " + numPuertas;
	}
}
