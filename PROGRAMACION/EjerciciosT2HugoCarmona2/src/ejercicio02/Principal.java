package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam = 10, numero;
		int[] posicion = new int[tam];

		for (int i = 0; i < 10; i++) {
			System.out.print("Dime un numero y lo multiplicare por 2: ");
			posicion[0] = Leer.datoInt();
			numero = posicion[0] * 2;
			System.out.println(numero + "\t");
		}

	}

}
