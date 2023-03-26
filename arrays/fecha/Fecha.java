package com.edu.arrays.fecha;

public class Fecha {
	
	private int dia;
	private int mes;
	private int annio;
	
	public Fecha(int dia, int mes, int annio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.annio = annio;
	}
	
	public static String meses(int numMes) {
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		String resultado = "-1";
		if(numMes>=1 && numMes<=12) {
			resultado = meses[numMes-1];
		}
		return resultado;
	}
	
	public static int diasDeUnMes(int mes) {
		int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
		int resultado = -1;
		if(mes>=1 && mes<=12) {
			resultado = diasMes[mes-1];
		}
		return resultado;
	}

	@Override
	public String toString() {
		String resultado = "No es una fecha válida";
		if(!(meses(mes).equals("-1")) && diasDeUnMes(mes) >= dia) {
			resultado = "La fecha en formato largo es "+ dia +" de " +  meses(mes) + " de " +annio;
		}
		return resultado;
	}
	
	
}
