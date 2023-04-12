package com.edu.listas.ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
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
	
	public String mostrarHistorialCompleto() {
		return this.historial.toString();
	}
	
	public String mostrarHistorialDia() {
		
	}
	
	
}
