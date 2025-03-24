package ejemploset;

import java.util.Set;

public class Secretaria {

	private Set<Alumno> listado;

	public Secretaria(Set<Alumno> listado) {
		super();
		this.listado = listado;
	}

	public Set<Alumno> getListado() {
		return listado;
	}

	public void setListado(Set<Alumno> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Secretaria []";
	}

	public void agregarAlummo(Alumno x) {
		listado.add(x);
	}

	public void imprimirLista() {
		for (Alumno x : listado) {
			System.out.println(x);
		}
	}

}
