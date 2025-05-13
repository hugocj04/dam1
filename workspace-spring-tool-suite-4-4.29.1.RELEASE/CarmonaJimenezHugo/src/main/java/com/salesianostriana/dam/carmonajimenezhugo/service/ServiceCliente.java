package com.salesianostriana.dam.carmonajimenezhugo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.carmonajimenezhugo.model.Cliente;
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

}
