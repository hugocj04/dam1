package ejercicio05;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd = new Random(System.nanoTime());

		int[] array;
		int tam, desde, hasta, suma = 0, elegir, nuevoValor, mayor = 0, menor = 0;

		System.out.println("Buenas.");
		do {
			System.out.println("\n¿De que tamaño quieres que sea el array?");
			System.out.println("(Pulsa 0 para salir)");
			tam = Leer.datoInt();

			if (tam != 0 || tam > 0) {
				array = new int[tam];

				System.out.println("¿Desde donde quiere que empezar a rellenar el array?");
				desde = Leer.datoInt();

				System.out.println("¿Hasta donde quiere que sea el tope?");
				hasta = Leer.datoInt();

				for (int i = 0; i < array.length; i++) {
					array[i] = rnd.nextInt(hasta - desde + 1) + desde;
				}

				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + "\t");
				}

				suma = 0;

				for (int i = 0; i < array.length; i++) {
					suma += array[i];
				}

				mayor = array[0];
				menor = array[0];

				for (int i = 0; i < array.length; i++) {
					if (array[i] > mayor) {
						mayor = array[i];
					}
					if (array[i] < menor) {
						menor = array[i];
					}
				}

				System.out.println("\nLa suma de todos los numeros es " + suma);
				System.out.println("El mayor es " + mayor);
				System.out.println("El menor es " + menor);
				System.out.println("\n¿Que valor quieres modificar?");
				elegir = Leer.datoInt();

				System.out.println("¿Cuál es el nuevo valor?");
				nuevoValor = Leer.datoInt();
				array[elegir - 1] = nuevoValor;

				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + "\t");
				}				
			}
		} while (tam != 0 || tam > 0);

		System.out.println("Saliendo...");
	}

}
