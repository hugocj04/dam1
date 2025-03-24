package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n1, n2, resultado;

		System.out.print("Dime el numero 1: ");
		n1 = Leer.datoDouble();

		System.out.print("Dime el numero 2: ");
		n2 = Leer.datoDouble();

		if (n2 > 0) {
			resultado = n1 / n2;
			System.out.printf("%.0f / %.0f = %.2f", n1, n2, resultado);
		} else {
			System.out.println("ERROR: No se pueden realizar divisiones entre 0 (Indeterminación)");			
		}
	}

}
