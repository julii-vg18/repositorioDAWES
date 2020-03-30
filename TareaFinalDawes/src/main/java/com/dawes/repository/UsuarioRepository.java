package com.dawes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.UsuarioVO;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioVO, Integer>{

	public UsuarioVO findByUsername(String username);
	
}
