package ejercicio;

public class Familia extends EntradaGeneral {

	private int nHijos;
	private double precio;

	public Familia(String nombreCliente, boolean zonaAsiento, int nFila, int nAsiento, double precioBasico, int nHijos, double precio) {
		super(nombreCliente, zonaAsiento, nFila, nAsiento, precioBasico);
		this.nHijos = nHijos;
		this.precio = precio;
	}

	public int getnHijos() {
		return nHijos;
	}

	public void setnHijos(int nHijos) {
		this.nHijos = nHijos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Familia [nHijos=" + nHijos + ", precio" + precio + "]";
	}

	public double calcularPrecioEntrada(double descuento, double cantidad) {
		double cien = 100;
		precio = super.calcularPrecioEntrada(descuento, cantidad);
		if (nHijos >= 3) {
			precio = precio - (precio * descuento / cien);
		}
		return precio;
	}

}
