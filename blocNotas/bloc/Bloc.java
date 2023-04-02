package com.edu.blocNotas.bloc;

import java.util.Arrays;
import java.util.Objects;

import com.edu.blocNotas.notas.Nota;
import com.edu.blocNotas.notas.NotaAlarma;

public class Bloc {
	
	private static final int NUMERO_NOTAS_MAXIMA=10;
	private int numNotas;
	private String nombre;
	private Nota[] nota = new Nota[NUMERO_NOTAS_MAXIMA];
	
	
	public Bloc(String nombre) {
		super();
		this.nombre = nombre;
	}


	public void addNota(String texto) throws BlocException {
		if(numNotas==NUMERO_NOTAS_MAXIMA) {
			throw new BlocException("No caben más alarmas, borra una");
		}
		else {
			this.nota[numNotas++] = new Nota(texto);
			
		}
	}
	
	public void addNota(Nota alarma) throws BlocException {
		if(numNotas==NUMERO_NOTAS_MAXIMA) {
			throw new BlocException("No caben más alarmas, borra una");
		}
		else {
			this.nota[numNotas++] = alarma;
		}
	}
	
	public static int getNumeroNotasMaxima() {
		return NUMERO_NOTAS_MAXIMA;
	}


	public String getNombre() {
		return nombre;
	}


	public String getNota(int codigo) {
		String nota = "";
		if(encontrarNota(codigo)!=null) {
			nota = encontrarNota(codigo).toString();
		}
		
		return nota;
	}
	
	public void updateNota(int codigo, String texto) {
		Nota nota = null;
		if(encontrarNota(codigo)!=null) {
			nota = encontrarNota(codigo);
			nota.setTexto(texto);
		}
	}
	
	public Nota encontrarNota(int codigo) {
		Nota nota = null;
		
		for(int i = 0; i<NUMERO_NOTAS_MAXIMA; i++) {
			if(this.nota!=null && this.nota[i].getCodigo()==codigo){
				nota = this.nota[i];
			}
		}return nota;
	}
	
	public void activa(int codigo) {
		for(Nota n: this.nota) {
			if(n!=null && n.getCodigo()==codigo && n instanceof NotaAlarma) {
				NotaAlarma notaAlarma = (NotaAlarma) n;
				notaAlarma.activar();
			}
		}
	}
	
	public void desactiva(int codigo) {
		for(Nota n: this.nota) {
			if(n!=null && n.getCodigo()==codigo && n instanceof NotaAlarma) {
				NotaAlarma notaAlarma = (NotaAlarma) n;
				notaAlarma.desactivar();
			}
		}
	}
	
	public Nota[] blocSinNull() {
		int tamannio = 0;
		
		for(Nota n: this.nota) {
			if(n != null) {
				tamannio ++;
			}
		}
		
		Nota[] tmp = new Nota[tamannio];
		int pos = 0;
		
		
		for(Nota n: this.nota) {
			if(n != null) {
				tmp[pos++] = n;
			}
		}
		
		return tmp;
	}
	
	public String ordenaBloc() {
		Nota[] nota = blocSinNull();
		Arrays.sort(nota);
		return Arrays.toString(this.nota);
	}


	@Override
	public int hashCode() {
		return Objects.hash(nombre);
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
		Bloc other = (Bloc) obj;
		return resultado && Objects.equals(nombre, other.nombre) && Arrays.equals(nota, other.nota) && numNotas == other.numNotas;
	}
	
	public String toString() {
		return Arrays.toString(this.nota);
	}
	
	
}
