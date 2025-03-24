package ejemploarrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Para arrays siempre for
		// Siempre vamos a acabar el for en un array con un .length

		// Forma 1: Lineas distintas

		int tam;
		int edades[];

		System.out.println("Diga numero de alumnos");
		tam = Leer.datoInt();
		edades = new int[tam];

		// Forma 2: En la misma linea

		int edades2[] = new int[tam];

		// Forma 3: Inicializando con valores

		int[] edades3 = { 23, 43, 33, 56 };

		// Imprimir un valor

		System.out.println("El valor es: " + edades3[2]);
		edades3[1] = 42;
		System.out.println("El valor nuevo es: " + edades3[1]);

		for (int i = 0; i < edades3.length; i++) {
			System.out.print(edades3[i] + "\t");
		}

	}

}
