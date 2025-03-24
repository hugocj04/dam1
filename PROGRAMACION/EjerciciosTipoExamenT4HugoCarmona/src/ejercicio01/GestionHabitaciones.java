package ejercicio01;

import java.util.Arrays;

public class GestionHabitaciones {

	private Habitacion[] lista;

	public GestionHabitaciones(Habitacion[] lista) {
		super();
		this.lista = lista;
	}

	public Habitacion[] getLista() {
		return lista;
	}

	public void setLista(Habitacion[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "GestionHabitaciones [lista=" + Arrays.toString(lista) + "]";
	}

	public Habitacion findHabitacion(int opcionHabitacion) {
		boolean encontrado = true;
		Habitacion h = null;
		for (int i = 0; i < lista.length || encontrado != false; i++) {
			if (opcionHabitacion == i) {
				h = lista[i];
				encontrado = false;
			}
		}
		return h;
	}

	public double calcularPrecioHabitacionElegida(Habitacion h) {
		return h.calcularPrecioHabitacion();
	}

	public double calcularTotalHabitaciones() {
		double suma = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].isOcupada()) {
				suma += calcularPrecioHabitacionElegida(lista[i]);
			}
		}
		return suma;
	}

	public void mostrarFacturaHabitacion(Habitacion h) {
		h.mostrarFactura();
	}

	public void mostrarHabitacionesLibres() {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].isOcupada()) {
				lista[i].mostrarFactura();
			}
		}
	}
}
