package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movil m = new Movil(129, 4, "Galaxy A22", true, "Samsung");
		EspadaLaser el = new EspadaLaser(25, 10, "Espada de Obi-Wan Kenobi ", false, "Normal");
		EspadaLaser el2 = new EspadaLaser(25, 10, "Espada de Cal Kestis ", false, "Doble");
		Producto [] lista = {m, el, el2};
		Ventas v = new Ventas(lista);
		
		int opcion;
		double porcentaje, coste, pago;

		System.out.println("Bienvenido a nuestra tienda.");
		System.out.println("¿Cuánto porcentaje de ganacia quieres tener?");
		porcentaje = Leer.datoDouble();

		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("""
					1. Devolver la cantidad de productos que quedan por vender
					2. Calcular cantidad total recaudado
					3. Devolver cambio
					4. Mostrar listado de productos
					5. Salir
					""");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				System.out.printf("Hay %d productos sin vender\n\n", v.devolverProductosSinVender());
				break;
			case 2:
				System.out.printf("El total recaudado es de %.2f€\n\n",v.calcularTotalRecaudado(porcentaje));
				break;
			case 3:
				System.out.println("¿Cuánto cuesta el producto que desea?");
				coste = Leer.datoDouble();
				System.out.print("Pague aqui porfavor: ");
				pago = Leer.datoDouble();
				System.out.printf("Tome su vuelta: %.2f€\n\n", v.devolverCambio(coste, pago));
				break;
			case 4:
				v.mostrarListadoProductos();
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opcion inexistente, intentelo de nuevo.");
				break;
			}
		} while (opcion != 5);

	}

}
