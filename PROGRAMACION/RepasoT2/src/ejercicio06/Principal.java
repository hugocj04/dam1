package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] notas;
		int tam = 4, suspensos = 0, total = 0, media;
		notas = new int[tam];

		System.out.println("Estas son las asignaturas que tienes:");
		System.out.println("1. Lengua");
		System.out.println("2. Matematicas");
		System.out.println("3. Biología");
		System.out.println("4. Historia");

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Dime la nota de la asignatura " + (i + 1) + ": ");
			notas[i] = Leer.datoInt();
			total += notas[i];
			if (notas[i] < 5) {
				suspensos++;
			}
		}
		media = total / tam;
		if (suspensos == 0) {
			System.out.println("Tu media es de " + media);
		} else if (media < 5) {
			System.out.println("Tu media es de " + media + " por lo tanto, da como suspensa");
			System.out.println("Has suspendido " + suspensos + " asignaturas");
		} else {
			System.out.println("Tu media es de " + media);
			System.out.println("Has suspendido " + suspensos + " asignaturas");
		}
	}
}
