package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, tam = 10, id, seccion, fragil;
		String nombre;
		double precioFab, porcentaje;
		Producto p1 = new Producto(1, "Cocacola", 2.59, false, 1);
		Producto p2 = new Producto(2, "Pegatinas", 1.4, false, 2);
		Producto p3;
		Producto[] lista = new Producto [tam];
		Tienda t1;
		t1 = new Tienda (lista);
		
		t1.añadirProducto(p1);
		t1.añadirProducto(p2);
		
		System.out.println("Bienvenido.");
		
		do {
			System.out.println("\n¿Qué desea hacer?");
			System.out.println("1. Listar productos");
			System.out.println("2. Comprobar si un producto es fragil");
			System.out.println("3. Añadir un producto a la lista");
			System.out.println("4. Calcular suma de todos los productos");
			System.out.println("5. Calcular PVP");
			System.out.println("6. Calcular ganancias al haber vendido todos los productos");
			System.out.println("7. Salir.");
			opcion = Leer.datoInt();
			
			switch(opcion) {
				case 1:
					t1.mostrarProductos();
					break;
				case 2:
					System.out.print("Diga el ID del producto que quiere comprobar si es fragil: ");
					id = Leer.datoInt();
					System.out.println(t1.comprobarFragil(t1.findByID(id)));
					break;
				case 3:
					System.out.println("Diga los datos del producto:");
					System.out.print("ID: ");
					id = Leer.datoInt();
					System.out.println("Nombre: ");
					nombre = Leer.dato();
					System.out.print("Precio: ");
					precioFab = Leer.datoDouble();
					System.out.print("Fragil (1. Si/2. No): ");
					fragil = Leer.datoInt();
					System.out.print("Seccion: ");
					seccion = Leer.datoInt();
					p3 = new Producto(id, nombre, precioFab, t1.transformarFragil(fragil), seccion);			
					t1.añadirProducto(p3);
					System.out.println("\nProducto añadido con exito.");
					break;
				case 4:
					System.out.printf("La suma del precio de todos los productos es de %.2f\n", t1.calcularSumaProductos());
					break;
				case 5:
					System.out.print("Dime el porcentaje del PVP: ");
					porcentaje = Leer.datoDouble();
					System.out.print("Dime el ID del producto: ");
					id = Leer.datoInt();
					System.out.printf("El PVP de ese producto es: %.2f€", t1.calcularPVP(porcentaje, t1.findByID(id)));
					break;
				case 6:
					
					break;
				case 7:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opcion inexistente, intentelo de nuevo.");
					break;
			}
		} while (opcion != 5);
	}
}
