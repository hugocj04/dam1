package ejercicio19;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salario, sueldoFijo = 1000, cobroVentas, ventas = 0, porcentajeVentas;
		int cien = 100;

		System.out.println("Buenas.");

		do {
			System.out.println("Vamos a calcular tu salario mensual.\n" + "¿Cuánto habeis vendido este mes?");
			ventas = Leer.datoInt();
			
			System.out.println("¿Cuánto porcentaje te llevas de las ventas?");
			porcentajeVentas = Leer.datoInt();

			cobroVentas = ventas * porcentajeVentas / cien;
			salario = sueldoFijo + cobroVentas;

			System.out.printf(
					"Sabiendo que tu sueldo fijo es de %.2f€, a esto le sumanos el %.0f%% de las ventas que te llevas y tu salario mensual es de %.2f€\n\n",
					sueldoFijo, porcentajeVentas, salario);
			System.out.println("(Para salir del programa introduzca -1 en las ventas del mes)");
		} while (ventas >= 0);
		System.out.println("Saliendo...");
	}

}
