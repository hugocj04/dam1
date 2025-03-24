package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contrasenia = 1234, contraseniaInicio;
		String nombre = "Hugo";
		String nombreInicio;

		do {
			System.out.println("Escriba su nombre de usuario: ");
			nombreInicio = Leer.dato();
			if (nombreInicio.equals(nombre)) {
				do {
					System.out.println("Escriba su contraseña: ");
					contraseniaInicio = Leer.datoInt();
					if (contraseniaInicio == contrasenia) {
						System.out.println("Inicio de sesión realizado con exito");
					} else {
						System.out.println("Contaseña incorrecta, intentelo de nuevo");
					}
				} while (contraseniaInicio != contrasenia);
			} else {
				System.out.println("Nombre de usuario inexistente, intentelo de nuevo");
			}
		} while (!nombreInicio.equals(nombre));
	}
}
