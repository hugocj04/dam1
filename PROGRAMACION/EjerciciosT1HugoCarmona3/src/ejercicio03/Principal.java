package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double patatas=0.90, refresco=1.40, hamburguesa=9.89;
		double precio, pago, vuelta, cantPatatas, cantRefresco, cantHamburguesa;
		String nombre="Hugo Carmona", fecha="03/10/2024", nombPatatas, nombRefresco, nombHamburguesa;
		
		System.out.println("Buenas, ¿Qué desea pedir?");
		
		nombPatatas=Leer.dato();
		
		System.out.println("¿Cuantos paquetes de patatas?");
		
		cantPatatas=patatas*Leer.datoDouble();
		precio=cantPatatas;
		
		System.out.printf("Su cuenta es de %.2f€, ¿qué mas desea pedir? \n",precio);
		
		nombRefresco=Leer.dato();
		
		System.out.println("¿Cuántos refrescos?");
		
		cantRefresco=refresco*Leer.datoDouble();
		precio=precio+cantRefresco;

		System.out.printf("Su cuenta es de %.2f€, ¿qué mas desea pedir? \n",precio);

		nombHamburguesa=Leer.dato();		
		
		System.out.println("¿Cuantas desea?");
		
		cantHamburguesa=hamburguesa*Leer.datoDouble();
		precio=precio+cantHamburguesa;
		
		System.out.printf("Perfecto, en total serian %.2f€, pague aqui porfavor\n",precio);
		
		pago=Leer.datoDouble();
		vuelta=pago-precio;
		
		System.out.printf("¡Gracias por su visita!, aquí tiene su ticket \n\n"
				+ "\t\t  McDonalds\t\t\t\t\n\n"
				+ "------------------------------------------------\n"
				+ "PRODUCTO\t\tPRECIO\t\tSUBTOTAL\t\n"
				+ "%s\t\t\t%.2f€\t\t%.2f€\t\n"
				+ "%s\t\t%.2f€\t\t%.2f€\t\n"
				+ "%s\t\t%.2f€\t\t%.2f€\t\n\n"
				+ "\tTOTAL\t\t\t%.2f€\n"
				+ "\tPAGO\t\t\t%.2f€\n"
				+ "\tVUELTA\t\t\t%.2f€\n\n"
				+ "------------------------------------------------\n"
				+ "\tTe ha atendido:\t\t%s\n"
				+ "\tFecha:\t\t\t%s\n"
				+ "------------------------------------------------\n"
				,nombPatatas,patatas,cantPatatas,nombRefresco,refresco,cantRefresco,nombHamburguesa,
				hamburguesa,cantHamburguesa,precio,pago,vuelta,nombre,fecha);
	}

}
