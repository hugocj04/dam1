package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, par = 2, cero = 0;

		System.out.print("Buenas, dime un numero y te diremos si es par o impar: ");
		numero = Leer.datoInt();

		if (numero % par == cero) {
			System.out.printf("El numero %d es par", numero);
		} else {
			System.out.printf("El numero %d es impar", numero);
		}

	}

}
