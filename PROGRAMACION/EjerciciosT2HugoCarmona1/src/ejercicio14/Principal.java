package ejercicio14;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mes;

		System.out.println("Buenas.");
		System.out.print("Diganos un número y le diremos cuantos días tiene el mes al que pertenece: ");
		mes = Leer.datoInt();
		
		switch (mes) {
		case 1:
			System.out.printf("El número %d pertenece a Enero y tiene 31 días.", mes);
			break;
		case 2:
			System.out.printf("El número %d pertenece a Febrero y tiene 28 días.", mes);
			break;
		case 3:
			System.out.printf("El número %d pertenece a Marzo y tiene 31 días.", mes);
			break;
		case 4:
			System.out.printf("El número %d pertenece a Abril y tiene 30 días.", mes);
			break;
		case 5:
			System.out.printf("El número %d pertenece a Mayo y tiene 31 días.", mes);
			break;
		case 6:
			System.out.printf("El número %d pertenece a Junio y tiene 30 días.", mes);
			break;
		case 7:
			System.out.printf("El número %d pertenece a Julio y tiene 31 días.", mes);
			break;
		case 8:
			System.out.printf("El número %d pertenece a Agosto y tiene 31 días.", mes);
			break;
		case 9:
			System.out.printf("El número %d pertenece a Septiembre y tiene 30 días.", mes);
			break;
		case 10:
			System.out.printf("El número %d pertenece a Octubre y tiene 31 días.", mes);
			break;
		case 11:
			System.out.printf("El número %d pertenece a Noviembre y tiene 30 días.", mes);
			break;
		case 12:
			System.out.printf("El número %d pertenece a Diciembre y tiene 31 días.", mes);
			break;
		}

	}

}
