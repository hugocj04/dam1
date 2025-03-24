package ejercicio04;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Agenda {

	private Map<Integer, Contacto> agenda;

	public Agenda(Map<Integer, Contacto> agenda) {
		super();
		this.agenda = agenda;
	}

	@Override
	public int hashCode() {
		return Objects.hash(agenda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		return Objects.equals(agenda, other.agenda);
	}

	public Map<Integer, Contacto> getAgenda() {
		return agenda;
	}

	public void setAgenda(Map<Integer, Contacto> agenda) {
		this.agenda = agenda;
	}

	@Override
	public String toString() {
		return "Agenda [agenda=" + agenda + "]";
	}

	public void agregarContacto(Integer i, Contacto c) {
		agenda.put(i, c);
	}

	public Map<Integer, Contacto> ordenarPorClave() {
		Map<Integer, Contacto> aux = new TreeMap<Integer, Contacto>(agenda);
		return aux;
	}
	
	public Contacto buscarPorId(Integer i) {
		return agenda.get(i);
	}
	
	public Contacto buscarPorNombre(String nombre) {
	    for (Contacto c : agenda.values()) {
	        if (c.getNombre().equalsIgnoreCase(nombre)) {
	            return c;
	        }
	    }
	    return null;
	}
	
	public void ordenarLista() {
		
	}
}
