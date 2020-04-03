package com.dawes.controlador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dawes.modelo.ProveedorDTO;
import com.dawes.modelo.ProveedorVO;
import com.dawes.services.ProveedorService;

@RestController
public class ProveedorController {

	@Autowired
	ProveedorService ps;
	
//	@GetMapping("/proveedores")
//	public List<ProveedorVO> proveedores(){
//		ArrayList<ProveedorVO> proveedores = new ArrayList<ProveedorVO>();
//		proveedores = (ArrayList<ProveedorVO>) (ps.findAll());
//		return proveedores;
//	}
	
	@GetMapping("/proveedores")
	public Iterable<ProveedorDTO> listaProveedores(Model modelo){
		List<ProveedorDTO> lista = new ArrayList<ProveedorDTO>();
		Iterable<ProveedorVO> proveedores = ps.findAll();
		for(ProveedorVO p:proveedores) {
			lista.add(new ProveedorDTO(p.getDni(), p.getNombre(), p.getApellidos()));
		}
		modelo.addAttribute("listaProveedores", lista);
		return lista;
	}
	
	
	
	@GetMapping("/proveedoresPorDni/{dni}")
	public ProveedorVO proveedorDni(@PathVariable String dni, Model modelo){
		ProveedorVO p = (ProveedorVO) ps.findByDni(dni);
		modelo.addAttribute("proveedor", p);
		return p;
	}
	
	@GetMapping("/proveedoresPorDni")
	public ProveedorVO proveedoresDni(String dni, Model modelo){
		ProveedorVO p = (ProveedorVO) ps.findByDni(dni);
		modelo.addAttribute("proveedor", p);
		return p;
	}
	
	@PostMapping("/creaProveedor")
	public ProveedorVO nuevoProveedor(@RequestParam String nombre, String apellido, String dni, Model modelo) {
		ProveedorVO p = new ProveedorVO(nombre, apellido, dni, LocalDate.now());
		modelo.addAttribute("proveedor", p);
		return ps.save(p);
	}
	
	@PostMapping("/eliminaProveedor")
	public ProveedorVO borrarProveedor(@RequestParam String dni, Model modelo) {
		ProveedorVO p = ps.findByDni(dni);
		ps.delete(p);
		modelo.addAttribute("proveedores", ps.findAll());
		return p;
	}
	
	@PostMapping("/modificaProveedor")
	public ProveedorVO modficaProveedor(@RequestParam String dni, String nombre, String apellido, String fecha,  Model modelo) {
		ProveedorVO p = ps.findByDni(dni);
		p.setNombre(nombre);
		p.setApellidos(apellido);
		p.setDni(dni);
		p.setFecha(LocalDate.parse(fecha));
		ps.save(p);
		modelo.addAttribute("proveedor", ps.findByDni(dni));
		return p;
	}
}
