package com.edu.calculos.model;

public class Complejo {

	public Complejo() {
	}
	public Complejo(double parteReal, double parteImaginaria) {
		super();
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}
	public double getParteReal() {
		return parteReal;
	}
	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}
	public double getParteImaginaria() {
		return parteImaginaria;
	}
	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}
	public Complejo suma(Complejo c) {
		Complejo newC = new Complejo();
		newC.parteReal= parteReal + c.parteReal;
		newC.parteImaginaria= parteImaginaria + c.parteImaginaria;
		return newC;
	}
	public Complejo resta(Complejo c) {
		Complejo newC = new Complejo();
		newC.parteReal= parteReal - c.parteReal;
		newC.parteImaginaria= parteImaginaria - c.parteImaginaria;
		return newC;
	}
	
	@Override
	public String toString() {
		String resultado = "";
		if(parteImaginaria >= 0) {
			resultado = parteImaginaria + " + " + parteImaginaria + " *i";
		}else {
			resultado = parteReal + " - " + parteReal + " *i";
		}
		return resultado;
	}
	





	private double parteReal;
	private double parteImaginaria;
}
