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
	public void realizarReintegro(int retirar) {
		if (retirar <= this.saldo && retirar > 0) {
			this.saldo -=retirar;
			this.reintegro++;
		}
	}
	public void realizarIngreso(int ingresar) {
		if (ingresar>0) {
			this.saldo +=ingresar;
			this.ingresos++;
		}
	}
	
	
	private double saldo;
	private int reintegro;
	private int ingresos;
}
