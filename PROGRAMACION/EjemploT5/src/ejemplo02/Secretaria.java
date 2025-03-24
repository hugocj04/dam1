package ejemplo02;

import java.util.List;

public class Secretaria {

	private List<Alumno> listAlumnos;

	public Secretaria(List<Alumno> listAlumnos) {
		super();
		this.listAlumnos = listAlumnos;
	}

	public List<Alumno> getListAlumnos() {
		return listAlumnos;
	}

	public void setListAlumnos(List<Alumno> listAlumnos) {
		this.listAlumnos = listAlumnos;
	}

	@Override
	public String toString() {
		return "Secretaria [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public boolean añadirAlumno(Alumno a) {
		listAlumnos.add(a);
		return true;
	}

	public Alumno findByDni(String dni) {
		Alumno a = null;
		boolean encontrado = false;
		for (int i = 0; i < listAlumnos.size() || encontrado != true; i++) {
			if (listAlumnos.get(i).getDni().equalsIgnoreCase(dni)) {
				a = listAlumnos.get(i);
				encontrado = true;
			}
		}
		return a;
	}

	public int findByDni2(String dni) {
		boolean encontrado = false;
		int resultado = -1;
		for (int i = 0; i < listAlumnos.size() && !encontrado; i++) {
			if (listAlumnos.get(i).getDni().equalsIgnoreCase(dni)) {
				resultado = i;
				encontrado = true;
			}
		}
		return resultado;
	}

	public void borrarAlumno(String dni) {
		int index = findByDni2(dni);
		if (index >= 0) {
			listAlumnos.remove(index);
		}
	}
		
	public void modificarMedia(String Dni, double notaMod) {
		int index = findByDni2(Dni);
		listAlumnos.get(index).setNotaMedia(notaMod);
	}
	
	// No se sabe si sirve este modificarMedia
	public void modificarMedia2(String Dni, double notaMod) {
		Alumno a = findByDni(Dni);
		a.setNotaMedia(notaMod);
	}

	public double calcularTotalMedias() {
		double medias = 0;
		for(Alumno a : listAlumnos) {
			medias += a.getNotaMedia();
		}
		return medias / listAlumnos.size();
	}
	
	public double calcularTotalMedias2() {
		double suma = 0;
		double medias = 0;
		for(int i = 0; i < listAlumnos.size(); i++) {
			suma += listAlumnos.get(i).getNotaMedia();
			medias = suma / listAlumnos.size();
		}
		return medias;
	}
	
	public void imprimirLista() {
		for (Alumno a : listAlumnos) {
			System.out.println(a);
		}
	}
	
}
