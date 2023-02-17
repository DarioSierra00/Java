package com.edu.geometria;

import java.util.Scanner;

import com.edu.geometria.model.Rectangulo;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangulo r = new Rectangulo(10, 13);
		System.out.println(r.calcularPerimetro(12, 14));
		System.out.println(r.calcularArea(12, 14));
	}

}
