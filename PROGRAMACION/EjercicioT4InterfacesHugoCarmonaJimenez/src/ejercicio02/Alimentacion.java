package ejercicio02;

public class Alimentacion extends Producto{

	private boolean refrigerado;

	public Alimentacion(String nombre, double precioBase, boolean refrigerado) {
		super(nombre, precioBase);
		this.refrigerado = refrigerado;
	}

	public boolean isRefrigerado() {
		return refrigerado;
	}

	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}

	@Override
	public String toString() {
		return "Alimentacion [refrigerado=" + refrigerado + "]";
	}
	
	public double calculoPVP(int iva) {
		return super.calculoPVP(iva) + super.calculoIVA(getPrecioBase(), iva);
	}
}