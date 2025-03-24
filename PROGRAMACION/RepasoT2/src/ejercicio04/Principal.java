package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double saldo, retirar, nuevoSaldo;

		System.out.println("¿Cuánto saldo tienes en tu cuenta?");
		saldo = Leer.datoDouble();

		System.out.println("¿Cuánto dinero quieres retirar?");
		retirar = Leer.datoDouble();

		if (saldo > retirar) {
			nuevoSaldo = saldo - retirar;
			System.out.printf("Operación realizada con exito. Tu saldo actual es de %.2f€", nuevoSaldo);
		} else {
			System.out.printf("Saldo insuficiente");
		}
	}

}
