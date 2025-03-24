package ejemplo02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Numeros n = new Numeros ();

		int num1;
		double num2, suma;
		
		// Nada: Solo clases de ese paquete
		// Public: Desde cualquier paquete y clase
		// Private: Solo su clase

		/*
		 * Alumno a = new Alumno();
		 * 
		 * System.out.println(a.getEdad()); a.setEdad(18);
		 * 
		 * System.out.println(a.getEdad());
		 */

		System.out.print("Dime dos numeros y los sumaremos, dime el primero: ");
		num1=Leer.datoInt();
		
		System.out.print("Dime el segundo numero: ");
		num2=Leer.datoDouble();
		suma = n.sumar(num1, num2);
		
		System.out.println("La suma de los numeros es " + suma);
	}
}