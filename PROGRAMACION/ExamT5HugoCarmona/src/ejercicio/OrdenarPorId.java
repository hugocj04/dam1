package ejercicio;

import java.util.Comparator;

public class OrdenarPorId implements Comparator<Mensaje>{

	@Override
	public int compare(Mensaje m1, Mensaje m2) {
		// TODO Auto-generated method stub
		return Integer.compare(m1.getId(), m2.getId());
	}

	
	
}
