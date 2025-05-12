package com.salesianostriana.dam.carmonajimenezhugo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.carmonajimenezhugo.model.Rutina;
import com.salesianostriana.dam.carmonajimenezhugo.service.ServiceRutina;

@Controller
public class ControllerRutina {

    @GetMapping("/crear")
    public String showForm(Model model) {
    	Rutina rutina = new Rutina();
    	model.addAttribute("rutina", rutina);
        return "crear";
    }
	
    @Autowired
    private ServiceRutina serviceRutina;
        
    @PostMapping("/crear")
    public String submit(@ModelAttribute Rutina rutina, Model model) {
    	serviceRutina.save(rutina);
    	return "crear";
    }


}
