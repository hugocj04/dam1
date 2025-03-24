package ejercicio06;

public abstract class Cuenta {

	protected double salario;
	private String nombre;
	private String apellidos;

	public Cuenta(double salario, String nombre, String apellidos) {
		super();
		this.salario = salario;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
//	public abstract double getAcumulo();
//	
//	public abstract double getRegalo();
	
	@Override
	public String toString() {
		return "Cuenta [salario=" + salario + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	public abstract double sacarDinero(double reintegro);

	public abstract double ingresarDinero(double ingreso);

}
