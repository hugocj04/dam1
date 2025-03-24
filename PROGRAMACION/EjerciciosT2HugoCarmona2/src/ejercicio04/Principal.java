package ejercicio04;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd = new Random(System.nanoTime());

		int[] posiciones;
		int tam = 10, desde, hasta;

		posiciones = new int[tam];

		System.out.println("Buenas.");
		System.out.println("¿Desde donde quiere empezar?");
		desde = Leer.datoInt();

		System.out.println("¿Hasta donde quiere que sea el tope?");
		hasta = Leer.datoInt();

		for (int i = 0; i < posiciones.length; i++) {
			posiciones[i] = rnd.nextInt(hasta - desde + 1) + desde;
			// System.out.println(posiciones[i]);
		}
		for (int valor : posiciones) {
			System.out.println(valor + "\t");
		}
	}

}
