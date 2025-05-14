package com.salesianostriana.dam.carmonajimenezhugo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControllerPrincipal {

    @GetMapping("/")
    public String principal() {
        return "Principal";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/verClientes")
    public String verClientes() {
        return "verClientes";
    }

    @GetMapping("/verProgreso")
    public String verProgreso() {
        return "verProgreso";
    }
    
}
