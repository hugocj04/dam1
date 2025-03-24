package ejercicio03;

public class Furgoneta extends Vehiculo {

	private double cantidadFijaFurgo;

	public Furgoneta(String tipoEmisiones, double cantidadFija, double cantidadFijaFurgo) {
		super(tipoEmisiones, cantidadFija);
		this.cantidadFijaFurgo = cantidadFijaFurgo;
	}

	public double getCantidadFija() {
		return cantidadFijaFurgo;
	}

	public void setCantidadFija(double cantidadFijaFurgo) {
		this.cantidadFijaFurgo = cantidadFijaFurgo;
	}

	@Override
	public String toString() {
		return "Furgoneta [cantidadFija=" + cantidadFijaFurgo + "]";
	}

	public double calcularImpuesto(double impuesto) {
		double cien = 100;
		double suma;
		suma = cantidadFija + cantidadFijaFurgo;
		return suma * impuesto / cien;
	}

}
