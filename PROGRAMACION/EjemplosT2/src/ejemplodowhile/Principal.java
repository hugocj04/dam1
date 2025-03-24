package ejemplodowhile;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;

		System.out.println("Hola, ejemplo menú completo");
		System.out.println("Introduzca un número según opcion deseada");
		do {
			System.out.println("0. Para salir");
			System.out.println("1. Refranes");
			System.out.println("2. Titulos");
			System.out.println("3. Frases hechas");
			opcion = Leer.datoInt();

			switch (opcion) {
				case 0:
					System.out.println("Saliendo...");
					break;
				case 1:
					System.out.println("En abril aguas mil");
					break;
				case 2:
					System.out.println("Agila");
					break;
				case 3:
					System.out.println("No ni na");
					break;
				default:
					System.out.println("Opcion incorrecta");
					break;
				}
			} while (opcion != 0);

	}

}
