package ejercicio06;

import java.util.Random;

public class Generadora {

	private Random random;
	private int resultado;

	public Generadora() {
		this.random = new Random();
	}

	// Método para generar 1, X o 2 para una quiniela
	public String generarQuiniela() {
		resultado = random.nextInt(3);
		switch (resultado) {
		case 0:
			return "1";
		case 1:
			return "X";
		default:
			return "2";
		}
	}

	public int generarPOI(int mayor, int menor) {
		resultado = random.nextInt(mayor - menor + 1) + menor;
		return resultado;
	}

	public void imprimirPOI(int numero) {
		if (resultado % 2 == 0) {
			System.out.println("es par.");
		} else {
			System.out.println("es impar.");
		}
	}
	
	public int generarChinos(int mayor, int menor) {
		resultado = random.nextInt(mayor - menor + 1) + menor;
		return resultado;
	}
	
	public int generarPrimitiva(int mayor, int menor) {
		resultado = random.nextInt(mayor - menor + 1) + menor;
		return resultado;
	}


}
