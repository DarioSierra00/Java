package com.edu.mockx2;

import java.io.IOException;
import java.util.Scanner;

import com.edu.mockx2.model.Serie;
import com.edu.mockx2.model.SerieException;
import com.edu.mockx2.model.Catalogo;
import com.edu.mockx2.model.Tema;


public class Main {

		
	
	public static void main(String[] args) {
		
		Catalogo series = new Catalogo();
		/*try {
			series.annadirSerie("This is us", 2015, Tema.DRAMA);
			series.annadirSerie("Friends", 1990, Tema.COMEDIA);
			series.annadirSerie("Dallas", 1970, Tema.CIENCIAFICCION);
			series.annadirTemporada("This is us", "Empezamos");
			series.annadirTemporada("This is us", "Seguimos");
			series.annadirTemporada("This is us", "Finalizamos");
			series.annadirCapituloTemporada("This is us", "Empezamos", "La familia");
			series.annadirCapituloTemporada("This is us", "Empezamos", "El problema");
			series.annadirCapituloTemporada("This is us", "Empezamos", "Los niños");
			series.annadirCapituloTemporada("This is us", "Empezamos", "CAsi el final");
			series.annadirCapituloTemporada("This is us", "Empezamos", "El final");
			
			System.out.println(series.listadoOrdenadoSeriesDeUnTema(Tema.DRAMA));
			series.toCsv();
			series.toJson();
			series.toXML();
			
		} catch (SerieException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try {
			series.cargarCSV("./ficheros/calderon.csv");
			
			
		} catch (NumberFormatException | IOException | SerieException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	
}
