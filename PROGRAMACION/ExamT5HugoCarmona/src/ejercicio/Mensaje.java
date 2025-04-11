package ejercicio;

import java.util.Objects;

public class Mensaje implements Comparable<Mensaje> {

	private int id;
	private String nombre;
	private String mensaje;

	public Mensaje(int id, String nombre, String mensaje) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.mensaje = mensaje;
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

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, mensaje, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mensaje other = (Mensaje) obj;
		return id == other.id && Objects.equals(mensaje, other.mensaje) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Mensaje [id=" + id + ", nombre=" + nombre + ", mensaje=" + mensaje + "]";
	}

	@Override
	public int compareTo(Mensaje m) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(m.getNombre());
	}
	
}
