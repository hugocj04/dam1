package ejemplointerfaces;

public class Leon extends Felino implements IDepredador {

	public void cazar() {
		System.out.println("Rawr te cazo ennove");
	}
	
	public void perseguir() {
		System.out.println("ILLOOOO no corra ennove ennove");
	}
	
}
