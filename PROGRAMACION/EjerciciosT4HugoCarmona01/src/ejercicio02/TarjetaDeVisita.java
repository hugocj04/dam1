package ejercicio02;

public class TarjetaDeVisita extends Documento {

	private String nombre;
	private String telefono;
	private String email;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "TarjetaDeVisita [nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + "]";
	}

	public TarjetaDeVisita(String empresa, String nombre, String telefono, String email) {
		super(empresa);
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}

	public void imprimirCabecera() {
		System.out.printf("""
				\t\t\tDATOS DE LA EMPRESA

				Nombre: %s\tTelefono: %d\tEmail: %s


				""", nombre, telefono, email);
	}

}
