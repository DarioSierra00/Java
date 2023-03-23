package com.edu.parking.comparables;

import java.util.Comparator;

import com.edu.parking.model.Vehiculo;

public class CompararTipoCombustible implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		int resultado = 0;
		if(o1 != null && o2 != null) {
			if(o1.getTipoVehiculo().compareTo(o2.getTipoVehiculo())==0){
				resultado=o1.getTipoCombustible().compareTo(o2.getTipoCombustible());
			}
		}else if(o2 == null) {
			resultado = -1;
		}else if(o1 == null) {
			resultado = 1;
		}
		return resultado;
	}

}
