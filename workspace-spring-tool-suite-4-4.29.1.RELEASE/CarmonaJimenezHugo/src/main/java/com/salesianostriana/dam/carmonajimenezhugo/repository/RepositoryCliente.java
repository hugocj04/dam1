package com.salesianostriana.dam.carmonajimenezhugo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.carmonajimenezhugo.model.Cliente;

@Repository
public interface RepositoryCliente extends JpaRepository<Cliente, Long>{

}
