package com.edu.avion;

public class Avion {
	public Avion(String idAvion, int capacidad, int numVuelos, double kmVolados, String compannia) {
		super();
		this.idAvion = idAvion;
		this.capacidad = capacidad;
		this.numVuelos = numVuelos;
		this.kmVolados = kmVolados;
		this.compannia = compannia;
	}
	public Avion(String idAvion, String compannia, int capacidad) {
		super();
		this.idAvion = idAvion;
		this.compannia = compannia;
		this.capacidad = capacidad;
	}
	public Avion(String idAvion, int capacidad) {
		super();
		this.idAvion = idAvion;
		this.capacidad = capacidad;
	}
	
	public String getIdAvion() {
		return idAvion;
	}
	public void setIdAvion(String idAvion) {
		this.idAvion = idAvion;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getNumVuelos() {
		return numVuelos;
	}
	public void setNumVuelos(int numVuelos) {
		this.numVuelos = numVuelos;
	}
	public double getKmVolados() {
		return kmVolados;
	}
	public void setKmVolados(double kmVolados) {
		this.kmVolados = kmVolados;
	}
	public String getCompannia() {
		return compannia;
	}
	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}
	public double getTotalKm() {
		return kmVolados;
	}
	public double getMediaKm() {
		return kmVolados/numVuelos;
	}
	public boolean asignarVuelo(int capacidad, int kmVolados) {
		if (capacidad <= this.capacidad && kmVolados > 0) {
			this.numVuelos++;
			this.kmVolados+=kmVolados;
		}
		return (capacidad <= this.capacidad && kmVolados > 0);
	}
	
	
	
	
	
	private String idAvion;
	private int capacidad;
	private int numVuelos = 0;
	private double kmVolados = 0;
	private String compannia;
}
