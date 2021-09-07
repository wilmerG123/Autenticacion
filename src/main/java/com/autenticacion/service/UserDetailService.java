package com.autenticacion.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.autenticacion.entity.Usuario;
import com.autenticacion.entity.UsuarioPrincipal;

@Service
@Transactional
public class UserDetailService implements UserDetailsService{

	@Autowired
	UsuarioService servicio;
	
	@Override
	public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
		
		Usuario usuario = servicio.getByNombreUsuario(nombreUsuario).get();
		
		return UsuarioPrincipal.build(usuario);
	}

}
