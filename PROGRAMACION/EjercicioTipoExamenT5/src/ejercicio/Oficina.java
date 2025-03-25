package ejercicio;

import java.util.ArrayList;
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

	public int buscarPorId(int id) {
		boolean encontrado = false;
		int index = -1;
		for (int i = 0; i < list.size() && !encontrado; i++) {
			if (id == list.get(i).getId()) {
				index = i;
				encontrado = true;
			}
		}
		return index;
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

	public List<Trastero> buscarPorNumero(int numero) {
		List<Trastero> listPrecio = new ArrayList<Trastero>();
		for (int i = 0; i < list.size(); i++) {
			if (numero == list.get(i).getNum()) {
				listPrecio.add(list.get(i));
			}
		}
		return listPrecio;
	}

	public Trastero buscarMasCaro() {
		Trastero masCaro = null;
		for (int i = 0; i < list.size(); i++) {
			if (masCaro == null || list.get(i).getPrecio() > masCaro.getPrecio()) {
				masCaro = list.get(i);
			}
		}
		return masCaro;
	}

	public boolean eliminar(int id) {
		boolean eliminado = false;
		int index = buscarPorId(id);
		if (index > -1) {
			list.remove(list.remove(index));
			eliminado = true;
		}
		return eliminado;
	}

	public void mostrarTrasteros() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void modificarPrecio(double precio, int id) {
		list.get(id - 1).setPrecio(precio);
	}
	
	public void ordenarPorPrecio() {
	}
	
	public void mostrarOcupados(){
		for (Trastero t : list) {
			if (!t.isOcupado()) {
				System.out.println(t);
			}
		}
	}
}
