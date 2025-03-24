package ejercicio05;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Hola, bienvenido al conversor de monedas");
		
		double euro=50;
		double libra;
		libra=euro*0.83;
		
		System.out.printf("%.2f € son %.2f libras \n",euro,libra);
		
		double unaLibra=1;
		double libEur;
		libEur=unaLibra/1.20;
		
		System.out.printf("%.2f libra son %.2f €",unaLibra,libEur);
		
		
	}

}
