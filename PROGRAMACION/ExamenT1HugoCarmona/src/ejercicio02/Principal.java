package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cien = 100, total, pago, cambio, descuento;
		double cant1, cant2, cant3, cant4, subtotal1, subtotal2, subtotal3, subtotal4, imp, desc, totalImp, totalDesc;
		double precio1 = 0.14;
		double precio2 = 77.99;
		double precio3 = 235.5;
		double precio4 = 7.5;
		double iva = 21;

		String producto1 = "Metros de cable de internet";
		String producto2 = "Pantallas de ordenador";
		String producto3 = "Ordenadores de sobremesa";
		String producto4 = "Ratones opticos";

		System.out.printf(
				"Bienvenido a nuestra tienda, este es nuestro catalogo:\n\n" + "- %s --> %.2f€\n" + "- %s --> %.2f€\n"
						+ "- %s --> %.2f€\n" + "- %s --> %.2f€\n\n",
				producto1, precio1, producto2, precio2, producto3, precio3, producto4, precio4);

		System.out.printf("¿Cuánto %s quiere?\n", producto1);

		cant1 = Leer.datoDouble();
		subtotal1 = precio1 * cant1;

		System.out.printf("¿Cuántas %s quiere?\n", producto2);

		cant2 = Leer.datoDouble();
		subtotal2 = precio2 * cant2;

		System.out.printf("¿Cuántos %s quiere?\n", producto3);

		cant3 = Leer.datoDouble();
		subtotal3 = precio3 * cant3;

		System.out.printf("¿Cuántos %s quiere?\n", producto4);

		cant4 = Leer.datoDouble();
		subtotal4 = precio4 * cant4;

		total = subtotal1 + subtotal2 + subtotal3 + subtotal4;
		imp = total * iva / cien;
		totalImp = total + imp;

		System.out.printf("El total a pagar es de %.2f€, pague aqui porfavor:\n", totalImp);

		pago = Leer.datoDouble();
		cambio = pago - totalImp;

		System.out.printf("Aqui tiene su cambio de %.2f€.\n", cambio);

		System.out.printf("¡Gracias por su visita! Aquí tiene su ticket:\n\n"
				+ "=========================================================================================\n"
				+ "/\t\t\t\t\t\t\t\t\t\t\t/\n" + "/\t\t\t\tTIENDA DE INFORMATICA\t\t\t\t\t/\n"
				+ "/\t\t\t\t\t\t\t\t\t\t\t/\n"
				+ "/---------------------------------------------------------------------------------------/\n"
				+ "/\t\t\t\t\t\t\t\t\t\t\t/\n" + "/\tNOMBRE\t\t\t\tCANTIDAD\tPRECIO\t\tSUBTOTAL\t/\n"
				+ "/\t%s\t%.0f\t\t%.2f€\t\t%.2f\t\t/\n" + "/\t%s\t\t%.0f\t\t%.2f€\t\t%.2f\t\t/\n"
				+ "/\t%s\t%.0f\t\t%.2f€\t\t%.2f\t\t/\n" + "/\t%s\t\t\t%.0f\t\t%.2f€\t\t%.2f\t\t/\n"
				+ "/\t\t\t\t\t\t\t\t\t\t\t/\n"
				+ "/---------------------------------------------------------------------------------------/\n"
				+ "/\t\t\t\t\t\t\t\t\t\t\t/\n" + "/\t\t\tTOTAL:\t\t\t%.2f€\t\t\t\t/\n"
				+ "/\t\t\tIVA:\t\t\t%.2f€\t\t\t\t/\n" + "/\t\t\tTOTAL + IVA:\t\t%.2f€\t\t\t\t/\n"
				+ "/\t\t\tPAGO:\t\t\t%.2f€\t\t\t\t/\n" + "/\t\t\tCAMBIO:\t\t\t%.2f€\t\t\t\t\t/\n"
				+ "/\t\t\t\t\t\t\t\t\t\t\t/\n"
				+ "=========================================================================================\n\n",
				producto1, cant1, precio1, subtotal1, producto2, cant2, precio2, subtotal2, producto3, cant3, precio3,
				subtotal3, producto4, cant4, precio4, subtotal4, total, imp, totalImp, pago, cambio);

		System.out.println(
				"Por ser usted, puede aplicarle el descuento que desee, ¿cuánto desea descontarle al precio final?");

		descuento = Leer.datoDouble();
		desc = totalImp * descuento / cien;
		totalDesc = totalImp - desc;

		System.out.printf("La cantidad total a pagar (IVA incluido) con el descuento del %.2f%% aplicado es de %.2f€\n"
				+ "¡Gracias por su visita!", descuento, totalDesc);
	}

}
