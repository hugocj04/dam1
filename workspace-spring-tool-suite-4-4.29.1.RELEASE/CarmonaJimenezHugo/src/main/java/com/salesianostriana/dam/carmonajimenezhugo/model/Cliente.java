package com.salesianostriana.dam.carmonajimenezhugo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

	@Id
	@GeneratedValue
	private long id;
	
	private String nombre;
	private String email;
	private String telefono;

	
}
