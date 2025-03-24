package ejercicio;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd = new Random(System.nanoTime());

		int[] clases;
		double media;
		int tam, opcion, desde, hasta, eleccionClase, masDinero, contador = 0, suma = 0, claseSuma, porcentaje,
				cien = 100, noventa = 90, mayor, claseMasDinero = 0;

		System.out.println("Bienvenido a nuestro programa para gestionar el dinero del Domund");
		System.out.println("¿Cuántas clases hay en tu instituto?");
		tam = Leer.datoInt();
		clases = new int[tam];

		do {
			System.out.println("\n¿Qué desea hacer?");
			System.out.println(
					"\t1. Generar aleatoriamente el número de euros recogidos por cada clase entre los números que el usuario desée");
			System.out.println("\t2. Mostrar los euros de una clase");
			System.out.println(
					"\t3. Mostrar la cantidad de clases que han conseguido mas dinero que lo que indique el usuario");
			System.out.println("\t4. Calcular la media de euros recaudados entre todas las clases");
			System.out.println("\t5. Mostrar los datos por columnas");
			System.out.println("\t6. Sumar a una clase");
			System.out.println(
					"\t7. (La media recaudada en otros años ha sido de 90 euros por clase). Calcular el porcentaje de euros recogidos por una clase");
			System.out.println("\t8. Mostrar la clase que más dinero a recaudado");
			System.out.println("\t9. Salir");
			opcion = Leer.datoInt();

			switch (opcion) {
				case 1:
					System.out.println("¿Cuántos euros quiere que sea el mínimo recogido?");
					desde = Leer.datoInt();
	
					System.out.println("¿Cuál quiere que sea el tope de euros recogidos?");
					hasta = Leer.datoInt();
	
					for (int i = 0; i < clases.length; i++) {
						clases[i] = rnd.nextInt(hasta - desde + 1) + desde;
					}
	
					for (int i = 0; i < clases.length; i++) {
						System.out.print(clases[i] + "€\t");
					}
					System.out.println("");
					break;
				case 2:
					System.out.println("¿De cuál clase quiere ver la cantidad de euros que han recogido?");
					eleccionClase = Leer.datoInt();
					while (eleccionClase > clases.length) {
						System.out.println("Esta clase no existe, introduzca de nuevo la clase.");
						eleccionClase = Leer.datoInt();
					}
					System.out.println("Esa clase ha recaudado " + clases[eleccionClase - 1] + "€.");
					break;
				case 3:
					contador = 0;
					System.out.print("Introduzca la cantidad de dinero que deben haber recaudado las clases: ");
					masDinero = Leer.datoInt();
					for (int i = 0; i < clases.length; i++) {
						if (clases[i] > masDinero) {
							contador++;
						}
					}
					System.out.println(contador + " clases han recogido mas de " + masDinero + "€.");
					break;
				case 4:
					media = 0;
					suma = 0;
					for (int i = 0; i < clases.length; i++) {
						suma += clases[i];
					}
					media = (double) suma / clases.length;
					System.out.println("La media de euros recaudados entre todas las clases es de " + media + "€.");
					break;
				case 5:
					System.out.println("Estos son los datos por columnas: \n");
					System.out.println("Clases\t\tDinero");
					System.out.println("----------------------");
					for (int i = 0; i < clases.length; i++) {
						System.out.println("Clase " + (i + 1) + "\t\t" + clases[i] + "€");
					}
					break;
				case 6:
					System.out.println("¿A qué clase quieres sumarle dinero?");
					eleccionClase = Leer.datoInt() - 1;
					System.out.println("¿Cuánto le quieres sumar?");
					claseSuma = Leer.datoInt();
					clases[eleccionClase] = clases[eleccionClase] + claseSuma;
					System.out.println("Esa clase ahora tiene " + clases[eleccionClase] + "€.");
					break;
				case 7:
					porcentaje = 0;
					System.out.println("¿De qué clase quieres calcular el porcentaje de euros recogidos?");
					eleccionClase = Leer.datoInt();
					while (eleccionClase > clases.length) {
						System.out.println("Esta clase no existe, introduzca de nuevo la clase.");
						eleccionClase = Leer.datoInt();
					}
					porcentaje = clases[eleccionClase - 1] * cien / noventa;
					System.out.println("El porcentaje recogido por esa clase es de " + porcentaje + "%.");
					break;
				case 8:
					mayor = clases[0];
					for (int i = 0; i < clases.length; i++) {
						if (clases[i] > mayor) {
							mayor = clases[i];
							claseMasDinero = i;
						}
					}
					System.out.println("La clase que más dinero ha recaudado es la " + (claseMasDinero + 1) + ", con "
							+ mayor + "€ recaudados.");
					break;
				case 9:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opción inexistente, intentelo de nuevo.");
					break;
			}
		} while (opcion != 9);
	}
}
