package ejercicio13;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia = 0;
		
		System.out.println("Buenas.");
		System.out.print("Introduzca un número y le diremos a que dia de la semana pertenece: ");
		dia = Leer.datoInt();
		
		switch (dia) {
		case 1:
			System.out.printf("El numero %d corresponde al Lunes.", dia);
			break;
		case 2:
			System.out.printf("El numero %d corresponde al Martes.", dia);
			break;
		case 3:
			System.out.printf("El numero %d corresponde al Miercoles.", dia);
			break;
		case 4:
			System.out.printf("El numero %d corresponde al Jueves.", dia);
			break;
		case 5:
			System.out.printf("El numero %d corresponde al Viernes.", dia);
			break;
		case 6:
			System.out.printf("El numero %d corresponde al Sabado.", dia);
			break;
		case 7:
			System.out.printf("El numero %d corresponde al Domingo.", dia);
			break;
		default:
			System.out.println("Número no valido, no pertenece a ningun día de la semana.");
			break;
		}
		
	}

}
