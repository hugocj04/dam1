package ejemplointerfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Anfibio a = new Anfibio();
		Rana r = new Rana();
		Anfibio a2 = new Rana();
		IPresa i2 = new Rana();
		IDepredador i4 = new Rana();
		
		Felino f2 = new Felino();
		Leon l = new Leon();
		Felino f = new Leon();
		IDepredador id = new Leon();
		
		Bovido b = new Bovido();
		Gacela g = new Gacela();
		Bovido b2 = new Gacela();
		IPresa i3 = new Gacela();
		
		// Probar metodos
		
		r.huir();
		
	}

}
