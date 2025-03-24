package ejemploobjetos;

public class Secretaria2 {

	// Sin Alumno como atributo
	private String nombreColegio;

	public Secretaria2(String nombreColegio) {
		super();
		this.nombreColegio = nombreColegio;
	}

	public String getNombreColegio() {
		return nombreColegio;
	}

	public void setNombreColegio(String nombreColegio) {
		this.nombreColegio = nombreColegio;
	}

	@Override
	public String toString() {
		return "Secretaria2 [nombreColegio=" + nombreColegio + ", getNombreColegio()=" + getNombreColegio()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	// Así no
	public double calcularMediav3() {
		Alumno a = new Alumno("Hugo", "Carmona Jimenez", 8, 5);
		return a.calcularMedia();
	}
	
	public double calcularMediav4(String nombre, String apellidos, double notaPro, double notaSis) {
		double dos = 2;
		return (notaPro + notaSis) / dos;
	}
	// ----------------------------------------------------------------------------------------------
	
	public double calcularMediav5(Alumno a) {
		return a.calcularMedia();
	}
	
}
