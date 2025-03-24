package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "Hugo";
		String usuario;
		String contraseña = "Hugo1234"; 
		String meterContraseña;

		System.out.println("Bienvenido, introduzca su nombre de usuario");
		usuario = Leer.dato();

		System.out.println("Introduzca su contraseña");
		meterContraseña = Leer.dato();

		if (usuario.equals(nombre) && meterContraseña.equals(contraseña)) {
			System.out.println("Inicio de sesión realizado con exito");
		} else {
			System.out.println("Nombre de usuario o contraseña incorrectos");
		}
	}
}