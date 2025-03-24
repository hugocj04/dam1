package ejemplo01;

public class Empleado extends Trabajador {

	private double sueldo;
	private double impuestos;

	public Empleado(String nombre, String puesto, double sueldo, double impuestos) {
		// El super va en la primera linea y llama a los atributos de la clase madre
		super(nombre, puesto);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + "]";
	}

	public double calcularSueldo(double base) {
		return sueldo - impuestos;
	}
	
}
