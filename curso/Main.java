package com.edu.curso;

public class Main {

	public static void main(String[] args) {
		
		Curso c = new Curso();

		c.setNombre("Currito");
		c.setApellidos("Kilimanjaro");
		c.setAltura(180);
		c.setEdad(25);
		c.setPeso(75.5f);
		
		System.out.println(c);
		
		Curso cp = new Curso("Loco", "Kokdo", 189, 24, 74.3f);
		
		System.out.println(cp);
	}

}
