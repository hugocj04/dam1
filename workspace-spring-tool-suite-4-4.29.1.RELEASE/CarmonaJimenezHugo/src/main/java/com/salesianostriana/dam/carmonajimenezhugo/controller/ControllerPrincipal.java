package com.salesianostriana.dam.carmonajimenezhugo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerPrincipal {

    @GetMapping("/")
    public String principal() {
        return "Principal";
    }

    @GetMapping("/empezar")
    public String empezar() {
        return "Empezar";
    }

}
