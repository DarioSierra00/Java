package com.edu.enumerados;


import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

import com.edu.enumerados.model.ArrayUtils;
import com.edu.enumerados.model.Genero;
import com.edu.enumerados.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate fechaNacimiento = LocalDate.of(2020, 3, 3);
		
		LocalTime momento = LocalTime.of(15, 20, 45);
		momento = momento.plusSeconds(3600);
		System.out.println(momento.plusSeconds(3600).getHour());
		LocalDateTime diaYHoraNacimiento = LocalDateTime.of(fechaNacimiento, momento);
		do {
			try {
				System.out.println("Introduce el año: ");
				int annyo = Integer.valueOf(sc.nextLine());
				System.out.println("Introduce el mes: ");
				int mes = Integer.valueOf(sc.nextLine());
				System.out.println("Introduce el dia: ");
				int dia = Integer.valueOf(sc.nextLine());
				fechaNacimiento = LocalDate.of(annyo, mes, dia);
			} catch (Exception e) {
				System.out.println("Fecha incorrecta");
			}
		}while(fechaNacimiento == null);
		
		
		Genero generoIntroducido = null;
		do {
			try {
				System.out.println("Introduzca el genero: ");
				String generoComoString = new Scanner(System.in).nextLine();
				generoIntroducido = Genero.valueOf(generoComoString.toUpperCase());
				
			}catch(Exception e) {
				System.out.println("El valor introducido no es correcto.. HOMBRE/MUJER");
			}
		}while(generoIntroducido==null);
		
	//	Persona p = new Persona(generoIntroducido, "Cristiano", "Ronaldo", LocalDate.now());
		Persona antonio = new Persona(Genero.HOMBRE, "Antonio", "Sánchez", fechaNacimiento);
		Persona juan = new Persona(Genero.HOMBRE, "Juan", "Sánchez", fechaNacimiento);
		Persona currito = new Persona(Genero.MUJER, "Currito", "Sánchez", fechaNacimiento);
		
		Persona[] grupo = new Persona[3];
		grupo[0]=antonio;
		grupo[1]=juan;
		grupo[2]=currito;
		
		System.out.println(Arrays.toString(grupo));
		System.out.println("------------------");
		Arrays.sort(grupo);
		
		System.out.println(Arrays.toString(grupo));
	}

}
