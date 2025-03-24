package ejercicio;

import java.util.Arrays;

public class Pasteleria {

	private Magdalena[] lista;
	private double presupuesto = 200;
	private int numProductos;

	public Magdalena[] getLista() {
		return lista;
	}

	public void setLista(Magdalena[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Pasteleria [lista=" + Arrays.toString(lista) + "]";
	}

	public Pasteleria(Magdalena[] lista) {
		super();
		this.lista = lista;
	}

	public void agregarMagdalena(Magdalena m1) {
		lista[numProductos] = m1;
		numProductos++;
	}

	public Magdalena[] mostrarPorSabor(String sabor, int tam) {
		Magdalena[] aux = new Magdalena[tam];
		int contador = 0;
		for (int i = 0; i < numProductos; i++) {
			if (sabor.equalsIgnoreCase(lista[i].getSabor())) {
				aux[contador] = lista[i];
				contador++;
			}
		}
		return aux;
	}
	
	public Magdalena findByID(int id) {
		Magdalena pastel = null;
		boolean encontrado = false;
		for (int i = 0; i < numProductos && !encontrado; i++) {
			if (lista[i].getId() == id) {
				pastel = lista[i];
				encontrado = true;
			}
		}
		return pastel;
	}

	public double calcularMediaCentimetrosCubicos() {
		double suma = 0;
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			suma += lista[i].getVolumenMasa();
		}
		return suma / numProductos;
	}

	public double calcularPrecioCoste(double precioMasa, Magdalena m1) {
		return m1.getVolumenMasa() * precioMasa;
	}

	public void mostrarCupcakes() {
		for (int i = 0; i < numProductos; i++) {
			if (lista[i].getTipo().equalsIgnoreCase("cupcake")) {
				System.out.println(lista[i]);
			}
		}
	}

	public double calcularPorcentajeTotal(Magdalena m1, double precioMasa) {
		double cien = 100;
		return presupuesto / cien * calcularPrecioCoste(precioMasa, m1);
	}

	public double calcularCosteNormales(double precioMasa) {
		double suma = 0;
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			if (lista[i].getTipo().equalsIgnoreCase("normal")) {
				suma += lista[i].getVolumenMasa() * precioMasa;
			}
		}
		return suma;
	}

	public void mostrar() {
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			System.out.println(lista[i]);
		}
	}

}
