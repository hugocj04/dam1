package ejemploobjetos;

public class Secretaria {

	private String nombreColegio;
	// Prmera vez que tengo atributo no basico
	// el tipo es de la clase Alumno
	private Alumno a;

	public Secretaria(String nombreColegio, Alumno a) {
		super();
		this.nombreColegio = nombreColegio;
		this.a = a;
	}

	public String getNombreColegio() {
		return nombreColegio;
	}

	public void setNombreColegio(String nombreColegio) {
		this.nombreColegio = nombreColegio;
	}

	public Alumno getA() {
		return a;
	}

	public void setA(Alumno a) {
		this.a = a;
	}

	// Asi:
	/*
	 * public double calcularMediav2() { double dos = 2; return (a.getNotaPro() +
	 * a.getNotaSis()) / dos; }
	 */
	
	// O asi:
	public double calcularMediav2() {
		double dos = 2;
		return a.calcularMedia();
	}

}
