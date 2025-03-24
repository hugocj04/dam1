package ejemplo03polimorfismo;

public class OperacionesFiguras {

	public double calcularAreaFigura(Figura f) {
		return f.calcularArea();
	}

	public double sumaAreas(Figura[] lista) {
		double suma = 0;
		for (int i = 0; i < lista.length; i++) {
			// Este if recorre el array comprobado que el objeto que es un circulo para
			// llamar al metodo mostrarRadianes, teniendo que castear el objeto a Circulo ya
			// que este metodo no es heredado y es propio de la clase circulo
			if (lista[i] instanceof Circulo) {
				((Circulo) lista[i]).mostrarRadianes();
			}
			suma += calcularAreaFigura(lista[i]);
		}
		return suma;
	}

}
