package ejemplo03polimorfismo;

public abstract class Figura {

	// Se pueden usar atributos protected
	private String nombre, color;

	public Figura(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}

	public Figura() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", color=" + color + "]";
	}

	public abstract double calcularArea();

	public abstract double calcularPerimetro();

	public void metodoSoloDeFigura() {
		System.out.println("Solo estoy en la clase figura, sin sobrescribir las hijas");
	}
}
