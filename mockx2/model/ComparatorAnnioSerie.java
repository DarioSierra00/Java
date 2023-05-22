package com.edu.mockx2.model;

import java.util.Comparator;

public class ComparatorAnnioSerie implements Comparator<Serie>{

	@Override
	public int compare(Serie o1, Serie o2) {
		return o2.getAnno()-o1.getAnno();
	}

}
