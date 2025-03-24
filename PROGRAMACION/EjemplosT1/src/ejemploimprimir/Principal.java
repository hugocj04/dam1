package ejemploimprimir;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreProducto="Pantalla";
		int cantidad=2;
		double precio=190;
		double total;
		total=precio*cantidad;
		
		System.out.printf("Llevas %d %s a %.2f euros cada una, "
				+ "luego el precio es: %.2f",cantidad,nombreProducto,precio,total);
		
	}

}
