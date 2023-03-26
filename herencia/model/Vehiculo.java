package com.edu.herencia.model;

public class Vehiculo {
	protected String marca;
	protected String modelo;
    protected int año;
    
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getAño() {
        return año;
    }
    
    public String arrancar() {
        return "El vehículo está arrancando.";
    }
    
    public String detener() {
        return "El vehículo se está deteniendo.";
    }
}
