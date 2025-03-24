package ejercicio01;

public class Suite extends Habitacion {

	private double mCuadrados;
	private double dineroServicioHabitaciones;
	private double descuento;
	private double precioSuite;

	public Suite(double precioBase, boolean ocupada, String nombreCliente, int diasOcupacion, int ocupantes,
			double mCuadrados, double dineroServicioHabitaciones, double descuento, double precioSuite) {
		super(precioBase, ocupada, nombreCliente, diasOcupacion, ocupantes);
		this.mCuadrados = mCuadrados;
		this.dineroServicioHabitaciones = dineroServicioHabitaciones;
		this.descuento = descuento;
		this.precioSuite = precioSuite;
	}

	public double getmCuadrados() {
		return mCuadrados;
	}

	public void setmCuadrados(double mCuadrados) {
		this.mCuadrados = mCuadrados;
	}

	public double getDineroServicioHabitaciones() {
		return dineroServicioHabitaciones;
	}

	public void setDineroServicioHabitaciones(double dineroServicioHabitaciones) {
		this.dineroServicioHabitaciones = dineroServicioHabitaciones;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getPrecioSuite() {
		return precioSuite;
	}

	public void setPrecioSuite(double precioSuite) {
		this.precioSuite = precioSuite;
	}

	@Override
	public String toString() {
		return "Suite [mCuadrados=" + mCuadrados + ", dineroServicioHabitaciones=" + dineroServicioHabitaciones
				+ ", descuento=" + descuento + ", precioSuite=" + precioSuite + "]";
	}

	public double calcularPrecioHabitacion() {
		double cien = 100;
		double precio;
		precio = super.calcularPrecioHabitacion() + dineroServicioHabitaciones + precioSuite;
		return precio - (precio * descuento / cien);
	}

	public void mostrarFactura() {
		System.out.printf("""
				- Nombre: %s
				- Dias de estancia: %d
				- Numero de personas: %d
				- Tipo de habitación: Suite
				- Metros cuadrados: %.2f 
				- Coste servicio a habitaciones: %.2f€
				- Descuento: %.0f
				- Precio final: %.2f€
				\n""", nombreCliente, diasOcupacion, ocupantes, mCuadrados, dineroServicioHabitaciones, descuento, calcularPrecioHabitacion());
	}

	
}
