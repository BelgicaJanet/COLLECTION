package com.collection.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Usuario {
	
	@NotNull
	@Size(min=1,max=20)
	private String usuario;
	@NotNull
	@Size(min=1,max=20)
	private String password;
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
