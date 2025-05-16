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
    
    @GetMapping("/gestionRutinas/editar/{id}")
    public String editarRutina(@PathVariable Long id, Model model) {
        Rutina rutina = serviceRutina.findById(id).orElse(null);

        if (rutina == null) {
            return "redirect:/gestionRutinas";
        }

        Cliente cliente = rutina.getCliente();

        List<Rutina> rutinas = cliente.getListaRutinas(); 

        model.addAttribute("cliente", cliente);
        model.addAttribute("rutinas", rutinas);
        model.addAttribute("rutina", rutina); 
        return "editar"; 
    }
    
    @PostMapping("/gestionRutinas/editar/{id}")
    public String guardarRutinas(@PathVariable Long id, @ModelAttribute("rutina") Rutina rutinaActualizada) {
        Rutina rutina = serviceRutina.findById(id).orElse(null);
        if (rutina != null) {
            // Actualiza los campos de la rutina
            rutina.setDiaSemana(rutinaActualizada.getDiaSemana());
            rutina.setEjercicio(rutinaActualizada.getEjercicio());
            rutina.setSeries(rutinaActualizada.getSeries());
            rutina.setRepeticiones(rutinaActualizada.getRepeticiones());
            rutina.setDescanso(rutinaActualizada.getDescanso());
            rutina.setPeso(rutinaActualizada.getPeso());

            serviceRutina.save(rutina);
        }
        return "redirect:/gestionRutinas/cliente?clienteId=" + rutina.getCliente().getId();
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
