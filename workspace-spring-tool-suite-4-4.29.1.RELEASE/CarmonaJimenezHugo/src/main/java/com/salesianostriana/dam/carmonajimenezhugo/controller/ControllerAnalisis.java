package com.salesianostriana.dam.carmonajimenezhugo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.carmonajimenezhugo.service.ServiceCliente;

@Controller
public class ControllerAnalisis {

	@Autowired
	private ServiceCliente serviceCliente;
	
	@GetMapping("/analisis")
	public String analisis(Model model) {
	    model.addAttribute("clientes", serviceCliente.findAll());
	    return "Analisis";
	}
}
