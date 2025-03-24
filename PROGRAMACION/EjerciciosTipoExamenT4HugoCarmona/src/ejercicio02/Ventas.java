package ejercicio02;

import java.util.Arrays;

public class Ventas {

	private Producto [] lista;

	public Ventas(Producto[] lista) {
		super();
		this.lista = lista;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Ventas [lista=" + Arrays.toString(lista) + "]";
	}
	
	public int devolverProductosSinVender() {
		int suma = 0;
		for (int i = 0; i < lista.length; i++) {
			if (!lista[i].isVendido()) {
				suma += 1;
			}
		}
		return suma;
	}
	
	public double calcularTotalRecaudado(double porcentaje) {
		double suma = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].isVendido()) {
				suma += lista[i].calcularPVP(porcentaje);
			}
		}
		return suma;
	}
	
	public double devolverCambio(double coste, double pago) {
		return pago - coste;
	}
	
	public void mostrarListadoProductos() {
		for (int i = 0; i < lista.length; i++) {
			lista[i].mostrarProducto();
		}
	}
}
