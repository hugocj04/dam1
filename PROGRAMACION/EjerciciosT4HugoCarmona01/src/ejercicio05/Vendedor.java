package ejercicio05;

public class Vendedor extends Empleado{

	private int cantVentas;
	private double incentivo;

	public Vendedor(String nombre, String apellidos, double sueldoBase, int nEmpleado, int cantVentas, double incentivo) {
		super(nombre, apellidos, sueldoBase, nEmpleado);
		this.cantVentas = cantVentas;
		this.incentivo = incentivo;
	}

	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(int incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return "Vendedor [cantVentas=" + cantVentas + ", incentivo=" + incentivo + "]";
	}

	public double calcularSueldo() {
		double cien = 100;
		double porcIncentivo;
		porcIncentivo = cantVentas * incentivo / cien;
		return super.calcularSueldo() + porcIncentivo;
	}
	
	public void comprobarTope(double ventas) {
		if (cantVentas > ventas) {
			System.out.println("¡Enhorabuena, has alcanzado tu tope de ventas!");
		}
	}
	
}
