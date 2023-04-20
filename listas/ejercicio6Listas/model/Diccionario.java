package com.edu.listas.ejercicio6Listas.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.edu.listas.ejercicio6.Excepciones.DiccionarioException;

public class Diccionario {
	
	private List<Entrada> diccionario;
	
	public Diccionario() {
		this.diccionario = new ArrayList<>();
	}
	
	public void annyadirPalabra(String palabra, String significado) {
		boolean seAñade = false;
		if(palabra != null && !palabra.isEmpty()) {
			for(Entrada e : this.diccionario) {
				if(e.getNombrePalabra().equals(palabra)) {
					e.annyadirSignificado(significado);
					seAñade = true;
				}
			}
			if(!seAñade) {
				this.diccionario.add(new Entrada(palabra, significado));
			}
		}
	}
	public String buscarPalabra(String palabra) throws DiccionarioException {
		StringBuilder sb = new StringBuilder();
		if(palabra != null && !palabra.isEmpty()) {
			for(Entrada e : this.diccionario) {
				if(e.getNombrePalabra().equals(palabra)) {
					sb.append(e.getSignificados());
				}
			}
			if(sb.isEmpty()) {
				throw new DiccionarioException("Esta palabra no está en el diccionario");
			}
		}return sb.toString();
	}
	
	public void borrarPalabra(String palabra) {
		boolean encuentraPalabra = false;
		Iterator<Entrada> it = this.diccionario.iterator();
		if(palabra != null && !palabra.isEmpty()) {
			while(it.hasNext() && !encuentraPalabra) {
				if(it.next().getNombrePalabra().equals(palabra)) {
					encuentraPalabra = true;
					it.remove();
				}
			}
		}
	}
	
	public String listarPalabra(String palabra) {
		StringBuilder sb = new StringBuilder();
		if(palabra != null && !palabra.isEmpty()) {
			for(Entrada e : this.diccionario) {
				if(e.getNombrePalabra().startsWith(palabra)) {
					sb.append(e.getNombrePalabra());
				}
			}
		}return sb.toString();
	}

}
