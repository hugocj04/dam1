package com.salesianostriana.dam.ejemplo02;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controlador {

	/*
	 * Esta clase va a utilizar un servicio que nos va a hacer la funcion de
	 * proveernos de datos, pero es solo porque todavia no tenemos la base de datos
	 * que vamos a usar
	 */

	@Autowired
	private DummyService service;

	@GetMapping({ "/", "welcome" })
	public String welcome(@RequestParam(name = "nombre", required = false, defaultValue = "Mundo") String nombre,
			Model model) {
		model.addAttribute("nombre", nombre);
		model.addAttribute("today", LocalDate.now());
		model.addAttribute("Producto", service.getProducto());

		return "index";
	}

}