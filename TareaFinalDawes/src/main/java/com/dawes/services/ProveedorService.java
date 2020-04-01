package com.dawes.services;

import java.util.Optional;

import com.dawes.modelo.ProveedorVO;

public interface ProveedorService {

	ProveedorVO findByDni(String dni);
	
	<S extends ProveedorVO> S save(S entity);

	Optional<ProveedorVO> findById(Integer id);

	Iterable<ProveedorVO> findAll();

	long count();

	void deleteById(Integer id);

	void delete(ProveedorVO entity);

	void deleteAll();
}
