package com.edu.listas.ejercicio8;

public class Main {
	
	public static void main(String[] args) {
		Equipo e = new Equipo("Betis");
		Equipo e1 = new Equipo("Mirandés");
		
		Alumno a = new Alumno("Curritooooo", "1278876t");
		Alumno a2 = new Alumno("Looooocoo", "127887336t");
		Alumno a1 = new Alumno("Looooocoo", "127887336t");
		
		try {
			e.addAlumno(a);
			e1.addAlumno(a1);
			System.out.println(e.unionEquipo(e1));
			System.out.println(e.interseccionEquipo(e1));
			System.out.println(e);
		} catch (AlumnoException e2) {
			e2.printStackTrace();
		}


	}
}
