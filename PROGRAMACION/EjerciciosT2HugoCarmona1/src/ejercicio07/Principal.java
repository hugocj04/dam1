package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precio, descuento, total, precioDesc, totalFinal;
		int cantidad, cien = 100;

		System.out.println("Bienvenido a nuestra tienda. ¿Cuánto cuesta el producto que desea?");
		precio = Leer.datoDouble();

		System.out.println("¿Cuántos va a querer?");
		cantidad = Leer.datoInt();

		total = precio * cantidad;

		if (total >= 100) {
			System.out.printf(
					"Su compra es de %.2f€, por lo tanto supera los 100€, ¿cuánto porcentaje de descuento desea aplicarle al total?\n",
					total);
			descuento = Leer.datoDouble();
			precioDesc = total * descuento / cien;
			totalFinal = total - precioDesc;
			System.out.printf("Perfecto, su compra es de %.2f€ con el descuento del %.0f%% aplicado.\n"
					+ "¡Gracias por su visita!", totalFinal, descuento);
		} else {
			System.out.printf("Perfecto, su compra es de %.2f€\n" + "¡Gracias por su visita!", total);
		}
	}

}
