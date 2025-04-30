package com.salesianostriana.dam.ejemplo03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rutina {

	private String ejercicio;
	private int series;
	private double peso;
	private double repeticiones;
	private double descanso;
	
}
