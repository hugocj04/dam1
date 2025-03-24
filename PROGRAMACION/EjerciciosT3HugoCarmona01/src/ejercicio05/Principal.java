package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase;
		int repetir;
		Copiado c = new Copiado();
		
		System.out.println("Bienvenido.");
		System.out.print("Escriba la frase que quiere imprimir: ");
		frase = Leer.dato();
		System.out.print("Indique cuantas veces quiere que se repita la frase: ");
		repetir = Leer.datoInt();
		c.repetirFrase(frase, repetir);
	}

}
