package com.edu.parking.model;
import java.util.Arrays;

import com.edu.parking.comparables.CompararPorMarca;
import com.edu.parking.model.Vehiculo;

public class Parking implements Comparable<Vehiculo>{
	
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
	
	private Vehiculo[] quitarNulosArray() {

		int contVeh = 0;
		for(Vehiculo v: this.vehiculos) {
			if(v != null) {
				contVeh ++;
			}
		}
		Vehiculo[] tmp = new Vehiculo[contVeh];
		int indice = 0;
		for(int i = 0; i < this.vehiculos.length; i++) {
			if(this.vehiculos[i] != null) {
				tmp[indice] = this.vehiculos[i];
				indice ++;
				}
			}
		return tmp;
		}
	
	public String arrayToString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<vehiculos.length; i++) {
			if(vehiculos[i]!=null) {
				sb.append(vehiculos[i]).append("\n");
			}
		}return sb.toString();
	}
	
	public String comparaPorFecha() {
		Vehiculo[] vehiculoNoNulo = quitarNulosArray();
		Arrays.sort(vehiculoNoNulo);
		
		return Arrays.toString(vehiculoNoNulo);
	}
	
	public String compararPorMarcaYModelo() {
		Arrays.sort(this.vehiculos, new CompararPorMarca());
		return Arrays.toString(this.vehiculos);
	}
	
	public String compararPorTipoCombustible() {
		//Arrays.sort(this.vehiculos, new CompararPorTipoCombustible());
		return "a";
	}

	@Override
	public String toString() {
		return "Parking [vehiculos=" + Arrays.toString(vehiculos) + "]";
	}

	@Override
	public int compareTo(Vehiculo o) {
		return 0;
	}
}
