package ejercicio01;

public class Apartamento extends Habitacion {

	private boolean servicioLimpieza;

	public Apartamento(double precioBase, boolean ocupada, String nombreCliente, int diasOcupacion, int ocupantes,
			boolean servicioLimpieza) {
		super(precioBase, ocupada, nombreCliente, diasOcupacion, ocupantes);
		this.servicioLimpieza = servicioLimpieza;
	}

	public boolean isServicioLimpieza() {
		return servicioLimpieza;
	}

	public void setServicioLimpieza(boolean servicioLimpieza) {
		this.servicioLimpieza = servicioLimpieza;
	}

	@Override
	public String toString() {
		return "Apartamento [servicioLimpieza=" + servicioLimpieza + "]";
	}

	public double calcularPrecioHabitacion() {
		double costeServicioLimpieza = 13;
		double precioFinal;
		precioFinal = super.calcularPrecioHabitacion();
		if (servicioLimpieza) {
			precioFinal += costeServicioLimpieza;
		}
		return precioFinal;
	}
	
	public void mostrarFactura() {
		System.out.printf("""
				- Nombre: %s
				- Dias de estancia: %d
				- Numero de personas: %d
				- Tipo de habitación: Apartamento
				- Servicio de limpieza: %b
				- Precio final: %.2f€
				\n""", nombreCliente, diasOcupacion, ocupantes, servicioLimpieza, calcularPrecioHabitacion());
	}

}
