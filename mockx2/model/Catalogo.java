package com.edu.mockx2.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
		if(!this.mapSeries.keySet().contains(nombreSerie)) {
			throw new SerieException("Esta serie no existe");
		}
		return this.mapSeries.get(nombreSerie).getNumTemporadas();
	}
	
	
	
	/** Modifica el tema de una serie. Si no se encuentra la serie o ya tenía ese tema saltará la excepción. 
	 * 
	 * @param nombreSerie
	 * @param nuevoTema
	 * @throws SerieException
	 */
	public void modificarTema( String nombreSerie, Tema nuevoTema) throws SerieException {
		if(!this.mapSeries.containsKey(nombreSerie) || this.mapSeries.get(nombreSerie).getTema().equals(nuevoTema)) {
			throw new SerieException("Esa serie no existe");
		}
		this.mapSeries.get(nombreSerie).setTema(nuevoTema);
	}
	
	
	
	/**
	 * Devolverá un listado ordenado de forma creciente por el año de la serie. 
	 * Para cada serie se mostrará su nombre, año y número de temporadas. 
	 * Si no hay ninguna serie de ese tema saltará la excepción.
	 * @param tema
	 * @return
	 * @throws IOException 
	 * @throws SerieException
	 */
	
	public void toCsv() throws IOException {
		File f = new File("./ficheros/calderon.csv");
		f.createNewFile();
		
		PrintWriter pw = new PrintWriter(f);
		pw.println("nombreSerie,anno,tema");
		for(Serie s : this.mapSeries.values()) {
			pw.println(String.format("%s,%s,%s", s.getNombreSerie(), s.getAnno(), s.getTema()));
			
		}
		
		pw.close();
	}
	
	public void toJson() throws IOException {
		Gson g = new GsonBuilder().setPrettyPrinting().enableComplexMapKeySerialization().create();
		File f = new File("./ficheros/kiukiu.json");
		f.createNewFile();
		
		PrintWriter pw = new PrintWriter(f);
		g.toJson(this.mapSeries.values(),pw);
		
		pw.close();
	}
	
	public void toXML() {
		try {
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			Element nodoRaiz = doc.createElement("Series");
			doc.appendChild(nodoRaiz);
			
			for(Serie s : this.mapSeries.values()) {
				Element primerNodoHijo = doc.createElement("Serie");
				nodoRaiz.appendChild(primerNodoHijo);
				
				Element nombreSerie = doc.createElement("nombreSerie");
				nombreSerie.appendChild(doc.createTextNode(s.getNombreSerie()));
				primerNodoHijo.appendChild(nombreSerie);
				
				Element annio = doc.createElement("annio");
				annio.appendChild(doc.createTextNode(""+s.getAnno()));
				primerNodoHijo.appendChild(annio);
				
				Element tema = doc.createElement("tema");
				tema.appendChild(doc.createTextNode(""+s.getTema()));
				primerNodoHijo.appendChild(tema);
				
				Element temporadas = doc.createElement("Temporadas");
				primerNodoHijo.appendChild(temporadas);
				for(Temporada t : s.getTemporadas()) {
					Element temporada = doc.createElement("temporada");
					temporadas.appendChild(temporada);
					
					Element nombreTemp = doc.createElement("nombreTemporada");
					nombreTemp.appendChild(doc.createTextNode(t.getNombreTemporada()));
					temporada.appendChild(nombreTemp);
					
					Element capitulos = doc.createElement("capitulos");
					capitulos.appendChild(doc.createTextNode(""+t.getNumCapitulos()));
					temporada.appendChild(capitulos);
					
					Element valoracion = doc.createElement("valoracion");
					valoracion.appendChild(doc.createTextNode(""+t.getNotaMedia()));
					temporada.appendChild(valoracion);
				}
			}
			Transformer optimus = TransformerFactory.newInstance().newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("./ficheros/mancity.xml"));
			
			optimus.setOutputProperty(OutputKeys.INDENT, "yes");
			optimus.transform(source, result);
		} catch (ParserConfigurationException | TransformerException | TransformerFactoryConfigurationError e) {
	}
	}
	
	public void cargarCSV(String path) throws IOException, NumberFormatException, SerieException {
		
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String[] array;
		String linea = br.readLine();
		linea = br.readLine();
		
		while(linea != null) {
			array = linea.split(",");
			this.mapSeries.put(array[0], new Serie(array[0],Integer.valueOf(array[1]), Tema.valueOf(array[2])));
			linea = br.readLine();
		}
		
		br.close();
		fr.close();
	}
	
	public void cargarXML(){
		File f = new File("./files/catalogo2.xml");
		
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = builder.parse(f);
			doc.getDocumentElement().normalize();
			
			NodeList listaNodoSerie = doc.getElementsByTagName("serie");
			NodeList listaNodoTemporada = doc.getElementsByTagName("temporada");
			
			for(int i = 0; i < listaNodoSerie.getLength(); i++) {
				Element nodoSerie = (Element) listaNodoSerie.item(i);
				
				String nombre = nodoSerie.getElementsByTagName("nombre").item(0).getTextContent();
				int annio = Integer.valueOf(nodoSerie.getElementsByTagName("annio").item(0).getTextContent());
				Tema tema = Tema.valueOf(nodoSerie.getElementsByTagName("tema").item(0).getTextContent());
				
				Serie e = new Serie(nombre,annio,tema);
				
				for(int o = 0; o < listaNodoTemporada.getLength() ; o ++) {
					Element nodoTemporada = (Element) listaNodoTemporada.item(o);
					String nombreTemp = nodoTemporada.getElementsByTagName("nombre").item(0).getTextContent();
					
					e.annadirTemporada(nombreTemp);			
				}
				
				this.mapSeries.put(nombre, e);
			}

		} catch (ParserConfigurationException | SAXException | IOException | SerieException e) {
			
		}
		
	}
	
	public String listadoOrdenadoSeriesDeUnTema(Tema tema) throws SerieException {
		StringBuilder sb = new StringBuilder();
		List<Serie> listilla = new ArrayList<>();
		
		for(Serie s : this.mapSeries.values()) {
			listilla.add(s);
		}
		Collections.sort(listilla, new ComparatorAnnioSerie());
		for(Serie s : listilla) {
			if(s.getTema().equals(tema)) {
				sb.append(s).append(System.lineSeparator());
			}
		}
		
		if(sb.isEmpty()) {
			throw new SerieException("No hay series de ese tema");
		}
		
		return sb.toString();
	}
	
	
}
