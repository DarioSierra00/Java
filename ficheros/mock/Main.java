package com.edu.ficheros.mock;

import java.io.IOException;

import com.edu.ficheros.mock.model.Catalogo;
import com.edu.ficheros.mock.model.Serie;
import com.edu.ficheros.mock.model.SerieException;
import com.edu.ficheros.mock.model.Tema;
import com.edu.ficheros.mock.model.Temporada;

public class Main {

	public static void main(String[] args) {
		
		Catalogo c = new Catalogo();
		Temporada t = new Temporada("Monaguillo");
		
		t.annadirCapitulo("Pelea con el cura");
		t.annadirCapitulo("El cura");
		
		try {
			System.out.println(t.primerCapituloQueContieneEstaPalabra("cura"));
			t.anniadirCapituloDespues("El monaguillo se apunta al gimnasio", "El cura");
			System.out.println(t.getCapitulos());
			System.out.println(t.primerCapituloQueContieneEstaPalabra("gim"));
			
		} catch (SerieException e2) {
			e2.printStackTrace();
		}
		try {
			Serie s = new Serie("Yepa", 2000, Tema.DRAMA);
			s.annadirTemporada("Eldia");
			s.annadirTemporada("OO");
			s.annadirCapituloTemporada("Eldia", "Fundador");
			//s.valorarTemporada("Eldia", 5);
			System.out.println(s.listadoTemporadasPorNotaMedia());
			System.out.println(s.listadoTemporadasPorNumeroDeCapitulos());
			s.escribirEnTemporada();
		} catch (SerieException | IOException e1) {
			e1.printStackTrace();
		}
		try {
			c.annadirSerie("Locotrone", 1990, Tema.COMEDIA);
			c.annadirTemporada("Locotrone", "1");
			c.annadirTemporada("Locotrone", "2");
			c.annadirCapituloTemporada("Locotrone", "1", "Fumando verdes");
			c.annadirSerie("Figaro", 1992, Tema.INTRIGA);
			c.annadirTemporada("Figaro", "1");
			c.annadirCapituloTemporada("Figaro", "1", "Figaro Figaro fiii");
			c.annadirSerie("Hey Hey", 1992, Tema.COMEDIA);
			c.annadirTemporada("Hey Hey", "1");
			c.annadirCapituloTemporada("Hey Hey", "1", "Yegiar");
			
			System.out.println(c.listadoOrdenadoSeriesDeUnTema(Tema.COMEDIA));
			System.out.println(c.numeroDeTemporadasDeUnaSerie("Locotrone"));
			c.modificarTema("Figaro", Tema.DRAMA);
			System.out.println(c.listadoOrdenadoSeriesDeUnTema(Tema.DRAMA));
		} catch (SerieException e) {
			e.printStackTrace();
		}
		
		try {
			c.escribirEnSerie();
			c.escribirEnCapitulos();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
