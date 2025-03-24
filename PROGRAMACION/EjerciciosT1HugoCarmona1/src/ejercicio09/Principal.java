package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int navas=1500;
		double campNou;
		double olimpico;
		double teatro;
		double campNavas;
		double olimpicNavas;
		double teatrNavas;
		
		System.out.println("Hola, te ayudaremos a calcular cuantos navas cabrian en distintos espacios");

		System.out.println("¿Cuantas personas caben en el Camp Nou?");
		campNou=Leer.datoInt();
		campNavas=campNou/navas;

		System.out.printf("Si en el Camp Nou caben %.0f personas, "
				+ "significa que caben %.2f Navas \n",campNou,campNavas);

		System.out.println("¿Cuantas personas caben en el estadio olimpico?");
		olimpico=Leer.datoInt();
		olimpicNavas=olimpico/navas;

		System.out.printf("Si en el estadio olimpico caben %.0f personas, "
				+ "significa que caben %.2f Navas \n",olimpico,olimpicNavas);
		
		System.out.println("¿Cuantas personas caben en el teatro del colegio");
		teatro=Leer.datoInt();
		teatrNavas=teatro/navas;

		System.out.printf("Si en el teatro del colegio caben %.0f personas, "
				+ "significa que caben %.2f Navas \n",teatro,teatrNavas);
	}

}
