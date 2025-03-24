package ejemplomenu;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido, estas son las opciones:");

		int notas = 0;

		System.out.println(
				"1. Lista de la compra.\n" + "2. Tarea del instituto.\n" + "3. Notas.\n" + "4. Lecciones del día.");
		notas = Leer.datoInt();

		switch (notas) {
		case 1:
			System.out.println("- Galletas\n" + "- Pan integral\n" + "- Yogures\n" + "- Leche\n" + "- Arroz");
			break;
		case 2:
			System.out.println("- Hacer deberes de programación.\n" + "- Estudiar para el examen.");
			break;
		case 3:
			System.out.println("- Programación: 10.\n" + "- Lenguaje de marca: 9.\n" + "- Bases de datos: 8.\n");
			break;
		case 4:
			System.out.println("- Disfruta del momento.\n" + "- No dejes las cosas para el ultimo día.\n");
			break;
		default:
			System.out.println("Opcion inexistente");
		}

	}

}
