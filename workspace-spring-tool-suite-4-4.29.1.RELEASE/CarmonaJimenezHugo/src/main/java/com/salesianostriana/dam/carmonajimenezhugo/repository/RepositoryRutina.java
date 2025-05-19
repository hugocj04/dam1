package com.salesianostriana.dam.carmonajimenezhugo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.carmonajimenezhugo.model.Rutina;

@Repository
public interface RepositoryRutina extends JpaRepository<Rutina, Long>{

    @Query(value = "SELECT * FROM RUTINA WHERE CLIENTE_ID = :clienteId", nativeQuery = true)
    List<Rutina> findByClienteId(@Param("clienteId") Long clienteId);

}
