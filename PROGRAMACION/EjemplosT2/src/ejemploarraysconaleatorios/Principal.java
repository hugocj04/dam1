package ejemploarraysconaleatorios;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd = new Random(System.nanoTime());

		String[] clase;
		double media, suma = 0;
		int tam, hasta, desde, buscado, contador = 0, elemento, nuevaEdad;
		int[] edades;

		System.out.println("Diga el tamaño");
		tam = Leer.datoInt();
		edades = new int[tam];
		clase = new String[tam];

		// Rellenar con aleatorios

		System.out.println("");

		System.out.println("Diga el menor generado");
		desde = Leer.datoInt();

		System.out.println("Y diga el mayor generado");
		hasta = Leer.datoInt();

		for (int i = 0; i < edades.length; i++) {
			// Ojo con lo sparentesis
			edades[i] = rnd.nextInt(hasta - desde + 1) + desde;
		}

		for (int valor : edades) {
			System.out.print(valor + "\t\n");
		}

		// Para buscar en el arrays

		System.out.println("¿Qué numero de los generados quieres buscar?");
		buscado = Leer.datoInt();

		for (int i = 0; i < edades.length; i++) {
			if (edades[i] == buscado) {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " numeros " + buscado);

		// Calcular la media

		for (int i = 0; i < edades.length; i++) {
			suma += edades[i];
		}
		media = suma / edades.length;
		System.out.printf("La media es %.2f\n", media);

		// Mostrar dos filas

		for (int i = 0; i < clase.length; i++) {
			System.out.println("Dime el nombre del alumno " + (i + 1));
			clase[i] = Leer.dato();
		}

		for (int i = 0; i < clase.length; i++) {
			System.out.print(clase[i] + "\t");
		}
		System.out.println("\n");

		for (int i = 0; i < edades.length; i++) {
			System.out.print(edades[i] + "\t\n");
		}

		// Cambiar un elemento dentro del array
		
		System.out.println("Diga el elemento que quiere cambiar");
		elemento = Leer.datoInt() - 1;
		
		System.out.println("Diga la nueva edad");
		nuevaEdad = Leer.datoInt();
		edades[elemento - 1] = nuevaEdad;
		
		for (int i = 0; i < edades.length; i++) {
			System.out.println(edades[i] + "\t");
		}
	}
}
