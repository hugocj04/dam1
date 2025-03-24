package ejercicio02;

public class Socio implements Comparable<Socio> {

	private int id, edad, tlf; // Los numeros de telefono suelen ser String
	private String nombre, dni;

	public Socio(int id, String nombre, int tlf, String dni, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tlf = tlf;
		this.dni = dni;
		this.edad = edad;
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

	public int getTlf() {
		return tlf;
	}

	public void setTlf(int tlf) {
		this.tlf = tlf;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", tlf=" + tlf + ", dni=" + dni + ", edad=" + edad + "]";
	}

	public int compareTo(Socio o) {
		if (id > o.id) {
			return 1;
		} else {
			if (id < o.id) {
				return -1;
			}
			return 0;
		}
	}
}
