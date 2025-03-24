package ejercicio05;

public class Empleado {

	private String nombre;
	private String apellidos;
	private double sueldoBase;
	private int nEmpleado;

	public Empleado(String nombre, String apellidos, double sueldoBase, int nEmpleado) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoBase = sueldoBase;
		this.nEmpleado = nEmpleado;
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

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getnEmpleado() {
		return nEmpleado;
	}

	public void setnEmpleado(int nEmpleado) {
		this.nEmpleado = nEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", sueldoBase=" + sueldoBase + ", nEmpleado="
				+ nEmpleado + "]";
	}

	public double calcularSueldo() {
		return sueldoBase;
	}
	
}
