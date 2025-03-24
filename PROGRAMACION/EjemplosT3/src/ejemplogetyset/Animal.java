package ejemplogetyset;

public class Animal {

	private String nombre;
	private int edad;
	private int numPatas;
	private double peso;
	private boolean mamifero;

	public Animal(String nombre, int edad, int numPatas, double peso, boolean mamifero) {

		this.nombre = nombre;
		this.edad = edad;
		this.numPatas = numPatas;
		this.peso = peso;
		this.mamifero = mamifero;
	}

	public Animal() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Solo en los boleanos se pone isNombreVariable
	public boolean isMamifero() {
		return mamifero;
	}

	public void setMamifero(boolean mamifero) {
		this.mamifero = mamifero;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", edad=" + edad + ", numPatas=" + numPatas + ", peso=" + peso
				+ ", mamifero=" + mamifero + "]";
	}

	// Sobrecarga de metodos
	// No pueden existir metodos que se llamen igual con el mismo parametro (lo que va dentro del parentesis)
	// Ante la duda si tenemos que devolver o modificar el atrivuto
	public int cambiarEdad(int cant) {
		edad += cant;
		return edad;
	}
	
	public int cambiarEdad () {
		edad ++;
		return edad;
	}
	
}