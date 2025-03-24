package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam, opcion, id;
		String sabor, tipo;
		double volumenMasa, precioMasa = 0;
		Magdalena m1 = new Magdalena(1, "Fresa", "Cupcake", 10);
		Magdalena m2 = new Magdalena(2, "Chocolate", "Normal", 12);
		Magdalena m3;
		Magdalena[] lista;
		Magdalena[] productosSabor;
		Pasteleria p1;

		System.out.println("Bienvenido.");
		System.out.println("¿Cuantas magdalenas caben en tu pastelería?");
		tam = Leer.datoInt();
		
		lista = new Magdalena[tam];
		p1 = new Pasteleria(lista);
		p1.agregarMagdalena(m1);
		p1.agregarMagdalena(m2);
		
		do {
			System.out.println("\n¿Qué desea hacer?");
			System.out.println("1. Agregar magdalena");
			System.out.println("2. Buscar todas las magdalenas de un sabor");
			System.out.println("3. Buscar una magdalena");
			System.out.println("4. Calcular media de centimetros cubicos gastados en magdalenas");
			System.out.println("5. Calcular precio de coste de una magdalena");
			System.out.println("6. Mostrar lista de Cupcakes");
			System.out.println("7. Calcular porcentaje de presupuesto gastadas en una magdalena");
			System.out.println("8. Calcular gasto en hacer todas las magdalenas Normales");
			System.out.println("9. Salir");
			opcion = Leer.datoInt();

			switch (opcion) {
				case 1:
					System.out.println("\nDiga los datos de la magdalena:");
					System.out.print("ID: ");
					id = Leer.datoInt();
					System.out.print("Sabor: ");
					sabor = Leer.dato();
					System.out.print("Tipo: ");
					tipo = Leer.dato();
					System.out.print("Volumen de la masa (centimetros cubicos): ");
					volumenMasa = Leer.datoDouble();
					m3 = new Magdalena(id, sabor, tipo, volumenMasa);
					p1.agregarMagdalena(m3);
					System.out.println("\nMagdalena agregada con exito.");
					p1.mostrar();
					break;
				case 2:
					System.out.print("\nDiga el sabor de las magdalenas: ");
					sabor = Leer.dato();
					productosSabor = p1.mostrarPorSabor(sabor, tam);
					for (int i = 0; i < productosSabor.length && productosSabor[i] != null; i++) {
						System.out.println(productosSabor[i]);
					}
					break;
				case 3:
					System.out.print("\nDiga el ID de la magdalena: ");
					id = Leer.datoInt();
					System.out.println(p1.findByID(id));
					break;
				case 4:
					System.out.printf(
							"La media de centimetros cubicos de volumen que necesitamos para las magdalenas es de %.2f cm cubicos\n",
							p1.calcularMediaCentimetrosCubicos());
					break;
				case 5:
					System.out.println("Diga el ID de la magdalena: ");
					id = Leer.datoInt();
					System.out.println("¿Cuánto cuesta el centimetro cubico de masa?");
					precioMasa = Leer.datoDouble();
					System.out.printf("El precio de coste de esa magdalena es de %.2f€\n", p1.calcularPrecioCoste(precioMasa, p1.findByID(id)));
					break;
				case 6:
					p1.mostrarCupcakes();
					break;
				case 7:
					System.out.println("\nDiga el ID de la magdalena: ");
					id = Leer.datoInt();
					System.out.println("¿Cuánto cuesta el centimetro cubico de masa?");
					precioMasa = Leer.datoDouble();
					System.out.printf("Ha costado un %.0f%% del presupuesto.\n", p1.calcularPorcentajeTotal(p1.findByID(id), precioMasa));
					break;
				case 8:
					System.out.println("\n¿Cuánto cuesta el centimetro cubico de masa?");
					precioMasa = Leer.datoDouble();
					System.out.printf("Hacer todas las magdalenas normales cuesta %.2f€\n", p1.calcularCosteNormales(precioMasa));
					break;
				case 9:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opcion inexistente, intentelo de nuevo.");
					break;
			}
		} while (opcion != 9);
	}
}
