package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double saldo, mantenimiento, interes, precioMant, precioInt, saldoFinal, cien=100;
		
		System.out.println("Buenas, ¿cuál es tu saldo actual?");
		
		saldo=Leer.datoDouble();
		
		System.out.println("¿Cuánto porcentaje de tu sueldo pagas por mantenimiento?");
		
		mantenimiento=Leer.datoDouble();
		precioMant=saldo*mantenimiento/cien;
		
		System.out.println("¿Cuánto porcentaje de intereses?");
		
		interes=Leer.datoDouble();
		precioInt=saldo*interes/cien;
		saldoFinal=saldo+precioInt-precioMant;
		
		//Hay que imprimir todo lo posible bonito, por ejemplo aqui con un ticket
		
		System.out.printf("Entonces, teniendo en cuenta que tu saldo es %.2f€, le sumamos el interes, que es del %.0f%% y le restamos el mantenimiento que es un %.0f%%, "
				+ "entonces su saldo final es de %.2f%%",saldo,interes,mantenimiento,saldoFinal);
		
	}

}
