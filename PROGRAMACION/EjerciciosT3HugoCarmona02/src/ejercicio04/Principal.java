package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0, tam = 10, numClientes = 0, dni;
		String nombre, apellidos;
		boolean activo = true;
		double altura, peso;
		Cliente c1 = new Cliente(29554858, "Hugo", "Carmona Jiménez", true, 65.6, 1.68);
		Cliente c2 = new Cliente(34556576, "Pablo", "García Martinez", true, 72.5, 1.72);
		Cliente c3;
		Cliente[] clientes = new Cliente[tam];
		Gimnasio g1 = new Gimnasio(clientes);

		g1.agregarClientes(c1, numClientes);
		numClientes++;
		g1.agregarClientes(c2, numClientes);
		numClientes++;

		System.out.println("Bienvenido.");

		do {
			System.out.println("\n¿Qué desea hacer?");
			System.out.println("1. Mostrar lista");
			System.out.println("2. Calcular IMC de un cliente elegido");
			System.out.println("3. Agregar un cliente a la lista");
			System.out.println("4. Dar de baja");
			System.out.println("5. Calcular media de IMC de todos los clientes");
			System.out.println("6. Mostrar datos de un cliente (buscar por DNI)");
			System.out.println("7. Salir");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				System.out.println("\n--- Lista ---");
				g1.mostrarLista();
				break;
			case 2:
				System.out.print("Diga el DNI del cliente al que le quiere calcular el IMC: ");
				dni = Leer.datoInt();
				System.out.printf("\nSu IMC es: %.2f \n", g1.calcularImc(g1.findByDni(dni)));
				break;
			case 3:
				System.out.println("A continuacion, diga los datos del cliente: ");
				System.out.print("DNI: ");
				dni = Leer.datoInt();
				System.out.print("Nombre: ");
				nombre = Leer.dato();
				System.out.print("Apellidos: ");
				apellidos = Leer.dato();
				System.out.print("Peso: ");
				peso = Leer.datoDouble();
				System.out.print("Altura: ");
				altura = Leer.datoDouble();
				c3 = new Cliente(dni, nombre, apellidos, activo, peso, altura);
				g1.agregarClientes(c3, numClientes);
				break;
			case 4:
				System.out.print("Diga el DNI del cliente al que quiere dar de baja: ");
				dni = Leer.datoInt();
				g1.darDeBaja(g1.findByDni(dni), numClientes);
				System.out.println("\nCliente dado de baja con exito.");
				break;
			case 5:
				System.out.printf("La media de los IMC de los clientes es de %.2f\n", g1.calcularMediaImc());
				break;
			case 6:
				System.out.println("Diga el DNI del cliente: ");
				dni = Leer.datoInt();
				System.out.println(g1.findByDni(dni));
				break;
			case 7:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opcion inexistente, intentelo de nuevo.");
				break;
			}
		} while (opcion != 7);

	}

}