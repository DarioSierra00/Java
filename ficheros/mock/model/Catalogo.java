package com.edu.ficheros.mock.model;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Catalogo {


	private HashMap<String, Serie> mapSeries;
	
	/**
	 * Crea el objeto que nos servirá para tener las series
	 */
	public Catalogo() {
		mapSeries=new HashMap<String, Serie>();
	}
	
	
	/** Añade una serie a la lista de series. Si existe una serie con el mismo nombre lanza una excpetion
	 * 
	 * @param serie
	 * @throws SerieException
	 */
	public void annadirSerie(String nombreSerie, int anno, Tema tema) throws SerieException {
		if (mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("Ya existe esa serie");
		}
		Serie serie = new Serie(nombreSerie, anno, tema);
		mapSeries.put(serie.getNombreSerie(), serie);
	}
	
	
	/** Añade una temporada a la Serie cuyo nombre se le pasa por argumento, si no existe
	 * la Serie lanza una exception
	 * @param serie
	 * @throws SerieException
	 */
	public void annadirTemporada(String nombreSerie, String temporada) throws SerieException {
		if (!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("No existe esa serie");
		}
		Serie serie = mapSeries.get(nombreSerie);
		serie.annadirTemporada(temporada);
	}
	
	
	/** Añade un capítulo a la temporada de la Serie cuyo nombre se le pasa por argumento, si no existe
	 * la Serie o la temporada lanza una exception
	 * @param serie
	 * @throws SerieException
	 */
	public void annadirCapituloTemporada(String nombreSerie, String temporada, String capitulo) throws SerieException {
		if (!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("No existe esa serie");
		}
		Serie serie = mapSeries.get(nombreSerie);
		serie.annadirCapituloTemporada(temporada, capitulo);

	}
	
	
	/** Valorar una temporada de la Serie cuyo nombre se le pasa por argumento, si no existe
	 * la Serie o la temporada lanza una exception
	 * @param serie
	 * @throws SerieException
	 */
	public void valorarTemporada(String nombreSerie, String temporada, int valoracion) throws SerieException {
		if (!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("No existe esa serie");
		}
		Serie serie = mapSeries.get(nombreSerie);
		serie.valorarTemporada(temporada, valoracion);
	}
	
	/**
	 * Devuelve el número de temporadas que tiene la serie que se pasa por parámetro
	 * Si no existe la serie saltará la excepción.
	 * @param nombreSerie
	 * @return
	 * @throws SerieException
	 */

	public int numeroDeTemporadasDeUnaSerie(String nombreSerie) throws SerieException{
		if(!this.mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("Esta Serie no existe");
		}
		return this.mapSeries.get(nombreSerie).numeroTemporadas();
		
	}
	
	
	
	/** Modifica el tema de una serie. Si no se encuentra la serie o ya tenía ese tema saltará la excepción. 
	 * 
	 * @param nombreSerie
	 * @param nuevoTema
	 * @throws SerieException
	 */
	public void modificarTema( String nombreSerie, Tema nuevoTema) throws SerieException {
		if(!this.mapSeries.containsKey(nombreSerie) || this.mapSeries.get(nombreSerie).getTema().equals(nuevoTema)) {
			throw new SerieException("Esta serie no existe o ya tiene ese tema");
		}
		this.mapSeries.get(nombreSerie).setTema(nuevoTema);
	}
	
	
	
	/**
	 * Devolverá un listado ordenado de forma creciente por el año de la serie. 
	 * Para cada serie se mostrará su nombre, año y número de temporadas. 
	 * Si no hay ninguna serie de ese tema saltará la excepción.
	 * @param tema
	 * @return
	 * @throws SerieException
	 */
	public String listadoOrdenadoSeriesDeUnTema(Tema tema)  throws SerieException {
		StringBuilder sb = new StringBuilder();
		List<Serie> listaSeries = new ArrayList<>();
		
		for(Serie s : this.mapSeries.values()) {
			listaSeries.add(s);
		}
		Collections.sort(listaSeries, new ComparatorPorAnnioSerie());;
		for(Serie s : listaSeries) {
			if(s.getTema().equals(tema)) {
				sb.append(s).append(System.lineSeparator());
			}
		}
		if(sb.isEmpty()) {
			throw new SerieException("No hay ninguna serie de ese tema");
		}
		return sb.toString();
	}
	
	public void escribirEnSerie() throws IOException {
		File f = new File("./ficheros/Series.csv");

		f.createNewFile();
		PrintWriter pw = new PrintWriter(f);
		pw.write("nombreSerie,anno,tema"+System.lineSeparator());

		for(Serie s : this.mapSeries.values()) {
			pw.write(String.format("%s, %s, %s %s", s.getNombreSerie(), s.getAnno(), s.getTema(), System.lineSeparator()));
		}
		
		pw.close();
	}
	
	public void escribirEnCapitulos() throws IOException {
		File f = new File("./ficheros/Capitulos.csv");
		f.createNewFile();
		PrintWriter writer = new PrintWriter(f);

		writer.write("nombreSerie,nombreTemporada,nombreCapitulo" + System.lineSeparator());
		writer.write("--------------------" + System.lineSeparator());
		for(Serie s : this.mapSeries.values()) {
			for(Temporada t : s.getTemporadas()) {
				for(String c : t.getCapitulos()) {
					writer.write(String.format("%s,%s,%s %s",s.getNombreSerie(),t.getNombreTemporada(),c,System.lineSeparator()));
				}
			}
		}
		writer.close();
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(mapSeries);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		 return this==obj || obj!=null &&
	                obj instanceof Catalogo
	                && this.hashCode()==((Catalogo)obj).hashCode();
	}
	
	
	
}


