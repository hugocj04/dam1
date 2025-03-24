package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Los nombres mejor sin estan en String

		double coste, ganancia, impuestos, total, gananciaFinal, impuestosFinal;
		double cien=100;
		
		System.out.println("Buenas, te vamos a yudar a calcular el precio final de tu automovil");
		
		System.out.println("¿Cuanto es el coste de fabricación?");
		
		coste=Leer.datoDouble();
		
		System.out.println("¿Cuanto porcentaje de ganacia obtiene el vendedor?");
		
		ganancia=Leer.datoDouble();
		
		System.out.println("¿Cuanto porcentaje de impuestos tienes que pagar?");
		
		impuestos=Leer.datoDouble();
		
		gananciaFinal=coste*ganancia/cien;
		impuestosFinal=coste*impuestos/cien;
		total=coste+gananciaFinal+impuestosFinal;
		
		System.out.printf("Esta es la factura de su coche: \n\n"
				+ "/-----------------------------------------------/\n"
				+ "/\t\tFACTURA COCHE\t\t\t/\n"
				+ "/-----------------------------------------------/\n"
				+ "/                                               /\n"
				+ "/\tCOSTE:\t\t\t%.2f€\t/\n"
				+ "/\tGANANCIA (%.0f%%):\t\t%.2f€\t/\n"
				+ "/\tIMPUESTOS (%.0f%%):\t%.2f€\t/\n"
				+ "/\tTOTAL:\t\t\t%.2f€\t/\n"
				+ "/                                               /\n"
				+ "/-----------------------------------------------/\n"
				,coste,ganancia,gananciaFinal,impuestos,impuestosFinal,total);
		
	}

}
