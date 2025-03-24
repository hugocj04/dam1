package ejemplo02;

public class Alumno {

	// SOLO Atributos: Todos Private
	// Todo lo demas publico

	// Metodo:
	// - Trozo de código que hace algo
	// - Los nombres de los metodos tienen que ser verbos en infinitivo
	// - Definen las acciones de los atributos

	// Devolucion:
	// - Solo el tipo
	// - Es el resultado de calcular el tipo

	// Parametros:
	// - Son aquellos datos, variables, que hay que darle al metodo para que haga lo
	// - que tiene que hacer
	// - Ejemplo: double precioInicial, double ganancia;

	private String Nombre;
	private double media;
	private int edad;
	private double[] notas;

	// Constructores

	// Metodos:
	// - Getters and setters
	// - - Get:
	public int getEdad() {
		return edad;
	}

	// - - Set: Cambian atributos (no devuelven nada)(Con el this especificamos la variable donde se guarda lo de dentro del parentesis)
	public void setEdad(int nuevaEdad) {
		edad = nuevaEdad;
	}

	// devolucion nombre (parametros) {
	// codigo;
	// }

}