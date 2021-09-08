package com.autenticacion.dto;

import javax.validation.constraints.NotBlank;

public class LoginUsuario {
	
	@NotBlank
	private String nombreUsuario;
	
	@NotBlank
	private String password;

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuaraio) {
		this.nombreUsuario = nombreUsuaraio;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
