package ejercicio05;

public class Gerente extends Empleado {

	private int impuesto;

	public Gerente(String nombre, String apellidos, double sueldoBase, int nEmpleado, int impuesto) {
		super(nombre, apellidos, sueldoBase, nEmpleado);
		this.impuesto = impuesto;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return "Gerente [impuesto=" + impuesto + "]";
	}

	public double calcularSueldo() {
		double cien = 100;
		return super.calcularSueldo() - (getSueldoBase() * impuesto / cien);
	}
}
