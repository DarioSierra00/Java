package com.edu.linea;

import com.edu.linea.model.Linea;
import com.edu.linea.model.Punto;

public class Main {

	public static void main(String[] args) {
		Punto a = new Punto(0, 0);
		Punto b = new Punto(3, 5);
		
		Linea linea = new Linea(a, b);
		Linea otra = new Linea(b, a);
	}

}
