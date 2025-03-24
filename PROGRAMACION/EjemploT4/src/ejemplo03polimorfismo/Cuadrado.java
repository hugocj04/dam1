package ejemplo03polimorfismo;

public class Cuadrado extends Figura {

	private double lado;

	public Cuadrado(String nombre, String color, double lado) {
		super(nombre, color);
		this.lado = lado;
	}
	
	// Constructor vacio de cuadrado pero con parametros de Figura para f2
	public Cuadrado(String nombre, String color) {
		super(nombre, color);
	}

	// Constructor vacio de cuadrado para f3
	public Cuadrado() {
		super();
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	public double calcularArea() {
		return lado * lado;
	}

	public double calcularPerimetro() {
		return 4 * lado;
	}

	public void mostrarLados() {
		System.out.println(
				"Solo estoy en la clase Cuadrado porque los demas no tienen lados, en concreto tengo 4 lados");
	}
}
