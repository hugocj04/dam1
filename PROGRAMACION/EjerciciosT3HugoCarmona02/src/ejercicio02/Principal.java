package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, diasCont = 0, habOcupada, bebidas;
		String tipo, serviciosExtra, nombreCliente, respuesta;
		double precioNoche = 0, precioBebidas, precioFinal;
		boolean limpia = true, ocupada = false;
		Habitacion h1;
		Habitacion [] lista = new Habitacion [10];
		Hotel hotel = new Hotel (lista);

		System.out.println("Bienvenido.");

		do {
			System.out.println("\n¿Qué desea hacer?");
			System.out.println("1. Agregar una habitacion a la lista");
			System.out.println("2. Ver si una habitacion esta ocupada");
			System.out.println("3. Calcular precio final");
			System.out.println("4. Mostrar factura");
			System.out.println("5. Salir");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				System.out.print("Diga su nombre: ");
				nombreCliente = Leer.dato();
				System.out.print("Diga el tipo de habitacion: ");
				tipo = Leer.dato();
				System.out.print("Diga el precio por noche: ");
				precioNoche = Leer.datoDouble();
				System.out.print("Diga los dias que desea estar: ");
				diasCont = Leer.datoInt();
				System.out.print("Diga que servicios extra quiere: ");
				serviciosExtra = Leer.dato();
				h1 = new Habitacion (tipo, precioNoche, serviciosExtra, nombreCliente, diasCont, limpia, ocupada);
				hotel.agregarHabitacion(h1);
				break;
			case 2:
				System.out.println("Introduzca el numero de la habitacion que quiere ver si esta ocupada: ");
				habOcupada = Leer.datoInt();
				System.out.println(lista[habOcupada - 1].isOcupada());
				break;
			case 3:
				System.out.println("¿Has consumido en el minibar?");
				respuesta = Leer.dato();
				if (respuesta.equals("si") || respuesta.equals("Si")) {
					System.out.println("¿Cuantas bebidas has consumido en el minibar?");
					bebidas = Leer.datoInt();
					System.out.println("¿Cuanto valia la bebida?");
					precioBebidas = Leer.datoDouble();
					hotel.calcularPrecioFinal(diasCont, precioNoche, bebidas, precioBebidas);
				} else {
		        	precioFinal = diasCont * precioNoche;
					System.out.printf("El precio final es %.2f€", precioFinal);
				}
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opcion inexistente, intentelo de nuevo");
				break;
			}

		} while (opcion != 5);

	}

}