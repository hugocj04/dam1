package ejemploaleatorio;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hasta, desde, aleatorio, tiradas, contador = 0;

		Random num = new Random(System.nanoTime());

		System.out.println("Hola, genero numeros aleatorios");
		
		System.out.println("Diga el menor");
		desde = Leer.datoInt();

		System.out.println("Diga el mayor");
		hasta = Leer.datoInt();

		System.out.println("Dime cuantas veces quieres tirar el dado");
		tiradas = Leer.datoInt();

		do {
			aleatorio = num.nextInt(hasta - desde + 1) + desde;
			contador++;
			System.out.println("El numero " + contador + " generado es " + aleatorio);
		} while (contador < tiradas);
	}
}