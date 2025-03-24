package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precioProducto, total, descuento, porcentaje, totalFinal, cien = 100;
		int cant, topeDesc = 100;

		System.out.println("Bienvenido a nuestra tienda.");
		System.out.println("¿Cuánto vale el prodcuto que desea llevarse?");
		precioProducto = Leer.datoDouble();

		System.out.println("¿Cuántas unidades desea llevarse?");
		cant = Leer.datoInt();
		total = precioProducto * cant;

		if (total < topeDesc) {
			System.out.println("No hay descuento");
			System.out.printf("El precio final es de %.2f€", total);
		} else {
			System.out.printf(
					"Su compra es de %.2f€, por lo que supera los %.2f€, ¿cuánto porcentaje de descuento desea aplicarle al total de su compra?\n",
					total, cien);
			porcentaje = Leer.datoInt();
			descuento = total * porcentaje / cien;
			totalFinal = total - descuento;
			System.out.printf("Perfecto, su compra con el %.0f%% aplicado, pasa a costar %.2f€", porcentaje,
					totalFinal);
		}
	}
}
