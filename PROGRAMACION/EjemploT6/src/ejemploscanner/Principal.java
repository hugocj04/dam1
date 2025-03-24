package ejemploscanner;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String aux, nombre;
		int edad;
		double precio;

		System.out.print("Dime tu nombre: ");
		nombre = sc.nextLine();

		System.out.println("Tu nombre es " + nombre);
		System.out.print("Dime tu edad: ");
		aux = sc.nextLine();
		edad = Integer.parseInt(aux);
		
		System.out.printf("Tienes %d años\n", edad);
		System.out.print("Dime el precio del producto: ");
		precio = Double.parseDouble(sc.nextLine());
		
		System.out.printf("El precio del producto es de %.2f€\n", precio);
		
		sc.close();
	}

}
