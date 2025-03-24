package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String introducirNombre, nombreAdmin = "Administrador", introducirContraseña, contraseña = "1234";
		int opcion;

		System.out.println("Bienvenido.");
		System.out.println("--- Inicio de sesion ---");
		System.out.print("Introduzca su nombre de usuario: ");
		introducirNombre = Leer.dato();

		if (introducirNombre.equals(nombreAdmin)) {
			System.out.print("Introduzca su contraseña: ");
			introducirContraseña = Leer.dato();

			while (!introducirContraseña.equals(contraseña)) {
				System.out.print("Contraseña incorrecta, intentelo de nuevo: ");
				introducirContraseña = Leer.dato();
			}

			System.out.println("Inicio de sesión realizado con exito.");

			do {
				System.out.println("¿Qué desea hacer?");
				System.out.println("1. Ver saldo total de la recaudacion de hoy");
				System.out.println("2. Poner a 0 el contador de saldo total");
				System.out.println("3. Cambiar el precio de los billetes");
				System.out.println("4. Salir");
				opcion = Leer.datoInt();
				
				switch (opcion) {
				case 1:
					break;
				default:
					System.out.println("Opcion inexistente, intentelo de nuevo");
					break;
				}
			} while (opcion != 4);
		} else {
			System.out.print("Introduzca su contraseña: ");
			introducirContraseña = Leer.dato();

			while (!introducirContraseña.equals(contraseña)) {
				System.out.print("Contraseña incorrecta, intentelo de nuevo: ");
				introducirContraseña = Leer.dato();
			}

			System.out.println("Inicio de sesión realizado con exito.");

			do {
				System.out.println("¿Qué desea hacer?");
				System.out.println("1. Comprar billetes");
				System.out.println("2. Calcular el cambio a devolver");
				System.out.println("3. Imprimir billete");
				System.out.println("4. Salir");
				opcion = Leer.datoInt();
				
				switch (opcion) {
				case 1:
					break;
				default:
					System.out.println("Opcion inexistente, intentelo de nuevo");
					break;
				}
			} while (opcion != 4);

		}

	}

}
