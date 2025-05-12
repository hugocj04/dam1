package com.salesianostriana.dam.carmonajimenezhugo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.carmonajimenezhugo.model.Cliente;
import com.salesianostriana.dam.carmonajimenezhugo.service.ServiceCliente;

@Controller
public class ControllerCliente {

    @GetMapping("/registrar")
    public String showForm(Model model) {
    	Cliente cliente = new Cliente();
    	model.addAttribute("cliente", cliente);
        return "registrar";
    }
	
    @Autowired
    private ServiceCliente serviceCliente;
        
    @PostMapping("/registrar")
    public String submit(@ModelAttribute Cliente cliente, Model model) {
    	serviceCliente.save(cliente);
    	return "registrar";
    }

}
