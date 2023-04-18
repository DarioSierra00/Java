package com.edu.listas.ejercicio6;

import com.edu.listas.ejercicio6.model.Diccionario;

public class Main {

	public static void main(String[] args) {
		Diccionario d = new Diccionario();
		
		d.addWord("Currito", "Es un chulaco");
		d.addWord("Culero", "En mexicano");
		d.addWord("Locotron", "Jajajaj");
		System.out.println(d.listarPalabra("Cu"));
		
	}

}
