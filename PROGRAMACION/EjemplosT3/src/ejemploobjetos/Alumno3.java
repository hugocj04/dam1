package ejemploobjetos;

import java.util.Random;

public class Alumno3 {
	
	private int id;
	private String nombre;
	
	public Alumno3(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public double [] rellenarNotas (int tam, int desde, int hasta) {
		double [] notas = new double [tam];
		Random rnd = new Random();
		for (int i = 0; i < notas.length; i++) {
			notas[i] = rnd.nextDouble(hasta - desde + 1) + desde;
		}
		return notas;
	}
	

}
