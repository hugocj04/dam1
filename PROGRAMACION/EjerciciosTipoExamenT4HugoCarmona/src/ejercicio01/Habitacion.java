package ejercicio01;

public class Habitacion {

	protected double precioBase;
	protected boolean ocupada;
	protected String nombreCliente;
	protected int diasOcupacion;
	protected int ocupantes;

	public Habitacion(double precioBase, boolean ocupada, String nombreCliente, int diasOcupacion, int ocupantes) {
		super();
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.diasOcupacion = diasOcupacion;
		this.ocupantes = ocupantes;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getDiasOcupacion() {
		return diasOcupacion;
	}

	public void setDiasOcupacion(int diasOcupacion) {
		this.diasOcupacion = diasOcupacion;
	}

	public int getOcupantes() {
		return ocupantes;
	}

	public void setOcupantes(int ocupantes) {
		this.ocupantes = ocupantes;
	}

	@Override
	public String toString() {
		return "Habitacion [precioBase=" + precioBase + ", ocupada=" + ocupada + ", nombreCliente=" + nombreCliente
				+ ", diasOcupacion=" + diasOcupacion + ", ocupantes=" + ocupantes + "]";
	}

	public double calcularPrecioHabitacion() {
		return precioBase * diasOcupacion;
	}
	
	public void mostrarFactura() {
		System.out.printf("""
				- Nombre: %s
				- Dias de estancia: %d
				- Numero de personas: %d
				- Tipo de habitación: Normal
				- Precio final: %.2f€
				\n""", nombreCliente, diasOcupacion, ocupantes, calcularPrecioHabitacion());
	}
	
}
