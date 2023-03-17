package com.edu.enumerados.model;

public class ArrayUtils {

	public static String arrayToString(Object[] objects) {
		StringBuilder sb = new StringBuilder();
		for(Object o : objects) {
			sb.append(o!=null?o: "").append(System.lineSeparator());
		}
		return sb.toString();
	}
	
}

