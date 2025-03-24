package ejercicio01;

import java.util.Arrays;

public class Tienda {

	private Producto lista[]; // No se instancia aqui

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

	public void listarProductos() {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				System.out.println(lista[i]);
			}
		}
	}

	public boolean comprobarFragil(int id, int numProductos) {
		boolean fragil = false, encontrado = false;
		for (int i = 0; i < numProductos && !encontrado; i++) {
			if (lista[i].getId() == id) {
				fragil = lista[i].isFragil();
				encontrado = true;
			}
		}
		return fragil;
	}

	public void imprimirFragil(int id, int numProducto) {
		if (comprobarFragil(id, numProducto)) {
			System.out.println("Es fragil");
		} else {
			System.out.println("No es fragil");
		}
	}

	// El ID no coincide o no tiene porque coincidir con el indice donde se va a
	// guardar el producto
	public void agregar(Producto p, int numProducto) {
		lista[numProducto] = p;
	}

	public boolean convertirFragil(int fragil) {
		boolean convertido;
		if (fragil == 1) {
			convertido = true;
		} else {
			convertido = false;
		}
		return convertido;
	}

	public double calcularPrecioFabrica(double transporte) {
		double suma = 0;
		for (int i = 0; i < lista.length && lista != null; i++) {
			suma += lista[i].calcularPrecioCoste(transporte);
		}
		return suma;
	}

	public Producto[] findByName(String nombre) {
		// Se crea este array para poder devolver un array con todos los productos que
		// se llamen como el nombre
		Producto[] aux = new Producto[lista.length];
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getNombre().equalsIgnoreCase(nombre)) {
				aux[i] = lista[i];
			}
		}
		return aux;
	}

}