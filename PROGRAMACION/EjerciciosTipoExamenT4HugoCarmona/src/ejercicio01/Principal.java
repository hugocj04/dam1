package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Habitacion h = new Habitacion(100, true, "Hugo", 3, 1);
		Suite s = new Suite(100, true, "Paco", 6, 2, 145, 13, 15, 100);
		Apartamento a = new Apartamento(100, true, "Hugo", 3, 1, true);
		Habitacion [] lista = {h, s, a};
		GestionHabitaciones gh = new GestionHabitaciones(lista);
		
		int opcion, opcionHabitacion;
		
		System.out.println("Bienvenido a nuestro hotel.\n");
		
		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("""
					1. Calcular el precio a pagar por una habitación de la lista elegida por el usuario.
					2. Calcular lo recaudado en total entre todas las habitaciones ocupadas.
					3. Mostrar factura con toda la información.
					4. Mostrar listado solo de las habitaciones que no están ocupadas.
					5. Salir
					""");
			opcion = Leer.datoInt();
			
			switch(opcion) {
			case 1:
				System.out.println("¿Qué tipo de habitacion ha elegido?");
				System.out.println(""" 
						1. Habitación normal
						2. Suite
						3. Apartamento
						""");
				opcionHabitacion = Leer.datoInt();
				while (opcionHabitacion < 1 && opcionHabitacion > 3) {
					System.out.println("Opcion inexistente, intentelo de nuevo: ");
					System.out.println(""" 
							1. Habitación normal
							2. Suite
							3. Apartamento
							""");
					opcionHabitacion = Leer.datoInt();
				}
				System.out.printf("El precio es de %.2f€\n\n", gh.calcularPrecioHabitacionElegida(gh.findHabitacion(opcionHabitacion - 1)));
				break;
			case 2:
				System.out.printf("El total de todas las habitaciones es de %.2f€\n\n", gh.calcularTotalHabitaciones());
				break;
			case 3:
				System.out.println("¿Qué tipo de habitacion ha elegido?");
				System.out.println(""" 
						1. Habitación normal
						2. Suite
						3. Apartamento
						""");
				opcionHabitacion = Leer.datoInt();
				while (opcionHabitacion < 1 && opcionHabitacion > 3) {
					System.out.println("Opcion inexistente, intentelo de nuevo: ");
					System.out.println(""" 
							1. Habitación normal
							2. Suite
							3. Apartamento
							""");
					opcionHabitacion = Leer.datoInt();
				}
				gh.mostrarFacturaHabitacion(gh.findHabitacion(opcionHabitacion - 1));
				break;
			case 4:
				gh.mostrarHabitacionesLibres();
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
