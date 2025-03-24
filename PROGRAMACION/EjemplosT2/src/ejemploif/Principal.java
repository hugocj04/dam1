package ejemploif;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad;
		int mayoria=18;
		double saldo;
		double topeSaldo=100;
		
		System.out.println("¿Cuál es tu edad?");
		
		edad=Leer.datoInt();
				
		// || --> o, && --> y.
		if (edad>=mayoria) {
			System.out.println("¿Cuánto dinero tienes?");
			saldo=Leer.datoDouble();
		if (saldo>=topeSaldo) {	
				System.out.println("Adelante");
			}
		}
		else {
			System.out.println("No puedes pasar");
		}
		
	}

}
