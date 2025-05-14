package com.salesianostriana.dam.carmonajimenezhugo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.carmonajimenezhugo.model.Rutina;
import com.salesianostriana.dam.carmonajimenezhugo.repository.RepositoryRutina;
import com.salesianostriana.dam.carmonajimenezhugo.service.base.BaseServiceImpl;

@Service
public class ServiceRutina extends BaseServiceImpl <Rutina, Long, RepositoryRutina>{

	public List<Rutina> listarRutinas(){
		return findAll();
	}

	// Crear un ordenar por numero de ejercicios
}
