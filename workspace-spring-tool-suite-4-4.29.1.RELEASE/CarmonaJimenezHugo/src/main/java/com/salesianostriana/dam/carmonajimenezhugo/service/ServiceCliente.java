package com.salesianostriana.dam.carmonajimenezhugo.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.carmonajimenezhugo.model.Cliente;
import com.salesianostriana.dam.carmonajimenezhugo.model.Rutina;
import com.salesianostriana.dam.carmonajimenezhugo.repository.RepositoryCliente;
import com.salesianostriana.dam.carmonajimenezhugo.service.base.BaseServiceImpl;

@Service
public class ServiceCliente extends BaseServiceImpl <Cliente, Long, RepositoryCliente>{

	public List<Cliente> listarClientes(){
		return findAll();
	}

	public Cliente buscarPorId(Long id) {
	    return findById(id).orElse(null);
	}
	
	public List<Map<String, Object>> calcularUnoRM(Long clienteId) {
		
	    Optional<Cliente> clienteOpt = repository.findById(clienteId);
	    List<Map<String, Object>> resultado = new ArrayList<>();
	    
	    if (clienteOpt.isPresent()) {
	        Cliente cliente = clienteOpt.get();
	        for (Rutina rutina : cliente.getListaRutinas()) {
	            Map<String, Object> fila = new LinkedHashMap<>();
	            fila.put("diaSemana", rutina.getDiaSemana());
	            fila.put("ejercicio", rutina.getEjercicio());
	            fila.put("series", rutina.getSeries());
	            fila.put("repeticiones", rutina.getRepeticiones());
	            fila.put("peso", rutina.getPeso());
	            fila.put("descanso", rutina.getDescanso());

	            double oneRM = rutina.getPeso() * (1 + (0.0333 * rutina.getRepeticiones()));
	            fila.put("oneRM", oneRM);
	            
	            resultado.add(fila);
	        }
	    }
	    
	    return resultado;
	}
	
	public int calcularVolumenSemanal(Long clienteId) {
	    return repository.findById(clienteId)
	        .stream()
	        .flatMap(cliente -> cliente.getListaRutinas().stream())
	        .mapToInt(Rutina::getSeries)
	        .sum();
	}
	
	public double calcularTotalKgLevantados(Long clienteId) {
	    return repository.findById(clienteId)
	        .map(cliente -> cliente.getListaRutinas().stream()
	            .mapToDouble(r -> r.getSeries() * r.getRepeticiones() * r.getPeso())
	            .sum())
	        .orElse(0.0);
	}
	
}
