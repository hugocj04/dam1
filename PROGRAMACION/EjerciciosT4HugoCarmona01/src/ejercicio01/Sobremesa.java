package ejercicio01;

public class Sobremesa extends Ordenador{

	private double precioMontaje;

	public Sobremesa(double capDisc, double hzCpu, double precioBase, String marca, double precioMontaje) {
		super(capDisc, hzCpu, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}
	
	public double calcularPVP (double ganancia) {
		return super.calcularPVP(ganancia) + precioMontaje;
	}
	
}
