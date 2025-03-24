package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] posiciones;
		int tam, suma = 0, cero = 0;
		double media, numCeros = 0;

		tam = 8;
		posiciones = new int[tam];

		for (int i = 0; i < posiciones.length; i++) {
			System.out.println("Dime el numero que se encuentra en la posicion " + (i + 1));
			posiciones[i] = Leer.datoInt();
			suma += posiciones[i];
			if (posiciones[i] == cero) {
				numCeros++;
			}
		}
		media = (double) suma / posiciones.length;
		System.out.printf("La media es %.2f y hay %.0f numeros %d", media, numCeros, cero);

	}

}
