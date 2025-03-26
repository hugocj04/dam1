package ejercicio;

import java.util.Comparator;

public class OrdenarPorPrecio implements Comparator<Trastero> {

	public int compare(Trastero t1, Trastero t2) {
		// El - Es para cambiar el orden, de normal el orden es de menor a mayor y con el menos lo ordena de mayor a menor
		return -Double.compare(t1.getPrecio(), t2.getPrecio());
	}
	
}