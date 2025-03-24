package ejercicio06corregido;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Generadora g = new Generadora();
		int opcion, resultadoPOI, resultadoQuiniela, resultadoPrimitiva, resultadoChinos, mayor, menor, opcionJugador;

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
					System.out.println("¿Entre que numero quieres que sean generados los numeros?");
					System.out.print("Dime el menor: ");
					menor = Leer.datoInt();
					System.out.print("Dime el mayor: ");
					mayor = Leer.datoInt();
					resultadoPOI = g.generarQuiniela(mayor, menor);
					System.out.print("\nEl numero generado es " + resultadoPOI + " y ");
					g.comprobarPOI(resultadoPOI);
					break;
				case 2:
					System.out.print("Elige un numero: ");
					opcionJugador = Leer.datoInt();
					resultadoQuiniela = g.generarAleatorio(2, 0);
					g.comprobarQuiniela(resultadoQuiniela);
					g.mostrarGanadorQuiniela(opcionJugador, resultadoQuiniela);
					break;
				case 3:
					System.out.println("¿Entre que numeros quieres que se generen para jugar a los chinos?");
					System.out.print("Dime el menor: ");
					menor = Leer.datoInt();
					System.out.print("Dime el mayor: ");
					mayor = Leer.datoInt();
					resultadoChinos = g.generarAleatorio(mayor, menor);
					System.out.println("\nEl numero generado es " + resultadoChinos);
					break;
				case 4:
					System.out.println("¿Entre que numeros se generan los numeros de la primitiva?");
					System.out.print("Dime el menor: ");
					menor = Leer.datoInt();
					System.out.print("Dime el mayor: ");
					mayor = Leer.datoInt();
					resultadoPrimitiva = g.generarAleatorio(mayor, menor);
					System.out.println("\nEl numero ganador de la primitiva es el " + resultadoPrimitiva);
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
