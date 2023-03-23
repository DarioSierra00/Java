package com.edu.sieteYmedia;

import java.util.Scanner;

import com.edu.sieteYmedia.model.Baraja;
import com.edu.sieteYmedia.model.Carta;
import com.edu.sieteYmedia.model.Palo;

public class Main {

	public static void main(String[] args) throws Exception {
		String respuesta;
		double jugador= 0; 
		double banca= 0;
		
		Scanner sc = new Scanner(System.in);
		Carta carta;
		try {
			carta = new Carta(Palo.BASTOS, 7);
			System.out.println(carta);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		Baraja b = new Baraja();
		System.out.println(b);
		b.Barajar();
		System.out.println(b);
		
		
		System.out.println("Quieres una carta? ");
		respuesta = sc.nextLine().toLowerCase();
		
		while(respuesta.equals("si")) {
			jugador += b.getSiguiente().getValor();
			System.out.println(jugador);
			System.out.println("Quieres plantarte? ");
			respuesta = sc.nextLine().toLowerCase();
			if(respuesta.equals("claro")) {
				System.out.println(jugador);
			}while(respuesta.equals("no")){
				jugador += b.getSiguiente().getValor();
				System.out.println(jugador);
				System.out.println("Quieres plantarte? ");
				respuesta = sc.nextLine().toLowerCase();
			}
		}
		
		System.out.println("Quieres una carta? ");
		respuesta = sc.nextLine();
		
		while(respuesta.equals("si")) {
			banca += b.getSiguiente().getValor();
			System.out.println(banca);
			System.out.println("Quieres plantarte? ");
			respuesta = sc.nextLine().toLowerCase();
			if(respuesta.equals("claro")) {
				System.out.println(banca);
			}while(respuesta.equals("no")){
				banca += b.getSiguiente().getValor();
				System.out.println(banca);
				System.out.println("Quieres plantarte? ");
				respuesta = sc.nextLine().toLowerCase();
			}
	}if(jugador<=7.5 && banca<=7.5) {
		if(jugador>banca) {
			System.out.println("Gana el jugador.");
		}else if(jugador<banca) {
			System.out.println("Gana la banca.");
		}else if(jugador==banca) {
			System.out.println("Empate.");
		}
	}else if(jugador>7.5) {
		System.out.println("Te has pasado, Jugador. Gana la banca.");
	}else if(banca>7.5) {
		System.out.println("Te has pasado, Banca. Gana el jugador.");
	}

}
}
