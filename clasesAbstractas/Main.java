package com.edu.clasesAbstractas;

import com.edu.clasesAbstractas.model.Circulo;
import com.edu.clasesAbstractas.model.Cuadrado;
import com.edu.clasesAbstractas.model.Figura;
import com.edu.clasesAbstractas.model.Rectangulo;
import com.edu.clasesAbstractas.model.Triangulo;


public class Main {

	public static void main(String[] args) {
		
		Figura cua = new Cuadrado(4);
		System.out.println(cua);
		Figura r = new Rectangulo(7);
		System.out.println(r);
		
		
		Figura f = new Triangulo(3,4,5);
		System.out.println(f);
		Figura c = new Circulo(5);
		System.out.println(c);

	}

}
