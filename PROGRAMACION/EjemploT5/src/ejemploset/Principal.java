package ejemploset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Alumno> listado = new HashSet<Alumno>();
		
		listado.add(new Alumno("Hugo", "29554858L", 10));
		listado.add(new Alumno("Dani", "29554858D", 7));
		Secretaria s = new Secretaria(listado);
		
		// System.out.println(listado);
		s.imprimirLista();
		
//		Secretaria s = new Secretaria(listaAlumnos);
//		
//		int opcion;
//		String nombre, dni;
//		double notaMedia, notaMod;
//		
////		listaEnteros.add(2);
////		listaNombres.add("Luis");
////		listaNombres.add("Hugo");
////		listaNombres.add("Luis");
////		
////		System.out.println(listaNombres);
//		
//		System.out.println("Bienvenido");
//		
//		do {
//			System.out.println("¿Qué desea hacer?");
//			System.out.print("""
//					1. Añadir alumno
//					2. Mostrar alumnos
//					3. Buscar alumno por su DNI
//					4. Modificar la nota de un Alumno
//					5. Borrar Alumno
//					6. Ver nota media de las notas medias
//					""");
//			opcion = Leer.datoInt();
//			
//			switch(opcion) {
//			case 1:
//				System.out.println("Diga los datos del alumno:");
//				System.out.print("Nombre: ");
//				nombre = Leer.dato();
//				
//				System.out.print("DNI: ");
//				dni = Leer.dato();
//				
//				System.out.print("Nota media: ");
//				notaMedia = Leer.datoDouble();
//				System.out.println();
//				
//				System.out.print(s.añadirAlumno(new Alumno(nombre, dni, notaMedia)));
//				System.out.println("\nAlumno añadido exitosamente.\n");
//				break;
//			case 2:				
//				s.imprimirLista();
//				System.out.println();
//				break;
//			case 3:				
//				System.out.println("Indique el DNI del alumno que quiere buscar: ");
//				dni = Leer.dato();
//				if (s.findByDni2(dni) < 0) {
//					System.out.println("Alumno inexistente.");
//				} else {
//					System.out.println(s.getListAlumnos().get(s.findByDni2(dni)));
//				}
//				System.out.println();
//				break;
//			case 4:				
//				System.out.println("Indique el DNI del alumno que quiere modificar: ");
//				dni = Leer.dato();
//				if (s.findByDni2(dni) < 0) {
//					System.out.println("Alumno inexistente.");
//				} else {
//					System.out.println("Diga la nota media nueva que le quiere poner:");
//					notaMod = Leer.datoDouble();
//					s.modificarMedia2(dni, notaMod);
//					System.out.println("Nota modificada con exito.");
//				}
//				System.out.println();
//				break;
//			case 5:				
//				System.out.println("Indique el DNI del alumno que quiere borrar: ");
//				dni = Leer.dato();
//				if (s.findByDni2(dni) < 0) {
//					System.out.println("Alumno inexistente.");
//				} else {
//					s.borrarAlumno(dni);
//					System.out.println("Alumno borrado con exito con exito.");
//				}
//				System.out.println();
//				break;
//			case 6:				
//				System.out.printf("La nota media es de %.2f", s.calcularTotalMedias());
//				System.out.println();
//				break;
//			default:
//				System.out.println("Opcion inexistente, intentalo de nuevo.");
//				break;
//			}
//		} while(opcion != 5);

	}

}
