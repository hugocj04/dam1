package ejercicio03;

public class Coche extends Vehiculo {

	private double potencia;

	public Coche(String tipoEmisiones, double cantidadFija, double potencia) {
		super(tipoEmisiones, cantidadFija);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Coche [potencia=" + potencia + "]";
	}

	public double calcularImpuesto(double impuesto) {
		double cien = 100;
		double veinticinco = 25;
		double suma;
		suma = cantidadFija + (veinticinco / cien * potencia);
		return suma * impuesto / cien;
	}
	
}
