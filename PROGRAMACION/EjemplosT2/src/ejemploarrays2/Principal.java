package ejemploarrays2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam, op, buscar;
		int edades[];

		System.out.println("Diga numero de alumnos");
		tam = Leer.datoInt();
		edades = new int[tam];

		// Para rellenar leyendo por teclado

		for (int i = 0; i < edades.length; i++) {
			System.out.println("Dime la edad del alumno " + (i + 1));
			edades[i] = Leer.datoInt();
		}

		// Para imprimir

		for (int i = 0; i < edades.length; i++) {
			System.out.print(edades[i] + "\t\n");
		}

		/*
		 * for (int aux : edades) { System.out.print(aux+"\t"); }
		 */

		// Para buscar
		// Por indice

		System.out.println("Diga el elemento que quiere buscar");
		op = Leer.datoInt();
		// Hay varias posibilidades ahora
		// op = Leer.datoInt()-1
		System.out.println(edades[op - 1]);

		System.out.println("Diga la edad que quiere buscar");
		buscar = Leer.datoInt();

	}

}
