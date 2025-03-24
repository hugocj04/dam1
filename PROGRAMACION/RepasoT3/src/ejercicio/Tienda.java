package ejercicio;

import java.util.Arrays;

public class Tienda {

	private Producto[] lista;
	private int numProductos = 0;

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + "]";
	}

	public Tienda(Producto[] lista) {
		super();
		this.lista = lista;
	}

	public void añadirProducto(Producto p1) {
		lista[numProductos] = p1;
		numProductos++;
	}

	public void mostrarProductos() {
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			System.out.println(lista[i]);
		}
	}

	public Producto findByID(int id) {
		boolean encontrado = false;
		int i = 0;
		while (i < lista.length && !encontrado) {
			if (lista[i].getId() == id) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return lista[i];
		} else {
			return null;
		}
	}

	public boolean transformarFragil(int fragil) {
		boolean comprobarFragil;
		if (fragil == 1) {
			comprobarFragil = true;
		} else {
			comprobarFragil = false;
		}
		return comprobarFragil;
	}

	public boolean comprobarFragil(Producto p1) {
		return p1.isFragil();
	}

	public double calcularSumaProductos() {
		double suma = 0;
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			suma += lista[i].getPrecioFab();
		}
		return suma;
	}

	public double calcularPVP(double porcentaje, Producto p1) {
		double cien = 100;
		return p1.getPrecioFab() / cien * porcentaje;
	}

}