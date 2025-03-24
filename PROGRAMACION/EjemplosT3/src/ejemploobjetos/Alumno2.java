package ejemploobjetos;

import java.util.Random;

public class Alumno2 {

	private String nombre;
	private double[] notas; // De momento no instanciamos aqui el array, es decir, no ponemos el new
	
	public Alumno2(String nombre, double[] notas) {
		super();
		this.nombre = nombre;
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMediaLista() {
		double sumaNotas = 0;
		for (int i = 0; i < notas.length; i ++) {
			sumaNotas += notas[i];
		}
		return sumaNotas / notas.length;
	}
	
	public double devolverNotas(double [] notas) {
		double sumaNotas = 0;
		for (int i = 0; i < notas.length; i ++) {
			sumaNotas += notas[i];
		}
		return sumaNotas / notas.length;
	}
	
	// Este metodo no deberia ir aqui
	public double [] rellenarNotas (int tam, int desde, int hasta) {
		double [] notas = new double [tam];
		Random rnd = new Random();
		for (int i = 0; i < notas.length; i++) {
			notas[i] = rnd.nextDouble(hasta - desde + 1) + desde;
		}
		return notas;
	}

}
