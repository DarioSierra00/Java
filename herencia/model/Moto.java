package com.edu.herencia.model;

public class Moto extends Vehiculo{

	  private boolean tieneCasco;
	    
	    public Moto(String marca, String modelo, int año, boolean tieneCasco) {
	        super(marca, modelo, año);
	        this.tieneCasco = tieneCasco;
	    }
	    
	    public boolean getTieneCasco() {
	        return tieneCasco;
	    }
	    
	    public String ponerCasco() {
	        return "El conductor está poniéndose el casco.";
	    }

		@Override
		public String toString() {
			return marca + ", modelo "+ modelo + ", año de la moto " + año + " y el conductor lleva casco " + tieneCasco;
		}
}
