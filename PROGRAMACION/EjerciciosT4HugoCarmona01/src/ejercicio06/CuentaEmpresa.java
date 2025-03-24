package ejercicio06;

public class CuentaEmpresa extends Cuenta {

	private double acumulo;

	public CuentaEmpresa(double salario, String nombre, String apellidos,double acumulo) {
		super(salario, nombre, apellidos);
		this.acumulo = acumulo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getAcumulo() {
		return acumulo;
	}

	public void setAcumulo(double acumulo) {
		this.acumulo = acumulo;
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [salario=" + salario + ", acumulo=" + acumulo + "]";
	}
	
//	public double getRegalo() {
//		return 0;
//	}

	public double sacarDinero(double reintegro) {
		acumulo += 1;
		salario -= 1;
		return salario - reintegro;
	}

	public double ingresarDinero(double ingreso) {
		return salario + ingreso;
	}

}
