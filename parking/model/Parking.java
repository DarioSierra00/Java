package com.edu.parking.model;
import java.util.Arrays;

import com.edu.parking.model.Vehiculo;

public class Parking {
	private Vehiculo[] vehiculos;
	private final static int MAX_CAPACITY = 50;
	
	public Parking() {
		super();
		this.vehiculos = new Vehiculo[MAX_CAPACITY];
	}

	public boolean añadirVehiculo(Vehiculo vehiculo) {
		boolean sePuedeAnnyadir = false;
		for(int i = 0; i<vehiculos.length && !sePuedeAnnyadir;i++) {
			if(vehiculos[i]==null) {
				sePuedeAnnyadir = true;
				vehiculos[i]=vehiculo;
			}
		}
		return sePuedeAnnyadir;
}
	public boolean sacarVehiculo(String matricula) {
		boolean sePuedeSacar = false;
		
		for(int i=0; i<vehiculos.length && !sePuedeSacar; i++) {
			if(vehiculos[i]!=null && matricula.equals(vehiculos[i].getMatricula())) {
				sePuedeSacar = true;
				vehiculos[i]=null;
			}
		}return sePuedeSacar;
	}

	@Override
	public String toString() {
		return "Parking [vehiculos=" + Arrays.toString(vehiculos) + "]";
	}
}
