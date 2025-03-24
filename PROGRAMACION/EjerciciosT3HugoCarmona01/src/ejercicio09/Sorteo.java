package ejercicio09;

import java.util.Random;

public class Sorteo {

	private int decimoPremiado, decimo;

	public Sorteo(int decimoPremiado) {
		super();
		this.decimoPremiado = decimoPremiado;
	}
	public int getDecimoPremiado() {
		return decimoPremiado;
	}
	public void setDecimoPremiado(int decimoPremiado) {
		this.decimoPremiado = decimoPremiado;
	}
	public int getDecimo() {
		return decimo;
	}
	public void setDecimo(int decimo) {
		this.decimo = decimo;
	}
	public int generarDecimo(int desde, int hasta) {
		Random rnd = new Random();
		decimo = rnd.nextInt(hasta - desde + 1) + desde;
		return decimo;
	}
	// este lo puedo borrar
	public int generarPremio() {
		int desde = 1, hasta = 99999;
		Random rnd = new Random();
		decimoPremiado = rnd.nextInt(hasta - desde + 1) + desde;
		return decimoPremiado;
	}

	public boolean comprobarPremio(int decimo) {
		boolean premio;
		if (decimo == decimoPremiado) {
			premio = true;
		} else {
			premio = false;
		}
		return premio;
	}

	public void mostrarPremio(boolean premio) {
		if (premio) {
			System.out.println("¡Has ganado la lotería!");
		} else {
			System.out.println("Lo siento, no has ganado el premio.");
		}
	}
}
