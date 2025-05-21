package com.salesianostriana.dam.carmonajimenezhugo.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.carmonajimenezhugo.model.Rutina;
import com.salesianostriana.dam.carmonajimenezhugo.repository.RepositoryRutina;
import com.salesianostriana.dam.carmonajimenezhugo.service.base.BaseServiceImpl;

@Service
public class ServiceRutina extends BaseServiceImpl <Rutina, Long, RepositoryRutina>{

	public List<Rutina> listarRutinas(){
		return findAll();
	}
	
	public void eliminarPorId(long id) {
		deleteById(id);
	}
	
	public List<Rutina> findByClienteId(Long clienteId) {
	    return repository.findByClienteId(clienteId);
	}
		
    public List<Map<String, Object>> calcularUnoRM(Long clienteId) {
        return findByClienteId(clienteId).stream()
            .map(rutina -> {
                Map<String, Object> fila = new LinkedHashMap<>();
                fila.put("diaSemana", rutina.getDiaSemana());
                fila.put("ejercicio", rutina.getEjercicio());
                fila.put("series", rutina.getSeries());
                fila.put("repeticiones", rutina.getRepeticiones());
                fila.put("peso", rutina.getPeso());
                fila.put("urlImagen", rutina.getUrlImagen());
                fila.put("alt", rutina.getAlt());
                fila.put("descanso", rutina.getDescanso());
                fila.put("oneRM", rutina.calcularRMIndividual(rutina));
                return fila;
            })
            .collect(Collectors.toList());
    }

    public int calcularVolumenSemanal(Long clienteId) {
        return findByClienteId(clienteId).stream()
            .mapToInt(Rutina::getSeries)
            .sum();
    }

    public double calcularTotalKgLevantados(Long clienteId) {
        return findByClienteId(clienteId).stream()
            .mapToDouble(r -> r.getSeries() * r.getRepeticiones() * r.getPeso())
            .sum();
    }
	
}
