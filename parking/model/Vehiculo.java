package com.edu.parking.model;

import java.time.LocalDate;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String matricula;
	private Combustible tipoCombustible;
	private LocalDate fecha;
	private TipoVehiculo TipoVehiculo;
	private final int LONGITUD_MAXIMA_MATRICULA = 8;
	
	
	public Vehiculo(String marca, String modelo, String matricula, Combustible tipoCombustible, LocalDate fecha,
			TipoVehiculo tipoVehiculo) {
		super();
		if(esMatriculaValida(matricula)) {
			this.marca = marca;
			this.modelo = modelo;
			this.matricula = matricula;
			this.tipoCombustible = tipoCombustible;
			this.fecha = fecha;
			this.TipoVehiculo = tipoVehiculo;
		}
		
	}
	
	
	public String getMatricula() {
		return this.matricula;
	}


	public String getMarca() {
		return this.marca;
	}


	public String getModelo() {
		return this.modelo;
	}

	public TipoVehiculo getTipoVehiculo() {
		return this.TipoVehiculo;
	}


	public Combustible getTipoCombustible() {
		return this.tipoCombustible;
	}


	public boolean esMatriculaValida(String matricula) {
		boolean esValida = false;
		int cont = 0;
		if(matricula.length()<=LONGITUD_MAXIMA_MATRICULA) {
			for (int i = 0; i <matricula.length(); i++) {
				if(Character.isDigit(matricula.charAt(i))) {
					cont++;
				}
			}if(cont==4) {
				esValida=true;
			}
		}return esValida;
	}
	
	public int compareTo(Vehiculo v) {
		int compare=2;
		if(v!=null) {
			compare=this.fecha.compareTo(v.fecha);
		}
		return compare;
	}


	@Override
	public String toString() {
		return "Vehiculo con marca " + marca + ", modelo " + modelo + ", con matricula " + matricula + ", un tipoCombustible "
				+ tipoCombustible + ", fecha " + fecha + ", y su TipoVehiculo " + TipoVehiculo;
	}
	
	
	
}
