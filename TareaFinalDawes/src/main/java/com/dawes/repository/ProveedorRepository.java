package com.dawes.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.dawes.modelo.ProveedorVO;

public interface ProveedorRepository extends CrudRepository<ProveedorVO, Integer> {

	public ProveedorVO findByDni(String dni);

	<S extends ProveedorVO> S save(S entity);

	Optional<ProveedorVO> findById(Integer id);

	Iterable<ProveedorVO> findAll();

	long count();

	void deleteById(Integer id);

	void delete(ProveedorVO entity);

	void deleteAll();

}
