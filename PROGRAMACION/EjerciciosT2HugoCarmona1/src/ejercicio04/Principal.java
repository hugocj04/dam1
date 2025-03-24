package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dinero, saldo, saldoActual;

		System.out.println("¿Cuanto saldo tienes en tu cuenta?");
		saldo = Leer.datoDouble();

		System.out.println("¿Cuanto dinero quieres retirar?");
		dinero = Leer.datoDouble();

		if (dinero > saldo) {
			System.out.println("No se puede reitrar el dinero ya que supera el saldo que usted tiene.");
		} else {
			saldoActual = saldo - dinero;
			System.out.printf("Dinero retirado con exito.\n" + "- Saldo actual: %.2f€\n" + "- Cantidad retirada: %.2f€",
					saldoActual, dinero);
		}
	}

}
