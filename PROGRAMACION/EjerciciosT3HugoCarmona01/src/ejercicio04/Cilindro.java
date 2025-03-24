package ejercicio04;

public class Cilindro {

	private double pi = 3.14;
	
	public double volumenCilindro(double radio, double altura) {
		double volumen;
		volumen = pi * Math.pow(radio, 2) * altura;
		return volumen;
	}
	
}
