package com.salesianostriana.dam.carmonajimenezhugo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.carmonajimenezhugo.model.Rutina;

@Repository
public interface RepositoryRutina extends JpaRepository<Rutina, Long>{

	
}
