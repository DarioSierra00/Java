package com.edu.maquinaCafe.model;

public class MaquinaCafe {
	
	public MaquinaCafe() {
	}

	private static final int CAFE = 1;
	private static final double LECHE = 0.8;
	private static final double CAFELECHE = 1.5;


	public MaquinaCafe(int depositoCafe, int depositoLeche, int depositoVaso, double monedero) {
		super();
		this.depositoCafe = depositoCafe;
		this.depositoLeche = depositoLeche;
		this.depositoVaso = depositoVaso;
		this.monedero = monedero;
	}
	public int getDepositoCafe() {
		return depositoCafe;
	}
	public void setDepositoCafe(int depositoCafe) {
		this.depositoCafe = depositoCafe;
	}
	public int getDepositoLeche() {
		return depositoLeche;
	}
	public void setDepositoLeche(int depositoLeche) {
		this.depositoLeche = depositoLeche;
	}
	public int getDepositoVaso() {
		return depositoVaso;
	}
	public void setDepositoVaso(int depositoVaso) {
		this.depositoVaso = depositoVaso;
	}
	public double getMonedero() {
		return monedero;
	}
	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}
	public void llenarDeposito() {
		this.depositoVaso = 80;
		this.depositoCafe = 50;
		this.depositoLeche = 50;
	}
	public String servirCafe(double dinero) {
		String resultado = "";
		if(dinero > this.monedero) {
			resultado = "Error, no disponemos de cambio para esa cantidad.";
		}else if(dinero < 1) {
			resultado = "Error, la cantidad introducida es menor que el precio del café.";
		}else if(this.depositoCafe < 1) {
			resultado = "Error, nos hemos quedado sin café.";
		}else {
			this.depositoCafe --;
			this.depositoVaso --;
			this.monedero += CAFE;
			if(dinero-CAFE == 0) {
				resultado = "Producto servido.";
			}else {
				resultado = "Producto servido, aquí tiene su cambio de: " + (dinero-CAFE);
			}
		}
		return resultado;
	}
	public String servirLeche(double dinero) {
		String resultado = "";
		if(dinero > this.monedero) {
			resultado = "Error, no disponemos de cambio para esa cantidad.";
		}else if(dinero < 1) {
			resultado = "Error, la cantidad introducida es menor que el precio del café.";
		}else if(this.depositoLeche < 1) {
			resultado = "Error, nos hemos quedado sin leche.";
		}else {
			this.depositoLeche --;
			this.depositoVaso --;
			this.monedero += LECHE;
			if(dinero-LECHE == 0) {
				resultado = "Producto servido.";
			}else {
				resultado = "Producto servido, aquí tiene su cambio de: " + (dinero-LECHE);
			}
		}
		return resultado;
	}
	public String servirCafeLeche(double dinero) {
		String resultado = "";
		if(dinero > this.monedero) {
			resultado = "Error, no disponemos de cambio para esa cantidad.";
		}else if(dinero < 1) {
			resultado = "Error, la cantidad introducida es menor que el precio del café.";
		}else if(this.depositoCafe < 1) {
			resultado = "Error, nos hemos quedado sin café.";
		}else if(this.depositoLeche < 1) {
			resultado = "Error, nos hemos quedado sin leche.";
		}else if(this.depositoVaso < 1) {
			resultado = "Error, nos hemos quedado sin vasos.";
		}
		else {
			this.depositoLeche --;
			this.depositoVaso --;
			this.monedero += CAFELECHE;
			if(dinero-CAFELECHE == 0) {
				resultado = "Producto servido.";
			}else {
				resultado = "Producto servido, aquí tiene su cambio de: " + (dinero-CAFELECHE);
			}
		}
		return resultado;
	}
	public String getEstado() {
		String resultado = "Quedan " + this.depositoCafe +" de cafe "+ ", "+ this.depositoLeche+ " de leche y "+ this.depositoVaso + " de vasos";
		return resultado;
	}
	
	private int depositoCafe;
	private int depositoLeche;
	private int depositoVaso;
	private double monedero;
	
	
}
