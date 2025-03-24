package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double velocidad, espacioInicial, tiempo, espacio;
		
		System.out.println("Buenas, vamos a calcular cuanto espacio recorre un objeto");
		
		System.out.println("¿A qué velocidad va el objeto?");
		
		velocidad=Leer.datoDouble();
		
		System.out.println("¿Cuánto es el espacio inicial en metros que ha recorrido el objeto?");
		
		espacioInicial=Leer.datoDouble();
		
		System.out.println("¿Cuánto tiempo en segundos ha estado el objeto en movimiento?");
		
		tiempo=Leer.datoDouble();
		
		espacio=espacioInicial+velocidad*tiempo;
		
		System.out.printf("El objeto ha recorrido %.2f metros",espacio);
		
	}

}
