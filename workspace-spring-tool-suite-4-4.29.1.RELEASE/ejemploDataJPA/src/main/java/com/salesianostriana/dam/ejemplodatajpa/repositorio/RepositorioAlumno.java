package com.salesianostriana.dam.ejemplodatajpa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ejemplodatajpa.model.Alumno;

// El @Repository no es necesario
public interface RepositorioAlumno extends JpaRepository<Alumno, Long>{

}
