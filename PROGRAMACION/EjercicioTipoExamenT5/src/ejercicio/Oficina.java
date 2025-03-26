package ejercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Oficina {

	private List<Trastero> list;

	public Oficina(List<Trastero> list) {
		super();
		this.list = list;
	}

	public List<Trastero> getList() {
		return list;
	}

	public void setList(List<Trastero> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Oficina [list=" + list + "]";
	}

	public void agregarTrastero(Trastero t) {
		list.add(t);
	}

	public Trastero buscarPorNumero(int num) {
		boolean encontrado = false;
		Trastero t = null;
		
		for (int i = 0; i < list.size() && !encontrado; i++) {
			if (num == list.get(i).getNum()) {
				t = list.get(i);
				encontrado = true;
			}
		}
		return t;
	}

	public Trastero buscarPorNumeroV2(int num) {
		for (Trastero t : list) {
			if (num == t.getNum()) {
				return t; // Se retorna el objeto en vez de el syso, para que si tiene que devolver solo uno, lo devuelva y deje de recorrer el array
			}
		}
		return null;
	}

	public List<Trastero> buscarPorPrecio(double precio) {
		List<Trastero> listPrecio = new ArrayList<Trastero>();
		
		for (int i = 0; i < list.size(); i++) {
			if (precio == list.get(i).getPrecio()) {
				listPrecio.add(list.get(i));
			}
		}
		return listPrecio;
	}

	// Mal, debe devolver una lista ya que puede haber mas de uno con el mismo precio
	public Trastero buscarMasCaro() {
		Trastero masCaro = null;
		
		for (int i = 0; i < list.size(); i++) {
			if (masCaro == null || list.get(i).getPrecio() >= masCaro.getPrecio()) {
				masCaro = list.get(i);
			}
		}
		return masCaro;
	}
	
	public List<Trastero> buscarMasCaroV2() {
		double dinero = list.getFirst().getPrecio();
		
		for (Trastero t : list) {
			if (t.getPrecio() >= dinero) {
				dinero = t.getPrecio();
			}
		}
		return buscarPorPrecio(dinero);
	}

	public boolean eliminarTrastero(int num) {
		boolean eliminado = false;
		Trastero t = buscarPorNumero(num);
		
		if (t != null) {
			list.remove(t);
			eliminado = true;
		}
		return eliminado;
	}

	public void mostrarTrasteros() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public boolean modificarPrecio(double precio, int num) {
		Trastero t = buscarPorNumero(num);
		boolean encontrado = false;
		
		if (t != null) {
			t.setPrecio(precio);
			encontrado = true;
		}
		return encontrado;
	}

	public void ordenarPorPrecio() {
	}

	public void mostrarOcupados() {
		for (Trastero t : list) {
			if (!t.isOcupado()) {
				System.out.println(t);
			}
		}
	}
	
	public void buscarPorNumeroV3() {
		for (Iterator<Trastero> iterator = list.iterator(); iterator.hasNext();) {
			Trastero trastero = iterator.next();
		}
	}
}
