package ejercicio07;

import java.util.Random;

public class Juego {

	private int moneda;
	private boolean resultado;
	
	public String lanzarMoneda() {
		String resultadoMoneda;
		int desde = 1, hasta = 2;
		Random rnd = new Random();
		moneda = rnd.nextInt(hasta - desde + 1) + desde;
		if (moneda == 1) {
			resultadoMoneda = "Cara";
		} else {
			resultadoMoneda = "Cruz";
		}
		return resultadoMoneda;
	}
	
	public boolean comprobarResultado(int eleccion) {
		if (eleccion == moneda) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}
	
	public void devolverResultado(String resultado) {
		String veredicto = "true";
		if (resultado.equals(veredicto)) {
			System.out.println("\n¡Enhorabuena, has ganado! :)");
		} else {
			System.out.println("\nLo siento, has perdido :(");
		}
	}
}
