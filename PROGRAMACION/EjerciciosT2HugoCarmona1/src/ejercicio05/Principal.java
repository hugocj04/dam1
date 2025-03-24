package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero, exponente, sol, cero = 0, uno = 1;

		System.out.println("Dime un numero");

		numero = Leer.datoDouble();

		System.out.println("Dime su exponente");

		exponente = Leer.datoDouble();

		if (exponente >= cero) {
			sol = Math.pow(numero, exponente);
			System.out.println(sol);
		}
		if (exponente < cero) {
			sol = uno / Math.pow(numero, exponente);
			System.out.println(sol);
		}

	}

}
