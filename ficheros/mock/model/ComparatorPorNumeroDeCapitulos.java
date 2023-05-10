package com.edu.ficheros.mock.model;

import java.util.Comparator;

public class ComparatorPorNumeroDeCapitulos implements Comparator<Temporada>{

	@Override
	public int compare(Temporada t, Temporada t1) {
		return t.getCapitulos()-t1.getCapitulos();
	}
	
}
