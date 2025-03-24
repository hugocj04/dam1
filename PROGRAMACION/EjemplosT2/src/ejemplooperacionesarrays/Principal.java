package ejemplooperacionesarrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam, elegida = 0, nuevoValor = 0;
		int[] numeros;

		System.out.println("Dime el tamaño del array");
		tam = Leer.datoInt();
		numeros = new int[tam];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime el valor de la posicion " + (i + 1));
			numeros[i] = Leer.datoInt();
		}

		// Mostramos

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "\t\n");
		}

		// Modificar un elemento

		System.out.println("Dime el elemento a modificar");
		elegida = Leer.datoInt();

		System.out.println("Dime el nuevo valor");
		nuevoValor = Leer.datoInt();
		numeros[elegida - 1] = nuevoValor;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + "\t");
		}

		// Modificar comprobando (do while)

		do {
			System.out.println("Dime el elemento a modificar");
			elegida = Leer.datoInt();
		} while (elegida > numeros.length || elegida <= 0);

		System.out.println("Dime el nuevo valor");
		nuevoValor = Leer.datoInt();
		numeros[elegida - 1] = nuevoValor;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + "\t");
		}

		// Modificar comprobando (while)

		System.out.println("Dime el elemento a modificar");
		elegida = Leer.datoInt();

		while (elegida > numeros.length || elegida < 1) {
			System.out.println("Invalido, otro");
			elegida = Leer.datoInt();
		}
		
		System.out.println("Dime el nuevo valor");
		nuevoValor = Leer.datoInt();
		numeros[elegida - 1] = nuevoValor;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + "\t");
		}


	}

}
