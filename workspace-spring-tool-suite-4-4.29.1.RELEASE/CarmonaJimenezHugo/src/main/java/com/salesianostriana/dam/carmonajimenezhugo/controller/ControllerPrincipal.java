package com.salesianostriana.dam.carmonajimenezhugo.controller;import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControllerPrincipal {

    @GetMapping("/")
    public String principal() {
        return "Inicio";
    }

    @GetMapping("/quienesSomos")
    public String quienesSomos() {
        return "QuienesSomos";
    }

    @GetMapping("/legal")
    public String legal() {
        return "Legal";
    }

    @GetMapping("/dedicamos")
    public String dedicamos() {
        return "Dedicamos";
    }
        
}
