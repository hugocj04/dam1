package com.salesianostriana.dam.carmonajimenezhugo.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.carmonajimenezhugo.model.Cliente;
import com.salesianostriana.dam.carmonajimenezhugo.repository.RepositoryCliente;
import com.salesianostriana.dam.carmonajimenezhugo.service.base.BaseServiceImplCliente;

@Service
public class ServiceCliente extends BaseServiceImplCliente <Cliente, Long, RepositoryCliente>{

}
