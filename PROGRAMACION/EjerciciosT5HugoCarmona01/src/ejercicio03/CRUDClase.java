package ejercicio03;

import java.util.List;

public class CRUDClase {

	private List<Alumno> listAlum;

	public CRUDClase(List<Alumno> listAlum) {
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
		return "CRUDClase [listAlum=" + listAlum + "]";
	}

	public double sacarNotaMedia() {
		double suma = 0;
		for (int i = 0; i < listAlum.size(); i++) {
			suma += listAlum.get(i).getMedia();
		}
		return suma / listAlum.size();
	}

	public int sacarTotalSuspensos() {
		int sumaSuspensos = 0;
		for (int i = 0; i < listAlum.size(); i++) {
			if (listAlum.get(i).getMedia() < 5) {
				sumaSuspensos += 1;
			}
		}
		return sumaSuspensos;
	}

	public double mediaSuspensos() {
		double totalSuspensos = 0;
		double sumaSuspensos = (double)sacarTotalSuspensos();
		for (int i = 0; i < listAlum.size(); i++) {
			if (listAlum.get(i).getMedia() < 5) {
				totalSuspensos += listAlum.get(i).getMedia();
			}
		}
		return totalSuspensos / sumaSuspensos;
	}

}
