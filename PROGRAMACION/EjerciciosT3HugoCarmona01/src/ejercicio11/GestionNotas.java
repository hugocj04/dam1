package ejercicio11;

public class GestionNotas {

	private Alumno a1;

	public Alumno getA1() {
		return a1;
	}

	public void setA1(Alumno a1) {
		this.a1 = a1;
	}

	@Override
	public String toString() {
		return "GestionNotas [a1=" + a1 + "]";
	}

	public GestionNotas(Alumno a1) {
		super();
		this.a1 = a1;
	}
	
	// Uso el getter de notas para acceder al array de notas
	public void mostrarNotas() {
	    int[] notas = a1.getNotas();
	    for (int i = 0; i < notas.length; i++) {
	        System.out.println("Asignatura " + (i + 1) + ": " + notas[i]);
	    }
	}

	public void modificarNota(int indice, int nuevaNota) {
		int [] notas = a1.getNotas();
		notas[indice - 1] = nuevaNota;
	}
	
	// Uso el setter de notaMedia para establecer el valor de este atributo en la clase alumno
	public double calcularMedia() {
		double media;
		double suma = 0;
		int [] notas = a1.getNotas();
		for (int i = 0; i < notas.length; i++) {
			suma += notas[i];
		}
		media = suma / notas.length;
		a1.setNotaMedia(media);
		return media;
	}
	
	public int contarSuspensos() {
		int [] notas = a1.getNotas();
		int suspensos = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < 5) {
				suspensos ++;
			}
		}
		a1.setNumeroSuspensos(suspensos);
		return suspensos;
	}
	
	
}