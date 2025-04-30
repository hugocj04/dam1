package com.salesianostriana.dam.ejemplo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.ejemplo.entidades.Contacto;
import com.sun.tools.javac.util.List;

public interface ContactoRepositorio extends JpaRepository<Contacto, Long> {

	@Query("""
			select c
			from Contacto c
			where id < 500
			""")
	
	List<Contacto> primerosContactos();
	
}
