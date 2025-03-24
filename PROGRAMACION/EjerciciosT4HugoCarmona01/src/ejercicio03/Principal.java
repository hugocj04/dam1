package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int categoria;
		double ceroEmisiones = 0, eco = 10, tipoB = 20, tipoC = 40, impuesto;
		
		Vehiculo m = new Motocicleta ("ECO", 200, 49);
		Vehiculo c = new Coche ("ECO", 200, 120);
		Vehiculo f = new Furgoneta ("ECO", 200, 145);
		
		System.out.println("¿Cuál es la categoria de emisiones contaminantes?");
		System.out.println(""" 
				- 1. Cero emisiones
				- 2. ECO
				- 3. Tipo B
				- 4. Tipo C
				""");
		categoria = Leer.datoInt();
		
		switch (categoria) {
			case 1:
				impuesto = ceroEmisiones;
				System.out.printf("Impuesto Moto: %.2f€\n", m.calcularImpuesto(impuesto));
				System.out.printf("Impuesto Coche: %.2f€\n", c.calcularImpuesto(impuesto));
				System.out.printf("Impuesto Furgoneta: %.2f€\n", f.calcularImpuesto(impuesto));
				break;
			case 2:
				impuesto = eco;
				System.out.printf("Impuesto Moto: %.2f€\n", m.calcularImpuesto(impuesto));
				System.out.printf("Impuesto Coche: %.2f€\n", c.calcularImpuesto(impuesto));
				System.out.printf("Impuesto Furgoneta: %.2f€\n", f.calcularImpuesto(impuesto));
				break;
			case 3:
				impuesto = tipoB;
				System.out.printf("Impuesto Moto: %.2f€\n", m.calcularImpuesto(impuesto));
				System.out.printf("Impuesto Coche: %.2f€\n", c.calcularImpuesto(impuesto));
				System.out.printf("Impuesto Furgoneta: %.2f€\n", f.calcularImpuesto(impuesto));
				break;
			case 4:
				impuesto = tipoC;
				System.out.printf("Impuesto Moto: %.2f€\n", m.calcularImpuesto(impuesto));
				System.out.printf("Impuesto Coche: %.2f€\n", c.calcularImpuesto(impuesto));
				System.out.printf("Impuesto Furgoneta: %.2f€\n", f.calcularImpuesto(impuesto));
				break;
			default:
				System.out.println("Categoría inexistente, intentelo de nuevo.");
		}		
	}

}
