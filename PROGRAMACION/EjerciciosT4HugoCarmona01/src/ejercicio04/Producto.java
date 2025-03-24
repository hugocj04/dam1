package ejercicio04;

public class Producto {

	private double precioUni;
	private String nombre;
	private int id;

	public Producto(double precioUni, String nombre, int id) {
		super();
		this.precioUni = precioUni;
		this.nombre = nombre;
		this.id = id;
	}

	public double getPrecioUni() {
		return precioUni;
	}

	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Producto [precioUni=" + precioUni + ", nombre=" + nombre + ", id=" + id + "]";
	}

	public double calcularPVP(double iva, double descuento, int topeCaducidad) {
		return precioUni + precioUni * iva / 100;
	}
	
}
