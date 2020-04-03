package com.dawes.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dawes.modelo.ProveedorDTO;
import com.dawes.modelo.ProveedorVO;
import com.dawes.services.ProveedorService;

@RestController
@RequestMapping("/proveedores")
public class WSProveedorController {
	
	@Autowired
	private ProveedorService ps;
	
	@GetMapping(value = "/ver")
	public Iterable<ProveedorDTO> listaProveedores (Model modelo){
		List<ProveedorDTO> lista = new ArrayList<ProveedorDTO>();
		Iterable<ProveedorVO> proveedores = ps.findAll();
		for(ProveedorVO p:proveedores) {
			lista.add(new ProveedorDTO(p.getDni(), p.getNombre(), p.getApellidos()));
		}
		modelo.addAttribute("listaProveedores", lista);
		return lista;
	}	
}
