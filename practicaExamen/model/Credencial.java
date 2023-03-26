package com.edu.practicaExamen.model;

import java.util.Objects;

public class Credencial {
	
	private String username;
	private String password;
	private static int secuencia = 100;
	
	private static final int LONGITUD_PASS_SEGURA = 8; 
	
	public Credencial(String nombre, String apellidos, String password) {
		if(nombre!=null && nombre.length()>2 && apellidos!=null && apellidos.length()>2) {
			this.username= nombre.substring(0,3).toLowerCase()+apellidos.substring(0,3).toLowerCase()+secuencia;
		}
		this.password = password;
		this.secuencia++;
	}
	
	public boolean comprobarPassword(String password) {
		return password!=null && !password.isEmpty() && password.equals(this.password);
	}
	
	public String getUsername() {
		return username;
	}
	
	public boolean esPasswordSegura() {
		boolean hayDigito = false;
		boolean hayMayus = false;
		
		if(password.length()>=LONGITUD_PASS_SEGURA) {
			for(int i=0; i < this.password.length(); i++) {
				if(Character.isDigit(this.password.charAt(i))) {
					hayDigito = true;
				}else if(Character.isUpperCase(this.password.charAt(i))) {
					hayMayus = true;
				}
			}
		}return hayDigito && hayMayus;
	}
	
	
	public void setPassword(String newpass) {
		this.password = newpass;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(username);
		sb.append(" y contraseña ");
		
		for(int i=0; i<password.length(); i++) {
			sb.append("*");
		}
		
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Credencial) {
			Credencial casteado = (Credencial) obj;
			sonIguales = Objects.equals(this.username, casteado.username);
		}
		
		return sonIguales;
	}
}
