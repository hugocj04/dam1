package ejercicio12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cocacola=1.20;
		double pipas=0.40;
		double espada=150;
		int cantCoca;
		int cantPipas;
		int cantEspada;
		double importCoca;
		double importPipas;
		double importEspada;
		double total;
		double pago;
		double vuelta;
		
		System.out.println("Buenas tardes, ¿cuantas latas de cocacola quiere?");
		
		cantCoca=Leer.datoInt();
		importCoca=cantCoca*cocacola;
		
		System.out.println("¿Y cuantos paquetes de pipas?");
		
		cantPipas=Leer.datoInt();
		importPipas=cantPipas*pipas;

		System.out.println("¿Cuantas Garras quiere?");
		
		cantEspada=Leer.datoInt();
		importEspada=cantEspada*espada;
		total=importCoca+importPipas+importEspada;
		
		System.out.printf("Perfecto, el precio total es de %.2f €, pague aqui:",total);
		
		pago=Leer.datoDouble();
		vuelta=pago-total;
		
		System.out.printf("Tome, su vuelta es de %.2f € y aqui tiene el ticket \n\n",vuelta);
		System.out.printf("\t\t TIENDA DE LA ESQUINA \n"
				+ "--------------------------------------------------------\n "
				+ "ARTICULO \t CANTIDAD \t PRECIO \tIMPORTE \n"
				+ "Cocacola \t %d       \t %.2f €    --\t%.2f € \n"
				+ "Pipas    \t %d       \t %.2f €    --\t%.2f € \n"
				+ "Garra    \t %d       \t %.2f €  --\t%.2f € \n\n"
				+ "         TOTAL IMPORTE:            %.2f € \n"
				+ "         EFECTIVO:                 %.2f € \n"
				+ "         CAMBIO:                   %.2f € \n\n"
				+ "                     IVA INCLUIDO               \n"
				+ "--------------------------------------------------------\n "
				+ "                GRACIAS POR SU VISITA               "
				,cantCoca,cocacola,importCoca,cantPipas,pipas,importPipas,cantEspada,espada,importEspada,total,pago,vuelta);
	}

}
