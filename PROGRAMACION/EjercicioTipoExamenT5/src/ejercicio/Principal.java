package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Orden no natural en una clase aparte y orden natural el compareTo de la clase pojo
		
		Scanner sc = new Scanner(System.in);

		Trastero t1 = new Trastero(20, "Calle Alfonso Lasso de la vega", 1, 134, true);
		Trastero t2 = new Trastero(15, "Calle Luis Uruñuela", 2, 120, true);
		Trastero t3 = new Trastero(32.5, "Calle Condes de baustillo", 3, 198.99, true);
		Trastero t4 = new Trastero(20, "Calle Alfonso Lasso de la vega", 4, 134, false);

		List<Trastero> oficina = new ArrayList<Trastero>();
		List<Trastero> oficinaSort = new ArrayList<Trastero>();

		Oficina o = new Oficina(oficina);

		o.agregarTrastero(t1);
		o.agregarTrastero(t2);
		o.agregarTrastero(t3);
		o.agregarTrastero(t4);

		int opcion = 0, num = 4;
		double capacidad, precio;
		String direccion;
		boolean ocupado;

		System.out.println("Bienvenido.");

		do {
			System.out.println(
					"""
							\n¿Qué desea hacer?
							0. Salir
							1. Añadir trastero
							2. Buscar trastero por precio
							3. Buscar trastero por numero
							4. Buscar el trastero mas caro
							5. Eliminar trastero
							6. Modificar precio de un trastero
							7. Ordenar lista de trasteros por numero (orden natural) y por precio (orden no natural) de mayor a menor
							8. Mostrar los trasteros no ocupados
							9. Mostrar todos los trasteros
							""");
			opcion = Integer.parseInt(sc.next());

			switch (opcion) {
				default:
					System.out.println("Opcion inexistente, intentelo de nuevo");
				case 1:
					System.out.println("A continuación introduzca los datos de su trastero: ");
					num++;
					System.out.print("Capacidad (en metros cuadrados): ");
					capacidad = Double.parseDouble(sc.next());
					System.out.print("Dirección: ");
					direccion = sc.next();
					System.out.print("Precio: ");
					precio = Double.parseDouble(sc.next());
					System.out.println("Ocupado (1: Si/2: No):");
					ocupado = Boolean.parseBoolean(sc.next());
					o.agregarTrastero(new Trastero(capacidad, direccion, num, precio, ocupado));
					System.out.println("Trastero agregado con exito.");
					break;
				case 2:
					System.out.print("Diga el precio de su trastero: ");
					precio = Double.parseDouble(sc.next());
					System.out.println(o.buscarPorPrecio(precio));
					break;
				case 3:
					System.out.print("Diga el numero de su trastero: ");
					num = Integer.parseInt(sc.next());
					System.out.println(o.buscarPorNumero(num));
					break;
				case 4:
					System.out.println("El trastero mas caro es:");
					System.out.println(o.buscarMasCaro());
					break;
				case 5:
					System.out.print("Diga el numero del trastero que desea eliminar: ");
					num = Integer.parseInt(sc.next());
					System.out.println(o.eliminarTrastero(num));
					break;
				case 6:
					System.out.print("Diga el numero de su trastero: ");
					num = Integer.parseInt(sc.next());
					System.out.print("Diga el nuevo precio de su trastero: ");
					precio = Double.parseDouble(sc.next());
					o.modificarPrecio(precio, num);
					break;
				case 7:
					oficinaSort.addAll(o.getList());
					Collections.sort(oficinaSort);
					System.out.println(oficinaSort);
					Collections.sort(oficinaSort, new OrdenarPorPrecio());
					System.out.println(oficinaSort);
					break;
				case 8:
					o.mostrarOcupados();
					break;
				case 9:
					o.mostrarTrasteros();
					break;
			}

		} while (opcion != 0);

		sc.close();
	}

}
