package com.edu.sieteYmedia.model;

public class Carta {
	private Palo palo;
	private int numero;
	
	public Carta(Palo palo, int numero) throws Exception {
		super();
		if(numero<1 || numero>12 || numero ==8 || numero==9) {
			throw new Exception("Valor no válido: ");
		}
		this.palo = palo;
		this.numero = numero;
	}
	
	public double getValor() {
		return this.numero > 9 ? 0.5: this.numero;
	}
	
	public Palo getPalo() {
		return this.palo;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (this == obj)
			 resultado = true;
		if (obj == null)
			 resultado = false;
		if (getClass() != obj.getClass())
			 resultado = false;
		Carta other = (Carta) obj;
		return resultado && numero == other.numero && palo == other.palo;
	}

	@Override
	public String toString() {
		return String.format("%s de %s", this.numero,this.palo.toString().toLowerCase());
	}

	public int compareTo(Carta o) {
		return this.numero-o.numero;
	}
}
