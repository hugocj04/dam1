package ejerciciorepaso;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		double saldo = 2345, deposito, retiro;
		String usuario = "Hugo";
		String nombreUsuario;
		String contraseña = "1234";
		String contraseñaEscrita;

		System.out.println("Bienvenido a nuestro banco.");
		System.out.println("Para continuar, debe iniciar sesion");

		do {
			System.out.print("Introduzca su nombre de usuario: ");
			nombreUsuario = Leer.dato();

			if (nombreUsuario.equals(usuario)) {
				do {
					System.out.print("Introduzca su contraseña: ");
					contraseñaEscrita = Leer.dato();
					if (contraseñaEscrita.equals(contraseña)) {
						System.out.println("Inicio de sesion realizado con exito");
					} else {
						System.out.println("Contraseña incorrecta, intentelo de nuevo");
					}
				} while (!contraseña.equals(contraseñaEscrita));
			} else {
				System.out.println("Nombre de usuario inexistente, porfavor intentelo de nuevo");
			}
		} while (!nombreUsuario.equals(usuario));

		System.out.println("¿Que operacion desea realizar?");
		System.out.println("1. Depósito");
		System.out.println("2. Retiro");
		System.out.println("3. Consulta de saldo");
		System.out.println("4. Cálculo de IVA");
		System.out.println("5. Salir");
		opcion = Leer.datoInt();

		switch (opcion) {
		case 1:
			System.out.println("¿Cuánto dinero desea depositar?");
			deposito = Leer.datoDouble();
			saldo = saldo + deposito;
			System.out.println("Deposito realizado con exito");
			break;
		case 2:
			System.out.println("¿Cuánto desea retirar?");
			retiro = Leer.datoDouble();
			while (retiro > saldo) {
				System.out.println("Saldo insuficiente. Intentelo de nuevo");
				retiro = Leer.datoDouble();
			}
			saldo = saldo - retiro;
			System.out.printf("Retiro realizado con exito. (Saldo actual %.2f€)\n", saldo);
			break;
		case 3:
			System.out.printf("Tu saldo actual es €.2f€\n", saldo);
			break;
		case 4: 
		}

	}

}
