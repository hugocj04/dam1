package com.salesianostriana.dam.ejemplo01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
// Los metodos controller no necesitan parametros
public class Controlador {

	
	@GetMapping({"/","welcome"}) // Ruta que si ponemos en el navegador, se ejecutara el metodo siguiente
	public String welcome(@RequestParam(name = "nombre", required = false, defaultValue = "Mundo") String nombre,
			Model model) {
		model.addAttribute("nombre", nombre);
		return "index";
	}
	
	@GetMapping("/saludo2")
	public String welcome2(Model model) {
		model.addAttribute("persona", new Persona ());
		return "SaludoPersonalizado";
	}
	
	@GetMapping("/saludo3")
	public String welcome3(Model model) {
		model.addAttribute("saludo", "Hola mundo");
		model.addAttribute("Mensaje", "Se me esta haciendo largo el proyecto final...");
		model.addAttribute("url", "https://triana.salesianos.com");
		return "SaludoYEnlace";
	}

}