package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numerador, denominador, sol;

		System.out.println("Vamos a dividir dos numeros.\n" + "Dime el primer numero");

		numerador = Leer.datoDouble();

		System.out.println("Dime el segundo numero");

		denominador = Leer.datoDouble();
		sol = numerador / denominador;

		if (denominador == 0) {
			System.out.println("No se puede hacer la operación");

		} else {
			sol = numerador / denominador;
			System.out.printf("Resultado: %.2f", sol);
		}
	}

}
