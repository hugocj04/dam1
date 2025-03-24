package ejemploexception;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = 10, opcion = 0;
		int den = 0;
		double res = 0;
		
		do {
			try {
				System.out.print("Dime el numerador: ");
				num = Integer.parseInt(sc.nextLine());

				System.out.print("Dime el denominador: ");
				den = Integer.parseInt(sc.nextLine());

				res = num/den;
				opcion = 1;
				
				System.out.printf("La division es: %.2f", res);
			} catch (ArithmeticException e){
					System.out.println("El denominador debe ser distinto de 0");
			} catch (NumberFormatException e) {
				System.out.println("Deben ser numeros");
			}
		} while (opcion == 0);
		
		
	}

}
