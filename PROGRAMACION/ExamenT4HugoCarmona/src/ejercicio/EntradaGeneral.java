package ejercicio;

public class EntradaGeneral implements IDonativo{

	private String nombreCliente;
	private boolean zonaAsiento;
	private int nFila;
	private int nAsiento;
	private double precioBasico;

	public EntradaGeneral(String nombreCliente, boolean zonaAsiento, int nFila, int nAsiento, double precioBasico) {
		super();
		this.nombreCliente = nombreCliente;
		this.zonaAsiento = zonaAsiento;
		this.nFila = nFila;
		this.nAsiento = nAsiento;
		this.precioBasico = precioBasico;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public boolean isZonaAsiento() {
		return zonaAsiento;
	}

	public void setZonaAsiento(boolean zonaAsiento) {
		this.zonaAsiento = zonaAsiento;
	}

	public int getnFila() {
		return nFila;
	}

	public void setnFila(int nFila) {
		this.nFila = nFila;
	}

	public int getnAsiento() {
		return nAsiento;
	}

	public void setnAsiento(int nAsiento) {
		this.nAsiento = nAsiento;
	}

	public double getPrecioBasico() {
		return precioBasico;
	}

	public void setPrecioBasico(double precioBasico) {
		this.precioBasico = precioBasico;
	}

	@Override
	public String toString() {
		return "EntradaGeneral [nombreCliente=" + nombreCliente + ", zonaAsiento=" + zonaAsiento + ", nFila=" + nFila + ", nAsiento=" + nAsiento
				+ ", precioBasico=" + precioBasico + "]";
	}

	public double calcularPrecioEntrada(double descuento, double cantidad) {
		if (zonaAsiento) {
			precioBasico = 3;
		} else {
			precioBasico = 4;
		}
		return precioBasico;
	}
	
	public double calcularDonativo(double porcDonativo, double descuento, double cantidad) {
		double cien = 100;
		return calcularPrecioEntrada(descuento, cantidad) / porcDonativo * cien;
	}

}
