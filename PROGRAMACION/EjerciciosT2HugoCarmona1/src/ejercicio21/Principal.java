package ejercicio21;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero1, numero2, solucionSuma, solucionResta, solucionDiv ,solucionMult;
		int opcion = 0;

		System.out.println("Bienvenido/a, esta es mi calculadora.");

		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Verificar si un número es par o impar");
			System.out.println("6. Salir");
			opcion = Leer.datoInt();

			switch (opcion) {
				case 1:
					System.out.println("Introduzca los dos numeros que desea sumar:");
					numero1 = Leer.datoDouble();
					System.out.println("+");
					numero2 = Leer.datoDouble();
					solucionSuma = numero1 + numero2;
					System.out.printf("%.2f\n\n", solucionSuma);
					break;
				case 2:
					System.out.println("Introduzca los dos numeros que desea restar:");
					numero1 = Leer.datoDouble();
					System.out.println("-");
					numero2 = Leer.datoDouble();
					solucionResta = numero1 - numero2;
					System.out.printf("%.2f\n\n", solucionResta);
					break;
				case 3:
					System.out.println("Introduzca los dos numeros que desea multiplicar");
					numero1 = Leer.datoDouble();
					System.out.println("x");
					numero2 = Leer.datoDouble();
					solucionMult = numero1 * numero2;
					System.out.printf("%.2f\n\n", solucionMult);
					break;
				case 4:
					System.out.println("Introduzca los dos numeros que desea dividir:");
					numero1 = Leer.datoDouble();
					System.out.println("/");
					numero2 = Leer.datoDouble();
					if (numero2 != 0) {
						solucionDiv = numero1 / numero2;
						System.out.printf("%.2f\n\n", solucionDiv);
					} else {
						System.out.println("No se puede dividir entre 0.");
					}
					break;
				case 5:
					System.out.print("Dime el número el cual quieres saber si es par o impar: ");
					numero1 = Leer.datoDouble();
					solucionDiv = numero1 % 2;
					if (solucionDiv == 0) {
						System.out.printf("EL numero %.0f es par.\n", numero1);
					} else {
						System.out.printf("El número %.0f es impar.\n", numero1);
					}
					break;
				case 6:
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.out.println("Opción no valida, intentelo de nuevo.\n");
					break;
			}
		} while (opcion != 6);
		
	}

}
