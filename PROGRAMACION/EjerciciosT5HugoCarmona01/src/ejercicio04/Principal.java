package ejercicio04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int id = 0;
		String nombre;
		
		Contacto c1 = new Contacto(1, "Hugo", "601498346");
		Contacto c2 = new Contacto(2, "Pedro", "656473846");
		Contacto c3 = new Contacto(3, "Pablo", "609823815");

		TreeMap<Integer, Contacto> tm = new TreeMap<Integer, Contacto>();
		
		Map <Integer, Contacto> agenda = new HashMap<Integer, Contacto>();
		
		agenda.put(20, c1);
		agenda.put(97, c2);
		agenda.put(34, c3);
		
		Agenda a = new Agenda(agenda);
		
		System.out.println(agenda);
		
		System.out.println(a.getAgenda().keySet());
		
		// Ordenamos
		
		System.out.println(a.ordenarPorClave());
		
		System.out.print("Dime el id del contacto que quieres buscar: ");
		id = Integer.parseInt(sc.next());
		
		System.out.println(a.buscarPorId(id));
		
		System.out.print("Dime el nombre del usuario que desea buscar: ");
		nombre = sc.next();
		
		System.out.println(a.buscarPorNombre(nombre));
		
		sc.close();
	}

}
