package com.salesianostriana.dam.carmonajimenezhugo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Rutina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String diaSemana;
	private String ejercicio;
	private int series;
	private int repeticiones;
	private double peso;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

}
