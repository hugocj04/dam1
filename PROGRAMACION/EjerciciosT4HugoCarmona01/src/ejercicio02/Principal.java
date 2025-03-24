package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Documento d = new Documento("Xbox");
		TarjetaDeVisita t = new TarjetaDeVisita("Xbox", "Hugo", "601498346", "hugocj00@gmail.com");
		Carta c = new Carta("Xbox", "09/01/2025");

		d.imprimirCabecera();
		t.imprimirCabecera();
		c.imprimirCabecera();
	}

}