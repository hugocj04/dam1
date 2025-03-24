package ejemplo01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trabajador t = new Trabajador("Hugo", "Profesor");
		Empleado e = new Empleado("Hugo", "Profesor", 2000, 20);
		Consultor c = new Consultor("Hugo", "Profesor", 40, 9);
		double base = 2;
		int horasDia = 8;
		
		System.out.println(t);
		System.out.println(e);
		System.out.println(c);
		
		// LLamadas al metodo
		
		System.out.println(t.calcularSueldo(base));
		System.out.println(e.calcularSueldo(base));
		System.out.println(c.calcularSueldo(base));

		System.out.println(c.calcularDias(horasDia));
		
	}

}
