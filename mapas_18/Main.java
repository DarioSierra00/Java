package com.edu.mapas_18;

import java.util.ArrayList;
import java.util.List;

import com.edu.mapas_18.model.Genero;
import com.edu.mapas_18.model.Mapeando;
import com.edu.mapas_18.model.Persona;

public class Main {
	
	public static void main(String[] args) {
		
		List<Persona> persons = new ArrayList<>(); 
		
		Mapeando m = new Mapeando();
		
		persons.add(new Persona("Dario","Sierra",Genero.MASCULINO));
			
		persons.add(new Persona("Jotaro","Kujo",Genero.MASCULINO));
		
		persons.add(new Persona("Jolyne","Kujo",Genero.FEMENINO));
		
		persons.add(new Persona("Kasca","Cin",Genero.FEMENINO));
		
		persons.add(new Persona("Maria","López",Genero.DESCONOCIDO));
		
		persons.add(new Persona("Pedro","Sampedro",Genero.NEUTRO));
		
		System.out.println(m.mapearPersonasPorGenero(persons));
		
		//System.out.println(m.generarNumerosAleatorios(20));
		
		
		List<Integer> numeros = new ArrayList<>();
		
		
		numeros.add(1);
		
		numeros.add(4);
		
		numeros.add(3);
		
		numeros.add(3);
		
		numeros.add(1);
		
		numeros.add(5);
		
		numeros.add(2);
		
		System.out.println(m.contarNumeros(numeros));
	}

	}

