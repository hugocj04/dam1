package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Mensaje m1 = new Mensaje(1, "Hugo", "Buenos dias");
		Mensaje m2 = new Mensaje(2, "Hugo", "Buenas noches");
		Mensaje m3 = new Mensaje(3, "Ana", "Hasta luego");
		Mensaje m4 = new Mensaje(4, "Pedro", "Eres un genio");
		Mensaje m5 = new Mensaje(5, "Pedro", "Es lunes");
		Mensaje m6 = new Mensaje(6, "Miguel", "¡Enhorabuena!");
		
		List<Mensaje> list = new ArrayList<Mensaje>();
		
		Whatsapp w = new Whatsapp(list);
		
		w.addMensaje(m1);
		w.addMensaje(m4);
		w.addMensaje(m5);
		w.addMensaje(m2);
		w.addMensaje(m6);
		w.addMensaje(m3);
		
		double cantidad;
		int opcion, id, tope;
		String nombre, mensaje;

		System.out.println("Bienvenido.");

		do {
			System.out.print("""
					\n0. Salir
					1. Agregar un nuevo mensaje
					2. Borrar un mensaje 
					3. Modificar un mensaje 
					4. Imprimir toda la lista
					5. Buscar por el cuerpo de un mensaje
					6. Buscar por ID
					7. Calcular recaudado por mensaje
					8. Imprimir mensaje de aviso de memoria
					9. Ordenar la lista por orden alfabetico (nombre)
					10. Ordenar por ID
					¿Qué desea hacer? --> \t""");
			opcion = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			switch (opcion) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				System.out.println("A continuación diga los datos del mensaje:");
				System.out.print("ID (no puede ser uno que ya este usado): ");
				id = Integer.parseInt(sc.nextLine());
				System.out.print("Nombre: ");
				nombre = sc.nextLine();
				System.out.print("Texto del mensaje: ");
				mensaje = sc.nextLine();
				w.addMensaje(new Mensaje(id, nombre, mensaje));
				System.out.println("Usuario añadido con exito.");
				break;
			case 2:
				System.out.print("Diga el ID del mensaje que desea eliminar: ");
				id = Integer.parseInt(sc.nextLine());
				System.out.println(w.deleteMensaje(id));
				break;
			case 3:
				System.out.print("Diga el ID del mensaje que quiere modificar: ");
				id = Integer.parseInt(sc.nextLine());
				System.out.println(w.modificarMensaje(id));
				break;
			case 4:
				w.imprimirLista();
				break;
			case 5:
				System.out.print("Diga el cuerpo del mensaje por el que quiere buscar: ");
				mensaje = sc.nextLine();
				System.out.println(w.buscarPorMensaje(mensaje));
				break;
			case 6:
				System.out.println("Diga el ID del mensaje que desea buscar: ");
				id = Integer.parseInt(sc.nextLine());
				System.out.println(w.buscarPorId(id));
				break;
			case 7:
				System.out.print("Diga el nombre del mensaje: ");
				nombre = sc.nextLine();
				System.out.print("Diga la cantidad a pagar por cada mensaje: ");
				cantidad = Double.parseDouble(sc.nextLine());
				System.out.printf("%s tendria que pagar %.2f€ por su/s mensaje/s \n", nombre, w.sumarPorNombre(nombre, cantidad));
				break;
			case 8:
				System.out.println("Diga cual es el tope de mensajes que permite la memoria: ");
				tope = Integer.parseInt(sc.nextLine());
				w.imprimirMensajeTope(tope);
				break;
			case 9:
				System.out.println(w.ordenarPorNombre());
				break;
			case 10:
				System.out.println(w.ordenarPorId());
				break;
			default:
				System.out.println("Opción inexistente, intentelo de nuevo.");
				break;
			}
		} while (opcion != 0);
		
		sc.close();
	}

}
