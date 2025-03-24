package ejercicio03;

public class Operaciones {
	
	// Se puede hacer asi
	public String calcularPOI(int numero) {
		if (numero % 2 == 0) {
			return "par";
		} else {
			return "impar";
		}
	}
	
	// Pero es mejor hacerlo asi (un solo return)
	public boolean calcularPON(int numero) {
		boolean res;
		if (numero >= 0) {
			res = true;
		} else {
			res = false;
		}
		return res;
	}
	
	public void imprimirResultado(boolean res) {
		if (res = true) {
			System.out.println("El numero es positivo.");
		} else {
			System.out.println("El numero es negativo.");
		}
	}

}
