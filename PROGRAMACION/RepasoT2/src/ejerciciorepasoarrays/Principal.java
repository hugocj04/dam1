package ejerciciorepasoarrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] alumnos;
		int[] notas;
		int tam, mayor = 0, menor = 0, contadorAprobados = 0, contadorSuspensos = 0, respuesta, indiceMayor = 0,
				indiceMenor = 0, totalNotas = 0, media = 0;

		do {
			media = 0;
			contadorAprobados = 0;
			contadorSuspensos = 0;

			System.out.println("¿Cuantos alumnos hay en la clase?");
			tam = Leer.datoInt();
			notas = new int[tam];
			alumnos = new String[tam];

			for (int i = 0; i < alumnos.length; i++) {
				System.out.println("Dime el nombre del alumno " + (i + 1));
				alumnos[i] = Leer.dato();
			}
			for (int i = 0; i < notas.length; i++) {
				System.out.println("Dime la nota de " + alumnos[i]);
				notas[i] = Leer.datoInt();
				while (notas[i] < 0 || notas[i] > 10) {
					System.out.println("No puede tener esa nota, indique de nuevo su nota");
					notas[i] = Leer.datoInt();
				}
				totalNotas += notas[i];
			}
			for (int i = 0; i < notas.length; i++) {
				System.out.print(notas[i] + ", ");
				if (notas[i] >= 5) {
					contadorAprobados++;
				}
				if (notas[i] < 5) {
					contadorSuspensos++;
				}
			}
			mayor = notas[0];
			menor = notas[0];
			for (int i = 0; i < notas.length; i++) {
				if (notas[i] > mayor) {
					mayor = notas[i];
					indiceMayor = i;
				}
				if (notas[i] < menor) {
					menor = notas[i];
					indiceMenor = i;
				}
			}
			media = totalNotas / tam;
			System.out.println("\nEl nota mas alta la tiene " + alumnos[indiceMayor] + " con un " + mayor
					+ " y la nota mas baja la tiene " + alumnos[indiceMenor] + " con un " + menor);
			System.out.println("Ha/n aprobado " + contadorAprobados + " alumno/s y ha/n suspendido " + contadorSuspensos
					+ " alumno/s");
			System.out.println("La media de la clase es de " + media);
			System.out.println("¿Te has equivocado escribiendo alguna nota?");
			System.out.println("1. Si");
			System.out.println("2. No");
			respuesta = Leer.datoInt();

			if (respuesta == 1) {
				System.out.println("No te preocupes, repetiremos de nuevo el programa");
			}
		} while (respuesta == 1);
		System.out.println("Perfecto, gracias por usar nuestro programa");
	}
}