package com.salesianostriana.dam.ejemploformulario01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.ejemploformulario01.model.Empleado;

@Controller
public class EmpleadoController {

	// Para los formularios siempre usamos las peticiones tipo post

	/*
	 * Dos metodos: Uno para ver el formulario vacio (peticion tipo GET) y otro para
	 * rellenar el formulario y recoger datos para la peticion (peticion tipo POST)
	 */

	@GetMapping("/empleado")
	public String showForm(Model model) {
		
		// El empleado se instancia vacio porque es el que se usa
		// para pintar el formulario que estamos creando sin datos
		
		Empleado empleado = new Empleado();
		model.addAttribute("empleadoForm", empleado);

		return "form";
	}
	
	@PostMapping("/addEmpleado")
	public String submit(@ModelAttribute("empleadoForm") Empleado empleado, Model model) {
		
		// Se añade al modelo, el empleado que se creará al recoger los datos del formulario
		
		model.addAttribute("empleado", empleado);
		
		/*
		 * En este ejemplo sencillo, se muestra la pagina con la informacion mandada por
		 * el formulario al pulsar el boton submit, no se guarda en la base de datos y
		 * solo mostramos lo que se escribe en el formulario en otra pagina web
		 */
		
		return "view";
	}
}
