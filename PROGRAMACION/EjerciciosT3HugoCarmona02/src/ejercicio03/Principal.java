package ejercicio03;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movil m1 = new Movil("Iphone", "XS", true, true, 300.99);
		Movil m2 = new Movil("Samsung", "Galaxy A22", false, false, 255.49);
		int opcion = 0;
		
		System.out.println("Bienvenido a nuestra tienda.");
		
		do {
			System.out.println("\n¿Qué desea hacer?");
			System.out.println("1. Comprobar cuántos moviles quedan sin vender");
			System.out.println("2. Mostrar precio final (con descuento si es de segunda mano)");
			System.out.println("3. Calcula cuanto dinero tengo despues de haber vendido todos los moviles");
			
		}while (opcion != 5);
		
	}

}
