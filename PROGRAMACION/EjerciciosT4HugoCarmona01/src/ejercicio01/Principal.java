package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ganancia;

		Ordenador o = new Ordenador(500, 25, 340, "hp");
		Sobremesa s = new Sobremesa(500, 25, 340, "hp", 46.9);
		Portatil p = new Portatil(500, 25, 340, "hp", true, 23.99);

		System.out.println("¿Cuánto porcentaje de ganacia te quieres llevar?");
		ganancia = Leer.datoDouble();
		
		System.out.printf("El PVP de un ordenador normal es de: %.2f€\n", o.calcularPVP(ganancia));
		System.out.printf("El PVP de un ordenador de sobremesa es de: %.2f€\n", s.calcularPVP(ganancia));
		System.out.printf("El PVP de un portatil es de: %.2f€\n", p.calcularPVP(ganancia));
		
	}

}
