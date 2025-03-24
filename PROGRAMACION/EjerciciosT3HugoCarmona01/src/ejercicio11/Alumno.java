package ejercicio11;

import java.util.Arrays;

import utilidades.Leer;

public class Alumno {

	private String nombre;
	private int curso;
	private int[] notas;
	private int numSuspensos;
	private double notaMedia;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	public int getNumeroSuspensos() {
		return numSuspensos;
	}

	public void setNumeroSuspensos(int numSuspensos) {
		this.numSuspensos = numSuspensos;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", curso=" + curso + ", notas=" + Arrays.toString(notas)
				+ ", numSuspensos=" + numSuspensos + ", notaMedia=" + notaMedia + "]";
	}

	public Alumno(String nombre, int curso, int[] notas, int numSuspensos, double notaMedia) {
		super();
		this.nombre = nombre;
		this.curso = curso;
		this.notas = notas;
		this.numSuspensos = numSuspensos;
		this.notaMedia = notaMedia;
	}

	public void rellenarNotas(int tam) {
		notas = new int [tam];
		for (int i = 0; i < notas.length; i++) {
			System.out.print("\nDime la nota de la asignatura " + (i + 1) + ": ");
			notas[i] = Leer.datoInt();
		}
	}
}