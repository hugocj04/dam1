package ejemplo03polimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// No podemos instanciar objetos de clases abstractas
		// Figura f = new Figura();
		// Solo casteamos cuando tenemos que llamar a un metodo que no esta rescrito
		
		Cuadrado c = new Cuadrado("Cuadrado 1", "negro", 2);
		
		// Al ser figuras, podemos llamar a los metodos heredados, pero no podemos usar los metodos que son solo de circulo o cuadrado
		Figura f2 = new Cuadrado("Cuadrado 2", "blanco", 4);
		Figura f3 = new Circulo("Circulo 1", "rojo", 4);
		
		Figura [] lista = {f2, f2, f3};
		
		/* System.out.println(f2.calcularArea());
		System.out.println(c.calcularArea());
		f2.metodoSoloDeFigura();
		c.mostrarLados();
		
		System.out.println(f2.calcularPerimetro());*/ 
		
		OperacionesFiguras op = new OperacionesFiguras();
		
		System.out.println(op.calcularAreaFigura(f3));
		System.out.println("La suma es: " + op.sumaAreas(lista));
		
		
		if (f3 instanceof Circulo) {
			// Se castea como circulo para poder llamar a los metodos no rescritos dentro de este
			((Circulo) f3).mostrarRadianes();
		}
	}

}
