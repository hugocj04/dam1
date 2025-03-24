package ejercicio01;

public class Nota {

	private String nombre;
	private String contenido;

	public Nota(String nombre, String contenido) {
		super();
		this.nombre = nombre;
		this.contenido = contenido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Nota [nombre=" + nombre + ", contenido=" + contenido + "]";
	}

	
	
}
