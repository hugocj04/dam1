package ejemplofor;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tope;

		System.out.println("Dime un tope");
		tope = Leer.datoInt();

		//No se declara la i fuera del bucle
		for (int i = 0; i < tope; i++) {
			System.out.println("Hola "+(i+1));
		}

	}

}