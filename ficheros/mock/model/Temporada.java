package com.edu.ficheros.mock.model;

import java.util.LinkedList;
import java.util.Objects;

import com.edu.ficheros.feria.model.Caseta;
import com.edu.ficheros.mock.model.SerieException;

public class Temporada implements Comparable<Temporada>{
	
	private String nombreTemporada;  // Nombre de las temporada
	private LinkedList<String> capitulos; // Lista donde etán los nombres de los capítulos de la temporada
	private int sumaOpiniones;  // Suma de todas las opiniones que se han realizado de la temporada
	private int numeroOpiniones; // Número de opiniones que se han realizado de la temporada
	
	/**
	 * Constructor de una temporada. Se crea sin ningún capítulo.
	 * @param nombreTemporada: recibe el nombre de la temporada.
	 * Obviamente no se ha realizado ninguna opinión sobre la temporada
	 */
	
	public Temporada(String nombreTemporada) {
		this.nombreTemporada=nombreTemporada;
		capitulos=new LinkedList<String>();
		sumaOpiniones=0;
		numeroOpiniones=0;
	}
	
	
	public String primerCapituloQueContieneEstaPalabra(String palabra) throws SerieException {
		StringBuilder sb = new StringBuilder();
		for(String s : this.capitulos) {
			if(!s.contains(palabra)) {
				throw new SerieException("No se encuentra el capitulo");
			}
			sb.append(s);
		}
		return sb.toString();
	}
	
	/**
	 * Método que añade un capítulo a la temporada. Se añade al final de los capítulos existente.
	 * No hay ningún control por lo que puede pasar que existan capítulos con el mismo nombre
	 * @param capitulo: nombre del capítulo a añadir
	 */
	public void annadirCapitulo(String capitulo) {
		capitulos.add(capitulo);
	}
	
	/**
	 * Elimna un capítulo de la temporada. Devuelve true si el capítulo estaba y se ha borrado, y 
	 * devuelve false si el capítulo no estába en la lista y por lo tanto no se ha podido borrar.
	 * @param capitulo: nombre del capítulo a borrar
	 * 
	 * 	 
	 * */
	
	public boolean eliminarCapitulo (String capitulo) {
		boolean borrado;
		borrado=capitulos.remove(capitulo);
		return borrado;
	}
	
	/**
	 * Métodoque valora la temporada. Los valores permitidos son de 0 a 10
	 * Se debe incrementar la suma de opiniones de la temporada y el número de valores
	 * que ha recibido la valoración
	 * @param nota
	 * @throws SerieException
	 */
	public void anniadirCapituloDespues(String nombreCapituloAnnadir, String nombreCapituloAnterior) throws SerieException {
		if(!this.capitulos.contains(nombreCapituloAnterior)) {
			throw new SerieException("No hay capitulo anterior");
		}
		
		this.capitulos.add(this.capitulos.indexOf(nombreCapituloAnterior)+1, nombreCapituloAnnadir);
	}
	public void valorar( int nota)throws SerieException {
		if (nota < 0 || nota > 10) {
			throw new SerieException("Nota incorrecta "  + nota);
		}
		
		sumaOpiniones= sumaOpiniones + nota;
		numeroOpiniones++;
	}
	
	
	/**
	 * Debe añadir un capítulo justo detrás del capítulo que se denomina nombreCapituloAnterior.
	 * Si no encuentra el capítulo anterior  saltará la excepción
	 * @param nombreCapituloAnnadir: este será el nombre del capítulo que se añadirá
	 * @param nombreCapituloAnterior: detrás de este capítulo se debe añadir

	 * @throws SerieException: si no encuentra el capítulo que indica la posición para añadir.
	 */
	

	public int getCapitulos() {
		return this.capitulos.size();
	}


	/**
	 * Devuleve el nombre del primer capítulo que contiene la palabra que  pasa por parámetro.
	 *  Si no lo encuentra salta la excepción 
	 * @param palabra
	 * @return
	 * @throws SerieException
	 */
	
	public double getNotaMedia() {
		double notaMedia=-1;
		if (numeroOpiniones==0) {
			notaMedia= sumaOpiniones/numeroOpiniones;
		}
		return notaMedia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capitulos, nombreTemporada, numeroOpiniones, sumaOpiniones);
	}

	@Override
	public boolean equals(Object obj) {
		 return this==obj || obj!=null &&
	                obj instanceof Temporada
	                && this.hashCode()==((Temporada)obj).hashCode();
	}


	@Override
	public int compareTo(Temporada t) {
		return (int) (this.getNotaMedia()-t.getNotaMedia());
	}


	@Override
	public String toString() {
		return String.format("Temporada con nombre %s, %s capitulos y una valoración de %s", this.nombreTemporada,this.capitulos.size(),getNotaMedia());
	}
	
	

	
	
	
}
