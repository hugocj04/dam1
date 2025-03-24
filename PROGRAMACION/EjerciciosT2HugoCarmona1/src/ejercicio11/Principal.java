package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sala, entradas;
		double precioEntradas;
		double nada = 0, precioSala1 = 10.9, precioSala2 = 7.9, precioSala3 = 5.8, precioSala4 = 12.9;
		String pelicula1="El Joker";
		String pelicula2="Bettlejuice";
		String pelicula3="Transformers One";
		String pelicula4="El hombre del saco";


		//Mejor poner el nombre de las peliculas en nombre de variables para que puedan cambiar

		do {
			System.out.printf(
					"Bienvenido a nuestros cines, nuestro catalogo es el siguiente:\n"
							+ "- 0 Salir\n"
							+ "- Sala 1 (%s): Sala 3D ---> %.2f€\n"
							+ "- Sala 2 (%s): Sala normal ---> %.2f€\n"
							+ "- Sala 3 (%s): Sala para niños ---> %.2f€\n"
							+ "- Sala 4 (%s): Sala VIP ---> %.2f€\n",
							pelicula1, precioSala1, pelicula2, precioSala2, pelicula3, precioSala3, pelicula4, precioSala4);
			System.out.println("¿A que sala irá?");
			sala = Leer.datoInt();
			switch (sala) {
				case 0:
					System.out.println("Saliendo...");
					break;
				case 1:
					System.out.println("Genial, ¿cuántas entradas querrá?");
					entradas = Leer.datoInt();
					precioEntradas = entradas * precioSala1;
					System.out.printf("El precio en total serán %.2f€\n", precioEntradas);
					break;
				case 2:
					System.out.println("Genial, ¿cuántas entradas querrá?");
					entradas = Leer.datoInt();
					precioEntradas = entradas * precioSala2;
					System.out.printf("El precio en total serán %.2f€\n", precioEntradas);
					break;
				case 3:
					System.out.println("Genial, ¿cuántas entradas querrá?");
					entradas = Leer.datoInt();
					precioEntradas = entradas * precioSala3;
					System.out.printf("El precio en total serán %.2f€\n", precioEntradas);
					break;
				case 4:
					System.out.println("Genial, ¿cuántas entradas querrá?");
					entradas = Leer.datoInt();
					precioEntradas = entradas * precioSala4;
					System.out.printf("El precio en total serán %.2f€\n", precioEntradas);
					break;
				default:
					System.out.println("Opción incorrecta");
				}
			} while (sala != nada);
		}
}
