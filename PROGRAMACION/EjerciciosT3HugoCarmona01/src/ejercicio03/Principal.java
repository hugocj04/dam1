package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		Operaciones o = new Operaciones();
		
		System.out.println("Bienvenido.");
		System.out.print("Dime un número y te diremos si es positivo, negativo, par e impar: ");
		numero = Leer.datoInt();
		o.calcularPON(numero);
		o.calcularPOI(numero);
		o.imprimirResultado(o.calcularPON(numero));
		System.out.printf("El numero es %s.", o.calcularPOI(numero));
	}

}
