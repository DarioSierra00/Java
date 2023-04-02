package com.edu.blocNotas;

import java.time.LocalDateTime;

import com.edu.blocNotas.bloc.Bloc;
import com.edu.blocNotas.bloc.BlocException;
import com.edu.blocNotas.notas.Nota;
import com.edu.blocNotas.notas.NotaAlarma;
import com.edu.blocNotas.notas.NotaAlarmaException;

public class Main {

	public static void main(String[] args) throws NotaAlarmaException, BlocException {
		
		Nota nota1 = new Nota("Tomar sol");
		Nota nota2 = new Nota("Tender");
		
		Nota notaWAlarma = new NotaAlarma("En un rato", LocalDateTime.now(), true);
		
		Bloc sol = new Bloc("Solecito");
		
		sol.addNota(nota1);
		sol.addNota(notaWAlarma);
		
		System.out.println(nota1);
		System.out.println(nota2);
		System.out.println(nota1.isModificado());
		System.out.println("");
		System.out.println(notaWAlarma);
	}

}
