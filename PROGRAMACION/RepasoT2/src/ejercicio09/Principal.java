package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cant;
		double subtotal, total, porcentaje, descuento, cien = 100, totalFinal;
		String diaM = "Miercoles";
		String diam = "miercoles";
		String dia;

		System.out.println("¿Cuántas entradas desea comprar?");
		cant = Leer.datoInt();

		System.out.println("¿Cuánto cuesta cada entrada?");
		subtotal = Leer.datoDouble();
		total = cant * subtotal;

		System.out.println("¿Para que día de la semana?");
		dia = Leer.dato();

		if (dia.equals(diam) || dia.equals(diaM)) {
			System.out.println(
					"El miercoles es el dia del espectador, por lo que puede aplicarle el descuento que desee al total, ¿cuánto descuento desea aplicarle?");
			porcentaje = Leer.datoDouble();
			descuento = total * porcentaje / cien;
			totalFinal = total - descuento;
			System.out.printf("El precio final a pagar es de %.2f€ con el descuento del %.0f%% aplicado", totalFinal,
					porcentaje);
		} else {
			System.out.printf("El precio final a pagar es de %.2f€ ", total);
		}
	}

}
