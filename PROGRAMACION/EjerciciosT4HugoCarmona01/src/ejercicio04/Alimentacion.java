package ejercicio04;

public class Alimentacion extends Producto {

	private int diasCaducidad;
	private boolean refrigerado;

	public Alimentacion(double precioUni, String nombre, int id, int diasCaducidad, boolean refrigerado) {
		super(precioUni, nombre, id);
		this.diasCaducidad = diasCaducidad;
		this.refrigerado = refrigerado;
	}

	public int getDiasCaducidad() {
		return diasCaducidad;
	}

	public void setDiasCaducidad(int diasCaducidad) {
		this.diasCaducidad = diasCaducidad;
	}

	public boolean isRefirgerado() {
		return refrigerado;
	}

	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}

	@Override
	public String toString() {
		return "Alimentacion [diasCaducidad=" + diasCaducidad + ", refrigerado=" + refrigerado + "]";
	}

	public double calcularPVP(double iva, double descuento, int topeCaducidad) {
		double total = 0;
		if (diasCaducidad<topeCaducidad) {
			total = super.calcularPVP(iva, descuento, topeCaducidad) - super.calcularPVP(iva, descuento, topeCaducidad) * descuento / 100;
		} else {
			total = super.calcularPVP(iva, descuento, topeCaducidad);
		}
		return total;
	}

	public void avisoCaducidad(int topeCaducidad) {
		if (diasCaducidad > topeCaducidad) {
			System.out.println("Este producto está apunto de caducar");			
		}
	}
	
}
