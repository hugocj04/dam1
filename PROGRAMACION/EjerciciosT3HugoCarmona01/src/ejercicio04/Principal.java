package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radio, altura;
		Cilindro v = new Cilindro();
		
		System.out.println("Bienvenido.");
		System.out.println("Para calcular el volumen de un cilindro necesitamos que nos des los siguientes datos,");
		System.out.print("Radio del cilindro: ");
		radio = Leer.datoDouble();
		
		System.out.print("Altura del cilindro: ");
		altura = Leer.datoDouble();
		System.out.printf("Su volumen es de %.2f cm cubicos", v.volumenCilindro(radio, altura));
	}

}
