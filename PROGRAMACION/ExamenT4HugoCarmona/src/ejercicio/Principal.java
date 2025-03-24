package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntradaGeneral e = new EntradaGeneral("Pablo", true, 4, 3, 15);
		EntradaGeneral f = new Familia("Hugo", true, 2, 4, 15, 4, 0);
		EntradaGeneral v = new Vip("Pedro", false, 5, 1, 15, 0);
		
		EntradaGeneral[] lista = {e, f, v};
		Taquilla t = new Taquilla(lista);
		
		int opcion, seleccion;
		double descuento = 0, cantidad = 0, porcDonativo = 0;
		
		System.out.println("Bienvenido.");
		
		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("""
					1. Calcular el precio de una entrada
					2. Calcular cuanto se dona de una entrada
					3. Calcular el total recaudado con las entradas de la zona de arriba
					4. Imprimir ticket de consumicion gratis por los invitados vip
					5. Calcular el total recaudado en donativos
					6. Calcular el total recaudado con entradas vip
					7. Salir
					""");
			opcion = Leer.datoInt();
			
			switch(opcion) {
			case 1:
				System.out.println("¿Qué tipo de entrada tienes?");
				System.out.println("""
						1. Normal
						2. Familia
						3. Vip
						""");
				seleccion = Leer.datoInt();
				if (seleccion == 2) {
					descuento = 10;
				} else if (seleccion == 3){
					cantidad = 5;
				}
				System.out.printf("El precio de la entrada es de %.2f€\n\n", t.calcularPrecioEntradaEligida(t.findEntrada(seleccion - 1), descuento, cantidad));
				break;
			case 2:
				System.out.println("¿Cuánto porcentaje se lleva el donativo?");
				porcDonativo = Leer.datoDouble();
				System.out.println("¿Qué tipo de entrada tienes?");
				System.out.println("""
						1. Normal
						2. Familia
						3. Vip
						""");
				seleccion = Leer.datoInt();
				if (seleccion == 2) {
					descuento = 10;
				} else if (seleccion == 3){
					cantidad = 5;
				}
				System.out.printf("La parte del donativo es de %.2f€\n", e.calcularDonativo(porcDonativo, descuento, cantidad));
				break;
			case 3:
				System.out.println("¿Cuánto es el descuento por familia numerosa?");
				descuento = Leer.datoDouble();
				System.out.println("¿Y cuál es la cantidad a pagar de más por la entrada vip?");
				cantidad = Leer.datoDouble();
				System.out.printf("El total recaudado es de %.2f€\n", t.calcularTotalZonaArriba(descuento, cantidad));
				break;
			case 4:
				t.imprimirTicketVip(lista);
				System.out.println("");
				break;
			case 5:
				System.out.println("¿Cuánto es el descuento por familia numerosa?");
				descuento = Leer.datoDouble();
				System.out.println("¿Y cuál es la cantidad a pagar de más por la entrada vip?");
				cantidad = Leer.datoDouble();
				System.out.println("¿Cuánto porcentaje se lleva el donativo?");
				porcDonativo = Leer.datoDouble();
				System.out.printf("El total recaudado en donativos es de %.2f€\n\n", t.calcularTotalDonativos(porcDonativo, descuento, cantidad));
				break;
			case 6:
				System.out.println("¿Cuánto es el descuento por familia numerosa?");
				descuento = Leer.datoDouble();
				System.out.println("¿Y cuál es la cantidad a pagar de más por la entrada vip?");
				cantidad = Leer.datoDouble();
				System.out.printf("El total recaudado con las entradas vip es de %.2f€\n\n", t.calcularTotalVip(lista, descuento, cantidad));
				break;
			case 7:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción inexistente, intentelo de nuevo");
				break;
			}
		} while (opcion != 7);
		
		
	}

}
