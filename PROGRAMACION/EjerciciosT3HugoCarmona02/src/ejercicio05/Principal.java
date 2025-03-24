package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, tam = 10, id;
		double precio, peso;
		String color;
		char consumoEnergetico;
		Electrodomestico lavadora = new Electrodomestico(1, 23.45, "Rojo", 'B', 45);
		Electrodomestico secadora = new Electrodomestico(2, 87.99, "Verde", 'C', 35);
		Electrodomestico e3;
		Electrodomestico[] lista;
		lista = new Electrodomestico[tam];
		Tienda t1 = new Tienda (lista);
		
		t1.agregarElectrodomestico(lavadora);
		t1.agregarElectrodomestico(secadora);

		System.out.println("Bienvenido.");
		
		do {
			System.out.println("\n¿Qué desea hacer?");
			System.out.println("1. Calcular el precio de un electrodomestico");
			System.out.println("2. Calcular suma de todos los precios");
			System.out.println("3. Calcular media de precios");
			System.out.println("4. Agregar electrodomestico");
			System.out.println("5. Mostrar productos");
			System.out.println("6. Salir");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 1:
				System.out.print("Diga el ID del electrodomestico del cual quiere calcular el precio: ");
				id = Leer.datoInt();
				System.out.printf("El precio de ese producto es: %.2f€\n", t1.calcularPrecio(t1.findByID(id)));
				break;
			case 2:
				System.out.printf("La suma de los precios es: %.2f€\n", t1.calcularSumaPrecios());
				break;
			case 3:
				System.out.printf("La media de los precios es de %.2f€: \n", t1.calcularMediaPrecios());
				break;
			case 4:
				System.out.println("Rellene los datos del electrodomestico:");
				System.out.print("ID: ");
				id = Leer.datoInt();
				System.out.print("Precio: ");
				precio = Leer.datoDouble();
				System.out.print("Color: ");
				color = Leer.dato();
				System.out.print("Consumo energetico: ");
				consumoEnergetico = Leer.datoChar();
				System.out.print("Peso: ");
				peso = Leer.datoDouble();
				e3 = new Electrodomestico(id, precio, color, t1.comprobarConsumoEnergetico(consumoEnergetico), peso);
				t1.agregarElectrodomestico(e3);
				System.out.println("\nElectrodomestico añadido correctamente");
				break;
			case 5:
				t1.mostrarProductos();
				break;
			case 6:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opcion inexistente, intentelo de nuevo.");
				break;
			}
		} while (opcion != 6);
	}
}