package ejercicio02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Club {

	private List<Socio> listado;

	public Club(List<Socio> listado) {
		super();
		this.listado = listado;
	}

	public List<Socio> getListado() {
		return listado;
	}

	public void setListado(List<Socio> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Club [listado=" + listado + "]";
	}

	public int findById(int id) {
		boolean encontrado = false;
		int resultado = -1;
		for (int i = 0; i < listado.size() && !encontrado; i++) {
			if (listado.get(i).getId() == id) {
				resultado = i;
				encontrado = false;
			}
		}
		return resultado;
	}
	
	public Socio getById(int id) {
		int index = findById(id);
		Socio s;
		if (index != -1) {
			s = listado.get(index);
		} else {
			// Hasta que no veamos los optional devolvemos un null
			s = null;
		}
		return s;
	}
	
	public void agregarSocio(Socio s) {
		listado.add(s);
	}
	
	public void eliminarSocio(int id) {
		listado.remove(findById(id));
	}
	
	public boolean modificarEdad(int id, int edad) {
		int index = findById(id);
		boolean hecho = false;
		if (index != -1) {
			listado.get(index).setEdad(edad);
			hecho = true;
		}
		return hecho;
	}

	public List<Socio> ordenarListado() {
		List<Socio> newList = new ArrayList<Socio>();
		newList = listado;
		Collections.sort(newList);
		return newList;
	}

}
