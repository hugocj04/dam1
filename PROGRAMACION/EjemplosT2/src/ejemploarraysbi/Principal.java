package ejemploarraysbi;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int filas = 3, col = 4, filaLeida, colLeida, elemento;
		// Primer corchete = filas, segundo corchete = columnas;
		int[][] lista = new int[filas][col];

		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista[i].length; j++) {
				System.out.print("Diga numero: ");
				lista[i][j] = Leer.datoInt();
			}
		}

		// Mostrar el array completo
		for (int i = 0; i < lista.length; i++) {
			System.out.println();
			for (int j = 0; j < lista[i].length; j++) {
				System.out.print(lista[i][j] + "\t");
			}
		}
		
		// Cambiar un elemento dentro del array
		System.out.println("\n¿En que fila esta el elemento del array quieres cambiar?");
		filaLeida = Leer.datoInt();

		System.out.println("¿Y en que columna esta el elemento del array que quieres cambiar?");
		colLeida = Leer.datoInt();

		System.out.println("¿Por cual elemento lo quieres cambiar?");
		elemento = Leer.datoInt();

		lista[filaLeida - 1][colLeida - 1] = elemento;
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println();
			for (int j = 0; j < lista[i].length; j++) {
				System.out.print(lista[i][j] + "\t");
			}
		}
	}

}
