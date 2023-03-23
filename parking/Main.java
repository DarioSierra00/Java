package com.edu.parking;

import java.time.LocalDate;

import com.edu.parking.model.Combustible;
import com.edu.parking.model.Parking;
import com.edu.parking.model.TipoVehiculo;
import com.edu.parking.model.Vehiculo;

public class Main {

	public static void main(String[] args) {
	Vehiculo v = new Vehiculo("Audi", "R8", "LWS8364", Combustible.GASOLINA, LocalDate.now(), TipoVehiculo.AUTOMOVIL);
	Vehiculo v1 = new Vehiculo("Mercedes", "GLA", "LWS8322", Combustible.GASOLINA, LocalDate.now(), TipoVehiculo.AUTOMOVIL);

	Parking p = new Parking();
	
	System.out.println(v.esMatriculaValida("LWS8364"));
	System.out.println(p.añadirVehiculo(v));
	System.out.println(p.sacarVehiculo("LWS8364"));
	System.out.println(v);
	System.out.println(v1);
	
	}

}
