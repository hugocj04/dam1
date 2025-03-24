package ejercicio03;

public class Motocicleta extends Vehiculo {

	private double cilindrada;

	public Motocicleta(String tipoEmisiones, double cantidadFija, double cilindrada) {
		super(tipoEmisiones, cantidadFija);
		this.cilindrada = cilindrada;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + "]";
	}

	public double calcularImpuesto(double impuesto) {
		double cien = 100;
		double sesenta = 60;
		double suma;
		suma = cantidadFija + (sesenta / cien * cilindrada);
		return suma * impuesto / cien;
	}
	
}
