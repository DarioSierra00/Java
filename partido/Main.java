package com.edu.partido;

import java.util.Scanner;

import com.edu.partido.model.Equipo;
import com.edu.partido.model.Partido;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Equipo local = null;
		Equipo visitante = null;
		
		System.out.println("Introduce el nombre del equipo local: ");
		local = new Equipo(sc.nextLine());
		System.out.println("Introduce el nombre del equipo visitante: ");
		visitante = new Equipo(sc.nextLine());
		
		while(visitante.getNombreEquipo().equals(local.getNombreEquipo())) {
			System.out.println("Introduce un equipo que sea diferente al local: ");
			visitante = new Equipo(sc.nextLine());
		}
		
		System.out.println("Introduce la jornada en la que juegan los equipos: ");
		int jornada = Integer.valueOf(sc.nextLine());
		
		while(jornada < 1 && jornada > 39) {
			System.out.println("Introduce una jornada correcta (1-38): ");
			jornada = Integer.valueOf(sc.nextLine());
		}
		Partido p1 = new Partido(jornada,local,visitante);
		System.out.println("Introduce el resultado del partido: ");
		p1.ponerResultado(sc.nextLine());
		p1.AsignarResultadoQuiniela();
		System.out.println(p1);
		

	}

}
