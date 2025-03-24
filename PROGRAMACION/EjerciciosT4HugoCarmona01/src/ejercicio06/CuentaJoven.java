package ejercicio06;

public class CuentaJoven extends Cuenta {

	private double regalo;
	
	public CuentaJoven(double salario, String nombre, String apellidos, double regalo) {
		super(salario, nombre, apellidos);
		this.salario = salario;
		this.regalo = regalo;
	}
	
//	public  double getAcumulo() {
//		return 0;
//	}
	
	public double getRegalo() {
		return regalo;
	}

	public void setRegalo(double regalo) {
		this.regalo = regalo;
	}

	@Override
	public String toString() {
		return "CuentaJoven [regalo=" + regalo + "]";
	}

	public double ingresarDinero(double ingreso) {
		regalo += 1;
		salario += 1;
		return salario + ingreso;
	}
	
	public double sacarDinero(double reintegro) {
		return salario - reintegro;
	}

}
