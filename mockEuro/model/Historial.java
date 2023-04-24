	package com.edu.mockEuro.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Historial {

	private Map<LocalDate, Combinacion> sorteos;

	public Historial() {
		super();
		this.sorteos = new HashMap<>();
	}
	
	public boolean addSorteo(LocalDate fecha, Combinacion c) throws HistorialException {
		
		if(this.sorteos.containsKey(fecha)) {
			throw new HistorialException("Error, ya existe ese sorteo");
		}
		return sorteos.put(fecha, c) == null;
	}
	
	public boolean addSorteo(int dia, int mes, int annio, Combinacion c) throws HistorialException {
		LocalDate fechaSorteo = LocalDate.of(annio, mes, dia);
		return addSorteo(fechaSorteo, c);
	}
	
	public boolean actualizarSorteo(int dia, int mes, int annio, Combinacion c) {
		LocalDate fechaSorteo = LocalDate.of(annio, mes, dia);
		return this.sorteos.replace(fechaSorteo, this.sorteos.get(fechaSorteo), c);
	}
	
	public boolean actualizarSorteo(LocalDate fecha, Combinacion c) throws HistorialException {
		boolean seActualiza = false;
		if(this.sorteos.containsKey(fecha)) {
			this.sorteos.replace(fecha, this.sorteos.get(fecha),c);
			seActualiza = true;
		}
		else {
			throw new HistorialException("Ese sorteo no existe");
		}
		return seActualiza;
	}
	
	public boolean borrarSorteo(LocalDate fecha) {
		return this.sorteos.remove(fecha) != null;
	}
	
	public List<String> listarSorteosDesdeFecha(LocalDate fecha){
		List<String> listaSorteoFecha = new ArrayList<>();
		
		for(LocalDate ld : this.sorteos.keySet()) {
			if(ld.isAfter(fecha)) {
				listaSorteoFecha.add(this.sorteos.get(ld).toString());
			}
		}return listaSorteoFecha;
	}
	
	public List<String> mostrarHistorico(){
		List<String> historico = new ArrayList<>();
		
		for(LocalDate ld : this.sorteos.keySet()) {
			historico.add(this.sorteos.get(ld).toString());
		}
		return historico;
	}
	
	public Map<String, Integer> comprobarAciertos(LocalDate fecha, Combinacion c) throws HistorialException{
		Map<String, Integer> aciertos = new HashMap<>();
		if(!this.sorteos.keySet().contains(fecha) || fecha == null || c== null) {
			throw new HistorialException("Este sorteo no existe");
		}
		aciertos.put(fecha.toString(), this.sorteos.get(fecha).comprobarCombinacion(c));
		return aciertos;
	}
	}

