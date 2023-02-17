package com.edu.cuentaCorriente.model;

public class CuentaCorriente {
	
	

	public CuentaCorriente() {}

	public CuentaCorriente(double saldo, int reintegro, int ingresos) {
		super();
		this.saldo = saldo;
		this.reintegro = reintegro;
		this.ingresos = ingresos;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getReintegro() {
		return reintegro;
	}
	public void setReintegro(int reintegro) {
		this.reintegro = reintegro;
	}
	public int getIngresos() {
		return ingresos;
	}
	public void setIngresos(int ingresos) {
		this.ingresos = ingresos;
	}
	public double realizarReintegro(double reintegro, double saldo) {
		if (reintegro>0 && saldo > 0) {
			saldo -=reintegro;
			this.reintegro++;
		}return saldo;
	}
	public double realizarIngreso(double ingresos, double saldo) {
		if (ingresos>0 && saldo > 0) {
			saldo +=ingresos;
			this.ingresos++;
		}return saldo;
	}
	
	
	private double saldo;
	private int reintegro;
	private int ingresos;
}
