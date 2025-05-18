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
    private ServiceCliente serviceCliente;
    
    @Autowired
    private ServiceRutina serviceRutina;

        
    @PostMapping("/asignarRutina")
    public String submit(@ModelAttribute Rutina rutina, Model model) {
    	Cliente cliente = serviceCliente.findById(rutina.getCliente().getId()).orElse(null);
    	rutina.setCliente(cliente);
    	serviceRutina.save(rutina);
    	return "redirect:/asignarRutina";
    }


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
        List<Rutina> rutinas = serviceRutina.findByClienteId(id);
        
        model.addAttribute("cliente", cliente);
        model.addAttribute("clientes", serviceCliente.listarClientes());
        model.addAttribute("rutinas", rutinas);
        return "rutina_cliente";
    }
    
    @GetMapping("/gestionRutinas/editar/{clienteId}")
    public String mostrarFormularioEdicionRutinas(@PathVariable long clienteId, Model model) {
        Cliente cliente = serviceCliente.findById(clienteId).orElse(null);
        
        if (cliente == null) {
            return "redirect:/gestionRutinas";
        }
        
        model.addAttribute("cliente", cliente);
        model.addAttribute("rutinas", cliente.getListaRutinas());
        return "editarRutinas";
    }
    
    @PostMapping("/gestionRutinas/guardar/{clienteId}")
    public String guardarRutinasEditadas(@PathVariable long clienteId, 
                                        @ModelAttribute Cliente cliente, 
                                        Model model) {
        Cliente clienteExistente = serviceCliente.findById(clienteId).orElse(null);
        
        if (clienteExistente == null) {
            return "redirect:/gestionRutinas";
        }
        
        for (int i = 0; i < cliente.getListaRutinas().size(); i++) {
            Rutina rutinaEditada = cliente.getListaRutinas().get(i);
            Rutina rutinaExistente = clienteExistente.getListaRutinas().get(i);
            
            rutinaExistente.setDiaSemana(rutinaEditada.getDiaSemana());
            rutinaExistente.setEjercicio(rutinaEditada.getEjercicio());
            rutinaExistente.setSeries(rutinaEditada.getSeries());
            rutinaExistente.setRepeticiones(rutinaEditada.getRepeticiones());
            rutinaExistente.setDescanso(rutinaEditada.getDescanso());
            rutinaExistente.setPeso(rutinaEditada.getPeso());
        }
        
        serviceCliente.save(clienteExistente);
        return "redirect:/gestionRutinas";
    }
    
    @PostMapping("/gestionRutinas/borrar/{id}")
    public String borrarRutina(@PathVariable long id) {
        Cliente cliente = serviceCliente.findById(id).orElse(null);
        
        if (cliente != null) {
            cliente.getListaRutinas().clear();
            serviceCliente.save(cliente);
        }
        
        return "redirect:/gestionRutinas";
    } 
    
}
