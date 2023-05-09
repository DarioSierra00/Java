package com.edu.listas.ejercicio5;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class Persona implements Comparable<Persona> {
	
	
	private static final int MAYORIA_EDAD = 18;
	private LocalDate fechaNacimiento;
	private String username;
	private List<Mensaje> buzon;
	
	public Persona(String username, LocalDate fechaNacimiento) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.username = username;
		this.buzon = new ArrayList<>();
	}

	
	private int getEdad() {
		return (int) ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
	}
	
	protected boolean esMayorEdad() {
		return getEdad() > MAYORIA_EDAD;
	}

	public String mostrarMensajes() {
		Collections.sort(buzon);
		return imprimirBuzon(buzon);
	}
	
	public String mostrarMensajesPorRemitente() {
		Collections.sort(buzon, new MensajeRemitenteComparator());
		return imprimirBuzon(buzon);		
	}


	private String imprimirBuzon(Collection<Mensaje> aImprimir) {
		StringBuilder sb = new StringBuilder();
		for(Mensaje m : aImprimir) {
			sb.append(m).append(System.lineSeparator());
		}
		return sb.toString();
	}
	
	public String buscarMensajePorContenido(String texto) {
		List<Mensaje> filtrado = new ArrayList<>();
		for(Mensaje m : buzon) {
			if(m.contieneTexto(texto)) {
				filtrado.add(m);
			}
		}
		return imprimirBuzon(filtrado);
		
	}
	
	
	public void enviarMensaje(Persona destinatario, String texto) throws DestinatarioNoValidoException {
		Mensaje m = new Mensaje(this, destinatario, texto, LocalDateTime.now());
		destinatario.recibirMensaje(m);
	}
	
	abstract public void enviarMensaje(Persona destinatario, Mensaje mensaje) throws DestinatarioNoValidoException;
	
	public void recibirMensaje(Mensaje mensaje) {
		this.buzon.add(mensaje);
	}
	
	public String toString() {
		return username;
	}
	
	public int compareTo(Persona p) {
		return username.compareTo(p.username);
	}
	
}
