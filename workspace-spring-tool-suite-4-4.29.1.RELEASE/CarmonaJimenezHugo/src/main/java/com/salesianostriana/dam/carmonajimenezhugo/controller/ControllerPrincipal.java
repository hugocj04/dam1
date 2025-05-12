package com.salesianostriana.dam.carmonajimenezhugo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.carmonajimenezhugo.model.Cliente;

@Controller
public class ControllerPrincipal {

    @GetMapping("/")
    public String principal() {
        return "Principal";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Dashboard";
    }

    @GetMapping("/registrar")
    public String showForm(Model model) {
    	Cliente cliente = new Cliente();
    	model.addAttribute("cliente", cliente);
        return "Registrar";
    }
        
    @PostMapping("/addCliente")
    public String submit(@ModelAttribute("clienteForm") Cliente cliente, Model model) {
    	model.addAttribute("cliente", cliente);
    	return "Registrar";
    }

    @GetMapping("/verClientes")
    public String verClientes() {
        return "VerClientes";
    }

    @GetMapping("/asignar")
    public String asignar() {
        return "Asignar";
    }

    @GetMapping("/verRutinas")
    public String verRutinas() {
        return "VerRutinas";
    }

    @GetMapping("/crear")
    public String crear() {
        return "Crear";
    }

    @GetMapping("/verProgreso")
    public String verProgreso() {
        return "VerProgreso";
    }
    
}
