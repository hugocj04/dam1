package ejemploarraysdeobjetos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo[] lista;
		int tam, nVs = 0, seguir;
		String modelo;
		double potencia;

		System.out.print("Diga el número de vehiculos total: ");
		tam = Leer.datoInt();
		lista = new Vehiculo[tam];

		do {
			System.out.print("\nDime el modelo del vehiculo " + (nVs + 1) + ": ");
			modelo = Leer.dato();

			System.out.print("Dime la potencia del vehiculo: " + (nVs + 1) + ": ");
			potencia = Leer.datoDouble();

			lista[nVs] = new Vehiculo(modelo, potencia);
			
			System.out.println("\n" + lista[nVs]);
			
			nVs++; // Aumentamos en 1 el numero de vehiculos
						
			System.out.println("\nSi desea terminar, pulsa 0, sino, pulsa cualquier numero");
			seguir = Leer.datoInt();
			
			// Para ver un atributo
			System.out.println(lista[0].getModelo());
			
		} while (seguir != 0 && nVs < lista.length);
		
		for (int i = 0; i < nVs; i++) {
			System.out.println(lista[i]);
		}

//		System.out.print("Dime el modelo del vehiculo: ");
//		modelo = Leer.dato();
//
//		System.out.print("Dime la potencia del vehiculo: ");
//		potencia = Leer.datoDouble();
//
//		// Varias posibilidades
//
//		// Guarda en el primer espacio de la lista un objeto vehiculo
//		
//		lista[0] = new Vehiculo(modelo, potencia);
//		
//		System.out.println(lista[0]);

	}

}
