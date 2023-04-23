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
		boolean seAñade = false;
		if(this.sorteos.containsKey(fecha)) {
			throw new HistorialException("Error, ya existe ese sorteo");
		}
		else {
			this.sorteos.put(fecha, c);
			seAñade = true;
		}
		return seAñade;
	}
	
	public boolean addSorteo(int dia, int mes, int annio, Combinacion c) throws HistorialException {
		LocalDate fechaSorteo = LocalDate.of(dia, mes, annio);
		return addSorteo(fechaSorteo, c);
	}
	
	public boolean actualizarSorteo(int dia, int mes, int annio, Combinacion c) {
		LocalDate fechaSorteo = LocalDate.of(dia, mes, annio);
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
	}

