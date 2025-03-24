package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p = new Producto("Pipas", 2.59);
		Producto p2 = new Alimentacion("croquetas", 12, true);
		Trabajador t = new Trabajador(15);
		Alimentacion a = new Alimentacion("Pipas", 2.59, false);
		Impuestos i = new Producto("Fritos", 5);
		
		System.out.println(p.calculoPVP(21));
		System.out.println(t.calculoIVA(2, 21));
		System.out.println(i.calculoIVA(12, 4));
	}

}
