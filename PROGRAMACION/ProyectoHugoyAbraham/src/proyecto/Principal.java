package proyecto;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// Miercoles 30 -> Hugo: Registro e Inicio de sesión. Abraham: Menú de inicio
		// (do + switch) y case 1
		// Jueves 31 -> Hugo: case 3 y 4. Abraham: case 2 y 5
		// Lunes 4 -> Hugo: case 7. Abraham: case 6
		// Martes 5-> Ambos hemos comprobado el programa y hemos añadido los respectivos while (para evitar numeros negativos, mas ventas que copias, etc.), en cada caso.

		String nombreRegistro, contrasenyaRegistro, nombreIntroducir, contrasenyaIntroducir;
		String[][] librosInfo;
		double[][] librosDatos;
		double mayor, menor, media, suma, masVendido = 0, menosVendido = 0, porcentajeVentas, cien = 100, totalVentas,
				precioLibro, copiasVendidasLibro, ventasLibro, precio, copiasVendidas;
		int numLibros, opcion = 0, opcionCase6 = 0, libroMasCaro = 0, libroMasBarato = 0, libroMasVendido = 0,
				libroMenosVendido = 0, libroLeer, libroSeleccionado;

		System.out.println("Bienvenido a tu biblioteca personalizada.");

		// Registro de usuario
		System.out.println("Para poder usar el programa debe registrarse como administrador.\n");
		System.out.println(" --- Registro de usuario --- ");
		System.out.print("Introduzca el nombre de usuario que desea: ");
		nombreRegistro = Leer.dato();
		System.out.print("Introduzca la contraseña que desea: ");
		contrasenyaRegistro = Leer.dato();
		System.out.println("¡Su usuario se ha registrado con exito!\n");

		// Inicio de sesión
		System.out.println(" --- Inicio de sesión --- ");
		System.out.print("Introduzca su nombre de usuario: ");
		nombreIntroducir = Leer.dato();
		while (!nombreIntroducir.equals(nombreRegistro)) {
			System.out.println("Nombre de usuario inexistente,");
			System.out.print("Intentelo de nuevo: ");
			nombreIntroducir = Leer.dato();
		}
		System.out.print("Introduzca su contraeña: ");
		contrasenyaIntroducir = Leer.dato();
		while (!contrasenyaIntroducir.equals(contrasenyaRegistro)) {
			System.out.println("Contraseña incorrecta,");
			System.out.print("Intentelo de nuevo: ");
			contrasenyaIntroducir = Leer.dato();
		}
		System.out.println("¡Inicio de sesión realizado con éxito!\n");

		// Relleno de los arrays
		System.out.print("Introduce el número de libros: ");
		numLibros = Leer.datoInt();
		librosDatos = new double[numLibros][4];
		librosInfo = new String[numLibros][3];

		for (int i = 0; i < librosDatos.length; i++) {
			System.out.println("\nIntroduce los detalles del libro " + (i + 1) + ":");
			// Relleno de array String
			System.out.print("Título: ");
			librosInfo[i][0] = Leer.dato();
			System.out.print("Género: ");
			librosInfo[i][1] = Leer.dato();
			System.out.print("Editorial: ");
			librosInfo[i][2] = Leer.dato();
			// Relleno de array Double
			System.out.print("Precio: ");
			librosDatos[i][0] = Leer.datoDouble();
			while (librosDatos[i][0] < 0) {
				System.out.println("No puede introducir un número negativo, inténtelo de nuevo.");
				System.out.print("Precio: ");
				librosDatos[i][0] = Leer.datoDouble();
			}

			System.out.print("Copias: ");
			librosDatos[i][1] = Leer.datoDouble();
			System.out.print("Ventas: ");
			librosDatos[i][2] = Leer.datoDouble();
			while (librosDatos[i][2] > librosDatos[i][1]) {
				System.out.println("No puede haber mas ventas que copias, inténtelo de nuevo.");
				System.out.print("Ventas: ");
				librosDatos[i][2] = Leer.datoDouble();
			}
			System.out.print("Número de páginas: ");
			librosDatos[i][3] = Leer.datoDouble();
		}
		System.out.println("\nSe han registrado " + numLibros + " libros en su biblioteca");

		do {
			System.out.println("\n¿Qué desea hacer?");
			System.out.println("1. Mostrar inventario.");
			System.out.println("2. Promedio de precios.");
			System.out.println("3. Libro más caro y más barato.");
			System.out.println("4. Libro más y menos vendido.");
			System.out.println("5. Promedio de páginas.");
			System.out.println("6. Calcular ventas totales (Biblioteca/Libro Individual)");
			System.out.println("7. Calcular el porcentaje de ventas por libro.");
			System.out.println("8. Salir.");

			opcion = Leer.datoInt();

			switch (opcion) {
				case 1:
					System.out.println("Este es el inventario:\n");
					System.out.printf("ID\t\tTítulo\t\t\tGénero\t\t\tEditorial\t\tPrecio\t\tCopias\t\tVentas\t\tPáginas%n");
					System.out.println(
							"-----------------------------------------------------------------------------------------------------------------------------------------------");
	
					for (int i = 0; i < numLibros; i++) {
						System.out.printf("%d\t\t%s\t\t\t%s\t\t\t%s\t\t\t%.2f€\t\t%.0f\t\t%.0f\t\t%.0f%n", (i + 1),
								librosInfo[i][0], librosInfo[i][1], librosInfo[i][2], librosDatos[i][0], librosDatos[i][1],
								librosDatos[i][2], librosDatos[i][3]);
					}
					break;
				case 2:
					suma = 0;
					media = 0;
					for (int i = 0; i < numLibros; i++) {
						suma += librosDatos[i][0];
					}
					media = suma / numLibros;
					System.out.printf("\nEl promedio de precios de los libros es de %.2f€\n", media);
					break;
				case 3:
					mayor = librosDatos[0][0];
					menor = librosDatos[0][0];
					libroMasCaro = 0;
					libroMasBarato = 0;
					for (int i = 0; i < librosDatos.length; i++) {
						if (librosDatos[i][0] > mayor) {
							mayor = librosDatos[i][0];
							libroMasCaro = i;
						}
						if (librosDatos[i][0] < menor) {
							menor = librosDatos[i][0];
							libroMasBarato = i;
						}
					}
					System.out.printf("\nEl libro más caro es " + librosInfo[libroMasCaro][0] + " y cuesta: %.2f€\n",
							mayor);
					System.out.printf("\nEl libro más barato es " + librosInfo[libroMasBarato][0] + " y cuesta: %.2f€\n",
							menor);
					break;
				case 4:
					masVendido = librosDatos[0][2];
					menosVendido = librosDatos[0][2];
					libroMasVendido = 0;
					libroMenosVendido = 0;
					for (int i = 0; i < librosDatos.length; i++) {
						if (librosDatos[i][2] > masVendido) {
							masVendido = librosDatos[i][2];
							libroMasVendido = i;
						}
						if (librosDatos[i][2] < menosVendido) {
							menosVendido = librosDatos[i][2];
							libroMenosVendido = i;
						}
					}
					System.out.printf("\nEl libro más vendido es " + librosInfo[libroMasVendido][0]
							+ " y se ha vendido %.0f veces.\n", masVendido);
					System.out.printf("\nEl libro menos vendido es " + librosInfo[libroMenosVendido][0]
							+ " y se ha vendido %.0f veces.\n", menosVendido);
					break;
				case 5:
					suma = 0;
					media = 0;
					for (int i = 0; i < numLibros; i++) {
						suma += librosDatos[i][3];
					}
					media = suma / numLibros;
					System.out.printf("\nEl promedio de páginas de los libros es de %.0f páginas\n", media);
					break;
				case 6:
					do {
						System.out.println("\t1. Calcular ventas totales de toda la biblioteca ");
						System.out.println("\t2. Calcular ventas de un libro");
						System.out.println("\t3. Salir al menú principal");
						opcionCase6 = Leer.datoInt();
	
						switch (opcionCase6) {
							case 1:
								totalVentas = 0;
								for (int i = 0; i < numLibros; i++) {
									precio = librosDatos[i][0];
									copiasVendidas = librosDatos[i][2];
									totalVentas += precio * copiasVendidas;
								}
								System.out.printf("Las ventas totales de toda la biblioteca son de: %.2f €\n\n", totalVentas);
								break;
							case 2:
								System.out.println("ID\t\tTítulo");
								System.out.println("----------------------");
								for (int i = 0; i < numLibros; i++) {
									System.out.printf("%d\t\t%s\n", (i + 1), librosInfo[i][0]);
								}
								System.out.print("\nIntroduce el ID del libro: ");
								libroSeleccionado = Leer.datoInt();
								while (libroSeleccionado > numLibros || libroSeleccionado < 0) {
									System.out.println("El ID seleccionado es incorrecto, inténtelo de nuevo.");
									System.out.print("\nIntroduce el ID del libro: ");
									libroSeleccionado = Leer.datoInt();
								}
								precioLibro = librosDatos[libroSeleccionado - 1][0];
								copiasVendidasLibro = librosDatos[libroSeleccionado - 1][2];
								ventasLibro = precioLibro * copiasVendidasLibro;
								System.out.printf(
										"Total de ventas del libro " + librosInfo[libroSeleccionado - 1][0] + ": %.2f€\n\n",
										ventasLibro);
								break;
							case 3:
								break;
							default:
								System.out.println("Opción no válida. Intenteló de nuevo.");
								break;
						}
					} while (opcionCase6 != 3);
					break;
				case 7:
					System.out.println("\nID\t\tTítulo");
					System.out.println("----------------------");
					for (int i = 0; i < numLibros; i++) {
						System.out.printf("%d\t\t%s\n", (i + 1), librosInfo[i][0]);
					}
					System.out.print(
							"\nSeleccione el ID del libro del cual quiere calcular el porcentaje de ventas respecto a las copias: ");
					libroLeer = Leer.datoInt();
					while (libroLeer > numLibros || libroLeer < 0) {
						System.out.println("El ID seleccionado no existe, inténtelo de nuevo.");
						System.out.print(
								"\nSeleccione el ID del libro del cual quiere calcular el porcentaje de ventas respecto a las copias: ");
						libroLeer = Leer.datoInt();
					}
					porcentajeVentas = librosDatos[libroLeer - 1][2] * cien / librosDatos[libroLeer - 1][1];
					System.out.printf("El porcentaje de ventas de " + librosInfo[libroLeer - 1][0] + " es del %.0f%%\n",
							porcentajeVentas);
					break;
				case 8:
					break;
				default:
					System.out.println("Opción incorrecta, inténtelo de nuevo.");
					break;
			}
		} while (opcion != 8);
		System.out.println("¡Gracias por su visita!");
		System.out.println("Saliendo del menú de administrador...");
	}
}