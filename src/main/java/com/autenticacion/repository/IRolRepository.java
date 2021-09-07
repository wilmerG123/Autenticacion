package com.autenticacion.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autenticacion.entity.Rol;
import com.autenticacion.enums.RolNombre;

public interface IRolRepository extends JpaRepository<Rol, Long>{
	
	Optional<Rol> findByRolNombre (RolNombre rolNombre);

}
