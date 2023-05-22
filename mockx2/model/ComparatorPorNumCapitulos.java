package com.edu.mockx2.model;

import java.util.Comparator;

public class ComparatorPorNumCapitulos implements Comparator<Temporada>{

	@Override
	public int compare(Temporada o1, Temporada o2) {
		return o2.getNumCapitulos()-o1.getNumCapitulos();
	}

}
