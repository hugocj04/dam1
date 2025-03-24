package ejercicio03.copy;

import java.util.Iterator;
import java.util.Set;

public class CRUDClase {

	private Set<Alumno> list;

	public CRUDClase(Set<Alumno> list) {
		super();
		this.list = list;
	}

	public Set<Alumno> getList() {
		return list;
	}

	public void setList(Set<Alumno> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Clase [list=" + list + "]";
	}

	public void mostrarTodos() {
		Iterator<Alumno> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public Alumno findById(int id) {
		Iterator<Alumno> it = list.iterator();
		Alumno a = null;
		while (it.hasNext()) {
			a = it.next();
			if (a.getId() == id) {
				return a;
			}
		}
		return a;
	}

	public int modificarMedia(int id, double nuevaMedia) {
		Alumno aux = findById(id);
		int num = 0;
		if (aux != null) {
			aux.setMedia(nuevaMedia);
			num = 1;
		}
		return num;
	}

	public int borrarAlumno(int id) {
		Alumno a = findById(id);
		int num = 0;
		if (a != null) {
			list.remove(a);
			num = 1;
		}
		return num;
	}

}
