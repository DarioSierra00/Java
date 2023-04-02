package com.edu.practicaMock.usuario;

public class Usuario {
	
	private String login;
	private String pass;
	
	
	public Usuario(String login, String pass) {
		super();
		this.login = login;
		this.pass = pass;
	}


	public String getLogin() {
		return this.login;
	}


	public boolean setPass(String oldPass, String newPass) {
		boolean sePuedeCambiar = false;
		if(oldPass!=null && newPass!=null && !oldPass.equals(newPass) && oldPass.equals(this.pass)) {
			this.pass = newPass;
			sePuedeCambiar = true;
		}
		return sePuedeCambiar;
	}
	
	public boolean checkPass(String pass) {
		
		return this.pass.equals(pass);
	}
	
	
	

}
