package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo c1 = new Circulo ();
		double radio;
		
		System.out.println("Bienvenido.");
		System.out.print("Dime el radio de tu circulo: ");
		radio = Leer.datoDouble();
		
		System.out.printf("El area es de %.2f cm", c1.calcularArea(radio));
		
	}

}
