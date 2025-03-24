package ejercicio04;

public class Contacto {

	private int id;
	private String nombre;
	private String tlf;

	public Contacto(int id, String nombre, String tlf) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tlf = tlf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", tlf=" + tlf + "]";
	}

	

}
