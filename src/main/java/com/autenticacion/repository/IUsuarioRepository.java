package com.autenticacion.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autenticacion.entity.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
	
	
	Optional<Usuario> findByNombreUsuario(String nombreUsuario);
	
	boolean existsByNombreUsuario(String nombreUsuario);
	
	boolean existsByEmail (String email);
	

}
