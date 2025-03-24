package ejemploconstructor;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int id;
		String nombre;
		double precioBase, porcentaje;
		Producto p3;


		// Con datos directamente (mala idea, solo pruebas)
		Producto p = new Producto(1, "Fanta", 1.30);

		// Leyendo por teclado
		System.out.print("Diga el id del producto: ");
		id = Leer.datoInt();

		System.out.print("Diga el nombre del producto: ");
		nombre = Leer.dato();

		System.out.print("Diga el precio del producto: ");
		precioBase = Leer.datoDouble();

		p3 = new Producto(id, nombre, precioBase);
		
		System.out.println(p3.getNombre());
		
		System.out.println(p3.getId());
		
		p3.setId(8);
		
		System.out.println(p3.getId());
		
		System.out.println("¿Cuánto porcentaje de ganancia quieres aplicar?");
		porcentaje = Leer.datoDouble();
		p3.calcularPVP(porcentaje);
		
		System.out.printf("Deberías ganar %.2f", p3.calcularPVP(porcentaje));
	}

}