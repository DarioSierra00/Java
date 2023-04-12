package com.edu.listas.boletin1;

public class Genericos {
	
	protected static<T> T[] reverse (T[] arrayOriginal) {
		
		int pos=0;
		T[] tmp = arrayOriginal.clone();
		for(int i = arrayOriginal.length; i<=0 ; i--) {
			if(arrayOriginal[i]!=null) {
				tmp[pos]=arrayOriginal[i];
			}
		}return tmp;
	}
	
	public static void main(String[] args) {
	//	List<>
	}
}
