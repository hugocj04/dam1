package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double km=100;
		double kmRec;
		double litros=7.5;

		System.out.printf("¿Cuantos kilometros a recorrido? \n");
		kmRec=Leer.datoDouble();		
		double litTotales;
		litTotales=(kmRec*(litros/km));
		double precioLit;
		precioLit=1.474;
		double total=precioLit*litTotales;
		
		System.out.printf("Teniendo en cuenta que en %.2fKm "
				+ "se gastan %.2fL, usted ha gastado %.2f€ en su recorrido de "
				+ "%.2fKm",km,litros,total,kmRec);
	}

}
