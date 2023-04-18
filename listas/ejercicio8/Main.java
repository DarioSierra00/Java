package com.edu.listas.ejercicio8;

public class Main {
	
	public static void main(String[] args) {
		Equipo e = new Equipo("Betis");
		Equipo e1 = new Equipo("Mirandés");
		
		Alumno a = new Alumno("Luis", "1278876t", 18, 'H', "Sevilla");
		Alumno a1 = new Alumno("Ana", "3774537b", 17, 'M', "Madrid");
		Alumno a2 = new Alumno("Marcos", "127887336t", 19, 'H', "Madrid");
		Alumno a3 = new Alumno("Minerva", "38940534g", 19, 'M', "Barcelona");
		Alumno a4 = new Alumno("Carlota", "38940534g", 20, 'M', "Getafe");
		Alumno a5 = new Alumno("Jotaro", "1278876z", 17, 'H', "Sevilla");
		Alumno a6 = new Alumno("Polnareff", "12534876x", 17, 'H', "Sevilla");




		
		try {
			e.addAlumno(a);
			e.addAlumno(a2);
			e.addAlumno(a3);
			e.addAlumno(a1);
			e.addAlumno(a4);
			e1.addAlumno(a4);
			e1.addAlumno(a3);
			e1.addAlumno(a1);
			e.addAlumno(a5);
			e.addAlumno(a6);
			
			System.out.println(e.listaJugadoresM());
			System.out.println(e1.esFemenino());
			System.out.println(e1.numeroJMayoresEdad());
			System.out.println(e.edadMayor());
			System.out.println(e.dniJugadoresM());
			System.out.println(e.nombresOrdenadosF());
			System.out.println(e1.mayorEdadEnEquipo());
			System.out.println(e.ciudadesDireferentes());
			
		} catch (AlumnoException e2) {
			e2.printStackTrace();
		}


	}
}
