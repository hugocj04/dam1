package com.salesianostriana.dam.ejemplo03;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

	public Rutina getRutina() {
		return new Rutina("Press de banca", 2, 80, 8, 4);
	}
	
}
