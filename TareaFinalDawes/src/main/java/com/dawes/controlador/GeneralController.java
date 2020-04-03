package com.dawes.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GeneralController {

	@RequestMapping("/index")
	public String index() {
		return "/index";
	}
	
	@RequestMapping("/listaProveedores")
	public String listaProveedores() {
		return "/listaProveedores";
	}
	
	@RequestMapping("/proveedoresDni")
	public String formDni() {
		return "/formDNI";
	}
	
	@RequestMapping("/nuevoProveedor")
	public String nuevoProveedor() {
		return "/nuevoProveedorForm";
	}
	
	@RequestMapping("/borraProveedor")
	public String borrarProveedor() {
		return "/borraProveedorForm";
	}
	
	@RequestMapping("/cambiaProveedor")
	public String cambiaProveedor() {
		return "/modificaProveedorForm";
	}
}
