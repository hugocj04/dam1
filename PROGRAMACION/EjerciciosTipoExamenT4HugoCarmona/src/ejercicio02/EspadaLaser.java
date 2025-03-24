package ejercicio02;

public class EspadaLaser extends Producto {

	private String tipoEspada;

	public EspadaLaser(double precioBase, int cantidad, String nombre, boolean vendido, String tipoEspada) {
		super(precioBase, cantidad, nombre, vendido);
		this.tipoEspada = tipoEspada;
	}

	public String getTipoEspada() {
		return tipoEspada;
	}

	public void setTipoEspada(String tipoEspada) {
		this.tipoEspada = tipoEspada;
	}

	@Override
	public String toString() {
		return "EspadaLaser [tipoEspada=" + tipoEspada + "]";
	}
	
	public double calcularPVP(double porcentaje) {
		String doble = "Doble";
		double calculado = super.calcularPVP(porcentaje);
		double cantidadFija = 12.99;
		if (tipoEspada.equalsIgnoreCase(doble)) {
			calculado += cantidadFija;
		}
		return calculado;
	}
	
	public void mensajeAdvertencia() {
		String doble = "Doble";
		if (tipoEspada.equalsIgnoreCase(doble)) {
			System.out.println("¡Cuidadín al sacarla de la bolsa, que hace pupa!");
		} else {
			System.out.println("");
		}
	}

	public void mostrarProducto() {
		System.out.printf("""
				- Tipo de espada: %s
				- Precio: %.2f€
				- Cantidad: %d
				- Vendido: %b\n
				""", tipoEspada, precioBase, cantidad, vendido);
	}
	
}
