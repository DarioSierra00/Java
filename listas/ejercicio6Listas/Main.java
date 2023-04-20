package com.edu.listas.ejercicio6Listas;

import com.edu.listas.ejercicio6.Excepciones.DiccionarioException;
import com.edu.listas.ejercicio6Listas.model.Diccionario;
import com.edu.listas.ejercicio6Listas.model.Entrada;

public class Main {

	public static void main(String[] args) {
		Diccionario d = new Diccionario();
		Entrada e = new Entrada("Currito", "Arte de curritear");
		
		d.annyadirPalabra("Currito", "Currito lerele");
		d.annyadirPalabra("Currito", "Locotron");
		try {
			System.out.println(d.buscarPalabra("Currito"));
		} catch (DiccionarioException e1) {
			e1.printStackTrace();
		}
		//System.out.println(d.listarPalabra("Cu"));
		d.borrarPalabra("Currito");
		System.out.println(d.listarPalabra("Curr"));
		
	}
		
	

}
