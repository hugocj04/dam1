package ejercicio03;

public abstract class Vehiculo {

	protected String tipoEmisiones;
	protected double cantidadFija;

	public Vehiculo(String tipoEmisiones, double cantidadFija) {
		super();
		this.tipoEmisiones = tipoEmisiones;
		this.cantidadFija = cantidadFija;
	}

	public String getTipoEmisiones() {
		return tipoEmisiones;
	}

	public void setTipoEmisiones(String tipoEmisiones) {
		this.tipoEmisiones = tipoEmisiones;
	}

	public double getCantidadFija() {
		return cantidadFija;
	}

	public void setCantidadFija(double cantidadFija) {
		this.cantidadFija = cantidadFija;
	}

	@Override
	public String toString() {
		return "Vehiculo [tipoEmisiones=" + tipoEmisiones + ", cantidadFija=" + cantidadFija + "]";
	}
	
	public abstract double calcularImpuesto(double impuesto);
	
}
