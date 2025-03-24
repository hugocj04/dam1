package ejercicio16;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma = 0, producto = 1, numero = 0, salir = 0;

		System.out.println("Bienvenido.");
		System.out.println("Dinos 10 numeros y te diremos la suma y el producto de todos ellos");
		
		while (salir >= 0) {
			suma = 0;
			producto = 1;
			for (int i = 0; i < 10; i++) {
				System.out.print("Introduce el número " + (i + 1) + ": ");
				numero = Leer.datoInt();
				suma = suma + numero;
				producto = producto * numero;
			}
			System.out.println("La suma de los números es: " + suma);
			System.out.println("El producto de los números es: " + producto);
			System.out.println("(Para salir introduzca un numero negativo)");
			salir = Leer.datoInt();
		}
		System.out.println("Saliendo...");
	}
}
