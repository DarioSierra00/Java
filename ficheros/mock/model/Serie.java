package com.edu.ficheros.mock.model;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Serie implements Comparable<Serie>{
	private static final int ANNO_MINIMO = 1900; // Sólo se almacenrará series posteriores a 1900
	private String nombreSerie; // Nombre de la serie
	private int anno; //Año de la primera temporada de la serie
	private Tema tema; // Tema de la serie
	private ArrayList<Temporada> temporadas; // Lista de las temporadas de las series.
	
	/*
	Se ha optado por una estructura de tipo lista porque por cada temporada, se va a guardar capitulos de forma ordenada, capitulo1,capitulo2,capitulo3
	*/
	

	/**
	 * Constructor que recibe el nombre de la serie, el año de creación y el tema.  Se crea la serie sin ninguna temporada
	 * @param nombreSerie
	 * @param anno
	 * @param tema
	 * @throws SerieException: si el año es anterior a 1900 se lanzará una exception
	 */
	public Serie(String nombreSerie, int anno, Tema tema) throws SerieException {
		super();
		this.nombreSerie = nombreSerie;
		setAnno(anno);
		this.tema = tema;
		temporadas=new ArrayList<Temporada>();
	}
	
	/**
	 * Añade una nueva temporada. Se le pasará el nombre de la nueva temporada y se añadirá al final.
	 * Debe comprobar que no existe un temporada con ese nombre en cuyo caso saltará la excepción.
	 * @param nombreTemporada
	 * @throws SerieException
	 */
	public void annadirTemporada(String nombreTemporada) throws SerieException {
		if(this.temporadas.contains(nombreTemporada)) {
			throw new SerieException("Ya existe una temporada con ese nombre");
		}
		this.temporadas.add(new Temporada(nombreTemporada));
	}
	
	
	/**
	 * Añade un nuevo capítulo a una temporada. Se le pasará el nombre de la temporada y si la temporada no existe
	 * se lanzará una exception
	 * @param nombreTemporada
	 * @param nombreCapitulo
	 * @throws SerieException
	 */
	public void annadirCapituloTemporada(String nombreTemporada, String nombreCapitulo) throws SerieException {
		Temporada temporada = new Temporada(nombreTemporada);
		int pos = temporadas.indexOf(temporada);
		if (pos == -1) {
			throw new SerieException("No existe la temporada");
		}
		temporadas.get(pos).annadirCapitulo(nombreCapitulo);
	}
	
	
	/**
	 * Valorar temporada. Si no exsite la temporada lanza una exception.
	 * @param nombreTemporada
	 * @param valoracion
	 * @throws SerieException
	 */
	
	public void valorarTemporada(String nombreTemporada, int valoracion) throws SerieException {
		Temporada temporada = new Temporada(nombreTemporada);		// TODO Auto-generated method stub

		int pos = temporadas.indexOf(temporada);
		if (pos == -1) {
			throw new SerieException("No existe la temporada");
		}
		temporadas.get(pos).valorar(valoracion);
		
	}
	/**
	 * Devuelve un listado de las temporadas de una serie ordenadas  de mayor a menor por nota media. 
	 * De cada temporada se mostrará el nombre, número de capítulos y nota media
	 * @return
	 */
	public String listadoTemporadasPorNotaMedia() {
		StringBuilder sb = new StringBuilder();
		Collections.sort(this.temporadas);
		
		for(Temporada t : this.temporadas) {
			sb.append(t).append(System.lineSeparator());
		}
		return sb.toString();
	}
	

	/**
	 * Devuelve un listado de las temporadas de una serie ordenadas de menor a mayor por número de capítulos. 
	 * De cada temporada se mostrará el nombre, número de capítulos y nota media.
	 * @return
	 */
	public String listadoTemporadasPorNumeroDeCapitulos() {
		StringBuilder sb = new StringBuilder();
		Collections.sort(this.temporadas, new ComparatorPorNumeroDeCapitulos());
		
		for(Temporada t : this.temporadas) {
			sb.append(t).append(System.lineSeparator());
		}
		return sb.toString();
	}

	
	/**
	 * Devuelve el nombre de la Serie
	 * @return
	 */
	public String getNombreSerie() {
		return nombreSerie;
	}


	/** Asigna el nombre de la serie
	 * 
	 * @param nombreSerie
	 */
	public void setNombreSerie(String nombreSerie) {
		this.nombreSerie = nombreSerie;
	}


	/**
	 * Devuelve el año
	 * @return
	 */
	public int getAnno() {
		return anno;
	}


	/**
	 * Asinga el año
	 * @param anno
	 * @throws SerieException
	 */
	public void setAnno(int anno) throws SerieException {
		if ( anno < ANNO_MINIMO) {
			throw new SerieException("Anno incorrecto");
		}
		this.anno = anno;
	}


	/**
	 * Devuelve el tema
	 * @return
	 */
	public Tema getTema() {
		return tema;
	}

	/** Asinga el tema
	 * 
	 * @param tema
	 */
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	/** 
	 * Devuelve el número de temporadas que tiene la serie
	 * @return
	 */
	public int numeroTemporadas() {
		return temporadas.size();
	}
	public void escribirEnTemporada() throws IOException {
		File f = new File("./ficheros/Temporadas.csv");

		f.createNewFile();
		PrintWriter pw = new PrintWriter(f);
		pw.write("nombreSerie,nombreTemporada,numeroCapitulos,sumaOpiniones,numeroOpiniones"+System.lineSeparator());

		for(Temporada t : this.temporadas) {
			pw.write(String.format("%s, %s, %s, %s, %s %s", this.nombreSerie, t.getNombreTemporada(), t.getCapitulos(),t.getSumaOpiniones(),t.getNumeroOpiniones(), System.lineSeparator()));
		}
		
		pw.close();
	}
	
	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}

	/**
	 * toString
	 */

	@Override
	public int hashCode() {
		return Objects.hash(anno, nombreSerie, tema, temporadas);
	}

	@Override
	public boolean equals(Object obj) {
		 return this==obj || obj!=null &&
	                obj instanceof Serie
	                && this.hashCode()==((Serie)obj).hashCode();
	}

	@Override
	public int compareTo(Serie s) {
		return s.anno-this.anno;
	}

	public String toString() {
		return  String.format("Serie con nombre %s del año %s y un numero de temporadas de %s", this.nombreSerie,this.anno,this.temporadas.size());
	}
	


	
	
	
	
	
}
