package ejercicio;

public class Producto {

	private int id;
	private String nombre;
	private double precioFab;
	private boolean fragil;
	private int seccion;

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

	public double getPrecioFab() {
		return precioFab;
	}

	public void setPrecioFab(double precioFab) {
		this.precioFab = precioFab;
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
		return "Producto [id=" + id + ", nombre=" + nombre + ", precioFab=" + precioFab + ", fragil=" + fragil
				+ ", seccion=" + seccion + "]";
	}

	public Producto(int id, String nombre, double precioFab, boolean fragil, int seccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precioFab = precioFab;
		this.fragil = fragil;
		this.seccion = seccion;
	}
	
	public double calcularPrecioCoste(int porcentaje) {
		double cien = 100;
		return precioFab / cien * porcentaje;
	}
		
}
