package com.salesianostriana.dam.carmonajimenezhugo.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rutina {

	@Id
	@GeneratedValue
	private long id;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;

	private String ejercicio;
	private int series;
	private int repeticiones;
	private double peso;
	private Cliente cliente;

}
