package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor;
		
		System.out.print("Dime un numero y te diremos si es par o impar: ");
		valor = Leer.datoDouble();
		
		if (valor % 2 == 0) {
			System.out.printf("El numero %.0f es par", valor);
		} else {
			System.out.printf("El numero %.0f es impar", valor);
		}
	}

}
