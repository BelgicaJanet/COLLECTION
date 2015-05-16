package com.collection.model;

<<<<<<< HEAD
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Usuario {
	
	@NotNull
	@Size(min=1,max=20)
	private String usuario;
	@NotNull
	@Size(min=1,max=20)
=======
public class Usuario {
	
	
	private String usuario;
>>>>>>> 7445760a6ed9e44ffc484719bc9a61d6653ae46f
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
