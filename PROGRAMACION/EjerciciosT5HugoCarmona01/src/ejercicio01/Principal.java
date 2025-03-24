package ejercicio01;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nota r = new Nota("Refranes", "A caballo regalado no le mires el diente");
		Nota c = new Nota("Compra", "- Huevos\n- Jamon\n- Patatas\n- Coca en litros");
		Nota x;
		
		List<Nota> notas = new ArrayList<Nota>();
		
		int opcion, eleccion;
		String nombre, contenido;
		
		notas.add(r);
		notas.add(c);
		
		System.out.println("Bienvenido");
		
		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("""
					1. Ver nota individual
					2. Ver cuantas notas hay guardadas
					3. Agregar una nota
					4. Borrar nota
					5. Salir
					""");
			opcion = Leer.datoInt();
			
			switch(opcion) {
			case 1:
				System.out.println("¿Qué nota quieres que muestre?");
				eleccion = Leer.datoInt();
				System.out.println(notas.get(eleccion - 1));
				System.out.println();
				break;
			case 2:
				System.out.println("Hay " + notas.size() + " notas guardadas\n");
				break;
			case 3:
				System.out.println("¿Cuál es el nombre de la nota?");
				nombre = Leer.dato();
				System.out.println("¿Cuál es el contenido de la nota?");
				contenido = Leer.dato();
				x = new Nota(nombre, contenido);
				break;
			case 4:
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción inexistente, intentelo de nuevo");
				break;
			}
		} while (opcion != 5);
		
	}

}
