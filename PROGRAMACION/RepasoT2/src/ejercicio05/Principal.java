package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero, exponente, resultado;

		System.out.print("Dime un numero: ");
		numero = Leer.datoInt();

		System.out.print("Dime su exponente: ");
		exponente = Leer.datoInt();

		if (exponente >= 0) {
			resultado = Math.pow(numero, exponente);
			System.out.println(resultado);
		}
		if (exponente < 0) {
			resultado = 1/Math.pow(numero, exponente);
			System.out.println(resultado);
		}
	}

}
