package ejercicio01;

public class Portatil extends Ordenador {

	private boolean seguro;
	private double precioSeguro;

	public Portatil(double capDisc, double hzCpu, double precioBase, String marca, boolean seguro,
			double precioSeguro) {
		super(capDisc, hzCpu, precioBase, marca);
		this.seguro = seguro;
		this.precioSeguro = precioSeguro;
	}

	public double calcularPVP (double ganancia) {
		double precioVenta;
		precioVenta = super.calcularPVP(ganancia);
		if (seguro) {
			precioVenta += precioSeguro;
		}
		return precioVenta;
	}
	
}
