package ejercicio06;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double coche=5000;
		
		System.out.printf("El precio del coche que quiere comprar"
				+ " es de %.2f€ \n",coche);
		
		double descuento=20;
		double cien=100;		
		double nuevoPrecio;
		nuevoPrecio=coche-(coche*(descuento/cien));
		
		System.out.printf("Con el 20 por ciento aplicado al "
				+ "precio original, el coche pasaria a costar %.2f€ ",nuevoPrecio);
		
	}

}
