package ejercicio12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso, nuevoPeso;
		int seleccionPlaneta = 0;
		double mercurio=0.38, venus=0.91, tierra=1.00, marte=0.38, jupiter=2.53, saturno=1.06, urano=0.92, neptuno=1.2;
		String planetaMerc="Mercurio";
		String planetaVenus="Venus";
		String planetaTierra="Tierra";
		String planetaMarte="Marte";
		String planetaJupiter="Jupier";
		String planetaSaturno="Saturno";
		String planetaUrano="Urano";
		String planetaNeptuno="Neptuno";
		
		System.out.println("Buenas, diganos su peso y calcularemos cuanto pesaria en cualquier planeta del sistema solar");
		peso=Leer.datoDouble();
		
		do {
			System.out.printf("Seleccione el planeta:\n"
					+ "0. Salir.\n"
					+ "1. %s\n"
					+ "2. %s\n"
					+ "3. %s\n"
					+ "4. %s\n"
					+ "5. %s\n"
					+ "6. %s\n"
					+ "7. %s\n"
					+ "8. %s\n"
					, planetaMerc, planetaVenus, planetaTierra, planetaMarte, planetaUrano, planetaJupiter, planetaSaturno, planetaNeptuno);
			seleccionPlaneta=Leer.datoInt();
			
			switch (seleccionPlaneta) {
				case 0:
					System.out.println("Saliendo...");
					break;
				case 1:
					nuevoPeso=peso*mercurio;
					System.out.printf("Tu peso en %s serian %.2fKg\n",planetaMerc,nuevoPeso);
					break;
				case 2:
					nuevoPeso=peso*venus;
					System.out.printf("Tu peso en %s serian %.2fKg\n",planetaVenus,nuevoPeso);
					break;
				case 3:
					nuevoPeso=peso*tierra;
					System.out.printf("Tu peso en %s serian %.2fKg\n",planetaTierra,nuevoPeso);
					break;
				case 4:
					nuevoPeso=peso*marte;
					System.out.printf("Tu peso en %s serian %.2fKg\n",planetaMarte,nuevoPeso);
					break;
				case 5:
					nuevoPeso=peso*urano;
					System.out.printf("Tu peso en %s serian %.2fKg\n",planetaUrano,nuevoPeso);
					break;
				case 6:
					nuevoPeso=peso*jupiter;
					System.out.printf("Tu peso en %s serian %.2fKg\n",planetaJupiter,nuevoPeso);
					break;
				case 7:
					nuevoPeso=peso*saturno;
					System.out.printf("Tu peso en %s serian %.2fKg\n",planetaSaturno,nuevoPeso);
					break;
				case 8:
					nuevoPeso=peso*neptuno;
					System.out.printf("Tu peso en %s serian %.2fKg\n",planetaNeptuno,nuevoPeso);
					break;
				default:
					System.out.println("Opcion inexistente, intentelo de nuevo");
			}
		} while (seleccionPlaneta != 0);
		
	}

}
