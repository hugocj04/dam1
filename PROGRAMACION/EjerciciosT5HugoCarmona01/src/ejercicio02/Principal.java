package ejercicio02;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socio s = new Socio(1, "Hugo", 601498346, "29554858L", 20);
		Socio ns;
		
		List<Socio> listado = new ArrayList<Socio>();
		listado.add(s);
		Club c = new Club(listado);
		
		int opcion, tlf, edad, id = 1;
		String nombre, nombreUsuario, dni;
		
		System.out.println("Bienvenido.");
		
		do {
			System.out.println("""
					\n¿Qué desea hacer?
					0. Salir
					1. Guardar socio
					2. Buscar socio
					3. Mostrar datos de socio
					4. Modificar edad
					5. Eliminar socio
					""");
			opcion = Leer.datoInt();
			
			switch(opcion) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				System.out.println("A continuación, diga los datos del socio:");
				System.out.print("Id: ");
				id = Leer.datoInt();
				System.out.print("Nombre: ");
				nombre = Leer.dato();
				System.out.print("Telefono: ");
				tlf = Leer.datoInt();
				System.out.print("DNI: ");
				dni = Leer.dato();
				System.out.print("Edad: ");
				edad = Leer.datoInt();
				ns = new Socio(id, nombre, tlf, dni, edad);
				c.agregarSocio(ns);;
				System.out.println("\nSocio agregado con exito.");
				break;
			case 2:
				System.out.print("Diga el ID del socio que desea buscar: ");
				id = Leer.datoInt();
				System.out.println(c.getListado().get(c.findById(id)));
				break;
			case 3:
				System.out.print("Diga el ID del socio que desea buscar: ");
				id = Leer.datoInt();
				System.out.println(c.getListado().get(c.findById(id)));
				break;
			case 4:
				System.out.print("Diga el ID del usuario que desea modificar: ");
				id = Leer.datoInt();
				System.out.print("Diga la nueva edad del usuario: ");
				edad = Leer.datoInt();
				System.out.println(c.modificarEdad(id, edad));
				break;
			case 5:
				break;
			default:
				System.out.println("Opción inexistente, intentelo de nuevo.");
				break;
			}
		} while (opcion != 0);
	}

}
