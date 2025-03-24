package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, resultadoPOI, resultadoPrimitiva, resultadoChinos, mayor, menor;
		Generadora quiniela = new Generadora();
		Generadora parImpar = new Generadora();
		Generadora imprimirPOI = new Generadora();
		Generadora chinos = new Generadora();
		Generadora primitiva = new Generadora();

		System.out.println("Bienvenido.");

		do {
			System.out.println("\nElija una opcion:");
			System.out.println("1. Jugar a pares o nones");
			System.out.println("2. Jugar a la quiniela");
			System.out.println("3. Jugar a los chinos");
			System.out.println("4. Sorteo de la primitiva ");
			System.out.println("5. Salir");
			opcion = Leer.datoInt();

			switch (opcion) {
				case 1:
					System.out.println("¿Entre que numero quieres que sean generador los numeros?");
					System.out.print("Dime el menor: ");
					menor = Leer.datoInt();
					System.out.print("Dime el mayor: ");
					mayor = Leer.datoInt();
					resultadoPOI = parImpar.generarPOI(mayor, menor);
					System.out.print("El numero generado es " + resultadoPOI + " y ");
					imprimirPOI.imprimirPOI(resultadoPOI);
					break;
				case 2:
					System.out.println("\n(1 = Gana local, 2 = Empate, 3 = Gana visitante)");
					System.out.println("El resultado de la quiniela es " + quiniela.generarQuiniela());
					break;
				case 3:
					System.out.println("¿Entre que numeros quieres que se generen para jugar a los chinos?");
					System.out.print("Dime el menor: ");
					menor = Leer.datoInt();
					System.out.print("Dime el mayor: ");
					mayor = Leer.datoInt();
					resultadoChinos = chinos.generarChinos(mayor, menor);
					System.out.println("El numero generado es " + resultadoChinos);
					break;
				case 4:
					System.out.println("¿Entre que numeros se generan los numeros de la primitiva?");
					System.out.print("Dime el menor: ");
					menor = Leer.datoInt();
					System.out.print("Dime el mayor: ");
					mayor = Leer.datoInt();
					resultadoPrimitiva = primitiva.generarPrimitiva(mayor, menor);
					System.out.println("El numero ganador de la primitiva es el " + resultadoPrimitiva);
					break;
				case 5:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opcion inexistente, intentelo de nuevo.");
					break;
			}
		} while (opcion != 5);
	}
}
