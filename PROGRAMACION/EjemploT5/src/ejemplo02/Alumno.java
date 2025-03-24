package ejemplo02;

public class Alumno {

	private String nombre;
	private String dni;
	private double notaMedia;

	public Alumno(String nombre, String dni, double notaMedia) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", dni=" + dni + ", notaMedia=" + notaMedia + "]";
	}

}
