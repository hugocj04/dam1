package ejemplowhile;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador = 0;
		int tope = 0;
		
		System.out.println("¿Cuantas veces quiere que imprima Soy la caña?");
		tope=Leer.datoInt();
		if (tope>=0&&tope<100)
			while (contador < tope) {
				System.out.println("Soy la caña");
		}

	}

}
