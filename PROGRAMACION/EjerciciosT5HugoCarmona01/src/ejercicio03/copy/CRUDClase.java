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

	public Alumno findByLastName(String apellido) {
		Iterator<Alumno> it = list.iterator();
		Alumno a = null;
		
		while (it.hasNext()) {
			a = it.next();
			if (a.getApellido().equalsIgnoreCase(apellido)) {
				return a; // Sirve para retornar cuando lo haya encontrado solo cuando es unico el parametro por el que se busca
			}
		}
		return null;
	}

	public boolean modificarMedia(String apellido, double media) {
		Alumno aux = findByLastName(apellido);
		boolean modificado = false;
		
		if (aux != null) {
			aux.setMedia(media);
			modificado = true;
		}
		return modificado;
	}
	
	public boolean modificarEdad(String apellido, int edad) {
		Alumno aux = findByLastName(apellido);
		boolean modificado = false;
		
		if (aux != null) {
			aux.setEdad(edad);
			modificado = true;
		}
		return modificado;
	}

	public boolean borrarAlumno(String apellido) {
		Alumno aux = findByLastName(apellido);
		boolean borrado = false;
		
		if (aux != null) {
			list.remove(aux);
			borrado = true;
		}
		return borrado;
	}

}
