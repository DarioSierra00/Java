package com.edu.ficheros.mock.model;

import java.util.Comparator;

public class ComparatorPorAnnioSerie implements Comparator<Serie>{

	@Override
	public int compare(Serie o1, Serie o2) {
		return o2.getAnno()-o1.getAnno();
	}
	
}
