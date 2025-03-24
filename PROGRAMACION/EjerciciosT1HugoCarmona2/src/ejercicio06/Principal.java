package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double horas;
		double precioHora;
		double horasExtra;
		double precioExtra;
		double cobro;
		double cobroExtra;
		
		System.out.println("Buenas, vamos a calcular tu sueldo de este mes. "
				+ "¿Cuantas horas has trabajado?");
		
		horas=Leer.datoDouble();
		
		System.out.println("¿A cuanto cobras la hora?");
		
		precioHora=Leer.datoDouble();
		cobro=horas*precioHora;
		
		System.out.println("Si has trabajado horas extras,"
				+ " ¿cuantas horas extras has echado?");
		
		horasExtra=Leer.datoDouble();
		
		System.out.println("¿A cuanto cobras la hora extra?");
		
		precioExtra=Leer.datoDouble();
		cobroExtra=cobro+(horasExtra*precioExtra);

		System.out.printf("Sin horas extras deberias de cobrar este mes %.2f € y con horas extra deberias cobrar %.2f €",cobro,cobroExtra);
	}

}
