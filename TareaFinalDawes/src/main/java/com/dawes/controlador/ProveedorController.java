package com.dawes.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dawes.modelo.ProveedorVO;
import com.dawes.services.ProveedorService;

@RestController
public class ProveedorController {

	@Autowired
	ProveedorService ps;
	
	@GetMapping("/proveedores")
	public List<ProveedorVO> proveedores(){
		ArrayList<ProveedorVO> proveedores = new ArrayList<ProveedorVO>();
		proveedores = (ArrayList<ProveedorVO>) (ps.findAll());
		return proveedores;
	}
	
	@GetMapping("/proveedoresPorDni")
	public ProveedorVO proveedoresDni(String dni){
		ProveedorVO proveedor = (ProveedorVO) ps.findByDni(dni);
		return proveedor;
	}
	
}
