package repasoarrays;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd = new Random(System.nanoTime());

		int[] array;
		int tam, desde, hasta, suma = 0, mayor = 0, menor = 0;

		System.out.print("Dime de que tamaño quieres que sea el array: ");
		tam = Leer.datoInt();
		array = new int[tam];

		System.out.println("¿Desde que numero quieres que se rellene el array?");
		desde = Leer.datoInt();

		System.out.println("¿Hasta que numero quieres que se rellene el array?");
		hasta = Leer.datoInt();

		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(hasta - desde + 1) + desde;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "\t");
			suma += array[i];
		}
		System.out.println("La suma de todos los valores del array es " + suma);

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
		System.out.println("El mayor es " + mayor + " y el menor es " + menor);
	}

}
