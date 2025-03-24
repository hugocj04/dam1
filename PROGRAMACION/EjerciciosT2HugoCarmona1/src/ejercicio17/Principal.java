package ejercicio17;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suspensos = 0, asignaturas = 6, opcion = 0;
		double nota = 0, media = 0, total = 0;

		String asignaturaLeng = "Lengua";
		String asignaturaMat = "Matematicas";
		String asignaturaGh = "Geografía e historia";
		String asignaturaBiol = "Biología";
		String asignaturaIng = "Ingles";
		String asignaturaFran = "Francés";

		System.out.println("Bienvenido.");
		System.out.printf(
				"Estas son todas las asignaturas que tienes:\n" + "1. %s\n" + "2. %s\n" + "3. %s\n" + "4. %s\n"
						+ "5. %s\n" + "6. %s\n",
				asignaturaLeng, asignaturaMat, asignaturaGh, asignaturaBiol, asignaturaIng, asignaturaFran);

		do {
			System.out.println("(Introduzca un numero negativo para salir del programa)");
			for (int i = 0; i < 6; i++) {
				System.out.println("Dime la nota de la asignatura " + (i + 1));
				nota = Leer.datoInt();
				if (nota < 0) {
					break;
				}

				total = total + nota;
				media = total / asignaturas;

				if (nota < 5) {
					suspensos++;
				}
			}
			if (nota < 0) {
				break;
			}
			System.out.printf("Tu media es de %.0f\n", media);
			System.out.printf("Has suspendido %d asignaturas\n", suspensos);
		} while (opcion >= 0);
		System.out.println("Saliendo...");
	}
}
