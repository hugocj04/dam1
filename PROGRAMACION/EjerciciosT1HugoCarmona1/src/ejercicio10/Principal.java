package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cien=100;
		double costeTotal;
		double costeDesc;
		double costeFinal;

		System.out.println("Buenas ¿Cuántas unidades quiere llevarse de ese producto?");
		
		double unidades=Leer.datoDouble();
		
		System.out.println("Perfecto, ¿Cuánto cuesta cada unidad?");
		
		double coste=Leer.datoDouble();
		
		System.out.println("¿Cuánto porcentaje de descuento quiere"
				+ " en su compra?");
		
		double descuento=Leer.datoDouble();
		
		costeTotal=unidades*coste;
		costeDesc=descuento*(costeTotal/cien);
		costeFinal=costeTotal-costeDesc;

		System.out.printf("Teniendo en cuenta que ha comprado "
				+ "%.0f unidades de un producto que cuesta %3"
				+ ".2f €, le saldría a %.2f €, pero "
				+ "como a elegido usar la oferta del %.0f por ciento, el total de su compra "
				+ "es de %.2f €. \n",unidades,coste,costeTotal,descuento,costeFinal);
		System.out.println("¡Gracias por su visita!");
		
	}

}
