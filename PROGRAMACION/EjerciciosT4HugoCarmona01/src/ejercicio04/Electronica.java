package ejercicio04;

public class Electronica extends Producto {

	// El atributo impuesto de lujo se pasa como parametro
	private boolean lujo;

	public Electronica(double precioUni, String nombre, int id, boolean lujo) {
		super(precioUni, nombre, id);
		this.lujo = lujo;
	}

	public boolean isLujo() {
		return lujo;
	}

	public void setLujo(boolean lujo) {
		this.lujo = lujo;
	}

	@Override
	public String toString() {
		return "Electronica [lujo=" + lujo + "]";
	}

	public double calcularPVP(double iva, double descuento, int topeCaducidad) {
		double total = 0;
		if (lujo) {
			total = super.calcularPVP(iva, descuento, topeCaducidad) + super.calcularPVP(iva, descuento, topeCaducidad) * descuento / 100;
		} else {
			total = super.calcularPVP(iva, descuento, topeCaducidad);
		}
		return total;
	}

}
