package com.salesianostriana.dam.carmonajimenezhugo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/gestionRutinas")
    public String verRutinasForm(Model model) {
        model.addAttribute("clientes", serviceCliente.listarClientes());
        model.addAttribute("rutinas", serviceRutina.listarRutinas());
        return "gestionRutinas";
    }

    @GetMapping("/gestionRutinas/cliente")
    public String mostrarRutinasCliente(@RequestParam(name="clienteId", required = false) Long id, Model model) {
    	
    	if (id == null) {
    		return "redirect:/gestionRutinas";
    	}
    	
        Cliente cliente = serviceCliente.buscarPorId(id);
        model.addAttribute("cliente", cliente);
        model.addAttribute("clientes", serviceCliente.listarClientes());
        return "rutina_cliente";
    }
    
    @GetMapping("/editarRutinaCliente/{id}")
    public String llevarAEditar(@PathVariable long id, Model model) {
        Cliente cliente = serviceCliente.buscarPorId(id);
        model.addAttribute("cliente", cliente);
        model.addAttribute("rutinas", cliente.getPlani());
        model.addAttribute("rutina", new Rutina());
        return "editar";
    }

    @PostMapping("/gestionRutina/editar/{id}")
    public String editarRutina(@PathVariable long id, Model model) {
        Cliente cliente = serviceCliente.buscarPorId(id);
        model.addAttribute("cliente", cliente);
        model.addAttribute("rutinas", cliente.getPlani());
        return "redirect:/gestionRutinas/cliente";
    }

    @PostMapping("/gestionRutina/borrar/{id}")
    public String borrarRutina(@PathVariable long id) {
        List<Rutina> rutinas = serviceRutina.findAll().stream()
        		.filter(r -> r.getCliente().getId() == id)
        		.toList();
        
        rutinas.forEach(r -> {
        	serviceRutina.delete(r);
        });
        
        return "redirect:/gestionRutinas";
    }
    
    

}
