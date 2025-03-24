package ejercicio06;

public class CuentaCorriente extends Cuenta {

	private double costeMantenimiento;
	private int puntos;

	public CuentaCorriente(double salario, String nombre, String apellidos, double costeMantenimiento, int puntos) {
		super(salario, nombre, apellidos);
		this.costeMantenimiento = costeMantenimiento;
		this.puntos = puntos;
	}

	public double getCosteMantenimiento() {
		return costeMantenimiento;
	}

	public void setCosteMantenimiento(double costeMantenimiento) {
		this.costeMantenimiento = costeMantenimiento;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
//	public double getAcumulo() {
//		return 0;
//	}
//	
//	public double getRegalo() {
//		return 0;
//	}

	@Override
	public String toString() {
		return "CuentaCorriente [costeMantenimiento=" + costeMantenimiento + ", puntos=" + puntos + "]";
	}

	public double sacarDinero(double reintegro) {
		puntos += 1;
		return salario - reintegro;
	}
	
	public double ingresarDinero(double ingreso) {
		return salario + ingreso;
	}

}
