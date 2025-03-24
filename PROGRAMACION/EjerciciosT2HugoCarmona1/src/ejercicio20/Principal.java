package ejercicio20;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double costeEntrada, cantEntradas, saldo = 30500, retiro, ingreso;
		int seleccion = 0;

		System.out.println("Bienvenido a su cajero automatico.\n");

		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("1. Ver saldo\n" + "2. Retirar dinero\n" + "3. Comprar entradas\n"
					+ "4. Ingresar dinero\n" + "5. Salir del programa");
			seleccion = Leer.datoInt();

			switch (seleccion) {
			case 1:
				System.out.printf("Su saldo es de %.2f€\n\n", saldo);
				break;
			case 2:
				System.out.println("¿Cuánto desea retirar?");
				retiro = Leer.datoDouble();
				saldo = saldo - retiro;
				System.out.printf("Retirada realizada con exito. (Saldo actual: %.2f€)\n\n", saldo);
				break;
			case 3:
				System.out.println("¿Cuantas entradas quiere?");
				cantEntradas = Leer.datoDouble();

				System.out.println("¿Cuánto cuesta cada entrada?");
				costeEntrada = Leer.datoDouble();
				saldo = saldo - cantEntradas * costeEntrada;
				System.out.printf("Compra realizada con exito. (Saldo actual: %.2f€)\n\n", saldo);
				break;
			case 4:
				System.out.println("¿Cuánto dinero quiere ingresar?");
				ingreso = Leer.datoDouble();
				saldo = saldo + ingreso;
				System.out.printf("Ingreso realizado con exito. (Saldo actual: %.2f€)\n\n", saldo);
				break;
			case 5:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no valida.\n");
				break;
			}
		} while (seleccion != 5);

	}

}
