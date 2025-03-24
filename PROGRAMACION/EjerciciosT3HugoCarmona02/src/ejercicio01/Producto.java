package ejercicio01;

public class Producto {

	private int id;
	private String nombre;
	private double precioFab;
	private boolean fragil;
	private int seccion;

	public double getPrecioFab() {
		return precioFab;
	}

	public void setPrecioFab(double precioFab) {
		this.precioFab = precioFab;
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

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	public int getSeccion() {
		return seccion;
	}

	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return "Producto [precioFab=" + precioFab + ", nombre=" + nombre + ", id=" + id + ", fragil=" + fragil
				+ ", seccion=" + seccion + "]";
	}

	public Producto(double precioFab, String nombre, int id, boolean fragil, int seccion) {
		super();
		this.precioFab = precioFab;
		this.nombre = nombre;
		this.id = id;
		this.fragil = fragil;
		this.seccion = seccion;
	}

	public double calcularPrecioCoste(double transporte) {
		double cien = 100;
		return precioFab + precioFab / cien * transporte;
	}
	
}