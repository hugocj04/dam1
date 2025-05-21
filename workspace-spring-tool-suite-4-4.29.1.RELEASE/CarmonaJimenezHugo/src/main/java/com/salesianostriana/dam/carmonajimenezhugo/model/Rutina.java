package com.salesianostriana.dam.carmonajimenezhugo.model;

import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString.Exclude;

@Data
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
	
	@Lob
	private String urlImagen;
	
	private String alt;

	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime descanso;
	private double peso;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	@Exclude
	private Cliente cliente;

	public Rutina() {
		cliente = new Cliente();
	}
	
    public double calcularRMIndividual(Rutina rutina) {
        return peso * (1 + (0.0333 * repeticiones));
    }


}
