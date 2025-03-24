package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precio, descuento, total, precioDesc, totalFinal;
		int cantidad, dia, cien = 100;
		String lunes = "Lunes";
		String martes = "Martes";
		String miercoles = "Miercoles";
		String jueves = "Jueves";
		String viernes = "Viernes";
		String sabado = "Sabado";
		String domingo = "Domingo";

		System.out.println("Bienvenido a nuestro cine, ¿cuánto cuesta la entrada?");
		precio = Leer.datoDouble();

		System.out.println("¿Cuántas entradas quiere?");
		cantidad = Leer.datoInt();

		System.out.printf(
				"¿Para que día de la semana son las entradas? (Seleccione el numero que corresponde con el día)\n"
						+ "- 1. %s.\n" + "- 2. %s.\n" + "- 3. %s.\n" + "- 4. %s.\n" + "- 5. %s.\n" + "- 6. %s.\n"
						+ "- 7. %s.\n",
				lunes, martes, miercoles, jueves, viernes, sabado, domingo);
		dia = Leer.datoInt();
		total = precio * cantidad;

		if (dia == 3) {
			System.out.printf(
					"El total es %.2f€, pero el Miercoles es el día del espectador, ¿cuánto quiere que le descontemos del precio final?\n",
					total);
			descuento = Leer.datoDouble();
			precioDesc = total * descuento / cien;
			totalFinal = total - precioDesc;

			System.out.printf("Perfecto, el total a pagar con el descuento del %.2f%% es de %.2f€\n"
					+ "¡Gracias por su visita!", descuento,
					totalFinal);
		} else {
			System.out.printf("Perfecto, el total a pagar es de %.2f€\n"
					+ "¡Gracias por su visita!", total);
		}

	}

}
