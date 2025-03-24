package ejercicio18;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horasTrabajadas, horas = 40, salarioSemanal, cobroHora = 16, horasExtra = 0, horasNormales, normal, extra,
				cobroHoraExtra = 20, salarioSemanalExtra = 0;
		System.out.println("Bienvenido.");
		do {
			System.out.print("Introduce el numero de horas trabajadas: ");
			horasTrabajadas = Leer.datoInt();

			if (horasTrabajadas < 0) {
				break;
			}
			
			if (horasTrabajadas <= horas) {
				salarioSemanal = cobroHora * horasTrabajadas;
				System.out.printf("Tu salario semanal es %d€\n", salarioSemanal);
			} else {
				horasExtra = horasTrabajadas - horas;
				horasNormales = horasTrabajadas - horasExtra;
				normal = horasNormales * cobroHora;
				extra = cobroHoraExtra * horasExtra;
				salarioSemanalExtra = normal + extra;
				System.out.printf("Tu salario semanal es %d€\n", salarioSemanalExtra);
			}
			System.out.println("(Escribe un numero negativo para salir del programa...)");
		} while (horasTrabajadas >= 0);
		System.out.println("Saliendo...");
	}
}
