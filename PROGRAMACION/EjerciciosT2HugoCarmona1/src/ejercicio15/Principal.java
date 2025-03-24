package ejercicio15;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, multiplicacion;

		System.out.println("Bienvenido.");

		do {
			System.out.print("Dinos un número entre el 0 y el 10 y le mostraremos su tabla de multiplicar: ");
			numero = Leer.datoInt();

			if (numero >= 1 && numero <= 10) {
				for (int i = 0; i <= 10; i++) {
					multiplicacion = numero * i;
					System.out.printf("%d x %d = %d\n", numero, i, multiplicacion);
				}
				System.out.println("(Para salir introduzca un numero negativo)");
			}
		} while (numero >= 0);
		System.out.println("Saliendo...");
	}

}
