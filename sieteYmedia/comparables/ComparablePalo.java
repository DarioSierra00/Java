package com.edu.sieteYmedia.comparables;

import java.util.Comparator;

import com.edu.sieteYmedia.model.Carta;

public class ComparablePalo implements Comparator<Carta>{
	
	public ComparablePalo() {
	}

	@Override
	public int compare(Carta o1, Carta o2) {
		int resultado = 0;
		if(o1 != null && o2 != null) {
			resultado = o1.getPalo().toString().compareTo(o2.getPalo().toString());
		}else if(o2 == null){
			resultado = -1;
		}else if(o1 == null) {
			resultado = 1;
		}
		return resultado;
	}

	
}
