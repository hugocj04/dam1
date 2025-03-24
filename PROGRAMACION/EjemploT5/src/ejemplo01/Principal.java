package ejemplo01;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto P1 = new Producto("Patatas", 2.5, false);
		Producto P2 = new Producto("Helado", 1.2, true);
		Producto P3 = new Producto("Fanta", 1.5, true);
		Producto P4 = new Producto("Pasta dientes", 4.5, true);
		Producto P5 = new Producto("Salchichas", 1, true);

		List<Producto> listado = new ArrayList<Producto>();
		
		listado.add(P1);
		
		System.out.println(listado);
		
		// Saber tamño del array
		
		System.out.println("Tamaño actual: " + listado.size());
		
		listado.add(P2);

		System.out.println("Tamaño actual: " + listado.size());
		
		listado.add(P3);

		listado.add(P4);
		
		System.out.println(listado);

		listado.remove(0);
		
		System.out.println(listado);
		
		listado.remove(P4);
		
		System.out.println(listado);
		
		listado.add(P5);
		
		System.out.println(listado);
		
		listado.add(2, P4);
				
		// listado.add(23, P3);
		
		System.out.println(listado);

		System.out.println(listado.get(3).getNombre());
	}

}
