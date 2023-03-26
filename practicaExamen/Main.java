package com.edu.practicaExamen;

import com.edu.practicaExamen.model.Usuario;

public class Main {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("Ernesto", "Sánchez", "12345678A");
		System.out.println(usuario1);
		usuario1.hacerLogin("ernsán100", "12345678A");
		usuario1.hacerLogin("ernsán100", "12345678A");
		usuario1.hacerLogin("ernsán100", "12345678A");
		
		System.out.println(usuario1);
		
		
		
		Usuario usuario2 = new Usuario("Ernesto", "López", "123456789");
		Usuario usuario3 = new Usuario("Ernesto", "González", "123456");
		
		System.out.println(usuario1.esPasswordSegura());
		System.out.println(usuario2.esPasswordSegura());
		System.out.println(usuario2.esCuentaBloqueada());
		System.out.println(usuario3.getUsername());
		System.out.println(); 
		
		
		
		Usuario[] usuarios = new Usuario[10];
		usuarios[0]= usuario1;
		usuarios[1]= usuario2;
		usuarios[2]= usuario3;
		
		
		System.out.println("Lista de usuarios: ");
		for(Usuario u : usuarios) {
			if(u!=null) {
				System.out.println(u);
			}
		}
		
		String login = "erngon102";
		
		for(Usuario u: usuarios) {
			if(u!=null && u.getUsername().equals(login)) {
				System.out.println("Usuario encontrado: ");
				System.out.println(u);
			}
		}

	}

}
