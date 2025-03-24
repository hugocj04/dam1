package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double notaMedia = 0;
		int curso, numSuspensos = 0, tam, opcion, indice, nuevaNota;
		int[] notas;
		String nombre;
		Alumno a1;
		GestionNotas g1;
		
		System.out.print("Dime el nombre del alumno: ");
		nombre = Leer.dato();
		
		System.out.print("Diga en que curso esta el alumno: ");
		curso = Leer.datoInt();
		
		System.out.print("Diga cuantas asignaturas tiene: ");
		tam = Leer.datoInt();
		notas = new int [tam];
		
		a1 = new Alumno(nombre, curso, notas, numSuspensos, notaMedia);
		a1.rellenarNotas(tam);
		
		g1 = new GestionNotas (a1);
		
		do {
			System.out.println("\n¿Qué desea hacer?");
			System.out.println("1. Mostrar notas");
			System.out.println("2. Modificar notas");
			System.out.println("3. Calcular media");
			System.out.println("4. Ver numero de suspensos");
			System.out.println("5. Salir");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 1:
				g1.mostrarNotas();
				break;
			case 2:
				System.out.print("\nIntroduzca el indice de la asignatura que quiere modificar la nota: ");
				indice = Leer.datoInt();
				while (indice - 1 <= 0 || indice - 1 >= notas.length) {
					System.out.print("Indice inexistente, intentelo de nuevo: ");
					indice = Leer.datoInt();
				}
				System.out.print("Introduzca la nueva nota: ");
				nuevaNota = Leer.datoInt();
				g1.modificarNota(indice, nuevaNota);
				System.out.println("\nNota actualizada con exito.");
				break;
			case 3:
				System.out.println("\nLa media es " + g1.calcularMedia());
				break;
			case 4:
				System.out.println("\nEl numero de suspensos es " + g1.contarSuspensos());
				break;
			case 5:
				System.out.println("Saliendo...");
			default:
				System.out.println("Opcion inexistente, intentelo de nuevo.");
				break;
			}
		} while (opcion != 5);
		
	}

}