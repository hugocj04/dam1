package ejercicio03;

import java.util.List;

public class Clase {

	private List<Alumno> listAlum;

	public Clase(List<Alumno> listAlum) {
		super();
		this.listAlum = listAlum;
	}

	public List<Alumno> getListAlum() {
		return listAlum;
	}

	public void setListAlum(List<Alumno> listAlum) {
		this.listAlum = listAlum;
	}

	@Override
	public String toString() {
		return "Clase [listAlum=" + listAlum + "]";
	}

	public int findBySecondname(String Apellido) {
		int index = -1;
		boolean encontrado = false;
		for (int i = 0; i < listAlum.size() && !encontrado; i++) {
			if (listAlum.get(i).getApellido().equalsIgnoreCase(Apellido)) {
				index = i;
				encontrado = true;
			}
		}
		return index;
	}
	
	public boolean modificar(int edad, String apellido) {
		boolean modificado = false;
		if (findBySecondname(apellido) > -1) {
			modificado = true;
			listAlum.get(findBySecondname(apellido)).setEdad(edad);
		}
		return modificado;
	}
	
	public void borrar(String apellido) {
		listAlum.remove(findBySecondname(apellido));
	}
}
