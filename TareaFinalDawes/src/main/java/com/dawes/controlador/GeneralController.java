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
	
	@RequestMapping("/proveedoresDni")
	public String formDni() {
		return "formDNI";
	}
	
}
