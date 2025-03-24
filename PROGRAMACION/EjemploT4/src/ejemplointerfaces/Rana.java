package ejemplointerfaces;

public class Rana extends Anfibio implements IPresa, IDepredador{

	public void observar() {
		System.out.println("Rana mirando 360º");
	}
	
	public void huir() {
		System.out.println("Salto triple");
	}
	
	public void cazar() {
		System.out.println("Rawr te cazo ennove");
	}
	public void perseguir() {
		System.out.println("ILLOOOO no corra ennove ennove");
	}
	
}
