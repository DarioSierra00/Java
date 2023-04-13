package com.edu.listas.ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Historial {

	private List<PaginaWeb> historial;
	
	public Historial() {
		super();
		this.historial = new ArrayList<>();
	}

	public void addPaginaHistorial(PaginaWeb pw) throws HistorialException {
		if(historial.isEmpty()) {
			historial.add(pw);
		}
		else if(this.historial.get(this.historial.size()-1).getFecha().isBefore(pw.getFecha())){
			
		}
		else {
			throw new HistorialException("La fecha debe ser posterior a la de la página anterior");
		}
	}
	
	public Historial mostrarHistorialCompleto() {
		return this;
	}
	
	public Historial mostrarHistorialDia(int dia) throws HistorialException {
		Historial hdia = new Historial();
		for(PaginaWeb p: this.historial) {
			if(p!=null && p.getFecha().getDayOfMonth()== dia) {
				hdia.addPaginaHistorial(p);
			}
		}return hdia;
	}
	
	public void borrarHistorial() {
		this.historial.clear();
	}
	
	public void borrarVisitasPagina(String url) {
		Iterator<PaginaWeb> iPagWeb = this.historial.iterator();
		while(url!=null && iPagWeb.hasNext()) {
			if(iPagWeb.next().getUrl().equals(url)) {
				iPagWeb.remove();
			}
		}
	}
	
	public String toString() {
		return String.format("Historial %s", this.historial.toString());
	}
	
}
