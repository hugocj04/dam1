package com.salesianostriana.dam.ejemplo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Contacto {

	@Id
	@GeneratedValue
	private Long id;
	private String nombre;
	private String apellidos;
	private String email;
	private String telefono;

}
