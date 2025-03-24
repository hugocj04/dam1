package ejemplolectura;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		double precio;
		
		System.out.println("Hola, diganos su nombre");
		nombre = Leer.dato();
		System.out.println("Introduzca el precio del producto "
				+ "que desea comprar");
		precio = Leer.datoDouble();
		System.out.printf("Su producto cuesta %.2f€",precio);

	}

}
