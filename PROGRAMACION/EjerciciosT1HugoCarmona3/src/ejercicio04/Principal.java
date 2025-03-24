package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double base, altura, area, dos=2;
		
		String figura="Triangulo";
		
		System.out.printf("Buenas, te vamos a ayudar a calcular el area de un %s\n",figura);
		
		System.out.printf("¿Cuánto mide la altura del %s en metros?\n",figura);
		
		altura=Leer.datoDouble();
		
		System.out.printf("¿Cuánto mide la base del %s en metros?\n",figura);

		base=Leer.datoDouble();
		
		area=base*altura/dos;
		
		System.out.printf("Sabiendo que el area de un triangulo se calcula multiplicando la base "
				+ "por la altura y diviendo el resultado entre %.0f, el resultado es %.2f metros cuadrados",dos,area);
		
	}

}
