package ejercicio03.copy;

import java.util.Iterator;

public class Clase {

	private CRUDClase crudclase;

	public Clase(CRUDClase crudclase) {
		super();
		this.crudclase = crudclase;
	}

	public CRUDClase getCrudclase() {
		return crudclase;
	}

	public void setCrudclase(CRUDClase crudclase) {
		this.crudclase = crudclase;
	}

	@Override
	public String toString() {
		return "Clase [crudclase=" + crudclase + "]";
	}
	
	public double averageGrades() {
		double average = 0;
		for (Alumno a : crudclase.getList()) {
			average += a.getMedia();
		}
		return average / crudclase.getList().size();
	}
	
	public int numberOfFails() {
		int num = 0;
		Iterator<Alumno> it = crudclase.getList().iterator();
		while (it.hasNext()) {
			if (it.next().getMedia() < 5) {
				num ++;
			}
		}
		return num;
	}
	
	public double averageOfFails() {
		return numberOfFails() / (double)crudclase.getList().size();
	}
}
