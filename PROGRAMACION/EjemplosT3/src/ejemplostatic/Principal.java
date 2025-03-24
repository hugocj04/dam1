package ejemplostatic;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marciano m1, m2;
		m1 = new Marciano(1);
		System.out.println(Marciano.getCuentaMarcianos());
		m2 = new Marciano (1);
		System.out.println(Marciano.getCuentaMarcianos());
	}

}
