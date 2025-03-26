package ejercicioset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Orden no natural en una clase aparte y orden natural el compareTo de la clase pojo
		
		Scanner sc = new Scanner(System.in);

		Trastero t1 = new Trastero(20, "Calle Alfonso Lasso de la vega", 1, 134, true);
		Trastero t2 = new Trastero(15, "Calle Luis Uruñuela", 2, 120, true);
		Trastero t3 = new Trastero(32.5, "Calle Condes de baustillo", 3, 198.99, true);
		Trastero t4 = new Trastero(20, "Calle Alfonso Lasso de la vega", 4, 134, false);
		Trastero t5 = new Trastero(32.5, "Calle Condes de baustillo", 5, 198.99, true);

		Set<Trastero> list = new HashSet<Trastero>();
		
		Oficina o = new Oficina(list);
		
		o.addTrastero(t1);
		o.addTrastero(t2);
		o.addTrastero(t3);
		o.addTrastero(t4);
		
		int opcion, num = 4;
		double capacidad, precio, nuevoPrecio;
		boolean ocupado;
		String direccion;
		
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
				case 0:
					System.out.println("Saliendo...");
					break;
				case 1:
					System.out.println("A continuación, introduzca los datos de su trastero:");
					System.out.print("Capacidad (metros cuadrados): ");
					capacidad = Double.parseDouble(sc.next());
					System.out.print("Dirección: ");
					direccion = sc.next();
					System.out.print("Precio: ");
					precio = Double.parseDouble(sc.next());
					System.out.print("Ocupado (true/false): ");
					ocupado = Boolean.parseBoolean(sc.next());
					o.addTrastero(new Trastero(capacidad, direccion, num, precio, ocupado));
					break;
				case 2:
					System.out.print("Diga el precio del trastero: ");
					precio = Double.parseDouble(sc.next());
					System.out.println(o.buscarPorPrecioV2(precio));
					break;
				case 3:
					System.out.print("Diga el numero del trastero: ");
					num = Integer.parseInt(sc.next());
					System.out.println(o.buscarPorNumero(num));
					break;
				case 4:
					System.out.println("Estos son los trasteros mas caros: ");
					System.out.println(o.buscarMasCaros());
					break;
				case 5:
					System.out.print("Diga el numero del trastero que desea eliminar: ");
					num = Integer.parseInt(sc.next());
					System.out.println(o.deleteTrastero(o.buscarPorNumero(num)));
					break;
				case 6:
					System.out.print("Diga el numero del trastero: ");
					num = Integer.parseInt(sc.next());
					System.out.print("Diga el nuevo precio: ");
					nuevoPrecio = Double.parseDouble(sc.next());
					System.out.println(o.modificarPrecio(o.buscarPorNumero(num), nuevoPrecio));
					break;
				case 7:
					System.out.println("Ordenados por precio de mayor a menor: ");
					System.out.println(o.ordenarPorPrecio());
					System.out.println("\nOrdenados por numero de mayor a menor: ");
					System.out.println(o.ordenarPorNumero());
					break;
				case 8:
					break;
				case 9:
					break;
			}

		} while (opcion != 0);


		sc.close();
	}

}
