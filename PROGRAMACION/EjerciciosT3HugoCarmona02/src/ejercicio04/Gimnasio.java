package ejercicio04;

import java.util.Arrays;

public class Gimnasio {

	private Cliente[] clientes;

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Gimnasio [clientes=" + Arrays.toString(clientes) + "]";
	}

	public Gimnasio(Cliente[] clientes) {
		super();
		this.clientes = clientes;
	}

	public void agregarClientes(Cliente c1, int numClientes) {
		clientes[numClientes] = c1;
	}

	public void mostrarLista() {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null) {
				System.out.println(clientes[i]);
			}
		}
	}

	public double calcularImc(Cliente c1) {
		double imc = 0;
		double cuadrado = 2;
		imc = c1.getPeso() / Math.pow(c1.getAltura(), cuadrado);
		c1.setImc(imc);
		return imc;
	}

	public Cliente findByDni(int dni) {
		int i = 0;
		boolean encontrado = false;
		// Mientras no hayamos llegado al final o encontrado lo que buscamos, repetimos
		// el bucle
		// Al encotrarlo, el bucle para
		while (i < clientes.length && !encontrado) {
			if (clientes[i].getDni() == dni) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return clientes[i];// Devolvemos el producto buscado
		} else {
			return null;
		}
	}

	public void darDeBaja(Cliente c1, int numClientes) {
		c1.setActivo(false);
		numClientes--;
	}

	public double calcularMediaImc() {
		double suma = 0;
		double clientesActivos = 0;
		for (int i = 0; i < clientes.length && clientes[i] != null; i++) {
			if (clientes[i].isActivo()) {
				suma += clientes[i].getImc();
				clientesActivos++;
			}
		}
		return suma / clientesActivos;
	}

}