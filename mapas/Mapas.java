package com.edu.mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Mapas {
	
	public static void main(String[] args) {
		
		Map<String, Collection<String>> animalesPorCategoria = new HashMap<>();
		
		animalesPorCategoria.put("Mamíferos", new HashSet<>());
		animalesPorCategoria.get("Mamíferos").add("León");
		animalesPorCategoria.get("Mamíferos").add("Tigre");
		
		animalesPorCategoria.put("Reptiles", new ArrayList<>());
		animalesPorCategoria.get("Mamíferos").remove("Titanoboa");
		animalesPorCategoria.get("Reptiles").add("Caimán");
		
		System.out.println(animalesPorCategoria.get("Reptiles"));
		System.out.println(animalesPorCategoria.get("Mamíferos"));
	}
}
