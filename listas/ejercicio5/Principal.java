package com.edu.listas.ejercicio5;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		Persona pa = new Alumno("alumno", LocalDate.now().minusYears(15));
		Persona pf = new Profesor("jms", LocalDate.now().minusYears(40));
		Persona pa2 = new Alumno("balumno", LocalDate.now().minusYears(23));

		try {
			pa2.enviarMensaje(pa2, "Cortesía de alguno");
			pa.enviarMensaje(pa2, "Ola, ke ase?");
			pf.enviarMensaje(pa2, "Otro mensaje");
			pf.enviarMensaje(pa, "Y otro mensaje");
			pf.enviarMensaje(pf, "Y ahora hablando conmigo mismo");
			pf.enviarMensaje(pf, "Como en whatsapp");
			
			pa2.enviarMensaje(pf, "Cortesía de alguno");
	

		} catch (DestinatarioNoValidoException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(pa2.mostrarMensajesPorRemitente());
		//System.out.println("Mensajes del buzón del profesor: ");
		//System.out.println(pf.mostrarMensajes());;
		
		//System.out.println("Mensajes del buzón del alumno: ");
		//System.out.println(pa.mostrarMensajes());;
		
	}

}
