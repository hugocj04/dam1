package ejercicioset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Oficina {

	private Set<Trastero> list;

	public Oficina(Set<Trastero> list) {
		super();
		this.list = list;
	}

	public Set<Trastero> getList() {
		return list;
	}

	public void setList(Set<Trastero> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Oficina [list=" + list + "]";
	}

	public void addTrastero(Trastero t) {
		list.add(t);
	}

	public List<Trastero> buscarPorPrecio(double precio) {
		List<Trastero> porPrecio = new ArrayList<Trastero>();

		for (Trastero t : list) {
			if (t.getPrecio() == precio) {
				porPrecio.add(t);
			}

		}
		return porPrecio;
	}

	public List<Trastero> buscarPorPrecioV2(double precio) {
		List<Trastero> porPrecio = new ArrayList<Trastero>();

		for (Iterator<Trastero> it = list.iterator(); it.hasNext();) {
			Trastero t = it.next();
			if (t.getPrecio() == precio) {
				porPrecio.add(t);
			}
		}
		return porPrecio;
	}

	public Trastero buscarPorNumero(int numero) {
		Trastero t = null;

		for (Iterator<Trastero> it = list.iterator(); it.hasNext();) {
			t = it.next();
			if (t.getNum() == numero) {
				return t;
			}
		}
		return null;
	}

	public List<Trastero> buscarMasCaros() {
		double masCaro = 0;

		for (Trastero t : list) {
			if (masCaro < t.getPrecio()) {
				masCaro = t.getPrecio();
			}
		}
		return buscarPorPrecio(masCaro);
	}

	public boolean deleteTrastero(Trastero t) {
		boolean eliminado = false;
		if (t != null) {
			list.remove(t);
			eliminado = true;
		}
		return eliminado;
	}
	
	public boolean modificarPrecio(Trastero t, double precio) {
		boolean modificado = false;
		
		if (t != null) {
			t.setPrecio(precio);
			modificado = true;
		}
		return modificado;
	}
	
	public Set<Trastero> ordenarPorPrecio(){
		Set<Trastero> ordenadoPrecio = new TreeSet<Trastero>(new OrdenarPorPrecio());
		ordenadoPrecio.addAll(list);
		return ordenadoPrecio;
	}
	
	public Set<Trastero> ordenarPorNumero() {
		Set<Trastero> ordenadoNumero = new TreeSet<Trastero>();
		ordenadoNumero.addAll(list);
		return ordenadoNumero;
	}

}
