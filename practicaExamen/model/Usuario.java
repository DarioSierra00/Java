package com.edu.practicaExamen.model;

import java.util.Objects;

public class Usuario {
	private String nombre;
	private String apellidos;
	private String email;
	private int intentos;
	private Credencial credencial;
	
	private static final int NUMERO_MAXIMO_INTENTOS = 2;

	public Usuario(String nombre, String apellidos, String password) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		setCredencial(new Credencial(nombre, apellidos, password)); 
	}
	
	public Usuario(String nombre, String apellidos, String email, String password) {
		this(nombre, apellidos, password);
		this.email = email;
	}
	
	
	public boolean esCuentaBloqueada() {
		return this.intentos>NUMERO_MAXIMO_INTENTOS;
	}
	
	
	private void setCredencial(Credencial cred) {
		this.credencial = cred;
	}
	
	
	public boolean modificarPassword(String oldpass, String newpass, String newpassverif) {
		boolean esPosibleModificar = 
				oldpass!=null && newpass!=null && !oldpass.isEmpty() && !newpass.isEmpty()
				&& this.credencial.comprobarPassword(oldpass)
				&& !oldpass.equals(newpass) && newpass.equals(newpassverif);
		
		if(esPosibleModificar) {
			this.credencial.setPassword(newpass);
		}
		return esPosibleModificar;
	}
	
	
	public boolean esPasswordSegura() {
		return this.credencial.esPasswordSegura();
	}

	
	public boolean hacerLogin(String username, String password) {
		boolean hagoLogin = false;
		
		if(!esCuentaBloqueada() &&
				username!=null && !username.isEmpty() && username.equals(getUsername())
				&& this.credencial.comprobarPassword(password)){
			hagoLogin = true;
			intentos = 0;
		}else {
			intentos++;
		}
				return hagoLogin;
	}
	
	
	public String getUsername() {
		return this.credencial.getUsername();
	}
	
	
	public String toString() {
		String resultado = "Cuenta Bloqueada";
		if(!esCuentaBloqueada()) {
			resultado=String.format("Usuari@: %s %s con email %s, %s", 
					this.nombre, this.apellidos, this.email, this.credencial);
		}
		return resultado;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Usuario) {
			Usuario casteado = (Usuario) obj;
			sonIguales = (Objects.equals(this.nombre, casteado.nombre)
					&& Objects.equals(this.apellidos, casteado.apellidos)
					&& Objects.equals(this.email, casteado.email))
					|| this.credencial.equals(casteado.credencial)
					;
		}
		
		return sonIguales;
	}
	
}
