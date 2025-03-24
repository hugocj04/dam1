package ejemplo01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nada: Solo clases de ese paquete
		// Public: Desde cualquier paquete y clase
		// Private: Solo su clase
		
		Alumno a = new Alumno();

		System.out.println(a.getEdad());
		a.setEdad(18);
		
		System.out.println(a.getEdad());

	}
}