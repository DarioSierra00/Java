package com.edu.listas.ejercicio6.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import com.edu.listas.ejercicio6.Excepciones.DiccionarioException;

public class Diccionario {
	private HashMap<String, Collection<String>> diccionario;
	
	public Diccionario() {
		super();
		this.diccionario = new HashMap<>();
	}
	
	public void addWord(String word, String definition) {
		if(diccionario.containsKey(word)) {
			diccionario.get(word).add(definition);
		}
		else {
			diccionario.put(word, new HashSet<String>());
		}
	}
	
	public String showWord(String word) throws DiccionarioException {
		String dic = "";
		if(diccionario.containsKey(word)) {
			dic = diccionario.toString();
		}
		else {
			throw new DiccionarioException("Esa palabra no está en el diccionario");
		}
		return dic;
	}
	
	public void deleteWord(String word) {
		if(word != null && diccionario.containsKey(word)) {
			diccionario.remove(word);
		}
	}
	
	public String listarPalabra(String start) {
		StringBuilder sb = new StringBuilder();
		for(String k : diccionario.keySet()) {	
			if(k.startsWith(start)) {
				sb.append(k + "\n");
			}
		}return sb.toString();
	}
}
