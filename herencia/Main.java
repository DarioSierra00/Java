package com.edu.herencia;

import com.edu.herencia.model.Camion;
import com.edu.herencia.model.Coche;
import com.edu.herencia.model.Moto;

public class Main {
	public static void main(String[] args) {
		Coche coche = new Coche("Toyota", "Corolla", 2022, 4);
		coche.arrancar();
		coche.abrirMaletero();
		
		Moto moto = new Moto("Yamaha", "RR", 2022, true);
		moto.arrancar();
		moto.detener();
		
		Camion camion = new Camion("Mercedes", "YUGH", 2022, 300);
		camion.arrancar();
		camion.detener();
		
		System.out.println(coche);
		System.out.println(moto);
		System.out.println(camion);
	}
}
