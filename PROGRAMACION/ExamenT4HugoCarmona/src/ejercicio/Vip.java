package ejercicio;

public class Vip extends EntradaGeneral {

	private double precio;

	public Vip(String nombreCliente, boolean zonaAsiento, int nFila, int nAsiento, double precioBasico, double precio) {
		super(nombreCliente, zonaAsiento, nFila, nAsiento, precioBasico);
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Vip [precio=" + precio + "]";
	}

	public double calcularPrecioEntrada(double descuento, double cantidad) {
		precio = super.calcularPrecioEntrada(descuento, cantidad) + cantidad;
		return precio;
	}
	
	public void mostrarConsumicion() {
		System.out.printf("""
				Vale de consumición:
				Consumición gratis para %s\n""", super.getNombreCliente());
	}
	
}
