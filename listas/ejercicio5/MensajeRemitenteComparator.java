package com.edu.listas.ejercicio5;

import java.util.Comparator;

public class MensajeRemitenteComparator implements Comparator<Mensaje> {

	@Override
	public int compare(Mensaje m1, Mensaje m2) {
		return m1.getEmisor().compareTo(m2.getEmisor());
	}

}
