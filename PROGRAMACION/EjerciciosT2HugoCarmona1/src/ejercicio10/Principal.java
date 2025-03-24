package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso, altura, imc;
		int potencia = 2;

		System.out.println("Buenas, le vamos a ayudar a calcular su IMC (Indice de masa corporal)");
		System.out.print("¿Cuánto pesa? (En Kg): ");
		peso = Leer.datoDouble();

		System.out.print("¿Cuanto mide? (En metros): ");
		altura = Leer.datoDouble();

		imc = peso / Math.pow(altura, potencia);

		if (imc < 16) {
			System.out.printf("Su IMC es de %.0f. Su estado es: Criterio de ingreso en hospital", imc);
		}
		if (imc > 16 && imc < 17) {
			System.out.printf("Su IMC es de %.0f. Su estado es: infrapeso", imc);
		}
		if (imc > 17 && imc < 18) {
			System.out.printf("Su IMC es de %.0f. Su estado es: bajo peso", imc);
		}
		if (imc > 18 && imc < 25) {
			System.out.printf("Su IMC es de %.0f. Su estado es: peso normal (saludable)", imc);
		}
		if (imc > 25 && imc < 30) {
			System.out.printf("Su IMC es de %.0f. Su estado es: sobrepeso (obesidad de grado I)", imc);
		}
		if (imc > 30 && imc < 35) {
			System.out.printf("Su IMC es de %.0f. Su estado es: sobrepeso crónico (obesidad de grado II)", imc);
		}
		if (imc > 35 && imc < 40) {
			System.out.printf("Su IMC es de %.0f. Su estado es: obesidad premórbida (obesidad de grado III)", imc);
		}
		if (imc > 40) {
			System.out.printf("Su IMC es de %.0f. Su estado es: obesidad mórbida (obesidad de grado IV)", imc);
		}

	}

}
