package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		char sexo;

		int edad;
		double peso, altura, imc;

		System.out.println("Buenas, te vamos a calcular cual es tu Indice de Masa Corporal. (IMC)\n"
				+ "Para ello, necesitaremos pedirte varios datos.");
		System.out.println("¿Cuál es tu nombre?");

		nombre = Leer.dato();

		System.out.println("¿Cuál es tu sexo? (M=Masculino/F=Femenino)");

		sexo = Leer.datoChar();

		System.out.println("¿Cuántos años tienes?");

		edad = Leer.datoInt();

		System.out.println("¿Cuánto pesas?");

		peso = Leer.datoDouble();

		System.out.println("¿Cuánto mides? (En metros)");

		altura = Leer.datoDouble();

		imc = peso / (altura * altura);

		System.out.printf("¡Muchas gracias por confiar en nosotros! Aqui tiene el ticket con todos los datos:\n"
				+ "=================================================\n" + "/\t\t\t\t\t\t/\n"
				+ "/\tCALCULO INDICE DE MASA CORPORAL\t\t/\n" + "/\t\t\t\t\t\t/\n" + "/\t\tNOMBRE\t%s\t\t\t/\n"
				+ "/\t\tSEXO\t%s\t\t\t/\n" + "/\t\tEDAD\t%d años\t\t\t/\n" + "/\t\tPESO\t%.2fKg\t\t\t/\n"
				+ "/\t\tALTURA\t%.2fm\t\t\t/\n" + "/\t\t\t\t\t\t/\n"
				+ "/-----------------------------------------------/\n" + "/\t\t\t\t\t\t/\n"
				+ "/\t\tIMC:\t%.2f\t\t\t/\n" + "/\t\t\t\t\t\t/\n"
				+ "=================================================\n", nombre, sexo, edad, peso, altura, imc);
	}

}
