package ejemploobjetoarray;

public class Alumno {

	private String Nombre;
	private double edad;
	private double nota;
	private double altura;
	private double alumno[];

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getEdad() {
		return edad;
	}

	public void setEdad(double edad) {
		this.edad = edad;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Alumno(String nombre, double edad, double nota, double altura) {
		super();
		Nombre = nombre;
		this.edad = edad;
		this.nota = nota;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Alumno [Nombre=" + Nombre + ", edad=" + edad + ", nota=" + nota + ", altura=" + altura + "]";
	}

	public double generarArray() {
		for (int i = 0; i < alumno.length; i++) {
			
		}
	}
}
