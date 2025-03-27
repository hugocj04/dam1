package ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Producto p1 = new Producto("Ordenador", 1250.99, "Electrónica");
		Producto p2 = new Producto("Ratón", 25, "Electrónica");
		Producto p3 = new Producto("Teclado", 45.75, "Electrónica");
		Producto p4 = new Producto("Camiseta", 19, "Ropa");
		Producto p5 = new Producto("Zapatillas", 79.99, "Ropa");
		Producto p6 = new Producto("Teléfono", 699.99, "Electrónica");
		Producto p7 = new Producto("Libro", 12, "Librería");
		Producto p8 = new Producto("Cascos", 12.99, "Electrónica");

		List<Producto> productos = new ArrayList<Producto>();
		List<Producto> productosCaros = new ArrayList<Producto>();

		int opcion;

		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		productos.add(p4);
		productos.add(p5);
		productos.add(p6);
		productos.add(p7);
		productos.add(p8);

		System.out.println("Bienvenido.");

		do {
			System.out.println("\nMenú de opciones:");
			System.out.println("1. Mostrar productos con precio mayor a 50€");
			System.out.println("2. Mostrar nombres de los productos");
			System.out.println("3. Mostrar longitud de los nombres de productos");
			System.out.println("4. Convertir precios a enteros");
			System.out.println("5. Mostrar precios de los productos");
			System.out.println("6. Mostrar letras únicas en las categorías");
			System.out.println("7. Mostrar valores ASCII de los nombres");
			System.out.println("8. Mostrar productos únicos");
			System.out.println("9. Ordenar productos por precio (ascendente)");
			System.out.println("10. Ordenar productos por precio (descendente)");
			System.out.println("11. Depuración con peek");
			System.out.println("12. Mostrar los 3 productos más baratos");
			System.out.println("13. Omitir los 2 productos más baratos");
			System.out.println("14. Mostrar productos hasta encontrar uno de más de 100€");
			System.out.println("15. Omitir productos baratos hasta encontrar uno de más de 100€");
			System.out.println("16. Mostrar lista de productos caros");
			System.out.println("0. Salir");
			System.out.print("Seleccione una opción: ");

			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				// Implementación para mostrar productos con precio mayor a 50€
				break;
			case 2:
				// Implementación para mostrar nombres de los productos
				break;
			case 3:
				// Implementación para mostrar longitud de los nombres de productos
				break;
			case 4:
				// Implementación para convertir precios a enteros
				break;
			case 5:
				// Implementación para mostrar precios de los productos
				break;
			case 6:
				// Implementación para mostrar letras únicas en las categorías
				break;
			case 7:
				// Implementación para mostrar valores ASCII de los nombres
				break;
			case 8:
				// Implementación para mostrar productos únicos
				break;
			case 9:
				// Implementación para ordenar productos por precio (ascendente)
				break;
			case 10:
				// Implementación para ordenar productos por precio (descendente)
				break;
			case 11:
				// Implementación para depuración con peek
				break;
			case 12:
				// Implementación para mostrar los 3 productos más baratos
				break;
			case 13:
				// Implementación para omitir los 2 productos más baratos
				break;
			case 14:
				// Implementación para mostrar productos hasta encontrar uno de más de 100€
				break;
			case 15:
				// Implementación para omitir productos baratos hasta encontrar uno de más de
				// 100€
				break;
			case 16:
				// Implementación para mostrar lista de productos caros
				break;
			case 0:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida. Intente de nuevo.");
			}
		} while (opcion != 0);

		sc.close();

	    // filter()
	    System.out.println("\nProductos con precio mayor a 50€:");
	    productos.stream().filter(p -> p.getPrecio() > 50).forEach(System.out::println);

	    // map()
	    System.out.println("\nNombres de los productos:");
	    productos.stream().map(Producto::getNombre).forEach(System.out::println);

	    // mapToInt()
	    System.out.println("\nLongitud de los nombres de productos:");
	    productos.stream().mapToInt(p -> p.getNombre().length()).forEach(System.out::println);

	    // mapToLong()
	    System.out.println("\nPrecios convertidos a enteros:");
	    productos.stream().mapToLong(p -> (long) p.getPrecio()).forEach(System.out::println);

	    // mapToDouble()
	    System.out.println("\nPrecios de los productos:");
	    productos.stream().mapToDouble(Producto::getPrecio).forEach(System.out::println);

	    // flatMap()
	    System.out.println("\nLetras únicas en las categorías:");
	    productos.stream()
	        .flatMap(p -> Arrays.stream(p.getCategoria().split("")))
	        .distinct()
	        .forEach(System.out::print);
	    System.out.println();

	    // flatMapToInt(), flatMapToLong() y flatMapToDouble()
	    System.out.println("\nValores ASCII de los nombres:");
	    productos.stream().flatMapToInt(p -> p.getNombre().chars()).forEach(c -> System.out.print(c + " "));
	    System.out.println();

	    // distinct()
	    System.out.println("\nProductos únicos por objeto:");
	    productos.stream().distinct().forEach(System.out::println);

	    // sorted() (Orden ascendente)
	    System.out.println("\nProductos ordenados por precio (ascendente):");
	    productos.stream().sorted(Comparator.comparing(Producto::getPrecio)).forEach(System.out::println);

	    // sorted() (Orden descendente)
	    System.out.println("\nProductos ordenados por precio (descendente):");
	    productos.stream().sorted((prod1, prod2) -> Double.compare(p2.getPrecio(), p1.getPrecio())).forEach(System.out::println);

	    // peek()
	    System.out.println("\nDepuración con peek:");
	    productos.stream()
	        .filter(p -> p.getPrecio() > 50)
	        .peek(p -> System.out.println("Filtrado: " + p))
	        .forEach(System.out::println);

	    // limit()
	    System.out.println("\nLos 3 productos más baratos:");
	    productos.stream()
	        .sorted(Comparator.comparingDouble(Producto::getPrecio))
	        .limit(3)
	        .forEach(System.out::println);

	    // skip()
	    System.out.println("\nProductos sin los 2 más baratos:");
	    productos.stream()
	        .sorted(Comparator.comparingDouble(Producto::getPrecio))
	        .skip(2)
	        .forEach(System.out::println);

	    // takeWhile()
	    System.out.println("\nProductos baratos hasta que aparezca uno de más de 100€:");
	    productos.stream()
	        .sorted(Comparator.comparingDouble(Producto::getPrecio))
	        .takeWhile(p -> p.getPrecio() < 100)
	        .forEach(System.out::println);

	    // dropWhile()
	    System.out.println("\nOmitiendo productos baratos hasta encontrar uno de más de 100€:");
	    productos.stream()
	        .sorted(Comparator.comparingDouble(Producto::getPrecio))
	        .dropWhile(p -> p.getPrecio() < 100)
	        .forEach(System.out::println);
	    
	    // collect()
	    System.out.println("\nLista de productos caros:");
	    productosCaros = productos.stream().filter(p -> p.getPrecio() > 50).collect(Collectors.toList());
	    productosCaros.forEach(System.out::println);

	}

}
