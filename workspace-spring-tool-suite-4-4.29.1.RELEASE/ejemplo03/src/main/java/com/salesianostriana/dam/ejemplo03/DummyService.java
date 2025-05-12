package com.salesianostriana.dam.ejemplo03;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

	public Rutina getRutina() {
		return new Rutina();
	}
	
}
