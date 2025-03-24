package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String titular;
		int opcion = 0;
		double ingreso, retiro, dolarAmericano;
		CuentaCorriente c1 = new CuentaCorriente();

		System.out.println("Bienvenido a su cuenta.");
		System.out.println("\n¿Cuál es el nombre del titular de la cuenta?");
		titular = Leer.dato();

		do {
			System.out.println("\n¿Qué desea hacer?");
			System.out.println("1. Ingresar dinero");
			System.out.println("2. Retirar dinero");
			System.out.println("3. Calcular el saldo en dolares americanos");
			System.out.println("4. Consultar saldo");
			System.out.println("5. Salir");
			opcion = Leer.datoInt();

			switch (opcion) {
				case 1:
					System.out.println("¿Cuánto desea ingresar?");
					ingreso = Leer.datoDouble();
					c1.ingresarDinero(ingreso);
					System.out.println("Dinero ingresado correctamente.");
					break;
				case 2:
					System.out.println("\n¿Cuánto desea retirar?");
					retiro = Leer.datoDouble();
					c1.retirarDinero(retiro);
					c1.imprimirFallo(c1.retirarDinero(retiro));
					break;
				case 3:
					System.out.println("\n¿A cuántos dolares americanos equivale 1 euro?");
					dolarAmericano = Leer.datoDouble();
					System.out.printf("\nTu saldo en dolares americanos es %.2f$\n", c1.convertir(dolarAmericano));
					break;
				case 4:
					System.out.printf("\nSaldo: %.2f€\n", c1.mostrarSaldo());
					break;
				case 5:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("\nOpción inexistente, intentelo de nuevo.");
					break;
			}
		} while (opcion != 5);

	}

}
