package ejercicio01;

public class Ordenador {

	private double capDisc;
	private double frecCpu;
	private double precioBase;
	private String marca;

	public Ordenador(double capDisc, double frecCpu, double precioBase, String marca) {
		super();
		this.capDisc = capDisc;
		this.frecCpu = frecCpu;
		this.precioBase = precioBase;
		this.marca = marca;
	}

	public double getCapDisc() {
		return capDisc;
	}

	public void setCapDisc(double capDisc) {
		this.capDisc = capDisc;
	}

	public double getFrecCpu() {
		return frecCpu;
	}

	public void setHzCpu(double frecCpu) {
		this.frecCpu = frecCpu;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Ordenador [capDisc=" + capDisc + ", frecCpu=" + frecCpu + ", precioBase=" + precioBase + ", marca=" + marca
				+ "]";
	}

	public double calcularPVP (double ganancia) {
		double cien = 100;
		return precioBase * (1 + ganancia / cien);
	}
	
}
