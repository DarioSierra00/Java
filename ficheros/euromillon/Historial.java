	package com.edu.ficheros.euromillon;

import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Historial {

	private Map<LocalDate, Combinacion> sorteos;
	private FileReader fileR;
	private File file;
	
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
	
	public void addSorteo(String linea) throws CombinacionException {
		String[] datos = linea.split(",");
		LocalDate fecha = LocalDate.parse(datos[0], DateTimeFormatter.ofPattern("d/MM/yyyy"));
		String[] numeros = Arrays.copyOfRange(datos, 1, 6);
		String[] estrellas = Arrays.copyOfRange(datos, 7, 9);
		sorteos.put(fecha, new Combinacion(numeros, estrellas));
	}
	
	public Set<Integer> numeroMenosRepetido() {
		Map<Integer, Integer> numerosRepetidos = mapeandoNumeros();
		Set<Integer> numeros = new HashSet<>();
		numeros.add(1);
		for(Integer n : numerosRepetidos.keySet()) {
			for(Integer i : numeros) {
				if(numerosRepetidos.get(n) < numerosRepetidos.get(i)) {
					numeros.clear();
					numeros.add(n);
				}
		}
		}return numeros;
	}
	
	public Set<Integer> numeroMasRepetido() {
		Map<Integer, Integer> numerosRepetidos = mapeandoNumeros();
		Set<Integer> numeros = new HashSet<>();
		numeros.add(1);
		for(Integer n : numerosRepetidos.keySet()) {
			for(Integer i : numeros) {
				if(numerosRepetidos.get(n) > numerosRepetidos.get(i)) {
					numeros.clear();
					numeros.add(n);
				}
		}
		}return numeros;
	}
	
	public Set<Integer> estrellaMenosRepetida() {
		Map<Integer, Integer> estrellasRepetidas = mapeandoEstrellas();
		Set<Integer> estrellas = new HashSet<>();
		estrellas.add(1);
		for(Integer n : estrellasRepetidas.keySet()) {
			for(Integer i : estrellas) {
				if(estrellasRepetidas.get(n) < estrellasRepetidas.get(i)) {
					estrellas.clear();
					estrellas.add(n);
				}
		}
		}return estrellas;
	}
	
	public Set<Integer> estrellaMasRepetida() {
		Map<Integer, Integer> estrellasRepetidas = mapeandoEstrellas();
		Set<Integer> estrellas = new HashSet<>();
		estrellas.add(1);
		for(Integer n : estrellasRepetidas.keySet()) {
			for(Integer i : estrellas) {
				if(estrellasRepetidas.get(n) > estrellasRepetidas.get(i)) {
					estrellas.clear();
					estrellas.add(n);
				}
		}
		}return estrellas;
	}
	
	private Map<Integer, Integer> mapeandoNumeros() {
		Map<Integer, Integer> numRepe = new HashMap();
		
		for(LocalDate l : this.sorteos.keySet()) {
			for(Integer n : this.sorteos.get(l).getNumeros()) {
				if(!numRepe.containsKey(n)) {
					numRepe.put(n, 0);
				}
				numRepe.put(n, numRepe.get(n)+1);
		}
		}
		return numRepe;
	}
	
	private Map<Integer, Integer> mapeandoEstrellas() {
		Map<Integer, Integer> numRepe = new HashMap();
		
		for(LocalDate l : this.sorteos.keySet()) {
			for(Integer n : this.sorteos.get(l).getEstrellas()) {
				if(!numRepe.containsKey(n)) {
					numRepe.put(n, 0);
				}
				numRepe.put(n, numRepe.get(n)+1);
		}
		}
		return numRepe;
	}
	
	public int maxAciertosCombi(Combinacion combi) {
		int acum = 0;
		for(LocalDate l : this.sorteos.keySet()) {
			if(this.sorteos.get(l).comprobarCombinacion(combi) > acum) {
				acum = this.sorteos.get(l).comprobarCombinacion(combi);
			}
		}return acum;
	}
	
	public Combinacion mayorSecuenciaNumeros() {
		List<Combinacion> secuenciaSorteo = new ArrayList(this.sorteos.values());
		Combinacion c = secuenciaSorteo.get(0);
		
		for(Combinacion c1 : this.sorteos.values()) {
			if(obtenerSecuencia(c1) > obtenerSecuencia(c)) {
				c = c1;
			}
		}return c;
		
	}
	
	public int obtenerSecuencia(Combinacion c) {
		int secuencia = 0;
		int temp = -1;
		for(int n : c.getBolnumeros()) {
			if(n == temp+1) {
				secuencia++;
			}
			temp = n;
		}return secuencia;
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
		if(!this.sorteos.keySet().contains(fecha)) {
			throw new HistorialException("Este sorteo no existe");
		}
		aciertos.put(fecha.toString(), this.sorteos.get(fecha).comprobarCombinacion(c));
		return aciertos;
	}
	}
