package com.dawes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.ProveedorVO;
import com.dawes.repository.ProveedorRepository;

@Service
public class ServicioProveedorImpl implements ProveedorService {

	@Autowired
	ProveedorRepository pr;

	@Override
	public ProveedorVO findByDni(String dni) {
		return (ProveedorVO) pr.findByDni(dni);
	}

	@Override
	public <S extends ProveedorVO> S save(S entity) {
		return pr.save(entity);
	}

	@Override
	public Optional<ProveedorVO> findById(Integer id) {
		return pr.findById(id);
	}

	@Override
	public Iterable<ProveedorVO> findAll() {
		return pr.findAll();
	}

	@Override
	public long count() {
		return pr.count();
	}

	@Override
	public void deleteById(Integer id) {
		pr.deleteById(id);
		
	}

	@Override
	public void delete(ProveedorVO entity) {
		pr.delete(entity);
	}

	@Override
	public void deleteAll() {
		pr.deleteAll();
	}
	
	
}
