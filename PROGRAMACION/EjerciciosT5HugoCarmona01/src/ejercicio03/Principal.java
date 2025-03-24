package ejercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Alumno a1 = new Alumno(1, "Hugo", "Carmona", 10, 20);
		Alumno a2 = new Alumno(2, "Pablo", "Perez", 5, 18);
		Alumno a3 = new Alumno(3, "Pedro", "Ibañez", 3, 19);
		Alumno a4 = new Alumno(4, "Luis", "Molina", 2, 22);
		Alumno a5 = new Alumno(5, "Miguel", "Rodriguez", 7, 20);
		
		List<Alumno> listAlum = new ArrayList<Alumno>();
		
		Clase c = new Clase(listAlum);
		CRUDClase cc = new CRUDClase(listAlum);
		
		String apellido;
		int opcion, edad; 
		
		c.getListAlum().add(a1);
		c.getListAlum().add(a2);
		c.getListAlum().add(a3);
		c.getListAlum().add(a4);
		c.getListAlum().add(a5);
		
		System.out.println("Bienvenido.");
		
		do {
			System.out.println("""
					\n¿Qué desea hacer?
					0. Salir
					1. Mostrar alumno
					2. Modificar edad de alumno
					3. Borrar alumno
					4. Sacar nota media del curso
					5. Ver total de suspensos
					6. Calcular media de suspensos
					""");
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				System.out.print("Diga el apellido del alumno que desea ver: ");
				apellido = sc.nextLine();
				System.out.println(c.getListAlum().get(c.findBySecondname(apellido)));
				break;
			case 2:
				System.out.print("Diga el apellido del alumno que desea modificar: ");
				apellido = sc.nextLine();
				System.out.print("Diga la nueva edad del alumno: ");
				edad = Integer.parseInt(sc.nextLine());
				System.out.println(c.modificar(edad, apellido));
				break;
			case 3:
				System.out.print("Diga el apellido del alumno que desea borrar: ");
				apellido = sc.nextLine();
				c.borrar(apellido);
				break;
			case 4:
				System.out.printf("La nota media del curso es de %.2f\n", cc.sacarNotaMedia());
				break;
			case 5:
				System.out.printf("El total de suspensos es de %d\n", cc.sacarTotalSuspensos());
				break;
			case 6:
				System.out.printf("La media de suspensos es de %.2f\n", cc.mediaSuspensos());
				break;
			default:
				System.out.println("Opcion inexistente, intentelo de nuevo.");
				break;
			}
		} while (opcion != 0);
		
		sc.close();
	}

}
