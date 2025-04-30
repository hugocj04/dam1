package com.salesianostriana.dam.ejemplodatajpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity // Genera la tabla en la base de datos
public class Alumno {

	@Id // Convierte el id en la pk de la base de datos
	@GeneratedValue // Genera el id de forma automatica

	private long id;
	private String nombre, apellidos, email;

	public Alumno(String nombre, String apellidos, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}

}
