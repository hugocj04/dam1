package com.salesianostriana.dam.carmonajimenezhugo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.carmonajimenezhugo.model.Cliente;
import com.salesianostriana.dam.carmonajimenezhugo.service.ServiceCliente;

@Controller
public class ControllerCliente {

    @GetMapping("/registrar")
    public String showForm(Model model) {
    	Cliente cliente = new Cliente();
    	model.addAttribute("cliente", cliente);
        return "Registrar";
    }
	
    @Autowired
    private ServiceCliente serviceCliente;
        
    @PostMapping("/registrar")
    public String submit(@ModelAttribute Cliente cliente, Model model) {
    	serviceCliente.save(cliente);
    	return "RegistroExito";
    }

    @GetMapping("/gestionClientes")
    public String listarClientes(Model model) {
    	model.addAttribute("listar", serviceCliente.listarClientes());
    	return "GestionClientes";
    }
    
    @GetMapping("/editarCliente/{id}")
    public String mostrarFormularioEdicion(@PathVariable Long id, Model model) {
        Cliente cliente = serviceCliente.findById(id).orElse(null);
        
        if (cliente == null) {
            return "redirect:/gestionClientes";
        }
        
        model.addAttribute("cliente", cliente);
        return "editarCliente";
    }

    @PostMapping("/editarCliente/{id}")
    public String procesarEdicion(@PathVariable Long id, @ModelAttribute("cliente") Cliente clienteEditado) {
        Cliente clienteExistente = serviceCliente.findById(id).orElse(null);
        
        if (clienteExistente != null) {
            clienteExistente.setNombre(clienteEditado.getNombre());
            clienteExistente.setApellidos(clienteEditado.getApellidos());
            clienteExistente.setEdad(clienteEditado.getEdad());
            clienteExistente.setEmail(clienteEditado.getEmail());
            clienteExistente.setTelefono(clienteEditado.getTelefono());
            clienteExistente.setFecha(clienteEditado.getFecha());
            
            serviceCliente.save(clienteExistente);
        }
        
        return "redirect:/gestionClientes";
    }

    @PostMapping("/eliminarCliente/{id}")
    public String eliminarCliente(@PathVariable Long id) {
        Cliente cliente = serviceCliente.findById(id).orElse(null);
        if (cliente != null && cliente.getListaRutinas() != null) {
            cliente.getListaRutinas().clear();
        }
        
        serviceCliente.deleteById(id);
        
        return "redirect:/gestionClientes";
    }
    
}
