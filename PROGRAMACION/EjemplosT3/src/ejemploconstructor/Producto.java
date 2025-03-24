package ejemploconstructor;

public class Producto {

	// Atributos
	private int id;
	private String nombre;
	private double precioBase;

	// Constructores (Metodos especiales)
	public Producto(int id, String nombre, double precioBase) {
		this.id = id;
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	
	public Producto() {
		
	}
	
	// Constructor con dos parametros
	public Producto(int id, double precioBase) {
		this.id = id;
		this.precioBase = precioBase;
	}
	
	// Getters and setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	// Nuestros metodos
	public double calcularPVP(double porcentaje) {
		double cien = 100;
		return precioBase + porcentaje * precioBase / 100;
	}
	
	// Para imprimir los datos
	public String toString() {
		return "Producto [id = " + id + ", nombre = " + nombre + ", precioBase = " + precioBase + "]";
	}
	
}

