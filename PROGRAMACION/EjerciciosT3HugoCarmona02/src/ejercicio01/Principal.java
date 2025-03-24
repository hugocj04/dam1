package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Seccion 1 alimentacion, seccion 4 electronica
		
		int opcion, id, tam = 10, seccion = 0, numProductos = 0, fragil;
		double precioFab, transporte;
		String nombre;
		Producto Fanta = new Producto(2.59, "Fanta", 1, false, 1);
		Producto PantallaLG = new Producto(85.99, "Pantalla LG", 2, true, 4);
		Producto p3;
		Producto[] lista = new Producto [tam];
		Tienda t;	
		t = new Tienda (lista);
		
		t.agregar(Fanta, numProductos);
		numProductos++;
		t.agregar(PantallaLG, numProductos);
		numProductos++;

		System.out.println("Bienvenido.");

		do {
			System.out.println("\n¿Qué desea hacer?");
			System.out.println("1. Listar datos de los productos");
			System.out.println("2. Comprobar si un producto es fragil");
			System.out.println("3. Añadir un producto a la lista");
			System.out.println("4. Calcular la suma de todos los productos de la fabrica");
			System.out.println("5. Calcular PVP");
			System.out.println("6. Calcular ganancias al vender todos los productos");
			System.out.println("7. Salir");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 1:
				t.listarProductos();
				break;
			case 2:
				System.out.println("¿Cuántos productos hay?");
				numProductos = Leer.datoInt();
				System.out.print("Seleccione el ID del producto que quiere comprobar: ");
				id = Leer.datoInt();
				t.imprimirFragil(id, numProductos);
				break;
			case 3:
				System.out.print("Dime el precio del producto: ");
				precioFab = Leer.datoDouble();
				System.out.print("Dime el nombre del producto: ");
				nombre = Leer.dato();
				System.out.print("Dime el ID del producto: ");
				id = Leer.datoInt();
				System.out.print("Dime si es fragil (1. Si/2. No): ");
				fragil = Leer.datoInt();
				t.convertirFragil(fragil);
				System.out.print("Dime a que seccion pertenece: ");
				seccion = Leer.datoInt();
				p3 = new Producto (precioFab, nombre, id, t.convertirFragil(fragil), seccion);
				t.agregar(p3, numProductos);
				numProductos++;
				System.out.println("Producto agregado correctamente.");
				break;
			case 4:
				System.out.println("¿Cuanto es el porcentaje por el transporte?");
				transporte = Leer.datoDouble();
				System.out.printf("El precio de la suma de todo lo de la fabrica es %.2f€", t.calcularPrecioFabrica(transporte));
				break;
			default:
				System.out.println("Opcion inexistete, intentelo de nuevo.");
				break;
			}
		} while (opcion != 7);
		
		
		// Si busco varias cosas, se devuelve un array con todas las cosas
	}

}
