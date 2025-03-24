package ejercicio02;

public class Movil extends Producto {

	private String marca;

	public Movil(double precioBase, int cantidad, String nombre, boolean vendido, String marca) {
		super(precioBase, cantidad, nombre, vendido);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Movil [nombre=" + nombre + ", marca=" + marca + "]";
	}

	public double calcularPVP(double porcentaje) {
		return super.calcularPVP(porcentaje);
	}
	
	public void mostrarProducto() {
		System.out.printf("""
				- Marca: %s
				- Precio: %.2f€
				- Cantidad: %d
				- Vendido: %b\n
				""", marca, precioBase, cantidad, vendido);
	}

}
