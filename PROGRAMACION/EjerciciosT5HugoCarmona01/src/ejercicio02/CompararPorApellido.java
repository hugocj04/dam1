package ejercicio02;

import java.util.Comparator;

public class CompararPorApellido implements Comparator<Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getNombre().toLowerCase().compareTo(o2.getNombre());
	}

	
}
