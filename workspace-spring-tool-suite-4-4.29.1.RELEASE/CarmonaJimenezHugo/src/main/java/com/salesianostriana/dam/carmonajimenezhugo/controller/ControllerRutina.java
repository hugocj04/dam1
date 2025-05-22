package com.salesianostriana.dam.carmonajimenezhugo.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

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

	@Autowired
	private ServiceCliente serviceCliente;

	@Autowired
	private ServiceRutina serviceRutina;

	@GetMapping("/asignarRutina")
	public String mostrarFormularioRutina(Model model) {

		model.addAttribute("rutina", new Rutina());
		model.addAttribute("clientes", serviceCliente.findAll());

		return "Asignar";
	}

	@PostMapping("/asignarRutina")
	public String submit(@ModelAttribute Rutina rutina, Model model) {

		Cliente cliente = serviceCliente.findById(rutina.getCliente().getId()).orElse(null);
		rutina.setCliente(cliente);
		serviceRutina.save(rutina);

		return "AsignoExito";
	}

	@GetMapping("/gestionRutinas")
	public String verRutinasForm(Model model) {

		model.addAttribute("clientes", serviceCliente.listarClientes());
		model.addAttribute("rutinas", serviceRutina.listarRutinas());

		return "GestionRutinas";
	}

	@GetMapping("/gestionRutinas/cliente")
	public String mostrarRutinasCliente(@RequestParam(name = "clienteId", required = false) Long id, Model model) {

		Cliente cliente = serviceCliente.buscarPorId(id);
		List<Rutina> rutinas = serviceRutina.findByClienteId(id);

		if (id == null) {
			return "redirect:/gestionRutinas";
		}

		model.addAttribute("cliente", cliente);
		model.addAttribute("clientes", serviceCliente.listarClientes());
		model.addAttribute("rutinas", rutinas);

		return "Rutina_cliente";
	}

	@GetMapping("/gestionRutinas/editar/{clienteId}")
	public String mostrarFormularioEdicionRutinas(@PathVariable long clienteId, Model model) {

		Cliente cliente = serviceCliente.findById(clienteId).orElse(null);

		if (cliente == null) {
			return "redirect:/gestionRutinas";
		}

		model.addAttribute("cliente", cliente);
		model.addAttribute("rutinas", cliente.getListaRutinas());

		return "EditarRutinas";
	}

	@PostMapping("/gestionRutinas/guardar/{clienteId}")
	public String guardarRutinasEditadas(@PathVariable long clienteId, @ModelAttribute Cliente cliente, Model model) {

		Cliente clienteExistente = serviceCliente.findById(clienteId).orElse(null);
		Rutina rutinaEditada = new Rutina();
		Rutina rutinaExistente = new Rutina();

		for (int i = 0; i < cliente.getListaRutinas().size(); i++) {

			rutinaEditada = cliente.getListaRutinas().get(i);
			rutinaExistente = clienteExistente.getListaRutinas().get(i);

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
	public String borrarRutinas(@PathVariable long id) {

		Cliente cliente = serviceCliente.findById(id).orElse(null);

		if (cliente != null) {
			cliente.getListaRutinas().clear();
			serviceCliente.save(cliente);
		}

		return "redirect:/gestionRutinas";
	}

	@GetMapping("/analisis")
	public String mostrarSeleccionCliente(Model model) {
		model.addAttribute("clientes", serviceCliente.findAll());
		return "Analisis";
	}

	@GetMapping("/analisis/cliente")
	public String analizarCliente(@RequestParam(name = "clienteid") Long id, Model model) {

		Optional<Cliente> clienteOpt = serviceCliente.findById(id);

		if (clienteOpt.isEmpty()) {
			return "redirect:/analisis";
		}

		model.addAttribute("cliente", clienteOpt.get());

		return "AnalisisCliente";
	}

	@PostMapping("/analisis/cliente/{id}/calcularRM")
	public String calcularRM(@PathVariable Long id, Model model) {

		Optional<Cliente> clienteOpt = serviceCliente.findById(id);
		List<Map<String, Object>> rutinasConRM = serviceRutina.calcularUnoRM(id);

		if (clienteOpt.isEmpty()) {
			return "redirect:/analisis";
		}

		model.addAttribute("cliente", clienteOpt.get());
		model.addAttribute("rutinas", rutinasConRM);
		return "ResultadosRM";
	}

	@PostMapping("/analisis/cliente/{id}/calcularVolumen")
	public String calcularVolumenSemanal(@PathVariable Long id, Model model) {

		Cliente cliente;
		int totalSeries;
		Optional<Cliente> clienteOpt = serviceCliente.findById(id);

		if (clienteOpt.isEmpty()) {
			return "redirect:/analisis";
		}

		cliente = clienteOpt.get();
		totalSeries = serviceRutina.calcularVolumenSemanal(id);

		model.addAttribute("cliente", cliente);
		model.addAttribute("totalSeries", totalSeries);
		return "ResultadosVolumen";

	}

	@PostMapping("/analisis/cliente/{id}/calcularTotalKg")
	public String mostrarTotalKg(@PathVariable Long id, Model model) {

		double totalKg;
		Optional<Cliente> cliente = serviceCliente.findById(id);

		if (cliente.isEmpty()) {
			return "redirect:/analisis";
		}

		totalKg = serviceRutina.calcularTotalKgLevantados(id);
		model.addAttribute("cliente", cliente.get());
		model.addAttribute("totalKg", totalKg);

		return "ResultadosKg";
	}

}
