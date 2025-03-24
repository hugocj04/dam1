package ejercicio05;

import java.util.Arrays;

public class Tienda {

	private Electrodomestico[] lista;
	private int numProductos = 0;

	public Electrodomestico[] getLista() {
		return lista;
	}

	public void setLista(Electrodomestico[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + "]";
	}

	public Tienda(Electrodomestico[] lista) {
		super();
		this.lista = lista;
	}

	public void agregarElectrodomestico(Electrodomestico e1) {
		lista[numProductos] = e1;
		numProductos++;
	}

	public Electrodomestico findByID(int id) {
		int i = 0;
		boolean encontrado = false;
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

	public double calcularPrecio(Electrodomestico e1) {
		double precio = 0;
		if (e1 != null) {
			switch (e1.getConsumoEnergetico()) {
			case 'A':
				precio = e1.getPrecio() * 10;
				break;
			case 'B':
				precio = e1.getPrecio() * 20;
				break;
			case 'C':
				precio = e1.getPrecio() * 30;
				break;
			case 'D':
				precio = e1.getPrecio() * 40;
				break;
			case 'E':
				precio = e1.getPrecio() * 50;
				break;
			case 'F':
				precio = e1.getPrecio() * 60;
				break;
			}
		}
		return precio;
	}

	public double calcularSumaPrecios() {
		double suma = 0;
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			suma += lista[i].getPrecio();
		}
		return suma;
	}

	public void mostrarProductos() {
		for (int i = 0; i < numProductos; i++) {
			System.out.println(lista[i]);
		}
	}

	public double calcularMediaPrecios() {
		return calcularSumaPrecios() / numProductos;
	}

	public char comprobarConsumoEnergetico(char letra) {
		char convertir = 0;
		for (int i = 0; i < lista.length; i++) {
			if (letra != 'A' && letra != 'B' && letra != 'C' && letra != 'D' && letra != 'E' && letra != 'F') {
				convertir = 'A';
			} else {
				convertir = letra;
			}
		}
		return convertir;
	}

}