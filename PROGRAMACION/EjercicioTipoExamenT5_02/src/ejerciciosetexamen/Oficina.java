package ejerciciosetexamen;

import java.util.ArrayList;
import java.util.Collections;
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

	public Set<Trastero> buscarPorPrecio(double precio) {
		Set<Trastero> listPrecio = new TreeSet<Trastero>();

		for (Iterator<Trastero> it = list.iterator(); it.hasNext();) {
			Trastero t = it.next();
			if (t.getPrecio() == precio) {
				listPrecio.add(t);
			}
		}
		return listPrecio;
	}

	public Trastero buscarNumero(int num) {
		Trastero t;

		for (Iterator<Trastero> it = list.iterator(); it.hasNext();) {
			t = it.next();
			if (t.getNum() == num) {
				return t;
			}
		}
		return null;
	}

	public Set<Trastero> buscarMasCaro() {
		Set<Trastero> listCaros = new TreeSet<Trastero>();
		Trastero t;
		boolean primero = true;
		double masCaro = 0;

		for (Iterator<Trastero> it = list.iterator(); it.hasNext();) {
			t = it.next();
			if (primero) {
				masCaro = t.getPrecio();
				primero = false;
			} else {
				if (masCaro < t.getPrecio()) {
					masCaro = t.getPrecio();
				}
			}
		}
		listCaros = buscarPorPrecio(masCaro);
		return listCaros;
	}

	public boolean deleteTrastero(int num) {
		boolean eliminado = false;

		if (buscarNumero(num) != null) {
			list.remove(buscarNumero(num));
			eliminado = true;
		}
		return eliminado;
	}

	public boolean modificarCapacidad(int num, double nuevaCapacidad) {
		boolean modificado = false;

		if (buscarNumero(num) != null) {
			buscarNumero(num).setPrecio(nuevaCapacidad);
			modificado = true;
		}
		return modificado;
	}

	public void mostrarTodos() {
		Trastero t;

		for (Iterator<Trastero> it = list.iterator(); it.hasNext();) {
			t = it.next();
			System.out.println(t);
		}
	}
	
	public Set<Trastero> ordenarPorNumero() {
		Set<Trastero> porNumero = new TreeSet<Trastero>(list);
		return porNumero;
	}
	
	public List<Trastero> ordenarPorPrecio() {
		List<Trastero> porPrecio = new ArrayList<Trastero>(list);
		Collections.sort(porPrecio, new OrdenarPorPrecio());
		return porPrecio;
	}
	

}
