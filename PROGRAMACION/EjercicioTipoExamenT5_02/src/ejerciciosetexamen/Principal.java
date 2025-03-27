package ejerciciosetexamen;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Trastero t1 = new Trastero(20, "Calle Condes de baustillo", 1, 340, true);
		Trastero t2 = new Trastero(15, "Calle Condes de baustillo", 2, 150, true);
		Trastero t3 = new Trastero(17, "Calle Condes de baustillo", 3, 150, true);
		Trastero t4 = new Trastero(34, "Calle Condes de baustillo", 4, 340, false);
	
		Set<Trastero> list = new HashSet<Trastero>();
		
		Oficina o = new Oficina(list);
		
		int opcion, num;
		double precio, capacidad, nuevaCapacidad;
		String direccion;
		boolean ocupado;
		
		o.getList().add(t1);
		o.getList().add(t2);
		o.getList().add(t3);
		o.getList().add(t4);
		
		System.out.println("Bienvenido.");
		
		do {
			System.out.println("""
					\n¿Qué desea hacer?
					0. Salir
					1. Añadir trastero
					2. 
					3. 
					4. 
					5. 
					6. 
					7. 
					8. 
					9. 
					""");
			opcion = Integer.parseInt(sc.next());
			
			switch (opcion) {
			case 1: 
				
				break;
			case 2:
				System.out.print("Diga el precio del producto que busca: ");
				precio = Double.parseDouble(sc.next());
				System.out.println(o.buscarPorPrecio(precio));
				break;
			case 3:
				System.out.print("Diga el numero del producto que desea buscar: ");
				num = Integer.parseInt(sc.next());
				System.out.println(o.buscarNumero(num));
				break;
			case 4:
				System.out.println(o.buscarMasCaro());
				break;
			case 5:
				System.out.print("Diga el numero del trastero que desea eliminar: ");
				num = Integer.parseInt(sc.next());
				System.out.println(o.deleteTrastero(num));
				break;
			case 6:
				System.out.print("Diga el numero del trastero del cual desea modificar la capacidad: ");
				num = Integer.parseInt(sc.next());
				System.out.print("Diga la nueva capacidad: ");
				nuevaCapacidad = Double.parseDouble(sc.next());
				System.out.println(o.modificarCapacidad(num, nuevaCapacidad));
				break;
			case 7:
				System.out.println("Ordenador por numero de mayor a menor: ");
				System.out.println(o.ordenarPorNumero());
				System.out.println("Ordenador por precio de mayor a menor: ");
				System.out.println(o.ordenarPorPrecio());
				break;

			case 9:
				o.mostrarTodos();
				break;
			default:
				System.out.println("Opcion inexistente, intentelo de nuevo.");
				break;
			}
			
		} while (opcion != 0);
		
		sc.close();
	}

}
