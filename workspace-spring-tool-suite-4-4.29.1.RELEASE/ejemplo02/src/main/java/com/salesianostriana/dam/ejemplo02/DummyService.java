package com.salesianostriana.dam.ejemplo02;

import org.springframework.stereotype.Service;

@Service
public class DummyService {
	
	// Estamos simulando que hemos ido a la base de datos para acceder a los datos pero realmente esto no se hace así

	public Producto getProducto() {
		return new Producto("Camiseta", "¡Wena de verdad!", 15.0f, 87, 91.1f);
	}
	
	
}
