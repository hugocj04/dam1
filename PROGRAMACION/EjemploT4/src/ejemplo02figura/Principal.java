package ejemplo02figura;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// No se pueden instanciar objetos de clases abstractas
		// Figura f = new Figura ("Rojo");
				
		Figura t = new Triangulo ("Rojo", 2, 4);
		
		System.out.println(t.calcularArea());
		t.imprimirDetalles();
		
		System.out.println(t instanceof Figura);
	}

}
