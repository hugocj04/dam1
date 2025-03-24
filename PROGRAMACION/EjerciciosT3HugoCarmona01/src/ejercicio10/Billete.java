package ejercicio10;

public class Billete {

	private int numSaltos;
	private double precioBase, precioSalto;

	public int getNumeroSaltos() {
		return numSaltos;
	}

	public void setNumeroSaltos(int numSaltos) {
		this.numSaltos = numSaltos;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPrecioSalto() {
		return precioSalto;
	}

	public void setPrecioSalto(double precioSalto) {
		this.precioSalto = precioSalto;
	}

	public Billete(int numSaltos, double precioBase, double precioSalto) {
		super();
		this.numSaltos = numSaltos;
		this.precioBase = precioBase;
		this.precioSalto = precioSalto;
	}

	@Override
	public String toString() {
		return "Billete [numSaltos=" + numSaltos + ", precioBase=" + precioBase + ", precioSalto=" + precioSalto + "]";
	}

	public double calcularPrecio() {
		return precioBase + numSaltos * precioSalto;
	}
	
}
