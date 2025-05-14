package com.salesianostriana.dam.carmonajimenezhugo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.carmonajimenezhugo.model.Cliente;
import com.salesianostriana.dam.carmonajimenezhugo.model.Rutina;
import com.salesianostriana.dam.carmonajimenezhugo.service.ServiceCliente;
import com.salesianostriana.dam.carmonajimenezhugo.service.ServiceRutina;

@Controller
public class ControllerRutina {

	@GetMapping("/asignarRutina")
	public String mostrarFormularioRutina(Model model) {
	    model.addAttribute("rutina", new Rutina());
	    model.addAttribute("clientes", serviceCliente.findAll());
	    return "asignar";
	}
	
    @Autowired
    private ServiceRutina serviceRutina;
    
        
    @PostMapping("/asignarRutina")
    public String submit(@ModelAttribute Rutina rutina, Model model) {
    	Cliente cliente = serviceCliente.findById(rutina.getCliente().getId()).orElse(null);
    	rutina.setCliente(cliente);
    	serviceRutina.save(rutina);
    	return "redirect:/asignarRutina";
    }

    @Autowired ServiceCliente serviceCliente;

    @GetMapping("/verRutinas")
    public String verRutinasForm(Model model) {
        model.addAttribute("clientes", serviceCliente.listarClientes());
        return "VerRutinas";
    }

    @GetMapping("/verRutinas/cliente")
    public String mostrarRutinasCliente(@RequestParam(name="clienteId") long id, Model model) {
        Cliente cliente = serviceCliente.buscarPorId(id);
        model.addAttribute("cliente", cliente);
        model.addAttribute("clientes", serviceCliente.listarClientes());
        return "rutina_cliente";
    }

}
