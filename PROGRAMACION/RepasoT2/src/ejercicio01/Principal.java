package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2;
		System.out.print("Dime el numero 1: ");
		n1 = Leer.datoInt();

		System.out.print("Dime el numero 2: ");
		n2 = Leer.datoInt();

		if (n1 > n2) {
			System.out.println("El " + n1 + " es mayor que el " + n2);
		} else if (n2 > n1) {
			System.out.println("El " + n2 + " es mayor que el " + n1);
		}
		if (n1 == n2) {
			System.out.println(n1 + " y " + n2 + ", ambos numeros son iguales");
		}
	}

}
