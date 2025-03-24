package ejercicio02;

public abstract class Producto {

	protected double precioBase;
	protected int cantidad;
	protected String nombre;
	protected boolean vendido;

	public Producto(double precioBase, int cantidad, String nombre, boolean vendido) {
		super();
		this.precioBase = precioBase;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.vendido = vendido;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	@Override
	public String toString() {
		return "Producto [precioBase=" + precioBase + ", cantidad=" + cantidad + ", nombre=" + nombre + "]";
	}

	public double calcularPVP(double porcentaje) {
		double cien = 100;
		return precioBase * porcentaje / cien;
	}
	
	public abstract void mostrarProducto();
	
}
