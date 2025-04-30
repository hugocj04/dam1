package com.salesianostriana.dam.ejemplo03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controlador {
	
	@Autowired
	private DummyService service;

	@GetMapping({"/", "welcome"})
	public String welcome(@RequestParam(name = "nombre", required = false, defaultValue = "Vacío") String nombre, Model model) {
		model.addAttribute("rutina", service.getRutina());
		return "index";
	}
	
}