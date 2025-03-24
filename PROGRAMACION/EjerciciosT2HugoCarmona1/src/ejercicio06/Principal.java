package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double lengua, mates, historia, asignaturas=3, media;
		
		System.out.println("Buenas, vamos a calcular la media de tus notas");
		System.out.println("Dime tu nota de Lengua");
		lengua = Leer.datoDouble();

		System.out.println("Dime tu nota de Matematicas");
		mates = Leer.datoDouble();

		System.out.println("Dime tu nota de historia");
		historia = Leer.datoDouble();

		media = (lengua + mates + historia) / asignaturas;

		if (media >= 5) {
			System.out.printf("¡Has aprobado! Tu media es de %.2f", media);
		} else {
			System.out.printf("Vaya, has suspendido, tu media es de %.2f", media);
		}
	}

}
