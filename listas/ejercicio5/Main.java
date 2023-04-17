package com.edu.listas.ejercicio5;

public class Main {

	public static void main(String[] args) {
		
		Persona p = new Profesor("Curro", 34);
		Persona p1 = new Profesor("Luis", 31);
		Persona a = new Alumno("Jaimito", 17);
		Persona a1 = new Alumno("Mario", 17);


		
		try {
			a.enviarMensaje(p, "Hola currito que haces");
			p.enviarMensaje(a, "Nada aqui estamos y tu");
			//a.enviarMensaje(a1, "No se va a poder");
			p1.enviarMensaje(a1, "Tienes un 5");
		} catch (MensajeException e1) {
			e1.printStackTrace();
		}
		
		try {
			System.out.println(p.leerBuzon());
			System.out.println(a.leerBuzon());
			System.out.println(a1.leerBuzon());
		} catch (MensajeException e) {
			e.printStackTrace();
		}

	}

}
