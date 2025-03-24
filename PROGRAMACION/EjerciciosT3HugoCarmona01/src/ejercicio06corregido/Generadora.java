package ejercicio06corregido;

import java.util.Random;

public class Generadora {

	public int generarAleatorio(int mayor, int menor) {
		Random rnd = new Random(System.nanoTime());
		return rnd.nextInt(mayor - menor + 1) + menor;
	}
	
	public int generarPOI(int mayor, int menor) {
		Random rnd = new Random(System.nanoTime());
		return rnd.nextInt(mayor - menor + 1) + menor;
	}
	
	public void comprobarPOI (int poi) {
		if (poi % 2 == 0) {
			System.out.println("es par.");
		} else {
			System.out.println("es impar.");
		}
	}
	
	public int generarQuiniela(int mayor, int menor) {
		int resultadoPartido;
		resultadoPartido = generarAleatorio(mayor, menor);
		return resultadoPartido;
	}
	
	public void comprobarQuiniela (int resultado) {
		if (resultado == 0) {
			System.out.println("El resultado de la quiniela es X");
		} else {
			System.out.println("El resultado de la quiniela es " + resultado);
		}
	}
	
	public void mostrarGanadorQuiniela(int opcionJugador, int resultadoQuiniela) {
		if (opcionJugador == resultadoQuiniela) {
			System.out.println("Has ganado");
		} else {
			System.out.println("Has perdido");
		}
	}

}
