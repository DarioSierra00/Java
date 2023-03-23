package com.edu.parking;

import java.time.LocalDate;

import com.edu.parking.model.Combustible;
import com.edu.parking.model.Parking;
import com.edu.parking.model.TipoVehiculo;
import com.edu.parking.model.Vehiculo;

public class Main {

	public static void main(String[] args) {
	Vehiculo v = new Vehiculo("Audi", "R8", "LWS8364", Combustible.GASOLINA, LocalDate.of(2023, 9, 1), TipoVehiculo.AUTOMOVIL);
	Vehiculo v1 = new Vehiculo("Mercedes", "GLA", "LWS8322", Combustible.GASOLINA, LocalDate.of(2023, 9, 2), TipoVehiculo.AUTOMOVIL);

	Parking p = new Parking();
	
	System.out.println(p.añadirVehiculo(v2));
	System.out.println(p.añadirVehiculo(v));
	System.out.println(p.añadirVehiculo(v1));
	System.out.println("Ordenar por fecha de entrada");
	System.out.println(p.comparaPorFecha());	
	System.out.println("Ordenar por marca");
	System.out.println(p.comparaPorFecha());
	System.out.println("Ordenar por modelo");
	System.out.println(p.comparaPorFecha());
	System.out.println("Ordenar por tipo");
	System.out.println(p.ComparableTipoCombustible());
	System.out.println("Ordenar por combustible");
	System.out.println(p.compararPorCombustible());
	System.out.println("Ordenar por matricula");
	System.out.println(p.compararPorMatricula());
	
	
	}

}
