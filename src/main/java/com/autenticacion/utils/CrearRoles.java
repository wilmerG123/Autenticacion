package com.autenticacion.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.autenticacion.entity.Rol;
import com.autenticacion.enums.RolNombre;
import com.autenticacion.service.RolService;

@Component
public class CrearRoles implements CommandLineRunner{


	/*
	@Autowired
	RolService rolService;
	
	*/
	
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		Rol rolAmin = new Rol(RolNombre.ROLE_ADMIN);
		Rol rolUser = new Rol (RolNombre.ROLE_USER);
		
		rolService.save(rolAmin);
		
		rolService.save(rolUser);
		*/
		
		
	}

}
