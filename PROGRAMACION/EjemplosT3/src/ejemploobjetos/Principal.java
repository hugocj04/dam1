package ejemploobjetos;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int desde = 1, hasta = 10;
		Random rnd = new Random(System.nanoTime());
				
		double res = 0, res2;
		Alumno a = new Alumno("Hugo", "Carmona Jimenez", 8, 5);
		Secretaria s;
		Secretaria2 s2;
		Alumno2 a2;
		Alumno3 a3 = new Alumno3(1,"Hugo");
		double notas[];
		int tam = 4;
		
		notas = a3.rellenarNotas(tam, desde, hasta);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
//		a.calcularMedia();
//		
//		// Guardando una variable
//		res = a.calcularMedia();
//		System.out.printf("La media es: %.2f", res);
//		
//		// Imprimiendo directamente
//		System.out.printf("\nLa media es: %.2f", a.calcularMedia());
//		
//		// Usando otra clase, instanciamos un objeto tipo secretaria
//		s = new Secretaria("San Pedro", a);
//		
//		// Usando Secretaria2
//		s2 = new Secretaria2 ("\nSan Pietro");
//		
//		res2 = s2.calcularMediav5(a);
//		System.out.printf("\nLa media es: %.2f", res2);
//		
//		// Rellenamos el array
//		for (int i = 0; i < notas.length; i++) {
//			System.out.println("\nDime la nota " + (i + 1));
//			notas[i] = Leer.datoDouble();
//		}
//		// Probamos la clase Alumno2, con array de notas
//		a2 = new Alumno2("Angel", notas);
//		System.out.println("\n" + a2.calcularMediaLista());
//		
//		// Pedimos el tamaño
//		System.out.println("Dime el tamaño: ");
//		tam = Leer.datoInt();
//		
//		// Rellenamos aleatorio, deberia ir en metodo?
//		
////		for (int i = 0; i < notas.length; i++) {
////			notas[i] = rnd.nextDouble(hasta - desde + 1) + desde;
////		}
//		

	}

}