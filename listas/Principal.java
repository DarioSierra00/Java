package com.edu.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(1);
		listaNumeros.add(4);
		listaNumeros.add(5);
		listaNumeros.add(2);
		listaNumeros.add(1);
		
		System.out.println(listaNumeros.get(2));
		Collections.sort(listaNumeros);
		
		System.out.println(listaNumeros);
		
		System.out.println(listaNumeros.size());
		System.out.println(listaNumeros.toString());
		
		System.out.println("");
		
		Set<String> conjuntoNombres = new HashSet<>();
		conjuntoNombres.add("Currito");
		conjuntoNombres.add("Ana");
		conjuntoNombres.add("Zorro");
		conjuntoNombres.add("Perro");
		conjuntoNombres.add("Daryl");

		System.out.println(conjuntoNombres);
		



		
		

	}

}
