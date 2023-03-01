package com.edu.producto.model;

public class Producto {
	
	public Producto() {}
	
	public Producto(String codigo, String descripcion, double precioSinIva) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioSinIva = precioSinIva;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioSinIva() {
		return precioSinIva;
	}
	public void setPrecioSinIva(double precioSinIva) {
		this.precioSinIva = precioSinIva;
	}
	public String getConsulta() {
		String resultado = "El codigo del producto es "+ this.codigo + ", su precioSinIva es "+ this.precioSinIva + " y su descripcion: "+ this.descripcion;
		return resultado;
	}
	
	private String codigo;
	private String descripcion;
	private double precioSinIva;
}
