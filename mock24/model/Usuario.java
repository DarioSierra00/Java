package com.edu.mock24.model;

public class Usuario {
	private String login;
	private String pass;
	
	public Usuario(String login, String pass) {
		super();
		this.login = login;
		this.pass = pass;
	}

	public String getLogin() {
		return login;
	}

	public boolean setPass(String oldpass, String newpass) {
		boolean seCambia=false;
		if(checkPass(oldpass)) {
			this.pass = newpass;
			seCambia = true;
		}
		return seCambia;
	}
	
	public boolean checkPass(String pass) {
		boolean existePass=false;
		if(this.pass.equals(pass)) {
			existePass=true;
		}
		return existePass;
	}
	
	
}
