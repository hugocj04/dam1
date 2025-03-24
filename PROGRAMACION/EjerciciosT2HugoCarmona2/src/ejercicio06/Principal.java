package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam;
		double nevera[];
		String[] productos;

		System.out.println("Bienvenido.");

		do {
			System.out.println("¿Cuantos productos caben en tu nevera?");
			tam = Leer.datoInt();
			nevera = new double[tam];
			productos = new String[tam];

			for (int i = 0; i < productos.length; i++) {
				System.out.println("Dime el nombre del producto " + (i + 1));
				productos[i] = Leer.dato();
			}
			for (int i = 0; i < productos.length; i++) {
				System.out.print(productos[i] + "\t\t");
			}
			System.out.print("\n");
			for (int i = 0; i < nevera.length; i++) {
				System.out.println("\nDime cuanto cuesta el producto " + (i + 1));
				nevera[i] = Leer.datoDouble();
			}
			System.out.print("\n");
			for (int i = 0; i < productos.length; i++) {
				System.out.print(productos[i] + "\t\t");
			}
			System.out.print("\n");
			for (int i = 0; i < nevera.length; i++) {
				System.out.print(nevera[i] + "\t\t");
			}
			System.out.println("\n\n(Para salir introduzca un numero negativo)");
		} while (tam >= 0);
		System.out.println("Saliendo...");
	}

}
