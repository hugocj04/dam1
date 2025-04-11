package ejemplo01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Si solo hay una linea no hacen falta llaves, si son mas, si hacen falta
		Operacion suma = (int a, int b) -> a + b;
		Operacion multi = (int a, int b) -> a * b;
		
		// Mismo metodo calcular, pero distinta funcionalidad por la lambda
		System.out.println(suma.calcular(2, 3));
		System.out.println(multi.calcular(2, 3));
		
	}

}
