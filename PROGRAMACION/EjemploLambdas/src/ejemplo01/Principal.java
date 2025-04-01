package ejemplo01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Si solo hay una linea no hacen falta llaves, si son mas, si hacen falta
		Operacion suma = (int a, int b) -> a + b;
		
		System.out.println(suma.calcular(2, 3));
		
	}

}
