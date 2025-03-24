package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado e = new Empleado("Manolo", "Perez", 1000, 34);
		Vendedor v = new Vendedor("Hugo", "Carmona", 1200, 1, 3, 15);
		Gerente g = new Gerente("Pablo", "Hernandez", 1120, 2, 20);
		Empleado[] lista = { e, v, g };
		Oficina o = new Oficina(lista, 200000);

		int opcion, opcionEmpleado;

		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("""
					1. Calcular sueldo de un empleado
					2. Ver sueldo de empleado generico
					3. Ver cuanto se ha gastado en los sueldos de los empleados
					4. Salir
					""");
			opcion = Leer.datoInt();

			switch (opcion) {
				case 1:
					System.out.println("¿De que tipo de empleado quieres calcular el sueldo?");
					System.out.println("""
							1. Empleado normal
							2. Vendedor
							3. Gerente
							""");
					opcionEmpleado = Leer.datoInt();
					System.out.printf("El sueldo es de %.2f€\n\n",
							o.calcularSueldoTipoEmpleado(o.elegirEmpleado(opcionEmpleado)));
					break;
				case 2:
					System.out.printf("El sueldo de un empleado generico es de %.2f€\n\n", e.calcularSueldo());
					break;
				case 3:
					System.out.printf("Se han gastado %.2f€ en los sueldos de los empleados\n\n", o.gastoEnEmpleados());
					break;
				case 4:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opcion inexistente, intentelo de nuevo.");
					break;
			}
		} while (opcion != 4);

	}

}
