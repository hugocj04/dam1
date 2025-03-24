package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, decimoComprado, desde = 0, hasta = 0, decimo = 0, decimoGenerado, decimoPremiado;
		Sorteo s1 = new Sorteo(0);
		
		
		System.out.println("Bienvenido al sorteo de la lotería de navidad.");
		
		do {
			System.out.println("\n¿Qué desea hacer?");
			System.out.println("1. Comprar un décimo");
			System.out.println("2. Comprar un décimo generado por la maquina");
			System.out.println("3. Hacer sorteo");
			System.out.println("4. Comprobar si mi décimo esta premiado");
			System.out.println("5. Mostrar si soy ganador");
			System.out.println("6. Salir");
			opcion = Leer.datoInt();
			
			switch (opcion) {
				case 1:
					System.out.print("Introduzca el número del decimo que desea comprar: ");
					decimoComprado = Leer.datoInt();
					while (decimoComprado > hasta) {
						System.out.print("Décimo inexistente, intentelo de nuevo: ");
						decimoComprado = Leer.datoInt();
					}
					System.out.println("\nCompra realizada con exito.");
					break;
				case 2:
					System.out.println("¿Cuál es el numero mas pequeño que puede ser premiado?");
					desde = Leer.datoInt();
					System.out.println("¿Cuál es el numero mas grande que puede ser premiado?");
					hasta = Leer.datoInt();
					decimoGenerado = s1.generarDecimo(desde, hasta);
					System.out.println("Su decimo es el " + decimoGenerado);
					break;
				case 3:
					decimoPremiado = s1.generarDecimo(desde, hasta);
					System.out.println("El numero premiado es el " + decimoPremiado);
					break;
				case 4:
					System.out.println("¿Cuál es tu decimo?");
					decimo = Leer.datoInt();
					System.out.println(s1.comprobarPremio(decimo));
					break;
				case 5:
					s1.mostrarPremio(s1.comprobarPremio(decimo));
					break;
				case 6:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opcion inexistente, intentelo de nuevo");
			}
		} while (opcion != 6);
	}
}