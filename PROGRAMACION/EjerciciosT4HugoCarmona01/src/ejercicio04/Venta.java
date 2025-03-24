package ejercicio04;

import java.util.Arrays;

public class Venta {

	private LineaDeVenta[] lista;

	public Venta(LineaDeVenta[] lista) {
		super();
		this.lista = lista;
	}

	public LineaDeVenta[] getLista() {
		return lista;
	}

	public void setLista(LineaDeVenta[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}

	public void agregarLineaVenta(LineaDeVenta lv, int contador) {
		if (contador < lista.length) {
			lista[contador] = lv;
		}
	}

	public double calcularTotal(double iva, double descuento, int topeCaducidad) {
		double total = 0;
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			total += lista[i].calcularSubtotal(iva, descuento, topeCaducidad);
		}
		return total;
	}
	
	// Mostrar ticket
	// Mostrar todos los productos con aviso, hay que usar el instanceoff
}
