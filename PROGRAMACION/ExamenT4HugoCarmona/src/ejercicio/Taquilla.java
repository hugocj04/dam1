package ejercicio;

import java.util.Arrays;

public class Taquilla {

	private EntradaGeneral[] lista;

	public Taquilla(EntradaGeneral[] lista) {
		super();
		this.lista = lista;
	}

	public EntradaGeneral[] getLista() {
		return lista;
	}

	public void setLista(EntradaGeneral[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Taquilla [lista=" + Arrays.toString(lista) + "]";
	}
	
	public EntradaGeneral findEntrada(int seleccion) {
		boolean encontrado = false;
		EntradaGeneral e = null;
		for (int i = 0; i < lista.length || encontrado != true; i++) {
			if (i == seleccion) {
				e = lista[i];
				encontrado = true;
			}
		}
		return e;
	}

	public double calcularPrecioEntradaEligida(EntradaGeneral e, double descuento, double cantidad) {
		return e.calcularPrecioEntrada(descuento, cantidad);
	}

	public double calcularTotalZonaArriba(double descuento, double cantidad) {
		double suma = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].isZonaAsiento()) {
				suma += calcularPrecioEntradaEligida(lista[i], descuento, cantidad);
			}
		}
		return suma;
	}
	
	public void imprimirTicketVip(EntradaGeneral[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof Vip) {
				((Vip) lista[i]).mostrarConsumicion();
			}
		}
	}
	
	public double calcularTotalDonativos(double porcDonativo, double descuento, double cantidad) {
		double suma = 0;
		for (int i = 0; i < lista.length; i++) {
			suma += lista[i].calcularDonativo(porcDonativo, descuento, cantidad);
		}
		return suma;
	}
	
	public double calcularTotalVip(EntradaGeneral[] lista, double descuento, double cantidad) {
		double suma = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof Vip) {
				suma += calcularPrecioEntradaEligida(((Vip) lista[i]), descuento, cantidad);
			}
		}
		return suma;
	}
}
