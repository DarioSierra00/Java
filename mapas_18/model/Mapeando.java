package com.edu.mapas_18.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Mapeando {

	
	/*
	 * Recibe una colección de personas y las agrupa por género
	 * @param personas
	 * @return Mapa con la colección de personas clasificadas por género
	 */
	public Map mapearPersonasPorGenero(Collection<Persona> personas) {
		Map<Genero, Collection<Persona>> mapita = new HashMap<>();
		
		for(Persona p : personas) {
			if(!mapita.containsKey(p.getGenero())){
				mapita.put(p.getGenero(), new HashSet<>());
			}
			mapita.get(p.getGenero()).add(p);
		}
		return mapita;
	}
	
	
	/**
	 * Recibe una colección de números y cuenta cuantas ocurrencias hay de cada uno de ellos
	 * creando un mapa en el que aparece cada número junto a su frecuencia de aparición
	 * @param numeros
	 * @return Tabla de frecuencias de los números facilitados
	 */
	public Map<Integer, Integer> contarNumeros(Collection<Integer> numeros){
		Map<Integer, Integer> mapaNumeros = new HashMap<>();
		
		for(Integer n : numeros) {
			if(!mapaNumeros.containsKey(n)) {
				mapaNumeros.put(n, 0);
			}
			mapaNumeros.put(n,mapaNumeros.get(n)+1);
			
		}
		
		return mapaNumeros;
	}
	
	
	/**
	 * Genera una lista de números aleatorios entre 0 y 20 del tamaño indicado
	 * @param size tamaño de la lista
	 * @return lista de size números aleatorios
	 */
	public static Collection<Integer> generarNumerosAleatorios(int size){
		List<Integer> numeros = new ArrayList<>() {{
			for(int i=0; i<size; i++) {
				add(new Random().nextInt(0, 20));
			}
		}};
		
		return numeros;
	}
}
