package com.edu.blocNotas.notas;

import java.time.LocalDateTime;

public class NotaAlarma extends Nota implements Activable{

	private LocalDateTime fechaAlarma;
	private static final int MINUTOS_REPETIR_POR_DEFECTO =5;
	private int minutosRepetir;
	private boolean activado;
	
	public NotaAlarma(String texto, LocalDateTime fechaAlarma, boolean activado) throws NotaAlarmaException {
		super(texto);
		if(fechaAlarma != null && texto!=null) {
			this.fechaAlarma = fechaAlarma;
			this.activado = activado;
		}
		else {
			throw new NotaAlarmaException("No puedes introducir valores nulos");
		}
	}
	
	public NotaAlarma(String texto, LocalDateTime fechaAlarma, int minutosRepetir) {
		super(texto);
		this.fechaAlarma = fechaAlarma;
		this.minutosRepetir = MINUTOS_REPETIR_POR_DEFECTO;
	}
	
	private void setFechaAlarma(LocalDateTime fecha) {
		this.fechaAlarma = fecha;
	}

	public static int getMinutosRepetirPorDefecto() {
		return MINUTOS_REPETIR_POR_DEFECTO;
	}
	
	public void activar() {
		this.activado = true;
	}
	
	public void desactivar() {
		this.activado = false;
	}

	public boolean isActivado() {
		return this.activado;
	}

	@Override
	public String toString() {
		return String.format("Nota con fecha alarma: %s\n"
							+ "se repite cada %s\n"
							+ "y esta activada: %s", this.fechaAlarma, this.minutosRepetir, this.activado);
	}
	
	
}	
