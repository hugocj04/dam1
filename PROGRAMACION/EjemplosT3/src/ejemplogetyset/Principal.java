package ejemplogetyset;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal perro = new Animal ("Paco", 12, 4, 20, true);
		perro.cambiarEdad();
		System.out.println(perro.getEdad());
		perro.cambiarEdad(4);
		System.out.println(perro.getEdad());
		
		
	}

}
