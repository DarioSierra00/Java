package com.edu.practicaMock.publicacion;

import java.util.Comparator;

public class ValoracionYfechaCreacionComparable implements Comparator<Publicacion>{
	
	@Override
	public int compare(Publicacion o1, Publicacion o2) {
		int resultado = 0;
		
		if(o1!=null && o2!=null) {
			resultado = o1.getValoracion()==o2.getValoracion()?
					o1.getFechaCreacion().compareTo(o2.getFechaCreacion()):
						o1.getValoracion()-o2.getValoracion();
		}else if(o1==null) {
			resultado = 1;
		}
		else if(o2==null) {
			resultado = -1;
		}
		return resultado;
	}

	
}
