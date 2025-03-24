package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;
		String resultado;
		Juego j = new Juego();
		
		System.out.println("Bienvenido a mi juego de cara o cruz.");
		System.out.println("\n¿Qué cara de la moneda será la que elija?");
		System.out.println("1. Cara");
		System.out.println("2. Cruz");
		System.out.println("(3. Salir)");
		opcion = Leer.datoInt();

		while (opcion != 3) {
			
			System.out.print("\nHa salido " + j.lanzarMoneda());
			System.out.println("\nResultado = " + j.comprobarResultado(opcion));
			System.out.println("\n¿Cuál ha sido el resultado?");
			System.out.println("1. Ganar (Escriba true)");
			System.out.println("2. Perder (Escriba false)");
			resultado = Leer.dato();
			j.devolverResultado(resultado);	
			
			System.out.println("\n¿Qué cara de la moneda será la que elija?");
			System.out.println("1. Cara");
			System.out.println("2. Cruz");
			System.out.println("(3. Salir)");
			opcion = Leer.datoInt();
		}
		System.out.println("Saliendo...");
	}
}
